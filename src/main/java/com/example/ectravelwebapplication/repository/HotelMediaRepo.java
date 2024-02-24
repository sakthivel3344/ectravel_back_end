package com.example.ectravelwebapplication.repository;

import com.example.ectravelwebapplication.entity.HotelMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface HotelMediaRepo extends JpaRepository<HotelMedia, Integer> {

}
