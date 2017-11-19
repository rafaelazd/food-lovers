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
			usuariosRepository.save(new Usuario("Kali", "Meinar", "kalimeinar@gmail.com", 19, "Homens e Mulheres", "Feminino", "kardashianlostsis", "kalimeinar", "kalimeinar", "Cinema, arte e fotografia <3","Campinas, São Paulo", "kali.meinar", "(19)99726-9062", "kalim_", "", "kardashianlostsis"));
			usuariosRepository.save(new Usuario("Mateus", "Takeda", "MateusTakeda@outlook.com", 21, "Homens", "Masculino", "_mateustakeda", "mateustakeda", "mateustakeda", "'O que é melhor - nascer bom, ou superar sua natureza maligna através de grande esforço?' - Paarthurnax","Joinville, Santa Catarina", "mateustakeda67", "(47)98890-3627", "mateustk", "matheustakeda", ""));
			log.info("Depois de criar os registros");
			

			log.info("Antes de criar os registros");
			preferenciasRepository.save(new Preferencias("Hot Dog"));
			preferenciasRepository.save(new Preferencias("Bolo"));
			preferenciasRepository.save(new Preferencias("Sorvete"));
			log.info("Depois de criar os registros");
			
			storageService.deleteAll();
            storageService.demo();
		};
	}
}
