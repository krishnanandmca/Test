package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1, t2;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText)findViewById(R.id.t1);
        t2 = (EditText)findViewById(R.id.t2);

        text = (TextView)findViewById(R.id.text);

    }


//    public void handleClick(View view) {
//
//        Toast toast = Toast.makeText(getApplicationContext(),"Clicked the button",Toast.LENGTH_LONG);
//        toast.setMargin(50,50);
//        toast.show();
//    }
//
//    public void displayMsg(View view) {
//        Toast toast = Toast.makeText(getApplicationContext(),R.string.msg,Toast.LENGTH_LONG);
//        toast.setMargin(100,1);
//        toast.show();
//    }

    public void sumFun(View v1) {
        int n1, n2, sum;
        n1 = Integer.parseInt(t1.getText().toString());
        n2 = Integer.parseInt(t2.getText().toString());
        sum = n1+n2;
        text.setText(String.valueOf(sum));


    }


    public void subFun(View v1) {
        int n1, n2, sub;
        n1 = Integer.parseInt(t1.getText().toString());
        n2 = Integer.parseInt(t2.getText().toString());
        sub = n1-n2;
        text.setText(String.valueOf(sub));


    }


    public void mulFun(View v1) {
        int n1, n2, mul;
        n1 = Integer.parseInt(t1.getText().toString());
        n2 = Integer.parseInt(t2.getText().toString());
        mul = n1*n2;
        text.setText(String.valueOf(mul));


    }

}