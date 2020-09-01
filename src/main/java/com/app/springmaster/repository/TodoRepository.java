package com.app.springmaster.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springmaster.model.Todo;

public interface TodoRepository extends JpaRepository < Todo, Long > {
    List < Todo > findTaskByUser(String user);
}