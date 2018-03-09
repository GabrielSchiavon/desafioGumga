package br.schiavon.lanchonete.domain;

import io.gumga.domain.GumgaModelUUID;
import io.gumga.domain.GumgaMultitenancy;
import io.gumga.domain.domains.GumgaMoney;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "produto")
@Table(name = "produto")
@GumgaMultitenancy
public class Produto extends GumgaModelUUID {

    @Column(name = "nome")
    private String nome;

    @Column(name = "preco")
    private GumgaMoney preco;

    @Column(name = "descricao")
    private String descricao;

    @OneToOne
    private Categoria categoria;

    public Produto() {
    }

    public Produto(String nome, GumgaMoney preco, String descricao, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.categoria = categoria;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GumgaMoney getPreco() {
        return preco;
    }

    public void setPreco(GumgaMoney preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
