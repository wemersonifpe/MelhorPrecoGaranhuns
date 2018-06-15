package br.com.gustech.android.melhoprecogaranhuns;

/**
 * Created by 20162D13GR0323 on 14/06/2018.
 */

public class Endereco {

    private int numero;
    private String cidade;
    private String bairro;
    private String rua;
    private String estado;
    private String cep;

    public Endereco(int numero, String cidade, String bairro, String rua, String estado, String cep) {
        this.numero = numero;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.estado = estado;
        this.cep = cep;
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

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
