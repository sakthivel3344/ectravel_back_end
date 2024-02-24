package com.example.ectravelwebapplication.DTO;

import com.example.ectravelwebapplication.entity.Hotel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllHotelResponseDTO {

    private String coverImgUrl;

    private String hotelName;

    private String city;

    private String state;

    private String country;

    private String description;

    private double latitude;

    private double longitude;

    private boolean married;

    private boolean unmarried;

    private boolean smoking;

    private boolean drinking;

    private boolean wifi;

    private boolean water;

    private boolean food;

    private boolean electricity;

    private boolean gym;

    private List<GetAllHotelRoomResponseDTO> roomList;
}
