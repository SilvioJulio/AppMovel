package com.example.sivic.myappmovel;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class MainActivityTela2 extends AppCompatActivity {


    public TextView h1;
    public TextView h2;
    public TextView h3;
    public TextView h4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_tela2);
        h1 = (TextView) findViewById(R.id.h1);
        h2 = (TextView) findViewById(R.id.h2);
        h3 = (TextView) findViewById(R.id.h3);
        h4 = (TextView) findViewById(R.id.h4);

        TextView []  textViews = {h1,h2,h3,h4};

        int id = getIntent().getIntExtra("id", 0);
        int [] horarios = MainActivityTela1.lamis.get(id).getHorariosManha();

        for (int i = 0;i < 4; i++){
            colorir(horarios[i], textViews[i]);
        }

    }

    private void colorir(int y , TextView h){
        switch (y){
            case 0:
                h.setBackgroundColor(Color.parseColor("#ff1905"));
                break;
            case 1:
                h.setBackgroundColor(Color.parseColor("#19982f"));
                break;
            case 2:
                h.setBackgroundColor(Color.YELLOW);
                break;
            default:
                h.setBackgroundColor(Color.LTGRAY);
                break;
        }
    }
}
