package com.example.aluno.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textValor1;
    private TextView textValor2;
    private EditText editValor;
    private EditText editValor2;
    private Button buttonSoma;
    private Button buttonSub;
    private Button buttonDiv;
    private Button buttonLimp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textValor1 = (TextView) findViewById(R.id.textValor1);
        textValor2 = (TextView) findViewById(R.id.textValor2);
        editValor = (EditText) findViewById(R.id.editValor);
        editValor2 = (EditText) findViewById(R.id.editValor2);
        buttonSoma = (Button) findViewById(R.id.buttonSoma);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonLimp = (Button) findViewById(R.id.buttonLimp);

        buttonSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double numb1 = Double.parseDouble(editValor.getText().toString());
                    Double numb2 = Double.parseDouble(editValor2.getText().toString());
                    Double total = numb1 + numb2;
                    Toast.makeText(MainActivity.this, ""+total, Toast.LENGTH_SHORT).show();
                }catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um problema, tente novamente!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double numb1 = Double.parseDouble(editValor.getText().toString());
                    Double numb2 = Double.parseDouble(editValor2.getText().toString());
                    Double total = numb1 - numb2;
                    Toast.makeText(MainActivity.this, ""+total, Toast.LENGTH_SHORT).show();
                }catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um problema, tente novamente!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Double numb1 = Double.parseDouble(editValor.getText().toString());
                    Double numb2 = Double.parseDouble(editValor2.getText().toString());
                    Double total = numb1 / numb2;
                    Toast.makeText(MainActivity.this, ""+total, Toast.LENGTH_SHORT).show();
                }catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um problema, tente novamente!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonLimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editValor.setText("");
                editValor2.setText("");
            }
        });
    }
}
