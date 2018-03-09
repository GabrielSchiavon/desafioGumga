package br.schiavon.lanchonete.domain;

import io.gumga.domain.GumgaModelUUID;
import io.gumga.domain.GumgaMultitenancy;

import javax.persistence.*;
import java.util.List;

@Entity(name = "cardapio")
@Table(name = "cardapio")
@GumgaMultitenancy
public class Cardapio extends GumgaModelUUID {

    @OneToOne
    private Filial filial;

    @OneToMany
    private List<Categoria> categorias;

    public Cardapio() { }

    public Cardapio(Filial filial, List<Categoria> categorias) {
        this.filial = filial;
        this.categorias = categorias;
    }

    public Filial getFilial() {
        return filial;
    }

    public void setFilial(Filial filial) {
        this.filial = filial;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
}
