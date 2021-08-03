package com.example.projet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import static com.example.projet.R.id.button2;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText t1=(EditText)findViewById(R.id.LOGIN);
        EditText t2=(EditText)findViewById(R.id.passeword);
        Button b1=(Button)findViewById(R.id.button1);
        Button   b2=(Button)findViewById(R.id.button2);


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(LoginActivity.this, MainActivity3.class);
                startActivity(i2);

            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = t1.getText().toString();
                String passeword = t2.getText().toString();


                if (t1.length()==0 || t2.length()==0 ) {
                    Toast.makeText( LoginActivity.this ,"Vèrifez la saisie des notes", Toast.LENGTH_LONG).show();
                } else {

                    Intent i = new Intent(LoginActivity.this, MainActivity2.class);
                    startActivity(i);

                }

            }
        });
    }
}