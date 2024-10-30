package darklegion.leilao.services;


import darklegion.leilao.repositories.LanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanceService {

    @Autowired
    LanceRepository lanceRepoitory;
}
