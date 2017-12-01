package com.example.mayankjain.checking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int aScore=0,bScore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void getp3(View view){
        aScore+=3;
        TextView t=(TextView) findViewById(R.id.a);
        t.setText("" +aScore);}
    public void getp2(View view){aScore+=2;TextView t=(TextView) findViewById(R.id.a); t.setText("" +aScore);}
    public void getp0(View view){TextView t=(TextView) findViewById(R.id.a); t.setText(""+aScore);}

    public void getp3b(View view){bScore+=3; TextView t=(TextView) findViewById(R.id.b); t.setText(""+bScore);}
    public void getp2b(View view){bScore+=2;TextView t=(TextView) findViewById(R.id.b); t.setText(""+bScore);}
    public void getp0b(View view){TextView t=(TextView) findViewById(R.id.b); t.setText(""+bScore);}




    public void res(View view)
    {
        aScore=0;
        bScore=0;
        TextView t=(TextView) findViewById(R.id.b); t.setText("" +bScore);
        TextView t2=(TextView) findViewById(R.id.a); t2.setText("" +aScore);
    }

}
