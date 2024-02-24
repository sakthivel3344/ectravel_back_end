package com.example.ectravelwebapplication.repository.service;

import com.example.ectravelwebapplication.entity.HotelMedia;
import org.springframework.stereotype.Service;

@Service
public interface HotelMediaRepoService {
    void saveHotelMedia(HotelMedia hotelMedia);
}
