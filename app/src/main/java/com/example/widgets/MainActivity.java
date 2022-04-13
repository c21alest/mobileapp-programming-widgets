package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private EditText whatToSearchFor;
    private String whatToSearchForString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Kopplar variabler mot widgets
        Button search = findViewById(R.id.search_button);
        whatToSearchFor = findViewById(R.id.input_name);

        search.setOnClickListener(new View.OnClickListener() { // Listner för sök knapp
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfilePage.class); // Skapar intent till profilsida
                whatToSearchForString = whatToSearchFor.getText().toString(); // Ger variabeln texten från EditText fält

                // Startar intent och skickar med extras datan
                intent.putExtra("name", whatToSearchForString);
                startActivity(intent);
            }
        });
    }

}
