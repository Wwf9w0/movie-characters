package characters.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "got" , url = "${got.url}")
public interface GameOfThronesClient {

    @GetMapping("/v1/random")
    ResponseEntity<String> getRandomQuotes();

    @GetMapping("/v1/random/5")
    ResponseEntity<String> getRandomQuotesFive();

    @GetMapping("/v1/author/tyrion/2")
    ResponseEntity<String> getCharacters();
}
