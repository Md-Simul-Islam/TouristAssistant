package com.example.administrator.sqliteloginactivity;

//package com.example.user.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MymenshignActivity extends AppCompatActivity implements View.OnClickListener{
    private Button BangladeshAgriculturalUniversityButton,BotanicalGardenutton,MuseumMymenshignButton,NuzrulMemorialCenterButton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymenshign);

        BangladeshAgriculturalUniversityButton=(Button)findViewById(R.id.bangladeshagriculturaluniversityId);
        BotanicalGardenutton=(Button)findViewById(R.id.botanicalgardenId);
        MuseumMymenshignButton=(Button)findViewById(R.id.museummymenshignId);
        NuzrulMemorialCenterButton=(Button)findViewById(R.id.nuzrulmemorialcenterId);

        BangladeshAgriculturalUniversityButton.setOnClickListener(this);
        BotanicalGardenutton.setOnClickListener(this);
        MuseumMymenshignButton.setOnClickListener(this);
        NuzrulMemorialCenterButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.bangladeshagriculturaluniversityId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","arcu");
            startActivity(intent);
        }

        if(v.getId()==R.id.botanicalgardenId){
            intent=new Intent(this,ProfileActivity.class);
            intent.putExtra("name","botanical");
            startActivity(intent);
        }

        if(v.getId()==R.id.museummymenshignId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","meuseum");
            startActivity(intent);
        }

        if(v.getId()==R.id.nuzrulmemorialcenterId) {
            intent = new Intent(this, ProfileActivity.class);

            intent.putExtra("name", "nazrul");
            startActivity(intent);
        }

    }

}
