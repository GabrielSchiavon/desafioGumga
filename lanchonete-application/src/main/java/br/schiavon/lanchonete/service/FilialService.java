package br.schiavon.lanchonete.service;

import br.schiavon.lanchonete.domain.Filial;
import io.gumga.application.GumgaService;
import io.gumga.domain.repository.GumgaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilialService extends GumgaService<Filial, String> {

    @Autowired
    public FilialService(GumgaCrudRepository<Filial, String> repository) {
        super(repository);
    }
}
