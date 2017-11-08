package br.com.calculadorakm.app;

import com.orm.SugarRecord;

/**
 * Created by 16254860 on 30/10/2017.
 */

public class Viagem extends SugarRecord {

    private Double idMes;
    private Double km;


    Viagem(){}

    public void Viagem(Double mes, Double km){
        this.idMes= mes;
        this.km= km;


        return;
    }

    public Double getMes() {
        return idMes;
    }

    public void setMes(Double mes) {
        this.idMes = mes;
    }

    public Double getKm() {
        return km;
    }

    public void setKm(Double km) {
        this.km = km;
    }


}
