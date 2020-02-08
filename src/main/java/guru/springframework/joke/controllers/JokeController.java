package guru.springframework.joke.controllers;

import guru.springframework.joke.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/joke")
public class JokeController {
    JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
@RequestMapping("")
    public String getJoke(Model m){
        m.addAttribute("jokemodel",jokeService.getJoke());
        return "/joke";
    }

}
