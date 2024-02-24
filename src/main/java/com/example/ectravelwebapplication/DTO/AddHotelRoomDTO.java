package com.example.ectravelwebapplication.DTO;

import lombok.Data;

@Data
public class AddHotelRoomDTO {

    private int roomCount;

    private int adultCount;

    private int childrenCount;

    private int price;

    private boolean airConditioner;

}
