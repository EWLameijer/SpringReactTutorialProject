package org.ericwubbo.springreacttutorialproject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/")
public class MessageController {
    @GetMapping
    ResponseEntity<String> getGreeting() {
        return ResponseEntity.ok("Hello user!");
    }
}
