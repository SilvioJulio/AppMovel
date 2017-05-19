package com.example.sivic.myappmovel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivityTela1 extends AppCompatActivity {

    public static List<Lami> lamis = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_tela1);

        int [] manha = {1,1,0,0};
        int [] noite = {1,0,1,0};

        int [] manha1 = {0,1,0,0};
        int [] noite1 = {0,0,0,1};

        Lami lami = new Lami(1,manha, noite);
        Lami lami1 = new Lami(2,manha, noite);

        lamis.add(lami);
        lamis.add(lami1);

        ListView listView = (ListView) findViewById(R.id.listLami);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, lamis);

        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener(){
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {

                Intent it = new Intent(MainActivityTela1.this, MainActivityTela2.class);
                it.putExtra("id", position);
                startActivity(it);
                
                return false ;
            }
        });



    }


}
