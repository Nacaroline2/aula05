package model;

public class Endereco {
    
    private String rua;
    private int numero;
    private String cidade;
    private String referencia;

    
    public Endereco(String rua, int numero, String cidade, String referencia) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.referencia = referencia;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    
}
