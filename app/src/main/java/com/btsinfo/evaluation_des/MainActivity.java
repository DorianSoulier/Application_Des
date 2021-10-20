package com.btsinfo.evaluation_des;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private RadioGroup rgNbFaces;
    private RadioButton rBtFaces;
    private Button btLancer;
    private TextView tvResultat;
    private Double resultat = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgNbFaces = (RadioGroup)  findViewById(R.id.rgNbFaces);
        btLancer = (Button) findViewById(R.id.btLancer);


        btLancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { toResult(); }
        });
    }





    public void toResult() {
        int radioId = rgNbFaces.getCheckedRadioButtonId();
        rBtFaces = (RadioButton) findViewById(radioId);
        resultat = 0.0;
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("resultat", resultat);
        intent.putExtra("nbFaces", rBtFaces.getText().toString());
        startActivity(intent);
    }



}