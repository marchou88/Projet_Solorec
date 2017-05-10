package com.example.march.solorec1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class activity_debut_dec extends AppCompatActivity {

    // les champs de la vue
    private ImageButton btnretourdebdec;
    private ImageButton btnsuivdebdec;
    private Spinner spinner3;
    private RadioGroup rgpressgazd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debut_dec);
        rgpressgazd = (RadioGroup) findViewById(R.id.radiogroup_pressgazd);
        rgpressgazd.setVisibility(RadioGroup.INVISIBLE);

            spinner3 = (Spinner) findViewById(R.id.spinner_client);
        List TypeClient = new ArrayList();
        TypeClient.add("      ");
        TypeClient.add("Industrie");
        TypeClient.add("Immeuble < 50 logements");
        TypeClient.add("Immeuble > 50 logements");

        ArrayAdapter adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                TypeClient);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter);

        btnsuivdebdec = (ImageButton) findViewById(R.id.button_suivdebdec);
        btnsuivdebdec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                GoToChaudiereDec();
            }
        });

        btnretourdebdec = (ImageButton) findViewById(R.id.button_retourdebdec);
        btnretourdebdec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                BackToMenu();
            }
        });


    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_alimgaz:
                if (checked){rgpressgazd.setVisibility(RadioGroup.VISIBLE);}
                else {rgpressgazd.setVisibility(RadioGroup.INVISIBLE);}
                break;
        }
    }
    private void BackToMenu() {
        Intent intentBackToMenu = new Intent();
        intentBackToMenu.setClass(this, activity_menu.class);
        startActivity(intentBackToMenu);
    }

    protected void GoToChaudiereDec() {
        Intent intentGoToChaudiereDec = new Intent();
        intentGoToChaudiereDec.setClass(this, activity_chaudiere_dec.class);
        startActivity(intentGoToChaudiereDec);
    }
}
