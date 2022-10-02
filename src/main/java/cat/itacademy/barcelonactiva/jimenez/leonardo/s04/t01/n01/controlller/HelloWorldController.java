package cat.itacademy.barcelonactiva.jimenez.leonardo.s04.t01.n01.controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom) {
        return "Hola, " + nom + " Estàs executant un projecte Maven";
    }

    @GetMapping(value = {"/HelloWorld2","/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(required = false) String nom) {
        return "Hola, " + nom + " Estàs executant un projecte Maven";
    }
}
