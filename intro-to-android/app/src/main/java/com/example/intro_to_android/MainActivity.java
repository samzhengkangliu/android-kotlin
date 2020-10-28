package com.example.intro_to_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view ) {

        EditText usernameEditText = (EditText) findViewById(R.id.usernameEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        Log.i("Info", "Button pressed!");

        Log.i("Username", usernameEditText.getText().toString());
        Log.i("Password", passwordEditText.getText().toString());

        Toast.makeText(this, "Hello " + usernameEditText.getText().toString(),
                Toast.LENGTH_SHORT).show();
    }

    public void switchCat(View view) {
        Log.i("Info", "button pressed!");

        ImageView image = (ImageView) findViewById(R.id.catImageView);
        image.setImageResource(R.drawable.cat2);

    }
}