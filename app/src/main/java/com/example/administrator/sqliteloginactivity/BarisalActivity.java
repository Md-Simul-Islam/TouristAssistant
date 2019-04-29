package com.example.administrator.sqliteloginactivity;


//package com.example.user.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BarisalActivity extends AppCompatActivity implements View.OnClickListener{
    private Button KuakataseabeachButton,GuthiamosqueButton,DurgasagorButton,PiarabazarButton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal);

        KuakataseabeachButton = (Button) findViewById(R.id.kuakataseabeachId);
        GuthiamosqueButton = (Button) findViewById(R.id.guthiamosqueId);
        DurgasagorButton = (Button) findViewById(R.id.durgasagorId);
        PiarabazarButton = (Button) findViewById(R.id.piarabazarId);


        KuakataseabeachButton.setOnClickListener(this);
        GuthiamosqueButton.setOnClickListener(this);
        DurgasagorButton.setOnClickListener(this);
        PiarabazarButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.kuakataseabeachId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","kuakata");
            startActivity(intent);
        }

        if(v.getId()==R.id.guthiamosqueId){
            intent=new Intent(this,ProfileActivity.class);
            intent.putExtra("name","guthia");
            startActivity(intent);
        }

        if(v.getId()==R.id.durgasagorId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","durgasagor");
            startActivity(intent);
        }

        if(v.getId()==R.id.piarabazarId) {
            intent = new Intent(this, ProfileActivity.class);

            intent.putExtra("name", "piara");
            startActivity(intent);
        }
        if(v.getId()==R.id.amcottorId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","amcottor");
            startActivity(intent);
        }
    }

}

