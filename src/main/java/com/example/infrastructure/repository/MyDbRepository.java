package com.example.infrastructure.repository;

import com.example.infrastructure.entity.MytableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyDbRepository extends JpaRepository<MytableEntity, Integer> {}
