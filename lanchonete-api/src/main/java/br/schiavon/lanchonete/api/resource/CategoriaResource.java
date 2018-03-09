package br.schiavon.lanchonete.api.resource;

import br.schiavon.lanchonete.domain.Categoria;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaResource extends GumgaAPI<Categoria, String> {

    @Autowired
    public CategoriaResource(@Qualifier("categoriaService") GumgaService<Categoria, String> service) {
        super(service);
    }
}
