package com.programandofodacci.hazescontrapomberos.models;

import com.google.gson.annotations.SerializedName;
public class Planta {
    @SerializedName("nome_planta") protected String nome;
    @SerializedName("qntd_vida") protected int vida;
    @SerializedName("qntd_custo") protected int custo;
    @SerializedName("local_imagem") protected String img;
    @SerializedName("defesa") protected int defesa;
    @SerializedName("dano") protected int dano;

    
    //Construtor
    public Planta() {
    }
    public Planta(String nome, int vida, int custo, String img, int defesa, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.custo = custo;
        this.img = img;
        this.defesa = defesa;
        this.dano = dano;
    }
    
    
    
    //Getters
    public String getNome() {
        return nome;
    }
    public int getVida() {
        return vida;
    }
    public int getCusto() {
        return custo;
    }
    public String getImg() {
        return img;
    }
    public int getDefesa() {
        return defesa;
    }
    public int getDano() {
        return dano;
    }
    
    
    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public void setCusto(int custo) {
        this.custo = custo;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }
    
     
    
    
}
