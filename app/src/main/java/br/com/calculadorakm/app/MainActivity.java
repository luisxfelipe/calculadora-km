package br.com.calculadorakm.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Double Valor;

    String Spinner;

    EditText txt_km;
    Button bt_inserir;
    Spinner spn_meses;

    Double id;
    Double quilometragem;

    private List<String> meses = new ArrayList<>();

    private Double valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");
        meses.add("Julho");
        meses.add("Agosto");
        meses.add("Setembro");
        meses.add("Outubro");
        meses.add("Novembro");
        meses.add("Desembro");

        spn_meses = (Spinner) findViewById(R.id.spn_meses);

        ArrayAdapter<String> ArrayAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, meses);
        ArrayAdapter<String> spinnerArrayAdapter = ArrayAdapter;
        spinnerArrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spn_meses.setAdapter(spinnerArrayAdapter);

        txt_km = (EditText) findViewById(R.id.txt_km);

        bt_inserir = (Button) findViewById(R.id.bt_inserir);



    }


    public void inserirKm (Context conext){
        id.parseDouble(String.valueOf(spn_meses));
        quilometragem.parseDouble(String.valueOf(txt_km));

        Viagem v = new Viagem();
        v.setMes(id);
        v.setKm(quilometragem);
        v.save();

        Intent i = new Intent(this, KilometragemActivity.class);
        startActivity(i);



    }



}
