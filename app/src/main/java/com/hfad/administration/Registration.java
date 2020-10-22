package com.hfad.administration;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

public class Registration extends AppCompatActivity {

    private EditText email, pswrd;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Button btn3 = (Button) findViewById(R.id.button3);
        final EditText email = (EditText) findViewById(R.id.editText);
        final EditText pswrd = (EditText) findViewById(R.id.editText2);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().isEmpty() || pswrd.getText().toString().isEmpty())
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Необходимо ввести все данные", Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
                    Intent intent = new Intent(Registration.this, LetterActivity.class);
                    startActivity(intent);
                }
            }
        });
    }

}
