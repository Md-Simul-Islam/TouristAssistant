package com.example.administrator.sqliteloginactivity;

//package com.example.user.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SylhetActivity extends AppCompatActivity implements View.OnClickListener{
    private Button SUSTButton,teagardenButton,shahjalalButton,jaflongButton,ratargulButton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet);

        SUSTButton=(Button)findViewById(R.id.SUSTId);
        teagardenButton=(Button)findViewById(R.id.teagardenId);
        shahjalalButton=(Button)findViewById(R.id.shajalalId);
        jaflongButton=(Button)findViewById(R.id.jaflongId);
        ratargulButton=(Button)findViewById(R.id.ratargulId);

        SUSTButton.setOnClickListener(this);
        teagardenButton.setOnClickListener(this);
        shahjalalButton.setOnClickListener(this);
        jaflongButton.setOnClickListener(this);
        ratargulButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.SUSTId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","sust");
            startActivity(intent);
        }
        if(v.getId()==R.id.teagardenId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","garden");
            startActivity(intent);
        }


        if(v.getId()==R.id.shajalalId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","shahjalal");
            startActivity(intent);
        }

        if(v.getId()==R.id.jaflongId) {
            intent = new Intent(this, ProfileActivity.class);

            intent.putExtra("name", "jaflong");
            startActivity(intent);
        }
        if(v.getId()==R.id.ratargulId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","ratargul");
            startActivity(intent);
        }
    }

}
