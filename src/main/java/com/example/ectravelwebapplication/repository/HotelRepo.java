package com.example.ectravelwebapplication.repository;

import com.example.ectravelwebapplication.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface HotelRepo extends JpaRepository<Hotel, Integer> {
    public List<Hotel> findAllByDeleted(boolean deleted);
}
