package com.example.mlrit.registrationform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1;
    EditText ed2;
    EditText ed3;
    Button b;
        @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.e1);
        ed2=(EditText)findViewById(R.id.e2);
        ed3=(EditText)findViewById(R.id.e3);
        b=(Button)findViewById(R.id.b1);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(MainActivity.this,"not registerd",Toast.LENGTH_LONG);
                    String s1 = ed1.getText().toString();
                    String s2 = ed2.getText().toString();
                    String s3 = ed3.getText().toString();
                   if (s1.equals("")) {
                       ed1.setError("");
                       Toast.makeText(MainActivity.this, "Not Registered", Toast.LENGTH_LONG).show();
                   }
                    else if (s2.equals("")) {
                       ed2.setError("");
                       Toast.makeText(MainActivity.this, "Not Registered", Toast.LENGTH_LONG).show();
                   }
                    else if(s3.equals("")) {

                       ed3.setError(" ");
                       Toast.makeText(MainActivity.this, "Not Registered", Toast.LENGTH_LONG).show();
                   }
                    else
                        Toast.makeText(MainActivity.this,"Registered",Toast.LENGTH_LONG).show();

                }   });
    }
}
