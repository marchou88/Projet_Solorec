package com.example.march.solorec1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;

public class activity_fin_dec extends AppCompatActivity {


    private ImageButton btnretourfindec;
    private ImageButton btnvaldec;
    private ImageButton btnprecfindec;
    private RadioGroup rgdiam,rghaut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fin_dec);


        rgdiam = (RadioGroup)findViewById(R.id.radioGroup_diam);
        rgdiam.setVisibility(RelativeLayout.INVISIBLE);
        rghaut = (RadioGroup)findViewById(R.id.radioGroup_haut);
        rghaut.setVisibility(RelativeLayout.INVISIBLE);


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




    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkbox_mel:
                if (checked){rgdiam.setVisibility(RadioGroup.VISIBLE);
                    rghaut.setVisibility(RadioGroup.VISIBLE);}
                else {rghaut.setVisibility(RadioGroup.INVISIBLE);
                    rgdiam.setVisibility(RadioGroup.INVISIBLE);}
                break;
        }
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
