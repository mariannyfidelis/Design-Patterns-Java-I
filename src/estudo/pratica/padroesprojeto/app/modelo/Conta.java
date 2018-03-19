package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Conta {

    private String titular;
    private double saldo;
    private LocalDate dataAbertura;

    public Conta(){}
    
    public Conta(String titular, double saldo, LocalDate data){
        
        this.titular = titular;
        this.saldo = saldo;
        this.dataAbertura = data;
        System.out.println(data);  
    }
    
    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public String getTitular() {
        return titular;
    }
    
    public LocalDate getDataAbertura() {
        
        return dataAbertura;
    }
}
