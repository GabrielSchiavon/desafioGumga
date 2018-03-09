package br.schiavon.lanchonete.domain;

import io.gumga.domain.GumgaModelUUID;
import io.gumga.domain.GumgaMultitenancy;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "pedido")
@Table(name = "pedido")
@GumgaMultitenancy
public class Pedido extends GumgaModelUUID {

    @Column(name = "num_ticket")
    private String ticket;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPedido;

    @Column(name = "situacao")
    private String situacao;

    // ****  Relacionamentos  ****
    @ManyToOne
    private Filial filial;
    @ManyToMany
    private List<Produto> produtos;
}
