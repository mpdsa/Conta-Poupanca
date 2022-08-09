package com.trybe.contapoupanca;

/** Classe ContaPoupanca. */
public class ContaPoupanca {
  private double saldo;
  private String titularConta;
  
  public ContaPoupanca(double saldo, String titularConta) {
    this.saldo = saldo;
    this.titularConta = titularConta;
  }

  public void depositar(Double valor) {
    this.saldo = this.saldo + valor;
  }

  public void sacar(Double valor) {
    this.saldo = this.saldo - valor;
  }
  
  public double mostrarSaldo() {
    return this.saldo;
  }

  public String mostrarTitularConta() {
    return this.titularConta;
  }
}
