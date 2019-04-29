package com.example.administrator.sqliteloginactivity;

//package com.example.user.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DhakaActivity extends AppCompatActivity implements OnClickListener{
    private Button HatirjheelButton,StarMosqueButton,AhsanmanzilButton,LalbaghKellaButton,NandanParkButton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka);

        HatirjheelButton=(Button)findViewById(R.id.hatirjheelId);
        StarMosqueButton=(Button)findViewById(R.id.starmosqueId);
        AhsanmanzilButton=(Button)findViewById(R.id.ahsanmanzilId);
        LalbaghKellaButton=(Button)findViewById(R.id.lalbaghkellaId);
        NandanParkButton=(Button)findViewById(R.id.nandanparkId);

        HatirjheelButton.setOnClickListener(this);
        StarMosqueButton.setOnClickListener(this);
        AhsanmanzilButton.setOnClickListener(this);
        LalbaghKellaButton.setOnClickListener(this);
        NandanParkButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.hatirjheelId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","hatirjheel");
            startActivity(intent);
        }

        if(v.getId()==R.id.starmosqueId){
            intent=new Intent(this,ProfileActivity.class);
            intent.putExtra("name","starmosque");
            startActivity(intent);
        }

        if(v.getId()==R.id.ahsanmanzilId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","ahsanmanzil");
            startActivity(intent);
        }

        if(v.getId()==R.id.lalbaghkellaId) {
            intent = new Intent(this, ProfileActivity.class);

            intent.putExtra("name", "lalbaghkella");
            startActivity(intent);
        }
        if(v.getId()==R.id.nandanparkId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","nandanpark");
            startActivity(intent);
        }
    }

}
