package characters.service.service;

import characters.service.client.GameOfThronesClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@RequiredArgsConstructor
@Service
@Slf4j
public class GameOfThronesService {

    private final GameOfThronesClient gameOfThronesClient;

    public String getRandoQuotes(){
        ResponseEntity<String> response = gameOfThronesClient.getRandomQuotes();
        if (Objects.isNull(response)){
            return null;
        }
        log.info("Get got characters of random : {}", response.getBody());
        return response.getBody();
    }

    public String getRandomQuotesFive(){
        ResponseEntity<String> response = gameOfThronesClient.getRandomQuotesFive();
        if (Objects.isNull(response)){
            return null;
        }
        log.info("Get got characters random of quotes :{}", response.getBody());
        return response.getBody();
    }

    public String getCharacters(){
        ResponseEntity<String> response = gameOfThronesClient.getCharacters();
        if (Objects.isNull(response)){
            return null;
        }
        log.info("Got characters: {}", response.getBody());
        return response.getBody();
    }

    public String getHouses(){
        ResponseEntity<String> response = gameOfThronesClient.getHouses();
        if (Objects.isNull(response)){
            return null;
        }
        log.info("Get houses : {}", response.getBody());
        return response.getBody();
    }

    public String getCharacter(String name){
        ResponseEntity<String> response = gameOfThronesClient.getCharacter(name);
        if (Objects.isNull(response)){
            return null;
        }
        log.info("Get character : {} - {}", name , response.getBody());
        return response.getBody();
    }
}
