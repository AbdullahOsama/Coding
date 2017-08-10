package com.example.gamer.codingchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView psg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        psg = (TextView) findViewById(R.id.textView);
        Intent it = getIntent();
        String mystr = it.getStringExtra(MainActivity.mymsg);
        switch (mystr){
            case MainActivity.PSG1 :
                psg.setText(R.string.passage1);
                break;
            case MainActivity.PSG2 :
                psg.setText(R.string.passage2);
                break;
            case MainActivity.PSG3 :
                psg.setText(R.string.passage3);
                break;
        }

    }
}
