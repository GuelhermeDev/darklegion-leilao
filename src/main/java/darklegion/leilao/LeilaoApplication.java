package darklegion.leilao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "darklegion.leilao.entities")
public class LeilaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeilaoApplication.class, args);
	}

}
