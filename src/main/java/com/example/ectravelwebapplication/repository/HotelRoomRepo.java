package com.example.ectravelwebapplication.repository;

import com.example.ectravelwebapplication.entity.HotelRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface HotelRoomRepo extends JpaRepository<HotelRoom, Integer> {
    List<HotelRoom> findByHotel_HotelIdAndDeleted(int hotelId,boolean deleted);
}
