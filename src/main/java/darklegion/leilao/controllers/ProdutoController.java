package darklegion.leilao.controllers;


import darklegion.leilao.entities.Produto;
import darklegion.leilao.services.ProdutoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto){
        Produto novoProduto = produtoService.cadastrarProduto(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoProduto);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Produto> buscarProduto(@PathVariable Long id ){
        Produto produto = produtoService.buscarProduto(id);
        return ResponseEntity.ok(produto);
    }
}
