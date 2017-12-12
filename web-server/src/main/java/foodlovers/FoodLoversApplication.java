package foodlovers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import foodlovers.storage.StorageProperties;
import foodlovers.storage.StorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
@EnableAutoConfiguration
public class FoodLoversApplication {
	private static final Logger log = LoggerFactory.getLogger(FoodLoversApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(FoodLoversApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(UsuariosRepository usuariosRepository, PreferenciasRepository preferenciasRepository, CombinacoesRepository combinacoesRepository, FotografiasRepository fotografiasRepository) {
		return (args) -> {
			log.info("Antes de criar os registros");
			Preferencias HotDog = new Preferencias("Hot Dog", "/static/img/hotdogico.png");
			Preferencias Bolo = new Preferencias("Bolo", "/static/img/boloico.png");
			Preferencias Sorvete = new Preferencias("Sorvete", "/static/img/sorveteico.png");
			Preferencias Batata = new Preferencias("Batata Frita", "/static/img/batataico.png");
			Preferencias Cafe = new Preferencias("Cafe", "/static/img/cafeico.png");
			Preferencias Churrasco = new Preferencias("Churrasco", "/static/img/churrascoico.png");
			Preferencias Sanduiche = new Preferencias("Sanduiche", "/static/img/icosand.png");
			Preferencias Macarrao = new Preferencias("Macarrao", "/static/img/macarraoico.png");
			Preferencias Nachos = new Preferencias("Nachos", "/static/img/nachosico.png");
			Preferencias Panquecas = new Preferencias("Panquecas", "/static/img/panquecasico.png");
			Preferencias Pizza = new Preferencias("Pizza", "/static/img/pizzaico.png");
			Preferencias Salada = new Preferencias("Salada", "/static/img/saladaico.png");
			Preferencias Sopa = new Preferencias("Sopa", "/static/img/sopaico.png");
			Preferencias Sushi = new Preferencias("Sushi", "/static/img/sushico.png");
			Preferencias Tacos = new Preferencias("Tacos", "/static/img/tacosico.png");
			
			preferenciasRepository.save(HotDog);
			preferenciasRepository.save(Bolo);
			preferenciasRepository.save(Sorvete);
			preferenciasRepository.save(Batata);
			preferenciasRepository.save(Cafe);
			preferenciasRepository.save(Churrasco);
			preferenciasRepository.save(Sanduiche);
			preferenciasRepository.save(Macarrao);
			preferenciasRepository.save(Nachos);
			preferenciasRepository.save(Panquecas);
			preferenciasRepository.save(Pizza);
			preferenciasRepository.save(Salada);
			preferenciasRepository.save(Sopa);
			preferenciasRepository.save(Sushi);
			preferenciasRepository.save(Tacos);
			
			Usuario kali = new Usuario("Kali", "Meinar", "kalimeinar@gmail.com", 19, "Homens e Mulheres", "Feminino", "kardashianlostsis", "kalimeinar", "Cinema, arte e fotografia <3","Campinas, São Paulo", "kali.meinar", "(19)99726-9062", "kalim_", "", "kardashianlostsis", "/static/img/m5.jpg");
			Usuario mateus = new Usuario("Mateus", "Takeda", "MateusTakeda@outlook.com", 21, "Homens", "Masculino", "_mateustakeda", "mateustakeda", "'O que é melhor - nascer bom, ou superar sua natureza maligna através de grande esforço?' - Paarthurnax","Joinville, Santa Catarina", "mateustakeda67", "(47)98890-3627", "mateustk", "matheustakeda", "", "/static/img/h1.4.jpg");
			Usuario thea = new Usuario("Thea", "Queen", "theaqueen@gmail.com", 20, "Homens e Mulheres", "Feminino", "theaqueen", "theaqueen", "I'm sorry if I turned out some major disappointment","Curitiba, Paraná", "thea.queen", "(42)99738-2384", "theaqn", "theQueen", "theQueen", "/static/img/m100.jpg");
			
			kali.addPreferencia(Bolo);
			kali.addPreferencia(HotDog);
			kali.addPreferencia(Sushi);
			kali.addPreferencia(Nachos);
			
			mateus.addPreferencia(Churrasco);
			mateus.addPreferencia(Pizza);
			mateus.addPreferencia(Sushi);
			
			thea.addPreferencia(Cafe);
			thea.addPreferencia(Sorvete);
			thea.addPreferencia(Sushi);
			thea.addPreferencia(Nachos);
			thea.addPreferencia(Pizza);
			
			usuariosRepository.save(kali);
			usuariosRepository.save(mateus);
			usuariosRepository.save(thea);
			
			Combinacao um = new Combinacao();
			Combinacao dois = new Combinacao();
			Combinacao tres = new Combinacao();
			
			um.setUsuario1(thea);
			um.setUsuario2(kali);
			dois.setUsuario1(mateus);
			dois.setUsuario2(thea);
			tres.setUsuario1(mateus);
			tres.setUsuario2(kali);
			
			combinacoesRepository.save(um);
			combinacoesRepository.save(dois);
			combinacoesRepository.save(tres);
			
			Fotografia fotoum = new Fotografia("/static/img/prato2.jpg", "Café para Renovar!");
			Fotografia fotodois = new Fotografia("/static/img/prato4.jpg", "O melhor!");
			Fotografia fototres = new Fotografia("/static/img/prato6.jpg", "Existe coisa melhor que pizza?");
			Fotografia fotoquatro = new Fotografia("/static/img/prato10.jpg", "Boa companhia!");
			Fotografia fotocinco = new Fotografia("/static/img/prato7.jpg", "Vc quer @?");
			Fotografia fotoseis = new Fotografia("/static/img/prato3.jpg", "Sushiiiii");
			Fotografia fotosete = new Fotografia("/static/img/prato5.jpg", "'Se o vinho cura as dores do corpo e da alma, uma boa taça deve nos tornar imortais'");
			
			
			fotoum.setUsuario(thea);
			fotodois.setUsuario(thea);
			fototres.setUsuario(kali);
			fotoquatro.setUsuario(mateus);
			fotocinco.setUsuario(kali);
			fotoseis.setUsuario(mateus);
			fotosete.setUsuario(thea);
			
			fotografiasRepository.save(fotoum);
			fotografiasRepository.save(fotodois);
			fotografiasRepository.save(fototres);
			fotografiasRepository.save(fotoquatro);
			fotografiasRepository.save(fotocinco);
			fotografiasRepository.save(fotoseis);
			fotografiasRepository.save(fotosete);
			log.info("Depois de criar os registros");
		};
	}
	
	@Bean
	public CommandLineRunner initStorageService(StorageService storageService) {
		return (args) -> {
			log.info("Antes de inicializar o Storage Service");
			storageService.init();
			log.info("Apos de inicializar o Storage Service");
		};
	}
}
