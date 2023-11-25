package model;

public abstract class Espaco {
private boolean cobertura;

    public Espaco(boolean cobertura) {
        this.cobertura = cobertura;
    }
    public Espaco() {
        this.cobertura = false;
    }

    public boolean getCobertura() {
        return cobertura;
    }
    

    public void setCobertura(boolean cobertura) {
        this.cobertura = cobertura;
    }
    
        public boolean valida()
    {
        // Escrever aqui o código de validação
        return true;
    }
    
@Override
public String toString() {
    return "Espaco{" +
            "cobertura=" + cobertura +
            '}';
}
}
