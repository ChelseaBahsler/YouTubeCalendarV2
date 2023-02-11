package com.cbahsler.YouTubeCalandar;

import android.content.ClipData;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeActivity extends AppCompatActivity {

    private FirebaseUser user;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.profile_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.item1){
            Toast.makeText(this, "Switch account", Toast.LENGTH_LONG).show();
            return true;
        }
        else if(item.getItemId() == R.id.item2){
            Toast.makeText(this, "Switch account", Toast.LENGTH_LONG).show();
            return true;
        }
        else if(item.getItemId() == R.id.item3){
            Toast.makeText(this, "Switch account", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Layout components and the Firebase login authentication functionality is set-up for use.
     */
    private void init() {
        // Get user details
        FirebaseAuth auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();

        /*// Set Btn logout event
        Button btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(view -> logout());*/

        // Set profile image from user
        ImageView profile = findViewById(R.id.profile_pic);
        Glide.with(getApplicationContext())
                .load(user.getPhotoUrl())
                .circleCrop()
                .into(profile);
    }

    /**
     * User logs out. Activity finishes.
     */
    private void logout() {
        Toast.makeText(
                HomeActivity.this,
                user.getDisplayName() + " has signed out",
                Toast.LENGTH_SHORT).show();
        AuthUI.getInstance().signOut(this);
        finish();
    }
}