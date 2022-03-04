package characters.service.controller;

import characters.service.service.BreakingBadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bb")
public class BreakingBadController {

    private final BreakingBadService breakingBadService;

    @GetMapping("/v1/characters")
    public ResponseEntity<String> getCharacters() {
        return ResponseEntity.ok(breakingBadService.getCharacters());
    }

    @GetMapping("/characters/{id}")
    public ResponseEntity<String> getCharacterById(@PathVariable String id) {
        return ResponseEntity.ok(breakingBadService.getCharacter(id));
    }

    @GetMapping("/characters/random")
    public ResponseEntity<String> getRandomCharacters() {
        return ResponseEntity.ok(breakingBadService.getRandomCharacter());
    }

    @GetMapping("/character")
    public ResponseEntity<String> getCharacterByName(@RequestParam String name) {
        return ResponseEntity.ok(breakingBadService.getCharacterByName(name));
    }

    @GetMapping("/eposides")
    public ResponseEntity<String> getEposides() {
        return ResponseEntity.ok(breakingBadService.getEposides());
    }

    @GetMapping("/eposides/{id}")
    public ResponseEntity<String> getEposidesById(@PathVariable String id) {
        return ResponseEntity.ok(breakingBadService.getEposidesById(id));
    }

    @GetMapping("/deaths")
    public ResponseEntity<String> getDeaths(){
        return ResponseEntity.ok(breakingBadService.getDeaths());
    }

    @GetMapping("/deaths/count")
    public ResponseEntity<String> getDeathCount(){
        return ResponseEntity.ok(breakingBadService.getDeathCount());
    }
}
