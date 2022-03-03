package characters.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "harry", url = "${harry.url}")
public interface HarryPotterClient {

   @GetMapping("/api/characters")
    ResponseEntity<String> getCharacters();
}
