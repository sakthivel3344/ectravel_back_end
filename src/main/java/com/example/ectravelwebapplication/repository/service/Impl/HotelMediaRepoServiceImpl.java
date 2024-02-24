package com.example.ectravelwebapplication.repository.service.Impl;

import com.example.ectravelwebapplication.entity.HotelMedia;
import com.example.ectravelwebapplication.repository.HotelMediaRepo;
import com.example.ectravelwebapplication.repository.service.HotelMediaRepoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelMediaRepoServiceImpl implements HotelMediaRepoService {

    @Autowired
    HotelMediaRepo hotelMediaRepo;

    @Override
    public void saveHotelMedia(HotelMedia hotelMedia) {
        hotelMediaRepo.save(hotelMedia);
    }
}
