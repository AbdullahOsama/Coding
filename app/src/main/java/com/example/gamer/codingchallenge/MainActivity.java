package com.example.gamer.codingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public final static String PSG1 = "passage1";
    public final static String PSG2 = "passage2";
    public final static String PSG3 = "passage3";
    public final static String mymsg = "mymsgs";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void oneclick(View view) {
        switch (view.getId()){
            case R.id.btn1 :
                Intent inte1 = new Intent(this,DetailActivity.class);
                inte1.putExtra(mymsg,PSG1);
                startActivity(inte1);
                break;
            case R.id.btn2 :
                Intent inte2 = new Intent(this,DetailActivity.class);
                inte2.putExtra(mymsg,PSG2);
                startActivity(inte2);
                break;
            case R.id.btn3 :
                Intent inte3 = new Intent(this,DetailActivity.class);
                inte3.putExtra(mymsg,PSG3);
                startActivity(inte3);
                break;
        }
    }
}
