package com.ifsc.tds;

public class Viagem {
    // 1. Atributos da classe
    private double velocidadeMedia;
    private double tempoGasto;
    private double rendimentoCarro; // Os 12 km/l

    // 2. Método Construtor (Tem o exato mesmo nome da classe)
    // Ele exige as informações logo no momento do "new"
    public Viagem(double velocidadeMedia, double tempoGasto) {
        this.velocidadeMedia = velocidadeMedia;
        this.tempoGasto = tempoGasto;
        this.rendimentoCarro = 12.0; // Valor fixo do enunciado
    }

    // 3. Métodos sem parâmetros, pois eles já usam os atributos da classe!
    public double calcularDistancia() {
        return this.velocidadeMedia * this.tempoGasto;
    }

    public double calcularLitrosUsados() {
        double distancia = this.calcularDistancia();
        return distancia / this.rendimentoCarro;
    }
}