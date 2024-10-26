package darklegion.leilao.entities;


import darklegion.leilao.entities.tipos.RoleName;
import jakarta.persistence.*;

import lombok.*;
import org.hibernate.annotations.NaturalId;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="tb_roles")
@ToString
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="role_id")
    private Long id;


    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private RoleName role_name;
}
