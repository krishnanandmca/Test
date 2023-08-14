package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void handleClick(View view) {

        Toast toast = Toast.makeText(getApplicationContext(),"Clicked the button",Toast.LENGTH_LONG);
        toast.setMargin(50,50);
        toast.show();
    }

    public void displayMsg(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),R.string.msg,Toast.LENGTH_LONG);
        toast.setMargin(100,1);
        toast.show();
    }


}