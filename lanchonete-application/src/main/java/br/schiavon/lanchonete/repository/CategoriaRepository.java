package br.schiavon.lanchonete.repository;

import br.schiavon.lanchonete.domain.Categoria;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends GumgaCrudRepository<Categoria, String> {
}
