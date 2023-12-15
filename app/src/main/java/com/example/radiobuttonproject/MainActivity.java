package com.example.radiobuttonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        radioGroup = findViewById(R.id.radioGroup);
//        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                RadioButton radioButton = findViewById(androidx.appcompat.R.id.checked);
//            }
//        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radioGroup.getCheckedRadioButtonId();
                if (selectedId == -1) {
                    Toast.makeText(MainActivity.this, "Nothing is selected!", Toast.LENGTH_SHORT).show();
                } else {
                    radioButton = radioGroup.findViewById(selectedId);
                    Toast.makeText(getApplicationContext(), radioButton.getText(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}