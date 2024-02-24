package com.example.ectravelwebapplication.repository.service.Impl;

import com.example.ectravelwebapplication.entity.HotelRoom;
import com.example.ectravelwebapplication.repository.HotelRoomRepo;
import com.example.ectravelwebapplication.repository.service.HotelRoomRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelRoomRepoServiceImpl implements HotelRoomRepoService {
    @Autowired
    HotelRoomRepo hotelRoomRepo;

    @Override
    public void saveHotelRoom(HotelRoom hotelRoom) {
        hotelRoomRepo.save(hotelRoom);
    }

    @Override
    public List<HotelRoom> findByHotel_HotelIdAndDeleted(int hotelId, boolean deleted) {
        return hotelRoomRepo.findByHotel_HotelIdAndDeleted(hotelId,deleted);
    }
}
