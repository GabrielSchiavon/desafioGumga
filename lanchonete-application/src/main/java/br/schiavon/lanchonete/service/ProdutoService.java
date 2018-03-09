package br.schiavon.lanchonete.service;

import br.schiavon.lanchonete.domain.Produto;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService extends GumgaService<Produto, String> {

    @Autowired
    public ProdutoService(GumgaCrudRepository<Produto, String> repository) {
        super(repository);
    }
}
