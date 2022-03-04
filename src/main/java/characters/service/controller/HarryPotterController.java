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

    @GetMapping("/characters")
    public ResponseEntity<String> getCharacters(){
        return ResponseEntity.ok(harryService.getCharacters());
    }

    @GetMapping("/students")
    public ResponseEntity<String> getStudents(){
        return ResponseEntity.ok(harryService.getStudents());
    }

    @GetMapping("/house")
    public ResponseEntity<String> getHouse(){
        return ResponseEntity.ok(harryService.getHouse());
    }

    @GetMapping("/staff")
    public ResponseEntity<String> getStaff(){
        return ResponseEntity.ok(harryService.getStaff());
    }
}
