package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button convert=(Button) findViewById(R.id.button_1);
        Button clear=(Button) findViewById(R.id.button2);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertcurrancy c=new convertcurrancy();
                EditText T_1=(EditText) findViewById(R.id.Edit_1);
                EditText T_2=(EditText) findViewById(R.id.Edit_2);
                if(!(T_1.getText().toString().equals("")) && !(T_2.getText().toString().equals("")) )
                {
                    Toast.makeText(MainActivity.this, "Enter only one type to convert", Toast.LENGTH_LONG).show();
                }
                else if((T_1.getText().toString().equals("")) && (T_2.getText().toString().equals("")) )
                {
                    Toast.makeText(MainActivity.this, "Enter valid number to convert", Toast.LENGTH_LONG).show();
                }
                else
                {
                   if(!(T_1.getText().toString().equals("")))
                   {
                       float dollars=Float.parseFloat(T_1.getText().toString());
                       c.setAmount(dollars);
                       float res=c.convertTopounds();
                       T_2.setText(String.valueOf(res));
                   }
                   else
                   {
                       float pounds=Float.parseFloat(T_2.getText().toString());
                       c.setAmount(pounds);
                       float res=c.convertToDollar();
                       T_1.setText(String.valueOf(res));
                   }
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText T_1=(EditText) findViewById(R.id.Edit_1);
                EditText T_2=(EditText) findViewById(R.id.Edit_2);
                if(!(T_1.getText().toString().equals("")) && !(T_2.getText().toString().equals("")) ) {

                    T_1.setText("");
                    T_2.setText("");
                }
                else {

                    Toast.makeText(MainActivity.this, "there is no input to clear", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}