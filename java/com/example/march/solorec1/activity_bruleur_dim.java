package com.example.march.solorec1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class activity_bruleur_dim extends AppCompatActivity {

    private ImageButton btnsuivbdim;
    private ImageButton btnprecbdim;
    private ImageButton btnretourbrudim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bruleur_dim);


            btnsuivbdim = (ImageButton) findViewById(R.id.button_suivbdim);
            btnsuivbdim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    goToDimens();
                }
            });
            btnprecbdim = (ImageButton) findViewById(R.id.button_precbdim);
            btnprecbdim.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    BackToChaudiere();
                }
            });
        btnretourbrudim = (ImageButton) findViewById(R.id.button_retourbrudim);
        btnretourbrudim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackToMenu();
            }
        });
        }
   // ((textView) tv.....).setVisibility(View.INVISIBLE);

    private void goToDimens() {
        Intent intent1 = new Intent();
        intent1.setClass(this, activity_fin_dim.class);
        startActivity(intent1);
    }

    private void BackToChaudiere() {
        Intent intent3 = new Intent();
        intent3.setClass(this, activity_chaudiere_dim.class);
        startActivity(intent3);
    }
    protected void BackToMenu() {
        Intent intentBackToMenu = new Intent();
        intentBackToMenu.setClass(this, activity_menu.class);
        startActivity(intentBackToMenu);
    }
}

