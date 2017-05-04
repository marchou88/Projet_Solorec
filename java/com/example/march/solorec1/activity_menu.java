package com.example.march.solorec1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class activity_menu extends AppCompatActivity {

    private Button btnretour ;
    private ImageButton btndim ;
    private ImageButton btnrecherche;
    private ImageButton btndiagno;
    private ImageButton btndeclar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        btndim = (ImageButton) findViewById(R.id.button_dim);
        btnrecherche = (ImageButton) findViewById(R.id.button_rec);
        btndiagno = (ImageButton) findViewById(R.id.button_dia);
        btndeclar = (ImageButton) findViewById(R.id.button_declar);

        btndiagno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToDiagnostic();
            }
        });
        btndim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goDimension();
            }
        });
        btnrecherche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goRecherche();
            }
        });
        btndeclar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goDeclaration();
            }
        });
    }

    private void goDeclaration() {
        Intent intentGoDeclaration = new Intent();
        intentGoDeclaration.setClass(this, activity_debut_dec.class);
        startActivity(intentGoDeclaration);
    }

    private void GoToDiagnostic() {
        Intent intentGoToDiagnostic = new Intent();
        intentGoToDiagnostic.setClass(this, activity_chaudiere_dia.class);
        startActivity(intentGoToDiagnostic);
    }

    private void goRecherche() {
       Intent intent2 = new Intent();
      intent2.setClass(this, activity_recherche.class);
      startActivity(intent2);
   }

    private void backToConnect2() {
        Intent intent3 = new Intent();
        intent3.setClass(this, activity_connexion.class);
        startActivity(intent3);
    }

    private void goDimension() {
        Intent intent4 = new Intent();
        intent4.setClass(this, activity_chaudiere_dim.class);
        startActivity(intent4);
    }
}
