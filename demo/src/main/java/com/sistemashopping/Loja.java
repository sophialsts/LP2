package com.sistemashopping;

public class Loja {
    private String nomeFantasia, razaoSocial, publicoAlvo;
    private long cnpj;
    private int digCnpj;
    private float area, faturamento;

    public Loja(String n, long cnpj, int d, int f, String pa ) {
        this(n,n,cnpj,d);
        this.faturamento = f;
        this.publicoAlvo = pa;
    }
    public Loja(String n, String rs, long cnpj, int d) {
        this.nomeFantasia = n;
        this.razaoSocial = rs;
        this.cnpj = cnpj;
        this.digCnpj = d;
    }
    public void verificaFaturamento (Loja loja1) {
        if(this.faturamento > loja1.getFaturamento()) System.out.println("Essa loja tem faturamento superior a que foi comparada.");
        else if(this.faturamento == loja1.getFaturamento()) System.out.println("As lojas tem faturamentos iguais");
        else System.out.println("Essa loja tem faturamento menor a que foi comparada.");
    }

    public float calcAluguel (float area) {
        this.faturamento = 50*area;
        return this.faturamento;
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

    public String getPublicoAlvo() {
        return publicoAlvo;
    }

    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public int getDigCnpj() {
        return digCnpj;
    }

    public void setDigCnpj(int digCnpj) {
        this.digCnpj = digCnpj;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(float faturamento) {
        this.faturamento = faturamento;
    }
}
