package com.example.valentina.ejemplo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void clickBoton1(View vista) {
        textView.getText();
        Toast.makeText(this, "usted oprimio el boton1", Toast.LENGTH_SHORT).show();

    }

    public void clickBoton2(View vista) {
        textView.getText();
        Toast.makeText(this, "usted oprimio el boton2", Toast.LENGTH_SHORT).show();

    }
}
