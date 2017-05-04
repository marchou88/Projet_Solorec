package com.example.march.solorec1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class activity_chaudiere_dim extends AppCompatActivity {


    private ImageButton btnsuivchdim;
    private ImageButton btnprecchdim;
    private ImageButton btnretourchdim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaudiere_dim);

        btnsuivchdim = (ImageButton) findViewById(R.id.button_suivchdim);
        btnsuivchdim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToBruleur();
            }
        });

     /*   btnprecchdim = (Button) findViewById(R.id.button_precchdim);
        btnprecchdim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackToConnect();
            }
        }); */

        btnretourchdim = (ImageButton) findViewById(R.id.button_retourchdim);
        btnretourchdim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackToMenu();
            }
        });

    }


    private void GoToBruleur() {
        Intent intent5 = new Intent();
        intent5.setClass(this, activity_bruleur_dim.class);
        startActivity(intent5);
    }

    private void BackToConnect() {
        Intent intent6 = new Intent();
        intent6.setClass(this, activity_menu.class);
        startActivity(intent6);
    }
    protected void BackToMenu() {
        Intent intentBackToMenu = new Intent();
        intentBackToMenu.setClass(this, activity_menu.class);
        startActivity(intentBackToMenu);
    }
}
