package com.probono.demo.model;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.probono.demo.model.entity.Activist;



public interface ActivistDAO extends JpaRepository<Activist, String>{


}
