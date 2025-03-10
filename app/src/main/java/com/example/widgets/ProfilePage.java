package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfilePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        // Kopplar variabler mot widgets
        TextView person = findViewById(R.id.person_field);
        ImageView ProfilePicture = findViewById(R.id.imageView);

        Bundle extras = getIntent().getExtras(); // Skapar bundle med tidigare extras från intent
        // Om det finns ett värde i extras (bundle) blir detta värdet för TextView
        if (extras != null) {
            String name = extras.getString("name");
            person.setText(name);
        }

        // Sätter profilbilden för ImageView widgeten
        ProfilePicture.setImageResource(R.drawable.ic_launcher_foreground);
    }
}