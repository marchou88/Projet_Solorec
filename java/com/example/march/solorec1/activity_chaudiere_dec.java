package com.example.march.solorec1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class activity_chaudiere_dec extends AppCompatActivity {

    // les champs de la vue
    private ImageButton btnretourchdec;
    private ImageButton btnsuivchdec;
    private ImageButton btnprecchdec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaudiere_dec);

        btnretourchdec = (ImageButton) findViewById(R.id.button_retourchdec);
        btnprecchdec = (ImageButton) findViewById(R.id.button_precchdec) ;
        btnsuivchdec = (ImageButton) findViewById(R.id.button_suivchdec) ;
        btnretourchdec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                BackToMenu();

            }
        });
        btnprecchdec.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                GoToDebDec();
            }
        });
        btnsuivchdec.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                GoToFinDec();
            }
        });
    }






    private void GoToFinDec() {
        Intent intentGoToFinDec = new Intent();
        intentGoToFinDec.setClass(this, activity_fin_dec.class);
        startActivity(intentGoToFinDec);
    }

    private void GoToDebDec() {
        Intent intentGoToDebDec = new Intent();
        intentGoToDebDec.setClass(this, activity_debut_dec.class);
        startActivity(intentGoToDebDec);
    }


    protected void BackToMenu() {
        Intent intentBackToMenu = new Intent();
        intentBackToMenu.setClass(this, activity_menu.class);
        startActivity(intentBackToMenu);
    }
}