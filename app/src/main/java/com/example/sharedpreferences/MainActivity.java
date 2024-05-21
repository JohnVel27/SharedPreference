package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview1);
        button1 = findViewById(R.id.write1);
        button2 = findViewById(R.id.read1);

        String username = "dark27hitman";
        String password = "56789";

        button1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Sharedpreferencename",MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("username",username);
                        editor.putString("password",password);
                        editor.apply();
                        Toast.makeText(MainActivity.this,"Success",Toast.LENGTH_LONG).show();
                    }
                }
        );
        button2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SharedPreferences sharedPreferences = getSharedPreferences("Sharedpreferencename",MODE_PRIVATE);
                        String username,password;
                        username = sharedPreferences.getString("username","");
                        password = sharedPreferences.getString("password","");
                        textView.setText("Username: " + username + "\nPassword: " + password +"\n" );

                    }
                }
        );
    }
}