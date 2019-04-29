package com.example.administrator.sqliteloginactivity;

//package com.example.user.listview;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        imageView = (ImageView) findViewById(R.id.imageViewId);
        textView = (TextView) findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String rajshahiArea = bundle.getString("name");
            showDetails(rajshahiArea);
        }
    }

    void showDetails(String rajshahiArea) {
        if (rajshahiArea.equals("rajshahi university")) {
            imageView.setImageResource(R.drawable.rajshahiuniversity);
            textView.setText(R.string.RajshahiUniversity_text);
        }

        if (rajshahiArea.equals("ruet")) {
            imageView.setImageResource(R.drawable.ruet);
            textView.setText(R.string.ruet_text);
        }

        if (rajshahiArea.equals("safina park")) {
            imageView.setImageResource(R.drawable.shafinapark);
            textView.setText(R.string.safinapark_text);
        }

        if (rajshahiArea.equals("padma par")) {
            imageView.setImageResource(R.drawable.padmapar);
            textView.setText(R.string.padmarpar_text);
        }

        if (rajshahiArea.equals("amcottor")) {
            imageView.setImageResource(R.drawable.amchottor);
            textView.setText(R.string.amcottor_text);
        }

        if (rajshahiArea.equals("comilla")) {
            //imageView.setImageResource(R.drawable.comillla);
            textView.setText(R.string.comilla_text);
            Resources res = getResources(); /** from an Activity */
            imageView.setImageDrawable(res.getDrawable(R.drawable.comillla));

        }
        if (rajshahiArea.equals("bard")) {
            imageView.setImageResource(R.drawable.bard);
            textView.setText(R.string.bard_text);

        }
        if (rajshahiArea.equals("moynamoti")) {
            imageView.setImageResource(R.drawable.moynamoti);
            textView.setText(R.string.moinamoti_text);

        }
        if (rajshahiArea.equals("lalmoy")) {
            imageView.setImageResource(R.drawable.lalmoy);
            textView.setText(R.string.lalmoy_text);
        }

        if (rajshahiArea.equals("hatirjheel")) {
            imageView.setImageResource(R.drawable.hatirjheel);
            textView.setText(R.string.hatirjheel_text);
        }

        if (rajshahiArea.equals("starmosque")) {
            imageView.setImageResource(R.drawable.starmosque);
            textView.setText(R.string.starmosque_text);
        }

        if (rajshahiArea.equals("ahsanmanzil")) {
            imageView.setImageResource(R.drawable.ahsanmanzil);
            textView.setText(R.string.ahaasnmanzil_text);
        }

        if (rajshahiArea.equals("lalbaghkella")) {
            imageView.setImageResource(R.drawable.lalbagerkella);
            textView.setText(R.string.lalbaghkella_text);
        }

        if (rajshahiArea.equals("nandanpark")) {
            imageView.setImageResource(R.drawable.nandanpark);
            textView.setText(R.string.nandanpark_text);
        }
        if (rajshahiArea.equals("nandanpark")) {
            imageView.setImageResource(R.drawable.nandanpark);
            textView.setText(R.string.nandanpark_text);
        }
        if (rajshahiArea.equals("saint")) {
            imageView.setImageResource(R.drawable.sintmartin);
            textView.setText(R.string.saintmartin_text);
        }

        if (rajshahiArea.equals("ceradip")) {
            imageView.setImageResource(R.drawable.cheradip);
            textView.setText(R.string.cheradip_text);
        }

        if (rajshahiArea.equals("inani")) {
            imageView.setImageResource(R.drawable.inanibeach);
            textView.setText(R.string.inanibeach_text);
        }
        if (rajshahiArea.equals("laboni")) {
            imageView.setImageResource(R.drawable.labonibeach);
            textView.setText(R.string.labonibech_text);
        }

        if (rajshahiArea.equals("sitakun")) {
            imageView.setImageResource(R.drawable.sitakundaecopark);
            textView.setText(R.string.sitakudaecopark_text);
        }
        if (rajshahiArea.equals("mohanada")) {
            imageView.setImageResource(R.drawable.mohamayalake);
            textView.setText(R.string.mohamayalake_text);
        }
        if (rajshahiArea.equals("sendip")) {
            imageView.setImageResource(R.drawable.sandwip);
            textView.setText(R.string.sandwip_text);
        }
        if (rajshahiArea.equals("shopnopur")) {
            imageView.setImageResource(R.drawable.shopnupuri);
            textView.setText(R.string.shopnopuri_text);
        }

        if (rajshahiArea.equals("vinnojagot")) {
            imageView.setImageResource(R.drawable.vinnojogot);
            textView.setText(R.string.vinnojogot_text);
        }

        if (rajshahiArea.equals("chini")) {
            imageView.setImageResource(R.drawable.chinimosque);
            textView.setText(R.string.chinimosque_text);
        }

        if (rajshahiArea.equals("tushbhander")) {
            imageView.setImageResource(R.drawable.tushabhandarjamindarbari);
            textView.setText(R.string.tushbahanderjomiderbari_text);
        }

        if (rajshahiArea.equals("gaibandha")) {
            imageView.setImageResource(R.drawable.gaibandhapouropark);
            textView.setText(R.string.gaibandhapouropark_text);
        }

        if (rajshahiArea.equals("shahi")) {
            imageView.setImageResource(R.drawable.shahimosque);
            textView.setText(R.string.shahimosque_text);
        }

        if (rajshahiArea.equals("sust")) {
            imageView.setImageResource(R.drawable.sust);
            textView.setText(R.string.SUST_text);
        }

        if (rajshahiArea.equals("garden")) {
            imageView.setImageResource(R.drawable.teagarden);
            textView.setText(R.string.teagarden_text);
        }

        if (rajshahiArea.equals("shahjalal")) {
            imageView.setImageResource(R.drawable.shajalalmazar);
            textView.setText(R.string.shahjalal_text);
        }

        if (rajshahiArea.equals("jaflong")) {
            imageView.setImageResource(R.drawable.jaflong);
            textView.setText(R.string.jaflong_text);
        }

        if (rajshahiArea.equals("ratargul")) {
            imageView.setImageResource(R.drawable.ratargul);
            textView.setText(R.string.ratargul_text);
        }

        if (rajshahiArea.equals("sundarbon")) {
            imageView.setImageResource(R.drawable.sundarban);
            textView.setText(R.string.sundarban_text);
        }

        if (rajshahiArea.equals("sixty")) {
            imageView.setImageResource(R.drawable.shaitgumbadmasjid);
            textView.setText(R.string.sixtygumbujmosque_text);
        }

        if (rajshahiArea.equals("lalon")) {
            imageView.setImageResource(R.drawable.lalaonshamazar);
            textView.setText(R.string.lalonshamazar_text);
        }

        if (rajshahiArea.equals("kuakata")) {
            imageView.setImageResource(R.drawable.kuakataseabeach);
            textView.setText(R.string.kuakataseabech_text);
        }
        if (rajshahiArea.equals("guthia")) {
            imageView.setImageResource(R.drawable.guthiamosjid);
            textView.setText(R.string.guthiamosque_text);

        }

        if (rajshahiArea.equals("durgasagor")) {
            imageView.setImageResource(R.drawable.durgasagor);
            textView.setText(R.string.durgasagor_text);
        }

        if (rajshahiArea.equals("piara")) {
            imageView.setImageResource(R.drawable.piarabazar);
            textView.setText(R.string.piarabazar_text);
        }

        if (rajshahiArea.equals("arcu")) {
            imageView.setImageResource(R.drawable.bangladeshagriculturaluniversity);
            textView.setText(R.string.bangladesharicaltureuniversity_text);
        }

        if (rajshahiArea.equals("botanical")) {
            imageView.setImageResource(R.drawable.botanicalgarden);
            textView.setText(R.string.botanicalgarden_text);
        }

        if (rajshahiArea.equals("meuseum")) {
            imageView.setImageResource(R.drawable.museummymensingh);
            textView.setText(R.string.meuseummymenshign_text);
        }

        if (rajshahiArea.equals("nazrul")) {
            imageView.setImageResource(R.drawable.nazrulmemorialcenter);
            textView.setText(R.string.nuzrulmemorialcenter_text);
        }


    }
}


