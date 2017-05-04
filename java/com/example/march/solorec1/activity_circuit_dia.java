package com.example.march.solorec1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class activity_circuit_dia extends AppCompatActivity {

        private ImageButton btnsuivcirdia;
        private ImageButton btnpreccirdia;
        private ImageButton btnretourcirdia;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_circuit_dia);

            btnsuivcirdia=(ImageButton) findViewById(R.id.button_suivcirdia);

            btnsuivcirdia.setOnClickListener(new View.OnClickListener(){

                public void onClick(View arg0) {
                    GoToFin();
                }
            });

            btnpreccirdia=(ImageButton) findViewById(R.id.button_preccirdia);
            btnpreccirdia.setOnClickListener(new View.OnClickListener(){

                public void onClick(View arg0) {
                    BackToChaudière();
                }
            });

            btnretourcirdia=(ImageButton) findViewById(R.id.button_retourcirdia);
            btnretourcirdia.setOnClickListener(new View.OnClickListener(){

                public void onClick(View arg0) {
                    BackToMenu();
                }
            });

        }

        private void BackToChaudière() {
            Intent intent1 = new Intent();
            intent1.setClass(this, activity_chaudiere_dia.class);
            startActivity(intent1);
        }

        private void GoToFin() {
            Intent intent2 = new Intent();
            intent2.setClass(this, activity_fin_dia.class);
            startActivity(intent2);
        }
        private void BackToMenu() {
            Intent intentBackToMenu = new Intent();
            intentBackToMenu.setClass(this, activity_menu.class);
            startActivity(intentBackToMenu);
        }
    }

