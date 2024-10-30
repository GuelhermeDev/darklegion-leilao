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
@Table(name="tb_lances")
public class Lance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="lance_id")
    private Long id;

    @Column(name="valor_lance")
    private Long valor_lance;

    @Column(name="hora_lance")
    private LocalDateTime hora_lance;

    @JoinColumn(name="usuario_id")
    @OneToOne
    private User user;

    @ManyToOne
    private Produto produto;

}
