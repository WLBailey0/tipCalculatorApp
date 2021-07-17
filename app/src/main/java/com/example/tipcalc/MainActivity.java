package com.example.tipcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button good = (Button) findViewById(R.id.good);
        Button excellent = (Button) findViewById(R.id.excellent);
        EditText bill  = (EditText) findViewById(R.id.bill);


        good.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText bill  = (EditText) findViewById(R.id.bill);
                TextView tipAmount = (TextView) findViewById(R.id.tipAmount);
                double billAmount = Double.parseDouble(bill.getText().toString());
                double tip = billAmount * .15;
                tipAmount.setText(String.format("Tip Amount\n$%.2f\nTotal\n$%.2f", tip, (billAmount + tip)));
            }
        });
        excellent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText bill  = (EditText) findViewById(R.id.bill);
                TextView tipAmount = (TextView) findViewById(R.id.tipAmount);
                double billAmount = Double.parseDouble(bill.getText().toString());
                double tip = billAmount * .25;
                tipAmount.setText(String.format("Tip Amount\n$%.2f\nTotal\n$%.2f", tip, (billAmount + tip)));
            }
        });
    }

}