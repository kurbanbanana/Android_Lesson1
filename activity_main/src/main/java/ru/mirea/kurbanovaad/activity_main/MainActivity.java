package ru.mirea.kurbanovaad.activity_main;

import static ru.mirea.kurbanovaad.activity_main.R.id.textView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.textViewStudent);
        TextView myTextView = (TextView) findViewById(textView);
        myTextView.setText("New text in MIREA");

        Button button = findViewById(R.id.button);
        button.setText("MireaButton");

        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setChecked(true);
    }
}