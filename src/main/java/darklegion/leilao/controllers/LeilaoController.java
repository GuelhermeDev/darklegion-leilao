package darklegion.leilao.controllers;

import darklegion.leilao.services.LanceService;
import darklegion.leilao.services.LeilaoService;
import darklegion.leilao.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;

public class LeilaoController {

    @Autowired
    LeilaoService leilaoService;

    @Autowired
    ProdutoService produtoService;

    @Autowired
    LanceService lanceService;


}
