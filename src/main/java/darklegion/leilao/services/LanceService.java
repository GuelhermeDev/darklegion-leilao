package darklegion.leilao.services;


import darklegion.leilao.entities.Lance;
import darklegion.leilao.entities.Produto;
import darklegion.leilao.exceptions.ResourceNotFoundException;
import darklegion.leilao.repositories.LanceRepository;
import darklegion.leilao.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.Optional;

@Service
public class LanceService {

    @Autowired
    LanceRepository lanceRepoitory;

    @Autowired
    ProdutoRepository produtoRepository;

    public Lance registrarLance(Lance lance, Long produtoId){
        Produto produto = produtoRepository.findById(produtoId).orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado"));

        produto.setTimerFinal(LocalDateTime.now().plusMinutes(1));
        produtoRepository.save(produto);

        lance.setProduto(produto);
        return lanceRepoitory.save(lance);
    }
}
