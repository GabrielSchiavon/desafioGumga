package br.schiavon.lanchonete.service;

import br.schiavon.lanchonete.domain.Cardapio;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardapioService extends GumgaService<Cardapio, String> {

    @Autowired
    public CardapioService(GumgaCrudRepository<Cardapio, String> repository) {
        super(repository);
    }
}
