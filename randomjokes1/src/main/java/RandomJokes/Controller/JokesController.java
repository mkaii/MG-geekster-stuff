package RandomJokes.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class JokesController {


    List<String> jokesList = new ArrayList<>();


    @PostMapping(value = "/jokes")
    public String saveJokes(@RequestBody String jokes)
    {
        jokesList.add(jokes);

        return "Joke has been saved";
    }


    @GetMapping(value = "/jokes")
    public String getJokes()
    {

        //flaw in the code :
        //this should not be inside call
        jokesList.add("joke1");
        jokesList.add("joke2");
        jokesList.add("joke3");
        jokesList.add("joke4");
        jokesList.add("joke5");
        jokesList.add("joke6");

        int randomNumber = 0 + (int)(Math.random() * ((jokesList.size()-1 -0) + 1));

        return jokesList.get(randomNumber);
    }
}
