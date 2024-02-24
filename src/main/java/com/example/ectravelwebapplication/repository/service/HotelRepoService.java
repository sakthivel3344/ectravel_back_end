package com.example.ectravelwebapplication.repository.service;

import com.example.ectravelwebapplication.entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelRepoService {
    void saveHotel(Hotel hotel);

    List<Hotel> findAllHotel();

    List<Hotel> findAllByDeleted(boolean deleted);
}
