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

        Button search = findViewById(R.id.search_button);
        whatToSearchFor = findViewById(R.id.input_name);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ProfilePage.class);
                whatToSearchForString = whatToSearchFor.getText().toString();
                intent.putExtra("name", whatToSearchForString);
                startActivity(intent);
            }
        });
    }

}
