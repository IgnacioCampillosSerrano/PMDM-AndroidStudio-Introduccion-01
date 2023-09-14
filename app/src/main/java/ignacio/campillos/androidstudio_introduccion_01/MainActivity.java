package ignacio.campillos.androidstudio_introduccion_01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declare logic variables
    private int contador;

    //Declare interface variables
    private TextView textViewContador;
    private Button buttonIncrease;
    private Button buttonDecrease;
    private Button buttonReset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contador = 0;
        initializeInterfaceVar();

        buttonIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador++;
                textViewContador.setTextColor(Color.BLACK);
                textViewContador.setText(contador + " veces");

            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador = 0;
                textViewContador.setTextColor(Color.GREEN);
                textViewContador.setText("COUNTER HAS BEEN RESET");
            }
        });

        buttonDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            contador--;
                if(contador > 0 ){
                    textViewContador.setTextColor(Color.BLACK);
                    textViewContador.setText(contador + " veces");
                } else if (contador == 0) {
                    textViewContador.setText("EMPTY");
                    textViewContador.setTextColor(Color.RED);
                } else {
                    contador++;
                }
            }
        });
    }

    private void initializeInterfaceVar(){
        textViewContador = findViewById(R.id.textViewContador);
        buttonDecrease = findViewById(R.id.buttonDecrement);
        buttonIncrease = findViewById(R.id.buttonIncrement);
        buttonReset = findViewById(R.id.buttonReset);
    }

}