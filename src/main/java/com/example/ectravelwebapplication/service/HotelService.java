package com.example.ectravelwebapplication.service;

import com.example.ectravelwebapplication.DTO.AddHotelDTO;
import com.example.ectravelwebapplication.DTO.GetAllHotelResponseDTO;
import com.example.ectravelwebapplication.entity.Hotel;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {
    ResponseEntity<String> addHotel(AddHotelDTO addHotelDTO);

    ResponseEntity<List<GetAllHotelResponseDTO>> getAllHotel();
}
