package com.example.administrator.sqliteloginactivity;

//package com.example.user.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChattagramActivity extends AppCompatActivity implements View.OnClickListener{
    private Button SaintMartinButton,CheraDipButton,InaniBeachButton,LaboniBeachButton,SitakundaEcoParkButton,MohamayaLakeButton,SandwipButton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chattagram);

        SaintMartinButton=(Button)findViewById(R.id.saintmartinId);
        CheraDipButton=(Button)findViewById(R.id.cheradipId);
        InaniBeachButton=(Button)findViewById(R.id.inanibeachId);
        LaboniBeachButton=(Button)findViewById(R.id.labonibeachId);
        SitakundaEcoParkButton=(Button)findViewById(R.id.sitakundaecoparkId);
        MohamayaLakeButton=(Button)findViewById(R.id.mohamayalakeId);
        SandwipButton=(Button)findViewById(R.id.sandwipId);

        SaintMartinButton.setOnClickListener(this);
        CheraDipButton.setOnClickListener(this);
        InaniBeachButton.setOnClickListener(this);
        LaboniBeachButton.setOnClickListener(this);
        SitakundaEcoParkButton.setOnClickListener(this);
        MohamayaLakeButton.setOnClickListener(this);
        SandwipButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.saintmartinId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","saint");
            startActivity(intent);
        }

        if(v.getId()==R.id.cheradipId){
            intent=new Intent(this,ProfileActivity.class);
            intent.putExtra("name","ceradip");
            startActivity(intent);
        }

        if(v.getId()==R.id.inanibeachId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","inani");
            startActivity(intent);
        }

        if(v.getId()==R.id.labonibeachId) {
            intent = new Intent(this, ProfileActivity.class);

            intent.putExtra("name", "laboni");
            startActivity(intent);
        }
        if(v.getId()==R.id.sitakundaecoparkId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","sitakun");
            startActivity(intent);
        }

        if(v.getId()==R.id.mohamayalakeId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","mohanada");
            startActivity(intent);
        }

        if(v.getId()==R.id.sandwipId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","sendip");
            startActivity(intent);
        }
    }

}
