package com.asif.from;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Singup extends AppCompatActivity {
    EditText name,num,Email,pass1;
Button Reg;
TextView Ibtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        name = findViewById(R.id.name);
        num = findViewById(R.id.num);
        Email = findViewById(R.id.Email);
        pass1 = findViewById(R.id.pass1);
        Reg = findViewById(R.id.Reg);
        Ibtn = findViewById(R.id.Ibtn);

        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Name,Num,Mail,passw;

                Name = name.getText().toString();
               Num = num.getText().toString();
               Mail = Email.getText().toString();
                passw= pass1.getText().toString();

                if(Name.equals(""));{
                    Toast.makeText(Singup.this,"Name is Blank",Toast.LENGTH_SHORT).show();
                }
                if(Num.equals(""));{
                    Toast.makeText(Singup.this,"Number is Blank",Toast.LENGTH_SHORT).show();
                }
                if(Mail.equals(""));{
                    Toast.makeText(Singup.this,"Email is Blank",Toast.LENGTH_SHORT).show();
                }
                if(passw.equals(""));{
                    Toast.makeText(Singup.this,"Password is Blank",Toast.LENGTH_SHORT).show();
                }
            }
        });
        Ibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent R =new Intent(Singup.this,MainActivity.class);
                startActivity(R);
                finish();
            }
        });
    }
}