package com.scheduler.repository;

import com.scheduler.model.Date;
import org.springframework.data.repository.CrudRepository;

public interface DateRepository extends CrudRepository<Date, Integer> {

    Date findDateById(Integer id);
}

