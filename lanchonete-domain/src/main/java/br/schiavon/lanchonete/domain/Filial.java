package br.schiavon.lanchonete.domain;

import io.gumga.domain.GumgaMultitenancy;
import io.gumga.domain.domains.GumgaAddress;
import io.gumga.domain.domains.GumgaPhoneNumber;
import org.hibernate.annotations.Columns;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity(name = "filial")
@GumgaMultitenancy
public class Filial extends Franquia {

    @Columns(columns = {
            @Column(name = "cod_postal"),
            @Column(name = "tipo_logradouro"),
            @Column(name = "logradouro"),
            @Column(name = "numero"),
            @Column(name = "informacao"),
            @Column(name = "bairro"),
            @Column(name = "localizacao"),
            @Column(name = "estado"),
            @Column(name = "cidade"),
            @Column(name = "latitude"),
            @Column(name = "longitude"),
            @Column(name = "codIbge"),
            @Column(name = "codEstado")
    })
    private GumgaAddress endereco;

    @Column(name = "telefone")
    private GumgaPhoneNumber telefone;

    @OneToMany
    private List<Pedido> pedidos;

    public Filial() { }

    public Filial(GumgaAddress endereco, GumgaPhoneNumber telefone, List<Pedido> pedidos) {
        this.endereco = endereco;
        this.telefone = telefone;
        this.pedidos = pedidos;
    }

    public Filial(String nome, GumgaAddress endereco, GumgaPhoneNumber telefone, List<Pedido> pedidos) {
        super(nome);
        this.endereco = endereco;
        this.telefone = telefone;
        this.pedidos = pedidos;
    }

    public GumgaAddress getEndereco() {
        return endereco;
    }

    public void setEndereco(GumgaAddress endereco) {
        this.endereco = endereco;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public GumgaPhoneNumber getTelefone() {
        return telefone;
    }

    public void setTelefone(GumgaPhoneNumber telefone) {
        this.telefone = telefone;
    }
}
