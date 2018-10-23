package com.example.wojci.firstproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    TextView textView;
    Button buttonClicker;
    Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.welcomeText);
        textView.setText("Text sie zmienił");
        textView.setOnClickListener(this);

        buttonClicker = findViewById(R.id.button1);
        buttonClicker.setText("Zmienilem text");
        buttonClicker.setOnClickListener(this);

        buttonNext = findViewById(R.id.next);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("test", "Pochodzę z innego activity");
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onPause() {

        super.onPause();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == buttonClicker.getId()) {
            Toast.makeText(this, "Kliknieto mnie", Toast.LENGTH_LONG).show();
//        } else if (v.getId() == button2.getId()) {
//            Toast.makeText(this, "Kliknieto guzik 2", Toast.LENGTH_LONG).show();
        } else if (v.getId() == textView.getId()) {
            Toast.makeText(this, "Dlaczego klikasz w text?", Toast.LENGTH_SHORT).show();
        }
    }
}
