package characters.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("harry")
public class HarryController {
    private final HarryService harryService;

    @GetMapping
    public ResponseEntity<String> getHarryPotterCharacters(){
        return ResponseEntity.ok(harryService.getCharacters());
    }
}
