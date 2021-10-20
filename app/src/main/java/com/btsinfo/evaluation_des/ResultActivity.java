package com.btsinfo.evaluation_des;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.security.SecureRandom;
import java.util.Random;

public class ResultActivity extends AppCompatActivity {


    private TextView tvResultat;
    private String NbFaces;
    private Double resultat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvResultat = (TextView) findViewById(R.id.tvResultat);
        Intent intent = getIntent();
         resultat = intent.getDoubleExtra("resultat",0.0);
         NbFaces = intent.getStringExtra("nbFaces");

         // Calcul
        if (NbFaces.equalsIgnoreCase("4")) {
            Random random = new Random();
            random.nextInt(4);
            int number = 1 + random.nextInt(4);

            resultat += number;
        }
        if (NbFaces.equalsIgnoreCase("6")) {
            Random random = new Random();
            random.nextInt(6);
            int number = 1 + random.nextInt(6);

            resultat += number;
        }
        if (NbFaces.equalsIgnoreCase("8")) {
            Random random = new Random();
            random.nextInt(8);
            int number = 1 + random.nextInt(8);

            resultat += number;
        }
        if (NbFaces.equalsIgnoreCase("10")) {
            Random random = new Random();
            random.nextInt(10);
            int number = 1 + random.nextInt(10);

            resultat += number;
        }
        if (NbFaces.equalsIgnoreCase("12")) {
            Random random = new Random();
            random.nextInt(12);
            int number = 1 + random.nextInt(12);

            resultat += number;
        }
        if (NbFaces.equalsIgnoreCase("20")) {
            Random random = new Random();
            random.nextInt(20);
            int number = 1 + random.nextInt(20);

            resultat += number;
        }



        // Resultat
        String monresultat = "Le lancé a donné : " + String.valueOf(resultat);
        tvResultat.setText(monresultat);






    }
}

            /*class GenerateurNb {
                public void main(String[] args) {
                    int min_val = 1;
                    int max_val = 4;
                    SecureRandom rand = new SecureRandom();
                    rand.setSeed(new Date().getTime());
                    int randomNum = rand.nextInt((max_val - min_val) + 1) + min_val;
                    System.out.println(randomNum);
                }
            }*/