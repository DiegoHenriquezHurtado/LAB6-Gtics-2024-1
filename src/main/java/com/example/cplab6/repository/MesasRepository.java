package com.example.cplab6.repository;

import com.example.cplab6.entity.Mesas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MesasRepository extends JpaRepository<Mesas, Integer> {
}
