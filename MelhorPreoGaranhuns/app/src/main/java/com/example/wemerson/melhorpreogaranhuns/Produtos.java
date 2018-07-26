package com.example.wemerson.melhorpreogaranhuns;

import android.support.annotation.NonNull;

import java.time.LocalDate;

public class Produtos implements Comparable<Produtos>{
    private Integer produto_id;
    private String bairro;
    private String cep;
    private String cnpj;
    private Long codMunicipio;
    private LocalDate dataEmissao;
    private String descricao;
    private String endereco;
    private String gtin;
    private Long inscEstadual;
    private String latitude;
    private String longitude;
    private String municipio;
    private String ncm;
    private String nomeFantasia;
    private String razaoSocial;
    private double vUnit;
    private String chaveAcesso;

    public Produtos(Integer produto_id, String bairro, String cep, String cnpj, Long codMunicipio,
                    LocalDate dataEmissao, String descricao, String endereco, String gtin,
                    Long inscEstadual, String latitude, String longitude, String municipio,
                    String ncm, String nomeFantasia, String razaoSocial, double vUnit, String chaveAcesso) {
        this.produto_id = produto_id;
        this.bairro = bairro;
        this.cep = cep;
        this.cnpj = cnpj;
        this.codMunicipio = codMunicipio;
        this.dataEmissao = dataEmissao;
        this.descricao = descricao;
        this.endereco = endereco;
        this.gtin = gtin;
        this.inscEstadual = inscEstadual;
        this.latitude = latitude;
        this.longitude = longitude;
        this.municipio = municipio;
        this.ncm = ncm;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.vUnit = vUnit;
        this.chaveAcesso = chaveAcesso;
    }

    public Integer getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(Integer produto_id) {
        this.produto_id = produto_id;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Long getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(Long codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }

    public Long getInscEstadual() {
        return inscEstadual;
    }

    public void setInscEstadual(Long inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNcm() {
        return ncm;
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public double getvUnit() {
        return vUnit;
    }

    public void setvUnit(double vUnit) {
        this.vUnit = vUnit;
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    @Override
    public int compareTo(@NonNull Produtos o) {
        return this.nomeFantasia.compareTo(o.getNomeFantasia());
    }
}
