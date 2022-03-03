package characters.service.service;

import characters.service.client.BreakingBadClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class BreakingBadService {
    private final BreakingBadClient breakingBadClient;

    public String getCharacters(){
        ResponseEntity<String> response = breakingBadClient.getCharacters();
        log.info("Get characters: {}", response.getBody());
        return response.getBody();
    }

    public String getCharacter(String id){
        ResponseEntity<String> response = breakingBadClient.getCharacter(id);
        log.info("Get character id : {} - {}", response.getBody());
        return response.getBody();
    }

    public String getRandomCharacter(){
        ResponseEntity<String> response = breakingBadClient.getRandomCharacter();
        log.info("Get random character : {}", response.getBody());
        return response.getBody();
    }

    public String getCharacterByName(String name){
        ResponseEntity<String> response = breakingBadClient.getCharacterByName(name);
        log.info("Get character by name:{} - {}", name, response.getBody());
        return response.getBody();
    }

    public String getEposides(){
        ResponseEntity<String> response = breakingBadClient.getEpisodes();
        log.info("Get eposides: {}", response.getBody());
        return response.getBody();
    }

    public String getEposidesById(String id){
        ResponseEntity<String> response = breakingBadClient.getEpisodeById(id);
        log.info("Get eposide by id: {} - {}", id, response.getBody());
        return response.getBody();
    }
}
