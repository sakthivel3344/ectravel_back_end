package com.example.ectravelwebapplication.repository.service.Impl;

import com.example.ectravelwebapplication.entity.Hotel;
import com.example.ectravelwebapplication.repository.HotelRepo;
import com.example.ectravelwebapplication.repository.service.HotelRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelRepoServiceImpl implements HotelRepoService {

    @Autowired
    HotelRepo hotelRepo;

    @Override
    public void saveHotel(Hotel hotel) {
        hotelRepo.save(hotel);
    }

    @Override
    public List<Hotel> findAllHotel() {
        return hotelRepo.findAll();
    }

    @Override
    public List<Hotel> findAllByDeleted(boolean deleted){
        return hotelRepo.findAllByDeleted(deleted);
    }

}
