package com.example.sivic.myappmovel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivityTela1 extends AppCompatActivity {

    public static List<String> lamis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_tela1);

        LinearLayout ln = new LinearLayout(this);

        for(int i = 0; i < lamis.size(); i++){
            TextView v = new TextView(this);
            v.setText(lamis.get(i));

        }
    }


}
