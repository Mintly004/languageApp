package my.edu.utar.languageapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;


public class SignUpActivity extends AppCompatActivity {

    private EditText editTextFullName;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private Button buttonSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        editTextFullName = findViewById(R.id.editTextFullName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonSignUp = findViewById(R.id.buttonSignUp);

        buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullName = editTextFullName.getText().toString();
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();

                // Implement your sign-up logic here
                // For demonstration purposes, display a toast message
                Toast.makeText(SignUpActivity.this, "Sign up clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
