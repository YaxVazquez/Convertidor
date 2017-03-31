package mx.a6im8.yaxiri.hernandez.vazquez.cecyt9.edu.vazquez_hernandez_yaxiri_6im8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText craneos;
    double dolars, pesos;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            craneos = (EditText) findViewById(R.id.cantidad);
        }

        void convertir (View vista){
            pesos = Double.parseDouble(craneos.getText().toString());
            dolars= pesos/15;

            Intent pasar = new Intent(this, Activity2.class);
            Bundle dinero = new Bundle();
            dinero.putString("dolares", Double.toString(dolars));
            pasar.putExtras(dinero);
            finish();
            startActivity(pasar);
        }
}

