package characters.service.service;

import characters.service.client.GameOfThronesClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class GameOfThronesService {
    private final GameOfThronesClient gameOfThronesClient;

    public String getRandoQuotes(){
        ResponseEntity<String> response = gameOfThronesClient.getRandomQuotes();
        log.info("Getting got characters of random : {}", response.getBody());
        return response.getBody();
    }

    public String getRandomQuotesFive(){
        ResponseEntity<String> response = gameOfThronesClient.getRandomQuotesFive();
        log.info("Getting got characters random of quotes :{}", response.getBody());
        return response.getBody();
    }
}
