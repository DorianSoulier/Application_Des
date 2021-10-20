package com.btsinfo.evaluation_des;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    private RadioGroup rgNbFaces;
    private RadioGroup rgNbDes;
    private RadioButton rBtFaces;
    private RadioButton rBtDes;
    private Button btLancer;
    private Double resultat = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rgNbFaces = (RadioGroup)  findViewById(R.id.rgNbFaces);
        rgNbDes = (RadioGroup) findViewById(R.id.rgNbDes);
        btLancer = (Button) findViewById(R.id.btLancer);

        btLancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { toResult(); }
        });
    }



    public void toResult() {
        int radioId1 = rgNbFaces.getCheckedRadioButtonId();
        rBtFaces = (RadioButton) findViewById(radioId1);
        int radioId2 = rgNbDes.getCheckedRadioButtonId();
        rBtDes = (RadioButton) findViewById(radioId2);
        resultat = 0.0;
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("resultat", resultat);
        intent.putExtra("nbFaces", rBtFaces.getText().toString());
        intent.putExtra("nbDes", rBtDes.getText().toString());
        startActivity(intent);
    }

}