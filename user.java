package com.example.practical13_1;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText user,pass;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b= findViewById(R.id.btn1);
        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!user.getText().toString().isEmpty() & !pass.getText().toString().isEmpty())
                {
                    Toast.makeText( getApplicationContext(),"Login Sucessful",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText( getApplicationContext(),"Login UnSucessful",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
