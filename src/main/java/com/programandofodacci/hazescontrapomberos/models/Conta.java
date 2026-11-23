package com.programandofodacci.hazescontrapomberos.models;

import java.time.LocalDateTime;

public class Conta {
    private Long id;
    private String nome;
    private String email;
    private String data;
    private String telefone;
    private String password;

    public Conta(Long id, String nome, String email, String data, String telefone, String password) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.data = data;
        this.telefone = telefone;
        this.password = password;
    }

    public Conta(String nome, String email, String data, String telefone, String password) {
        this.nome = nome;
        this.email = email;
        this.data = data;
        this.telefone = telefone;
        this.password = password;
    }

    //Getters
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getData() {
        return data;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getPassword() {
        return password;
    }
    
    //Setters

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
