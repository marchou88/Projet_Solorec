package com.example.march.solorec1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class activity_chaudiere_dia extends AppCompatActivity {

    private ImageButton btnsuivcdia;
    private ImageButton btnpreccdia;
    private ImageButton btnretourcdia;
    private Spinner spinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaudiere_dia);

        //Récupération du Spinner déclaré dans le fichier xml
        spinner2 = (Spinner) findViewById(R.id.spinner_chodia);
        //Création d'une liste d'élément à mettre dans le Spinner
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
        spinner2.setAdapter(adapter);

        btnsuivcdia=(ImageButton) findViewById(R.id.button_suivcdia);
       // btnpreccdia = (ImageButton) findViewById(R.id.button_preccdia);
btnretourcdia = (ImageButton) findViewById(R.id.button_retourcdia);

        btnsuivcdia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {GoToCircuit();}});
     /*   btnpreccdia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BackToMenu();
            }
        });*/
        btnretourcdia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToMenu();
            }
        });
    }

    private void GoToMenu() {
        Intent intentGoToMenu = new Intent();
        intentGoToMenu.setClass(this, activity_menu.class);
        startActivity(intentGoToMenu);
    }

    private void BackToMenu() {
        Intent intentBackToMenu = new Intent();
        intentBackToMenu.setClass(this, activity_menu.class);
        startActivity(intentBackToMenu);
    }

    private void GoToCircuit() {
        Intent intentGoToCircuit = new Intent();
        intentGoToCircuit.setClass(this, activity_circuit_dia.class);
        startActivity(intentGoToCircuit);
    }
}