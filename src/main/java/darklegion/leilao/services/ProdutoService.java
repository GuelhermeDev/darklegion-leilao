package darklegion.leilao.services;


import darklegion.leilao.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {


    @Autowired
    ProdutoRepository produtoRepository;
}
