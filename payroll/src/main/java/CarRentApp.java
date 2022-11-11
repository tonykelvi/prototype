
import domain.CacheDePrototipos;
import domain.Carro;
import domain.Carro.Modelo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Rodar o microserviço com: ./mvnw spring-boot:run

@SpringBootApplication
public class CarRentApp
{
    public static void main(String... args) {
        
		SpringApplication.run(CarRentApp.class, args);

        CacheDePrototipos.criar();

		Carro CarroSedanClonada = CacheDePrototipos.getCarroClonado(Modelo.Sedan);
		System.out.println(CarroSedanClonada);
		
		Carro CarroHatchClonada = CacheDePrototipos.getCarroClonado(Modelo.Hatch);
		System.out.println(CarroHatchClonada);
		
		Carro CarroSUVClonada = CacheDePrototipos.getCarroClonado(Modelo.SUV);
		System.out.println(CarroSUVClonada);	
		

    }
}