package com.project.lucky_number_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;



public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button btn;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);




        txt = findViewById(R.id.textView);
        editText = findViewById(R.id.edit_text);
        btn  = findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = editText.getText().toString();

                // Explicit Intent
                Intent i = new Intent(
                        getApplicationContext(),
                        SecondActivity.class
                );

                // Passing the name to second activity
                i.putExtra("name",userName);

                startActivity(i);
            }
        });




    }
}