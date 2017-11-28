package foodlovers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import foodlovers.storage.StorageProperties;
import foodlovers.storage.StorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class FoodLoversApplication {
	private static final Logger log = LoggerFactory.getLogger(FoodLoversApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FoodLoversApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(UsuariosRepository usuariosRepository, PreferenciasRepository preferenciasRepository, StorageService storageService) {
		return (args) -> {
			log.info("Antes de criar os registros");
			usuariosRepository.save(new Usuario("Kali", "Meinar", "kalimeinar@gmail.com", 19, "Homens e Mulheres", "Feminino", "kardashianlostsis", "kalimeinar", "Cinema, arte e fotografia <3","Campinas, São Paulo", "kali.meinar", "(19)99726-9062", "kalim_", "", "kardashianlostsis"));
			usuariosRepository.save(new Usuario("Mateus", "Takeda", "MateusTakeda@outlook.com", 21, "Homens", "Masculino", "_mateustakeda", "mateustakeda", "'O que é melhor - nascer bom, ou superar sua natureza maligna através de grande esforço?' - Paarthurnax","Joinville, Santa Catarina", "mateustakeda67", "(47)98890-3627", "mateustk", "matheustakeda", ""));
			usuariosRepository.save(new Usuario("Thea", "Queen", "theaqueen@gmail.com", 20, "Homens e Mulheres", "Feminino", "theaqueen", "theaqueen", "I'm sorry if I turned out some major disappointment","Curitiba, Paraná", "thea.queen", "(42)99738-2384", "theaqn", "theQueen", "theQueen"));
			
			log.info("Depois de criar os registros");
			

			log.info("Antes de criar os registros");
			preferenciasRepository.save(new Preferencias("Hot Dog", "/static/img/hotdogico.png"));
			preferenciasRepository.save(new Preferencias("Bolo", "/static/img/boloico.png"));
			preferenciasRepository.save(new Preferencias("Sorvete", "/static/img/sorveteico.png"));
			preferenciasRepository.save(new Preferencias("Batata Frita", "/static/img/batataico.png"));
			preferenciasRepository.save(new Preferencias("Cafe", "/static/img/cafeico.png"));
			preferenciasRepository.save(new Preferencias("Churrasco", "/static/img/churrascoico.png"));
			preferenciasRepository.save(new Preferencias("Sanduiche", "/static/img/icosand.png"));
			preferenciasRepository.save(new Preferencias("Macarrao", "/static/img/macarraoico.png"));
			preferenciasRepository.save(new Preferencias("Nachos", "/static/img/nachosico.png"));
			preferenciasRepository.save(new Preferencias("Panquecas", "/static/img/panquecasico.png"));
			preferenciasRepository.save(new Preferencias("Pizza", "/static/img/pizzaico.png"));
			preferenciasRepository.save(new Preferencias("Salada", "/static/img/saladaico.png"));
			preferenciasRepository.save(new Preferencias("Sopa", "/static/img/sopaico.png"));
			preferenciasRepository.save(new Preferencias("Sushi", "/static/img/sushico.png"));
			preferenciasRepository.save(new Preferencias("Tacos", "/static/img/tacosico.png"));
			log.info("Depois de criar os registros");
			
			storageService.deleteAll();
            storageService.demo();
		};
	}
}
