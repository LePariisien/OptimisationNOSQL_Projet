
package com.example.OptimisationNOSQL.Services;

import com.example.OptimisationNOSQL.Entities.Session;
import com.example.OptimisationNOSQL.Repositories.MongoDB.SessionMongoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionService {
    private final SessionMongoRepository sessionRepository;

    public SessionService(SessionMongoRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    public List<Session> getAllSessions() {
        return sessionRepository.findAll();
    }

    public Optional<Session> getSessionById(String id) {
        return sessionRepository.findById(id);
    }

    public Session saveSession(Session session) {
        return sessionRepository.save(session);
    }

    public void deleteSession(String id) {
        sessionRepository.deleteById(id);
    }
}
