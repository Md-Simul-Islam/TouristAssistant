package com.example.administrator.sqliteloginactivity;

//package com.example.user.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RajshahiActivity extends AppCompatActivity implements View.OnClickListener{
    private Button RajshahiUniversityButton,RUETButton,safinaparkButton,amchottorButton,padmaparButton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajshahi);

        RajshahiUniversityButton=(Button)findViewById(R.id.rajshahiUniversityId);
        RUETButton=(Button)findViewById(R.id.RUETId);
        safinaparkButton=(Button)findViewById(R.id.safinaparkId);
        padmaparButton=(Button)findViewById(R.id.padmarparId);
        amchottorButton=(Button)findViewById(R.id.amcottorId);

        RajshahiUniversityButton.setOnClickListener(this);
        RUETButton.setOnClickListener(this);
        safinaparkButton.setOnClickListener(this);
        padmaparButton.setOnClickListener(this);
        amchottorButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.rajshahiUniversityId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","rajshahi university");
            startActivity(intent);
        }

        if(v.getId()==R.id.RUETId){
            intent=new Intent(this,ProfileActivity.class);
            intent.putExtra("name","ruet");
            startActivity(intent);
        }

        if(v.getId()==R.id.safinaparkId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","safina park");
            startActivity(intent);
        }

        if(v.getId()==R.id.padmarparId) {
            intent = new Intent(this, ProfileActivity.class);

            intent.putExtra("name", "padma par");
            startActivity(intent);
        }
        if(v.getId()==R.id.amcottorId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","amcottor");
            startActivity(intent);
        }
    }

}

