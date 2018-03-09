package br.schiavon.lanchonete.service;

import br.schiavon.lanchonete.domain.Categoria;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService extends GumgaService<Categoria, String> {

    @Autowired
    public CategoriaService(GumgaCrudRepository<Categoria, String> repository) {
        super(repository);
    }
}
