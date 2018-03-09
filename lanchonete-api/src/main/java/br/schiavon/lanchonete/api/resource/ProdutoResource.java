package br.schiavon.lanchonete.api.resource;

import br.schiavon.lanchonete.domain.Produto;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoResource extends GumgaAPI<Produto, String> {

    @Autowired
    public ProdutoResource(@Qualifier("produtoService") GumgaService<Produto, String> service) {
        super(service);
    }
}
