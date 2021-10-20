package com.btsinfo.evaluation_des;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.security.SecureRandom;
import java.util.Random;

public class ResultActivity extends AppCompatActivity {


    private TextView tvResultat;
    private String nbFaces;
    private String nbDes;
    private Double resultat;
    private Double i = 0.0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvResultat = (TextView) findViewById(R.id.tvResultat);
        Intent intent = getIntent();
        resultat = intent.getDoubleExtra("resultat",0.0);
        nbFaces = intent.getStringExtra("nbFaces");
        nbDes = intent.getStringExtra("nbDes");

        // Calcul
        // Pour 1 dé
        if (nbDes.equalsIgnoreCase("1")) {
            if (nbFaces.equalsIgnoreCase("4")) {
                while (i<1) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(4);
                    int number = 1 + random.nextInt(4);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("6")) {
                while (i<1) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(6);
                    int number = 1 + random.nextInt(6);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("8")) {
                while (i<1) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(8);
                    int number = 1 + random.nextInt(8);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("10")) {
                while (i<1) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(10);
                    int number = 1 + random.nextInt(10);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("12")) {
                while (i<1) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(12);
                    int number = 1 + random.nextInt(12);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("20")) {
                while (i<1) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(20);
                    int number = 1 + random.nextInt(20);
                    resultat += number;
                }
            }
        }




        // Pour 2 dés
        if (nbDes.equalsIgnoreCase("2")) {
            if (nbFaces.equalsIgnoreCase("4")) {
                while (i<2) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(4);
                    int number = 1 + random.nextInt(4);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("6")) {
                while (i<2) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(6);
                    int number = 1 + random.nextInt(6);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("8")) {
                while (i<2) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(8);
                    int number = 1 + random.nextInt(8);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("10")) {
                while (i<2) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(10);
                    int number = 1 + random.nextInt(10);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("12")) {
                while (i<2) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(12);
                    int number = 1 + random.nextInt(12);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("20")) {
                while (i<2) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(20);
                    int number = 1 + random.nextInt(20);
                    resultat += number;
                }
            }
        }

        // Pour 3 dés
        if (nbDes.equalsIgnoreCase("3")) {
            if (nbFaces.equalsIgnoreCase("4")) {
                while (i<3) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(4);
                    int number = 1 + random.nextInt(4);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("6")) {
                while (i<3) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(6);
                    int number = 1 + random.nextInt(6);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("8")) {
                while (i<3) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(8);
                    int number = 1 + random.nextInt(8);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("10")) {
                while (i<3) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(10);
                    int number = 1 + random.nextInt(10);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("12")) {
                while (i<3) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(12);
                    int number = 1 + random.nextInt(12);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("20")) {
                while (i<3) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(20);
                    int number = 1 + random.nextInt(20);
                    resultat += number;
                }
            }
        }

        // Pour 4 dés
        if (nbDes.equalsIgnoreCase("4")) {
            if (nbFaces.equalsIgnoreCase("4")) {
                while (i<4) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(4);
                    int number = 1 + random.nextInt(4);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("6")) {
                while (i<4) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(6);
                    int number = 1 + random.nextInt(6);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("8")) {
                while (i<4) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(8);
                    int number = 1 + random.nextInt(8);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("10")) {
                while (i<4) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(10);
                    int number = 1 + random.nextInt(10);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("12")) {
                while (i<4) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(12);
                    int number = 1 + random.nextInt(12);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("20")) {
                while (i<4) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(20);
                    int number = 1 + random.nextInt(20);
                    resultat += number;
                }
            }
        }
        // Pour 5 dés
        if (nbDes.equalsIgnoreCase("5")) {
            if (nbFaces.equalsIgnoreCase("4")) {
                while (i<5) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(4);
                    int number = 1 + random.nextInt(4);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("6")) {
                while (i<5) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(6);
                    int number = 1 + random.nextInt(6);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("8")) {
                while (i<5) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(8);
                    int number = 1 + random.nextInt(8);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("10")) {
                while (i<5) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(10);
                    int number = 1 + random.nextInt(10);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("12")) {
                while (i<5) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(12);
                    int number = 1 + random.nextInt(12);
                    resultat += number;
                }
            }
            if (nbFaces.equalsIgnoreCase("20")) {
                while (i<5) {
                    i += 1.0;
                    Random random = new Random();
                    random.nextInt(20);
                    int number = 1 + random.nextInt(20);
                    resultat += number;
                }
            }
        }


        /*if (nbFaces.equalsIgnoreCase("4")) {
            Random random = new Random();
            random.nextInt(4);
            int number = 1 + random.nextInt(4);

            resultat += number;
        }
        if (nbFaces.equalsIgnoreCase("6")) {
            Random random = new Random();
            random.nextInt(6);
            int number = 1 + random.nextInt(6);

            resultat += number;
        }
        if (nbFaces.equalsIgnoreCase("8")) {
            Random random = new Random();
            random.nextInt(8);
            int number = 1 + random.nextInt(8);

            resultat += number;
        }
        if (nbFaces.equalsIgnoreCase("10")) {
            Random random = new Random();
            random.nextInt(10);
            int number = 1 + random.nextInt(10);

            resultat += number;
        }
        if (nbFaces.equalsIgnoreCase("12")) {
            Random random = new Random();
            random.nextInt(12);
            int number = 1 + random.nextInt(12);

            resultat += number;
        }
        if (nbFaces.equalsIgnoreCase("20")) {
            Random random = new Random();
            random.nextInt(20);
            int number = 1 + random.nextInt(20);

            resultat += number;
        }
        */


        // Resultat
        String monresultat = "Le lancé a donné : " + String.valueOf(resultat);
        tvResultat.setText(monresultat);

    }
}