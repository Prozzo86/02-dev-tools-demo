package com.udemy.demo.vjezba1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Anotacija koja označava da je ova klasa Spring REST Controller.
public class FunRestController {
    @GetMapping("/")  // Označava da je ova metoda mapirana na HTTP GET zahtjev na "/" putanji.
    public String sayHello(){
        return "Hello World";
    } // Vraća "Hello, world!" kao odgovor na GET zahtjev.

    @GetMapping("/workout") // Označava da je ova metoda mapirana na HTTP GET zahtjev na "/workout" putanji.
    public String getDailyWorkout(){ return "Run a hard 5k!"; } // Vraća "Run a hard 5k!" kao odgovor na GET zahtjev.

    @GetMapping("/fortune") // Označava da je ova metoda mapirana na HTTP GET zahtjev na "/fortune" putanji.
    public String getDailyFortune(){ return "Today is your lucky day!"; } // Vraća "Today is your lucky day!" kao odgovor na GET zahtjev.
}
