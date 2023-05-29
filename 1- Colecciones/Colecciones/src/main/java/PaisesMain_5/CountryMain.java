package PaisesMain_5;

import Country.Service_5.CountryService;
import Paises_5.Country;
import java.util.HashSet;

public class CountryMain {

    public static void main(String[] args) {
        CountryService service = new CountryService();
       HashSet <Country> conjuntoPaises = service.crearListaPaises();
       service.mostrarPaises(conjuntoPaises);
       service.ordenarPorNombre(conjuntoPaises);
       service.eliminarPais(conjuntoPaises);
    }
    
}
