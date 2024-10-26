package darklegion.leilao.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="tb_leilao")
public class Leilao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="leilao_id")
    private Long id;

    @Column(name="data_inicio")
    private LocalDateTime dt_inicio;

    @Column(name="data_fim")
    private LocalDateTime dt_fim;

    @OneToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @OneToOne
    @JoinColumn(name="lance_id")
    private Lance lance;



}
