package com.saurabh.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurabh.bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
