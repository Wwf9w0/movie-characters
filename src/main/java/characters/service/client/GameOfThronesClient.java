package characters.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "got" , url = "${got.url}")
public interface GameOfThronesClient {

    @GetMapping("/v1/random")
    ResponseEntity<String> getRandomCharacters();
}
