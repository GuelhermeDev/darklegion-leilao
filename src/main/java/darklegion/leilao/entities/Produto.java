package darklegion.leilao.entities;


import darklegion.leilao.entities.tipos.Alternativa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="tb_produtos")
public class Produto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="produto_id")
    private Long Id;

    @Column(name="titulo_produto")
    private String titulo_produto;

    @Column(name="descricao_produto")
    private String descricao_produto;

    @Column(name="lance_minimo")
    private Double lance_minimo;

    @Column(name="arrematado")
    @Enumerated(EnumType.STRING)
    private Alternativa arrematado;

    @Column(name="timerFinal")
    private LocalDateTime timerFinal;  // Armazena o tempo final do leilão



}
