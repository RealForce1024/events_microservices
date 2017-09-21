package com.microservices.events.repository;

import com.microservices.events.model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EventRepository extends MongoRepository<Event, String> {
    List<Event> findByName(@Param("name") String name);
    List<Event> findByNumberLimit(@Param("numberLimit") Integer numberLimit);
}