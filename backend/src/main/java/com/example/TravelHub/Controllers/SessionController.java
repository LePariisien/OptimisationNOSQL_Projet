package com.example.TravelHub.Controllers;

import com.example.TravelHub.Entities.Session;
import com.example.TravelHub.Services.SessionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sessions")
public class SessionController {
    private final SessionService sessionService;

    public SessionController(SessionService sessionService) {
        this.sessionService = sessionService;
    }

    // @GetMapping("/{id}")
    // public ResponseEntity<Session> getSessionById(@PathVariable String id) {
    // return sessionService.getSessionById(id)
    // .map(ResponseEntity::ok)
    // .orElse(ResponseEntity.notFound().build());
    // }

    // @PostMapping
    // public Session createSession(@RequestBody Session session) {
    // return sessionService.saveSession(session.getToken(), session.getUserId(),
    // session.getTtlSeconds());
    // }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSession(@PathVariable String id) {
        sessionService.deleteSession(id);
        return ResponseEntity.noContent().build();
    }
}
