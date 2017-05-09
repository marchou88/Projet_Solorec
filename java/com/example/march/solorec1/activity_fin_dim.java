package com.example.march.solorec1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class activity_fin_dim extends AppCompatActivity {

    private ImageButton btnprecfindim ;
    private ImageButton btnvaldim ;
    private ImageButton btnretourfindim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin_dim);

        btnprecfindim = (ImageButton) findViewById(R.id.button_precfindim);
        btnprecfindim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackToBruleur();
            }
        });

        btnvaldim = (ImageButton) findViewById(R.id.button_valdim);
        btnvaldim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendGoMenu();
            }
        });

        btnretourfindim = (ImageButton) findViewById(R.id.button_retourfindim);
        btnretourfindim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackToMenu();
            }
        });
    }

    private void SendGoMenu() {
        Intent intentGoMenu = new Intent();
        intentGoMenu.setClass(this, activity_menu.class);
        startActivity(intentGoMenu);
    }

    private void BackToBruleur() {
        Intent intentBackToBruleur = new Intent();
        intentBackToBruleur.setClass(this, activity_bruleur_dim.class);
        startActivity(intentBackToBruleur);
    }
    private void BackToMenu() {
        Intent intentBackToMenu = new Intent();
        intentBackToMenu.setClass(this, activity_menu.class);
        startActivity(intentBackToMenu);
    }
}
