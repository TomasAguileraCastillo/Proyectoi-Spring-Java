package prueba.tienda.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class helloworld {

    @GetMapping("/hola")

    public String saludo() {
        System.out.println("Ejecutando el metodo saludo");
        return "hola ernestina";

    }


}
