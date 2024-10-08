package com.riser.twopay;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView forget_password = findViewById(R.id.textView2);

        forget_password.setOnClickListener(view -> {
            startActivity(new Intent(Login.this, ForgotUIP.class));
        });

        ImageView back_button = findViewById(R.id.imageView2);
        back_button.setOnClickListener(view -> {
            Toast display_out = Toast.makeText(getApplicationContext(), "Cannot Go Back, Login First!", Toast.LENGTH_SHORT);
            display_out.show();
        });

    }

}