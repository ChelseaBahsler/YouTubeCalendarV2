package com.cbahsler.YouTubeCalandar;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseAuthUIActivityResultContract;
import com.firebase.ui.auth.data.model.FirebaseAuthUIAuthenticationResult;

import java.util.Collections;

/**
 * The Google Login functionality and logged-in user screen.
 */
public class FBGoogleLogin extends AppCompatActivity {

    /**
     * User logs in and btnLogout becomes visible.
     */
    private final ActivityResultLauncher<Intent> signInLauncher = registerForActivityResult(
            new FirebaseAuthUIActivityResultContract(),
            this::onSignInResult
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fbgoogle_login);


        Toast.makeText(this, "It went to the google sign in page.", Toast.LENGTH_LONG);

        // Build a google sign in authentication system
//        AuthUI.IdpConfig provider = new AuthUI.IdpConfig.GoogleBuilder().build();
//        Intent signInIntent = AuthUI.getInstance()
//                .createSignInIntentBuilder()
//                .setAvailableProviders(Collections.singletonList(provider))
//                .build();
//        signInLauncher.launch(signInIntent);
    }

    private void onSignInResult(FirebaseAuthUIAuthenticationResult result) {
        if (result.getResultCode() == RESULT_OK) {
            // Successfully signed in
            Intent signInIntent = new Intent(getBaseContext(), HomeActivity.class);
            startActivity(signInIntent);
            finish();
        }
    }
}