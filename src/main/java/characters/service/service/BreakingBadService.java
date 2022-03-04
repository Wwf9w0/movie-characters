package characters.service.service;

import characters.service.client.BreakingBadClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
@RequiredArgsConstructor
public class BreakingBadService {

    private final BreakingBadClient breakingBadClient;

    public String getCharacters(){
        ResponseEntity<String> response = breakingBadClient.getCharacters();
        if (Objects.isNull(response)){
            return null;
        }
        log.info("Get characters: {}", response.getBody());
        return response.getBody();
    }

    public String getCharacter(String id){
        ResponseEntity<String> response = breakingBadClient.getCharacter(id);
        if (Objects.isNull(response)){
            return null;
        }
        log.info("Get character id : {} - {}", response.getBody());
        return response.getBody();
    }

    public String getRandomCharacter(){
        ResponseEntity<String> response = breakingBadClient.getRandomCharacter();
        if (Objects.isNull(response)){
            return null;
        }
        log.info("Get random character : {}", response.getBody());
        return response.getBody();
    }

    public String getCharacterByName(String name){
        ResponseEntity<String> response = breakingBadClient.getCharacterByName(name);
        if (Objects.isNull(response)){
            return null;
        }
        log.info("Get character by name:{} - {}", name, response.getBody());
        return response.getBody();
    }

    public String getEposides(){
        ResponseEntity<String> response = breakingBadClient.getEpisodes();
        if (Objects.isNull(response)){
            return null;
        }
        log.info("Get eposides: {}", response.getBody());
        return response.getBody();
    }

    public String getEposidesById(String id){
        ResponseEntity<String> response = breakingBadClient.getEpisodeById(id);
        if (Objects.isNull(response)){
            return null;
        }
        log.info("Get eposide by id: {} - {}", id, response.getBody());
        return response.getBody();
    }

    public String getDeaths(){
        ResponseEntity<String> response = breakingBadClient.getDeaths();
        if (Objects.isNull(response)){
            return null;
        }
        log.info("Get deaths: {}", response.getBody());
        return response.getBody();
    }

    public String getDeathCount(){
        ResponseEntity<String> response = breakingBadClient.getDeathCount();
        if (Objects.isNull(response)){
            return null;
        }
        log.info("Get death count : {}", response.getBody());
        return response.getBody();
    }
}
