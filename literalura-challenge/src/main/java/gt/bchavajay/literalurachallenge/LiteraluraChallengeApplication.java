package gt.bchavajay.literalurachallenge;

import gt.bchavajay.literalurachallenge.principal.Principal;
import gt.bchavajay.literalurachallenge.repositoy.AutorRepository;
import gt.bchavajay.literalurachallenge.repositoy.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LiteraluraChallengeApplication implements CommandLineRunner {

	@Autowired
	private LibroRepository repository;
	@Autowired
	private AutorRepository repositoryAutor;

	public static void main(String[] args) {
		SpringApplication.run(LiteraluraChallengeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository, repositoryAutor);
		principal.iniciarApp();
	}
}
