package characters.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "harry", url = "${harry.url}")
public interface HarryPotterClient {

   @GetMapping("/characters")
    ResponseEntity<String> getCharacters();

   @GetMapping("/characters/students")
    ResponseEntity<String> getStudents();

   @GetMapping("characters/staff")
    ResponseEntity<String> getStaff();

   @GetMapping("/characters/house/gryffindor")
    ResponseEntity<String> getHouse();
}
