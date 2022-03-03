package characters.service.controller;

import characters.service.service.HarryPotterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("harry")
public class HarryPotterController {
    private final HarryPotterService harryService;

    @GetMapping
    public ResponseEntity<String> getHarryPotterCharacters(){
        return ResponseEntity.ok(harryService.getCharacters());
    }
}
