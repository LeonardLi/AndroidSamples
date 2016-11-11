package com.example.xiaode.emoi;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidget();

    }

    private void initWidget(){
        ImageButton button_music = (ImageButton)findViewById(R.id.button_music);
        ImageButton button_light = (ImageButton)findViewById(R.id.button_light);
        ImageButton button_bluetooth = (ImageButton)findViewById(R.id.button_bluetooth);
        ImageButton button_file = (ImageButton)findViewById(R.id.button_file);
        ImageButton button_little = (ImageButton)findViewById(R.id.button_little);


        button_music.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Music button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        button_light.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "light button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        button_bluetooth.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "bluetooth button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        button_file.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "file button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
        button_little.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "little button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
