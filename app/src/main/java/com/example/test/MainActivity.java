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

//8-9-23
//method1

// package com.example.newpro8;

// import androidx.appcompat.app.AppCompatActivity;

// import android.os.Bundle;
// import android.view.View;
// import android.widget.Button;
// import android.widget.Toast;

// public class MainActivity extends AppCompatActivity {
//     Button b,b2;

//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//         super.onCreate(savedInstanceState);
//         setContentView(R.layout.activity_main);
//         b = findViewById(R.id.button);
//         b2 = findViewById(R.id.button2);
//         b.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View v) {
//                 Toast.makeText(getApplicationContext(),"hi", Toast.LENGTH_LONG).show();
//             }
//         });

//         b2.setOnClickListener(new View.OnClickListener() {
//             @Override
//             public void onClick(View v) {
//                 Toast.makeText(getApplicationContext(),"another hi", Toast.LENGTH_LONG).show();
//             }
//         });



//     }


// }





//method2
// package com.example.newpro28;

// import androidx.appcompat.app.AppCompatActivity;

// import android.os.Bundle;
// import android.view.View;
// import android.widget.Button;
// import android.widget.Toast;

// public class MainActivity extends AppCompatActivity implements View.OnClickListener{
//     Button b1,b2;
//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//         super.onCreate(savedInstanceState);
//         setContentView(R.layout.activity_main);
//         b1 = (Button)findViewById(R.id.b1);
//         b2 = (Button)findViewById(R.id.b2);

//         b1.setOnClickListener(this);
//         b2.setOnClickListener(this);

//     }

//     @Override
//     public void onClick(View v) {
//         int click = v.getId();
//         if(R.id.b1 == click){
//             Toast.makeText(getApplicationContext(),"button1",Toast.LENGTH_LONG).show();
//         }else if(R.id.b2 == click){
//             Toast.makeText(getApplicationContext(),"button2",Toast.LENGTH_LONG).show();
//         }
//     }


// }
