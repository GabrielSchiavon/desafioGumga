package br.schiavon.lanchonete.repository;

import br.schiavon.lanchonete.domain.Filial;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilialResource extends GumgaCrudRepository<Filial, String> {
}
