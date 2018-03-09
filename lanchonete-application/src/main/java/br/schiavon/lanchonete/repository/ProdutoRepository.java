package br.schiavon.lanchonete.repository;

import br.schiavon.lanchonete.domain.Produto;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends GumgaCrudRepository<Produto, String> {
}
