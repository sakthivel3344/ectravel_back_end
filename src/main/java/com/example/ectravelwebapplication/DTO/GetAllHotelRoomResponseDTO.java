package com.example.ectravelwebapplication.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllHotelRoomResponseDTO {

    private int hotelRoomId;

    private int roomCount;

    private int adultCount;

    private int childrenCount;

    private int price;

    private boolean airConditioner;
}
