package characters.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "bb", url = "${bb.url}")
public interface BreakingBadClient {

    @GetMapping("/v1/characters")
    ResponseEntity<String> getCharacters();

    @GetMapping("/characters/{id}")
    ResponseEntity<String> getCharacter(@PathVariable String id);

    @GetMapping("/character/random")
    ResponseEntity<String> getRandomCharacter();

    @GetMapping("/characters")
    ResponseEntity<String> getCharacterByName(@RequestParam String name);

    @GetMapping("/episodes")
    ResponseEntity<String> getEpisodes();

    @GetMapping("/episodes/{id}")
    ResponseEntity<String> getEpisodeById(@PathVariable String id);
}
