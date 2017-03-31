package mx.a6im8.yaxiri.hernandez.vazquez.cecyt9.edu.vazquez_hernandez_yaxiri_6im8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Yax on 31/03/2017.
 */

public class Activity2 extends AppCompatActivity {
    TextView resultado;
    String dolars, yoxi, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        resultado= (TextView) findViewById(R.id.result);

        Bundle dati = new Bundle();
        dati = this.getIntent().getExtras();
        dolars = dati.getString("dolares");
        yoxi ="Vázquez Hernández Yaxiri";
        resultado.setText(yoxi+",resultado: "+dolars+" dólares" );
    }

    public void enviar(View vistae){
        email="eoropezag@ipn.mx";

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "examen 1er parcial");
        intent.putExtra(Intent.EXTRA_TEXT,  resultado.getText().toString());
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {email} );
        startActivity(intent);
    }
}
