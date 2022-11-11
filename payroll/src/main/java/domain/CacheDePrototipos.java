package domain;
import java.util.Hashtable;

import domain.Carro.Cor;
import domain.Carro.Marca;
import domain.Carro.Modelo;

public class CacheDePrototipos {
    
    private static Hashtable<Carro.Modelo, Carro> carros = new Hashtable<Carro.Modelo, Carro>();

    public static Carro getCarroClonado(Carro.Modelo modelo){
        Carro retorna = carros.get(modelo); //Veja
        return (Carro) retorna.clone();
    }

    public static void criar(){

        Carro CarroSedan = new CarroSedan();
		CarroSedan.setId(123);
		CarroSedan.setModelo(Modelo.Sedan);
		CarroSedan.setMarca(Marca.Ford);
        CarroSedan.setCor(Cor.Preto);
		carros.put(CarroSedan.getModelo(), CarroSedan);
		CarroSedan.criarCarro();
        
        Carro CarroHatch = new CarroHatch();
		CarroHatch.setId(55);
		CarroHatch.setModelo(Modelo.Hatch);
		CarroHatch.setMarca(Marca.Volkswagen);
        CarroHatch.setCor(Cor.Prata);
		carros.put(CarroHatch.getModelo(), CarroHatch);
		CarroHatch.criarCarro();	

        Carro CarroSUV = new CarroSUV();
		CarroSUV.setId(342);
		CarroSUV.setModelo(Modelo.SUV);
		CarroSUV.setMarca(Marca.Volvo);
        CarroSUV.setCor(Cor.Azul);
		carros.put(CarroSUV.getModelo(), CarroSUV);
		CarroSUV.criarCarro();	
}
}


