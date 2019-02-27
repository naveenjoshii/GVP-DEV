package com.example.hp.itjunior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button btn;
   CheckBox cb1,cb2;
   RadioButton rb1,rb2;
   String s="",s1="",s2="",s3="",s4;
   EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1 = (CheckBox)findViewById(R.id.ck1);
        cb2 = (CheckBox)findViewById(R.id.ck2);
        rb1 =(RadioButton)findViewById(R.id.rb1);
        rb2 =(RadioButton)findViewById(R.id.rb2);
        et = (EditText)findViewById(R.id.et);
        btn= (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s = et.getText().toString();
                if(!s.equals("")&& (cb1.isChecked()||cb2.isChecked())&&(rb1.isChecked()||rb2.isChecked())){
                    if(cb1.isChecked()){
                       s1="IT1";
                    } if(cb2.isChecked()){
                        s2="IT2";
                    }
                    if(rb1.isChecked()){
                        s3="Male";
                    }else if(rb2.isChecked()){
                        s3="Female";
                    }
                    Intent i = new Intent(MainActivity.this,secondActivity.class);
                    i.putExtra("name",s);
                    i.putExtra("branch",s1);
                    i.putExtra("branch2",s2);
                    i.putExtra("gender",s3);
                    startActivity(i);
                }else{
                    et.setError("Enter Name ");
                    Toast.makeText(getApplicationContext(),"Enter Details correctly",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

}
