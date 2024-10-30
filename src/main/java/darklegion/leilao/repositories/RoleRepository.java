package darklegion.leilao.repositories;

import darklegion.leilao.entities.Role;
import darklegion.leilao.entities.tipos.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
}