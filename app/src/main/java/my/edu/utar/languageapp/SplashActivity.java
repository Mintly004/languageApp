package my.edu.utar.languageapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.support.v7.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private ImageView splashImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashImage = findViewById(R.id.splashImage);

        // Load animation
        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        splashImage.startAnimation(fadeInAnimation);

        // Delay for a few seconds and start the MainActivity
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 3000); // 3000 milliseconds (3 seconds)
    }
}
