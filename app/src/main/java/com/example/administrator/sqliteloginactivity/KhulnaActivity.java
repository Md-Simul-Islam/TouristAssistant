package com.example.administrator.sqliteloginactivity;

//package com.example.user.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class KhulnaActivity extends AppCompatActivity implements View.OnClickListener{
    private Button SundarbanButton,SixtyDomeMosqueButton,LalonshaButton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna);

        SundarbanButton=(Button)findViewById(R.id.sundarbanId);
        SixtyDomeMosqueButton=(Button)findViewById(R.id.sixtydomemosqueId);
        LalonshaButton=(Button)findViewById(R.id.lalonshamazarId);

        SundarbanButton.setOnClickListener(this);
        SixtyDomeMosqueButton.setOnClickListener(this);
        LalonshaButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.sundarbanId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","sundarbon");
            startActivity(intent);
        }

        if(v.getId()==R.id.sixtydomemosqueId){
            intent=new Intent(this,ProfileActivity.class);
            intent.putExtra("name","sixty");
            startActivity(intent);
        }



        if(v.getId()==R.id.lalonshamazarId) {
            intent = new Intent(this, ProfileActivity.class);

            intent.putExtra("name", "lalon");
            startActivity(intent);
        }

    }

}
