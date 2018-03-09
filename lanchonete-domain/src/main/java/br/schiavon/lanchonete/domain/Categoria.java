package br.schiavon.lanchonete.domain;

import io.gumga.domain.GumgaModelUUID;
import io.gumga.domain.GumgaMultitenancy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity(name = "categoria")
@Table(name = "categoria")
@GumgaMultitenancy
public class Categoria extends GumgaModelUUID{

    @Column(name = "nome")
    private String nome;

    @OneToMany
    private List<Produto> produtos;

    public Categoria() {}

    public Categoria(String nome, List<Produto> produtos) {
        this.nome = nome;
        this.produtos = produtos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
