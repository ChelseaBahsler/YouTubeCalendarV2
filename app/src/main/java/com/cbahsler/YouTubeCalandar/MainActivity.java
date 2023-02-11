package com.cbahsler.YouTubeCalandar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Login Button
        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(view -> login());

        // Check user sign in status
        FirebaseAuth auth = FirebaseAuth.getInstance();
        FirebaseUser user = auth.getCurrentUser();

        // already signed in
        // open to already logged in page
        if (user != null) {
            Intent homeActivityIntent = new Intent(this, HomeActivity.class);
            startActivity(homeActivityIntent);
        }
    }

    private void login() {
        Intent loginActivityIntent = new Intent(this, FBGoogleLogin.class);
        startActivity(loginActivityIntent);
    }
}