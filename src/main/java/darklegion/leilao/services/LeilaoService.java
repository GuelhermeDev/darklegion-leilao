package darklegion.leilao.services;



import darklegion.leilao.repositories.LeilaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeilaoService {

    @Autowired
    LeilaoRepository leilaoRepository;

}
