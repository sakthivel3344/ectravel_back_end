package com.example.ectravelwebapplication.api;

import com.example.ectravelwebapplication.DTO.AddHotelDTO;
import com.example.ectravelwebapplication.DTO.GetAllHotelResponseDTO;
import com.example.ectravelwebapplication.entity.Hotel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("api/v1/hotel")
public interface HotelApi {

    @PostMapping("addHotel")
    ResponseEntity<String> addHotel(@RequestBody AddHotelDTO addHotelDTO);

    @GetMapping("getAllHotel")
    ResponseEntity<List<GetAllHotelResponseDTO>> getAllHotel();
}
