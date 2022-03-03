package characters.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class HarryService {
    private final HarryPotterClient harryPotterClient;

    public String getCharacters(){
        ResponseEntity<String> response = harryPotterClient.getCharacters();
        log.info("Get Characters: {}", response);
        return response.getBody();
    }
}
