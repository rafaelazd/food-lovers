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
			usuariosRepository.save(new Usuario("Kali", "Meinar", "kalimeinar@gmail.com", 19, "kardashianlostsis", "kalimeinar", "kalimeinar", "Cinema, arte e fotografia <3"));
			usuariosRepository.save(new Usuario("Mateus", "Takeda", "MateusTakeda@outlook.com", 21, "_mateustakeda", "mateustakeda", "mateustakeda", "'O que é melhor - nascer bom, ou superar sua natureza maligna através de grande esforço?' - Paarthurnax"));
			log.info("Depois de criar os registros");
			

			log.info("Antes de criar os registros");
			preferenciasRepository.save(new Preferencias("Hot Dog", "/static/img/hotdogico.png"));
			preferenciasRepository.save(new Preferencias("Bolo", "/static/img/boloico.png"));
			preferenciasRepository.save(new Preferencias("Sorvete", "/static/img/sorveteico.png"));
			log.info("Depois de criar os registros");
			
			storageService.deleteAll();
            storageService.demo();
		};
	}
}
