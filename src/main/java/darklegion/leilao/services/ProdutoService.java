package darklegion.leilao.services;


import darklegion.leilao.entities.Produto;
import darklegion.leilao.exceptions.ResourceNotFoundException;
import darklegion.leilao.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProdutoService {


    @Autowired
    ProdutoRepository produtoRepository;


    public Produto cadastrarProduto(Produto produto){

        produto.setTimerFinal(LocalDateTime.now().plusMinutes(1));
        return produtoRepository.save(produto);

    }

    public Produto buscarProduto(Long id){
        return produtoRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Produto não encontrado."));
    }
}
