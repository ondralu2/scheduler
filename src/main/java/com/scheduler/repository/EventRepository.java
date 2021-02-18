package com.scheduler.repository;

import com.scheduler.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Integer> {

    Event findEventById(Integer id);
}

