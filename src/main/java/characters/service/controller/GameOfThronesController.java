package characters.service.controller;

import characters.service.service.GameOfThronesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("got")
@RequiredArgsConstructor
public class GameOfThronesController {

    private final GameOfThronesService gameOfThronesService;

    @GetMapping("/random")
    public ResponseEntity<String> getRandomCharacters() {
        return ResponseEntity.ok(gameOfThronesService.getRandoQuotes());
    }

    @GetMapping("/random/5")
    public ResponseEntity<String> getRandomCharactersQuotes() {
        return ResponseEntity.ok(gameOfThronesService.getRandomQuotesFive());
    }

    @GetMapping("/characters")
    public ResponseEntity<String> getCharacters() {
        return ResponseEntity.ok(gameOfThronesService.getCharacters());
    }

    @GetMapping("/houses")
    public ResponseEntity<String> getHouses(){
        return ResponseEntity.ok(gameOfThronesService.getHouses());
    }

    @GetMapping("/character/{name}")
    public ResponseEntity<String> getCharacterByName(@PathVariable String name){
        return ResponseEntity.ok(gameOfThronesService.getCharacter(name));
    }
}
