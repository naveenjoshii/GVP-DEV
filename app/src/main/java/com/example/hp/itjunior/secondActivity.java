package com.example.hp.itjunior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    TextView tv;
    String a,b,c,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv = (TextView)findViewById(R.id.tvv);
        Intent i = getIntent();
        a = i.getExtras().getString("name").toString();
        b = i.getExtras().getString("branch").toString();
        c = i.getExtras().getString("branch2").toString();
        d = i.getExtras().getString("gender").toString();
        tv.setText("Name "+a+" Branch "+b+"branch2 "+c+"gender "+d);

    }
}
