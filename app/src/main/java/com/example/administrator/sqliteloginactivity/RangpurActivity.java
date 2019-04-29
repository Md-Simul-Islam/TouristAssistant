package com.example.administrator.sqliteloginactivity;

//package com.example.user.listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RangpurActivity extends AppCompatActivity implements View.OnClickListener{
    private Button ShopnopuriButton,VinnojogotButton,ChinimosqueButton,TushabanderjamiderbariButton,GaibandhapouroparkButton,ShahimosqueButton;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur);

        ShopnopuriButton=(Button)findViewById(R.id.shopnopuriId);
        VinnojogotButton=(Button)findViewById(R.id.vinnojogotId);
        ChinimosqueButton=(Button)findViewById(R.id.chinimosqueId);
        TushabanderjamiderbariButton=(Button)findViewById(R.id.tushbanderjamiderbariId);
        GaibandhapouroparkButton=(Button)findViewById(R.id.gaibandhapouroparkId);
        ShahimosqueButton=(Button)findViewById(R.id.shahimosqueId);

        ShopnopuriButton.setOnClickListener(this);
        VinnojogotButton.setOnClickListener(this);
        ChinimosqueButton.setOnClickListener(this);
        TushabanderjamiderbariButton.setOnClickListener(this);
        GaibandhapouroparkButton.setOnClickListener(this);
        ShahimosqueButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.shopnopuriId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","shopnopur");
            startActivity(intent);
        }

        if(v.getId()==R.id.vinnojogotId){
            intent=new Intent(this,ProfileActivity.class);
            intent.putExtra("name","vinnojagot");
            startActivity(intent);
        }

        if(v.getId()==R.id.chinimosqueId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","chini");
            startActivity(intent);
        }

        if(v.getId()==R.id.tushbanderjamiderbariId) {
            intent = new Intent(this, ProfileActivity.class);

            intent.putExtra("name", "tushbhander");
            startActivity(intent);
        }
        if(v.getId()==R.id.gaibandhapouroparkId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","gaibandha");
            startActivity(intent);
        }

        if(v.getId()==R.id.shahimosqueId){
            intent=new Intent(this,ProfileActivity.class);

            intent.putExtra("name","shahi");
            startActivity(intent);
        }
    }

}
