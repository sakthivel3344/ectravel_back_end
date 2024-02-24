package com.example.ectravelwebapplication.controller;

import com.example.ectravelwebapplication.DTO.AddHotelDTO;
import com.example.ectravelwebapplication.DTO.GetAllHotelResponseDTO;
import com.example.ectravelwebapplication.api.HotelApi;
import com.example.ectravelwebapplication.entity.Hotel;
import com.example.ectravelwebapplication.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class HotelController implements HotelApi {

    @Autowired
    HotelService hotelService;

    @Override
    public ResponseEntity<String> addHotel(@RequestBody AddHotelDTO addHotelDTO){
        return hotelService.addHotel(addHotelDTO);
    }

    @Override
    public ResponseEntity<List<GetAllHotelResponseDTO>> getAllHotel() {
        return hotelService.getAllHotel();
    }
}
