import domain.CacheDePrototipos;
import domain.Carro;
import domain.Carro.Modelo;

public class CarRentApp
{
    public static void main(String[] args) {
        
        CacheDePrototipos.criar();

		Carro CarroSedanClonada = CacheDePrototipos.getCarroClonado(Modelo.Sedan);
		System.out.println(CarroSedanClonada);
		
		Carro CarroHatchClonada = CacheDePrototipos.getCarroClonado(Modelo.Hatch);
		System.out.println(CarroHatchClonada);
		
		Carro CarroSUVClonada = CacheDePrototipos.getCarroClonado(Modelo.SUV);
		System.out.println(CarroSUVClonada);	
		

    }
}