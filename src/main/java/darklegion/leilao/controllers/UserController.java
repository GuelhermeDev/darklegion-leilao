package darklegion.leilao.controllers;

import darklegion.leilao.entities.Role;
import darklegion.leilao.entities.User;
import darklegion.leilao.entities.tipos.RoleName;
import darklegion.leilao.repositories.RoleRepository;
import darklegion.leilao.repositories.UserRepository;
import darklegion.leilao.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;


@Controller
@RestController
@RequestMapping("/auth")
public class UserController {


    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @PostMapping("/register")
    public ResponseEntity cadastrar(@RequestBody User dados){
        User usuario = new User();
        usuario.setEmail(dados.getEmail());
        usuario.setUsername(dados.getUsername());
        usuario.setPassword(dados.getPassword());
        usuario.setRoles(dados.getRoles());
        userRepository.save(usuario);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping("/login")
    public ResponseEntity logar(@RequestBody User login){
        Optional<User> usuario = userRepository.findByEmail(login.getEmail());
        if(ObjectUtils.isEmpty(usuario)){

        }
        return ResponseEntity.ok("LOGIN SUCCESS" +  usuario);
    }
}
