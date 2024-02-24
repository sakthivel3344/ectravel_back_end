package com.example.ectravelwebapplication.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
public class HotelRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hotelRoomId;

    @ManyToOne
    @JoinColumn(name = "fk_hotel")
    private Hotel hotel;

    private int adultCount;

    private int childrenCount;

    private int price;

    private int initialAvailCount;

    private int currentAvailCount;

    private boolean airConditioner;

    private boolean deleted;

    public HotelRoom(Hotel hotel, int adultCount, int childrenCount, int price,int initialAvailCount,int currentAvailCount, boolean airConditioner,boolean deleted) {
        this.hotel = hotel;
        this.adultCount = adultCount;
        this.childrenCount = childrenCount;
        this.price = price;
        this.initialAvailCount = initialAvailCount;
        this.currentAvailCount = currentAvailCount;
        this.airConditioner = airConditioner;
        this.deleted = deleted;
    }
}
