package com.example.march.solorec1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class activity_chaudiere_dim extends AppCompatActivity {


    private ImageButton btnsuivchdim;
    private ImageButton btnretourchdim;
    private Spinner spinnerdim;
    private Button btnajch2;
    private Button btnajch3;
    private Button btnajch4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaudiere_dim);

        final RelativeLayout chaudiere2 = (RelativeLayout)findViewById(R.id.layout_ch2);
        chaudiere2.setVisibility(RelativeLayout.INVISIBLE);
        btnajch2 = (Button) findViewById(R.id.button_ajch2);
        btnajch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chaudiere2.setVisibility(RelativeLayout.VISIBLE);
                btnajch2.setVisibility(Button.INVISIBLE);
            }
        });

        final RelativeLayout chaudiere3 = (RelativeLayout)findViewById(R.id.layout_ch3);
        chaudiere3.setVisibility(RelativeLayout.INVISIBLE);
        btnajch3 = (Button) findViewById(R.id.button_ajch3);
        btnajch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chaudiere3.setVisibility(RelativeLayout.VISIBLE);
                btnajch3.setVisibility(Button.INVISIBLE);
            }
        });

        final RelativeLayout chaudiere4 = (RelativeLayout)findViewById(R.id.layout_ch4);
        chaudiere4.setVisibility(RelativeLayout.INVISIBLE);
        btnajch4 = (Button) findViewById(R.id.button_ajch4);
        btnajch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chaudiere4.setVisibility(RelativeLayout.VISIBLE);
                btnajch4.setVisibility(Button.INVISIBLE);
            }
        });



        btnsuivchdim = (ImageButton) findViewById(R.id.button_suivchdim);
        btnsuivchdim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToBruleur();
            }
        });
        spinnerdim = (Spinner) findViewById(R.id.spinner_chodim);
        List ChoixInstall = new ArrayList();
        ChoixInstall.add("      ");
        ChoixInstall.add("Mairie Golbey");
        ChoixInstall.add("École Golbey");
        ChoixInstall.add("Vogélis Thaon");

        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                ChoixInstall);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerdim.setAdapter(adapter);
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
    protected void BackToMenu() {
        Intent intentBackToMenu = new Intent();
        intentBackToMenu.setClass(this, activity_menu.class);
        startActivity(intentBackToMenu);
    }
}
