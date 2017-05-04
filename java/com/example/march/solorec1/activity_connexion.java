package com.example.march.solorec1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class activity_connexion extends AppCompatActivity {
    private Spinner spinner1;
    private ImageButton btnconnexion;
    private TextView textAgence ;
    private TextView textTech ;
    private EditText editTextTech ;
    private EditText editmdp ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        //Récupération du Spinner déclaré dans le fichier xml
        spinner1 = (Spinner) findViewById(R.id.spinner_agence);
        //Création d'une liste d'élément à mettre dans le Spinner
        List AgenceList = new ArrayList();
        AgenceList.add("      ");
        AgenceList.add("Golbey");
        AgenceList.add("Ludres");
        AgenceList.add("Metz");

        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                AgenceList);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
          spinner1.setAdapter(adapter);




        btnconnexion = (ImageButton) findViewById(R.id.button_connexion);
        btnconnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doValider();
            }
        });


    }

    private void doValider() {
        Intent intent1 = new Intent();
        intent1.setClass(this, activity_menu.class);
        startActivity(intent1);

    }
}