package characters.service.service;

import characters.service.client.HarryPotterClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class HarryPotterService {
    private final HarryPotterClient harryPotterClient;

    public String getCharacters(){
        ResponseEntity<String> response = harryPotterClient.getCharacters();
        log.info("Get Characters: {}", response);
        return response.getBody();
    }

    public String getStudents(){
        ResponseEntity<String> response = harryPotterClient.getStudents();
        log.info("Get students : {}", response.getBody());
        return response.getBody();
    }

    public String getStaff(){
        ResponseEntity<String> response = harryPotterClient.getStaff();
        log.info("Get staff : {}", response.getBody());
        return response.getBody();
    }

    public String getHouse(){
        ResponseEntity<String> response = harryPotterClient.getHouse();
        log.info("Get house : {}", response.getBody());
        return response.getBody();
    }
}
