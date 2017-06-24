package com.example.android.music_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Find the View that shows Main Page
        Button mainpage = (Button) findViewById(R.id.get_started);

        //Set a click listener on that View
        mainpage.setOnClickListener(new View.OnClickListener() {
            //The code will be executed when Button is clicked

            @Override
            public void onClick(View view) {
                //Create a new Intent to open the {@link MainPage}
                Intent mainPageIntent = new Intent(MainActivity.this, MainPage.class);
                // Start the new activity
                startActivity(mainPageIntent);
            }
        });

    }
}

