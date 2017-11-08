package br.com.calculadorakm.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class KilometragemActivity extends AppCompatActivity {

    TextView text_txtJanairo;
    Double quilometragem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilometragem);

        text_txtJanairo = (TextView) findViewById(R.id.text_txtJanairo);

        Viagem v = new Viagem();
        quilometragem= v.getKm().doubleValue();


    }
}
