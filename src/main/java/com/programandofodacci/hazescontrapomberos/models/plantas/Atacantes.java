package com.programandofodacci.hazescontrapomberos.models.plantas;

import com.programandofodacci.hazescontrapomberos.models.Planta;

public class Atacantes extends Planta{

    public Atacantes() {
    }

    public Atacantes(String nome, int vida, int custo, String img, int defesa, int dano) {
        super(nome, vida, custo, img, 5, dano);
    }
    
    public int atacar(){
        return dano;
    }
    

}
