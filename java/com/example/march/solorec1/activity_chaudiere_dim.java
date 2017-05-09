package com.example.march.solorec1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class activity_chaudiere_dim extends AppCompatActivity {


    private ImageButton btnsuivchdim;
    private ImageButton btnretourchdim;
    private Spinner spinnerdim;

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
