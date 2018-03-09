package br.schiavon.lanchonete.api.resource;

import br.schiavon.lanchonete.domain.Filial;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/brands")
public class Brand extends GumgaAPI<Filial, String> {

    @Autowired
    public Brand(@Qualifier("filialService") GumgaService<Filial, String> service) {
        super(service);
    }

}
