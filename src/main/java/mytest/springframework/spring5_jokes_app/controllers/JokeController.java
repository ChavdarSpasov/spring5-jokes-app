package mytest.springframework.spring5_jokes_app.controllers;

import mytest.springframework.spring5_jokes_app.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", " "})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }

    @RequestMapping({"/secondJoke"})
    public String showJokeTwo(Model model) {
        model.addAttribute("secondJoke", jokeService.getJoke());
        return "secondJoke";
    }

    @RequestMapping({"/thirdJoke"})
    public String showJokeThree(Model model) {
        model.addAttribute("thirdJoke", jokeService.getJoke());
        return "thirdJoke";
    }

    @RequestMapping({"/allJokes"})
    public String showAllJokes(Model model) {
        model.addAttribute("joke1", jokeService.getJoke());
        model.addAttribute("joke2", jokeService.getJoke());
        model.addAttribute("joke3", jokeService.getJoke());
        return "allJokes";
    }
}
