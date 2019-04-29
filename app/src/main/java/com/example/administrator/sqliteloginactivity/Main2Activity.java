package com.example.administrator.sqliteloginactivity;

//package com.example.user.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    private ListView listview;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listview = (ListView) findViewById(R.id.ListView_Id);
        final String[] city_name = getResources().getStringArray(R.array.Division_name);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.sample_view, R.id.textView_Id, city_name);
        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                if (position == 0) {
                                                    Intent myintent = new Intent(view.getContext(), RajshahiActivity.class);
                                                    startActivityForResult(myintent, 0);
                                                } else if (position == 1) {
                                                    Intent myintent = new Intent(view.getContext(), ComillaActivity.class);
                                                    startActivityForResult(myintent, 1);
                                                } else if (position == 2) {
                                                    Intent myintent = new Intent(view.getContext(), DhakaActivity.class);
                                                    startActivityForResult(myintent, 2);
                                                } else if (position == 3) {
                                                    Intent myintent = new Intent(view.getContext(), ChattagramActivity.class);
                                                    startActivityForResult(myintent, 3);
                                                } else if (position == 4) {
                                                    Intent myintent = new Intent(view.getContext(), RangpurActivity.class);
                                                    startActivityForResult(myintent, 4);
                                                } else if (position == 5) {
                                                    Intent myintent = new Intent(view.getContext(), SylhetActivity.class);
                                                    startActivityForResult(myintent, 5);
                                                } else if (position == 6) {
                                                    Intent myintent = new Intent(view.getContext(), KhulnaActivity.class);
                                                    startActivityForResult(myintent, 6);
                                                } else if (position == 7) {
                                                    Intent myintent = new Intent(view.getContext(), BarisalActivity.class);
                                                    startActivityForResult(myintent, 7);
                                                } else if (position == 8) {
                                                    Intent myintent = new Intent(view.getContext(), MymenshignActivity.class);
                                                    startActivityForResult(myintent, 8);
                                                }
                                            }


                                        }
        );


    }
}
