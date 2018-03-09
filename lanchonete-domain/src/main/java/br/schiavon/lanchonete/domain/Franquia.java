package br.schiavon.lanchonete.domain;

import io.gumga.domain.GumgaModelUUID;
import io.gumga.domain.GumgaMultitenancy;

import javax.persistence.*;

@Entity(name = "franquia")
@Table(name = "franquia")
@GumgaMultitenancy
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Franquia extends GumgaModelUUID{

    @Column(name = "nome")
    private String nome;

    public Franquia() { }
    public Franquia(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
