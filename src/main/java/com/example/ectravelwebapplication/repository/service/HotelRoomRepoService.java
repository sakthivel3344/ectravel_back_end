package com.example.ectravelwebapplication.repository.service;

import com.example.ectravelwebapplication.entity.HotelRoom;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelRoomRepoService {
    void saveHotelRoom(HotelRoom hotelRoom);

    List<HotelRoom> findByHotel_HotelIdAndDeleted(int hotelId, boolean deleted);
}
