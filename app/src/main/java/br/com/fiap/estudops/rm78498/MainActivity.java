package br.com.fiap.estudops.rm78498;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkToy01;
    CheckBox chkToy02;
    CheckBox chkToy03;
    TextView txtCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkToy01 = findViewById(R.id.chkToy01);
        chkToy02 = findViewById(R.id.chkToy02);
        chkToy03 = findViewById(R.id.chkToy03);
        txtCalculo = findViewById(R.id.txtCalculo);
    }

    @SuppressLint("SetTextI18n")
    public void calcular (View view) {
        double total = 0.0;

        if (chkToy01.isChecked()){
            total += 20;
        }

        if (chkToy02.isChecked()){
            total += 15;
        }

        if (chkToy03.isChecked()){
            total += 50;
        }

        txtCalculo.setText("R$ " + String.valueOf(total));
        Toast.makeText(this, "R$ " + total, Toast.LENGTH_SHORT).show();
    }

    public void detalhesToy01(View view) {
        Intent it =  new Intent(this, Toy01Activity.class);
        startActivity(it);
    }

    public void detalhesToy02(View view) {
        Intent it =  new Intent(this, Toy02Activity.class);
        startActivity(it);
    }

    public void detalhesToy03(View view) {
        Intent it =  new Intent(this, Toy03Activity.class);
        startActivity(it);
    }


}
