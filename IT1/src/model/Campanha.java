package model;

import utils.Data;



public class Campanha {
    private int codigo;
    private Data dataInicio;
    private Data dataFim;
    private double desconto;


    public Campanha(int codigo, Data dataInicio, Data dataFim, double desconto) {
        this.codigo = codigo;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.desconto = desconto;
    }
    public Campanha(){
        this.codigo = 0;
        this.dataInicio = new Data();
        this.dataFim = new Data();
        this.desconto = 0;
    
}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Data getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Data dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Data getDataFim() {
        return dataFim;
    }

    public void setDataFim(Data dataFim) {
        this.dataFim = dataFim;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
        public boolean valida()
    {
        // Escrever aqui o código de validação
        return true;
    }

    @Override
    public String toString() {
        return "Campanha{" +
                "codigo=" + codigo +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", desconto=" + desconto +
                '}';
    }
}