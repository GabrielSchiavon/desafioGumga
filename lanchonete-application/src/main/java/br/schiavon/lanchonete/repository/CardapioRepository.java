package br.schiavon.lanchonete.repository;

import br.schiavon.lanchonete.domain.Cardapio;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardapioRepository extends GumgaCrudRepository<Cardapio, String> {
}
