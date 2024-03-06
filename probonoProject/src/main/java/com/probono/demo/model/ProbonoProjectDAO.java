package com.probono.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.probono.demo.model.entity.ProbonoProject;


@Repository
public interface ProbonoProjectDAO extends JpaRepository<ProbonoProject, Integer>{

}
