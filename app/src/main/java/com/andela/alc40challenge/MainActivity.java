package com.andela.alc40challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mInfoALCButton = findViewById(R.id.alc_info);
        Button mProfileInfoButton = findViewById(R.id.profile_info);


        mInfoALCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent alcIntent = new Intent(MainActivity.this, ALCInfoActivity.class);
                startActivity(alcIntent);
            }
        });


        mProfileInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profileIntent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
            }
        });
    }
}
