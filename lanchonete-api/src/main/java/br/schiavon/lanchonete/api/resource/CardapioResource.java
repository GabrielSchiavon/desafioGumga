package br.schiavon.lanchonete.api.resource;

import br.schiavon.lanchonete.domain.Cardapio;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cardapios")
public class CardapioResource extends GumgaAPI<Cardapio, String> {

    @Autowired
    public CardapioResource(@Qualifier("cardapioService") GumgaService<Cardapio, String> service) {
        super(service);
    }

}
