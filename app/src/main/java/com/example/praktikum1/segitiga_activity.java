package com.example.praktikum1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class segitiga_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga2);
        final EditText alas =
                (EditText) findViewById(R.id.input_luas);
        final EditText tinggi =
                (EditText) findViewById(R.id.input_tinggi);
        final EditText hasil =
                (EditText) findViewById(R.id.output_hasil);
        final Button tampil =
                (Button) findViewById(R.id.button_hsl);
        tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tinggi1, alas1;
                alas1 = Double.parseDouble(alas.getText().toString());
                tinggi1 = Double.parseDouble(tinggi.getText().toString());
                Double rumus = 0.5 * alas1 * tinggi1;
                hasil.setText(Double.toString(rumus));
            }
        });
    }
}