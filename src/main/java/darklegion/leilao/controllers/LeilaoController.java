package darklegion.leilao.controllers;

import darklegion.leilao.entities.Lance;
import darklegion.leilao.services.LanceService;
import darklegion.leilao.services.LeilaoService;
import darklegion.leilao.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/lances")
public class LeilaoController {

    @Autowired
    LeilaoService leilaoService;

    @Autowired
    ProdutoService produtoService;

    @Autowired
    LanceService lanceService;


    @PostMapping("/{produtoId}")
    public ResponseEntity<Lance> registrarLance(@PathVariable Long produtoId, @RequestBody Lance lance){
        Lance novoLance = lanceService.registrarLance(lance, produtoId);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoLance);
    }

}
