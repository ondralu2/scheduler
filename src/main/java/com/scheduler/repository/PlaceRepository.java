package com.scheduler.repository;

import com.scheduler.model.Place;
import org.springframework.data.repository.CrudRepository;

public interface PlaceRepository extends CrudRepository<Place, Integer> {

    Place findPlaceById(Integer id);
}

