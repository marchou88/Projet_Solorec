package com.example.march.solorec1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class activity_fin_dec extends AppCompatActivity {


    private ImageButton btnretourfindec;
    private ImageButton btnvaldec;
    private ImageButton btnprecfindec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin_dec);

        btnretourfindec = (ImageButton) findViewById(R.id.button_retourfindec);
        btnprecfindec = (ImageButton) findViewById(R.id.button_precfindec) ;
        btnvaldec = (ImageButton) findViewById(R.id.button_valdec) ;

        btnretourfindec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                BackToMenu();

            }
        });
        btnprecfindec.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                GoToChaudDec();
            }
        });
        btnvaldec.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                SendGoToMenu();
            }
        });
    }
    private void GoToChaudDec() {
        Intent intentGoToChaudDec = new Intent();
        intentGoToChaudDec.setClass(this, activity_chaudiere_dec.class);
        startActivity(intentGoToChaudDec);
    }

    private void SendGoToMenu() {
        Intent intentSendGoToMenu = new Intent();
        intentSendGoToMenu.setClass(this, activity_menu.class);
        startActivity(intentSendGoToMenu);
    }


    protected void BackToMenu() {
        Intent intentBackToMenu = new Intent();
        intentBackToMenu.setClass(this, activity_menu.class);
        startActivity(intentBackToMenu);
    }
}
