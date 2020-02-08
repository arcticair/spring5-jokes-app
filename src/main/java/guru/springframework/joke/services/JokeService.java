package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {
    ChuckNorrisQuotes q;

    public JokeService(ChuckNorrisQuotes q) {
        this.q =  q;
    }

    public String getJoke(){
        return q.getRandomQuote();
    }
}
