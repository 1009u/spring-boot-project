package com.January.repository;

import com.January.model.SoftDrink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoftDrinkJpaRepository extends JpaRepository<SoftDrink,Long>{
    //we can write here our method
}
