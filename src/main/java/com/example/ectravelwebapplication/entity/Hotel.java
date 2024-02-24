package com.example.ectravelwebapplication.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hotelId;

    @OneToOne
    @JoinColumn(name = "fk_cover_img")
    private HotelMedia coverImg;

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

    private boolean deleted;

    public Hotel(HotelMedia coverImg, String hotelName, String city, String state, String country, String description, double latitude, double longitude, boolean married, boolean unmarried, boolean smoking, boolean drinking, boolean wifi, boolean water, boolean food, boolean electricity, boolean gym,boolean deleted) {
        this.coverImg = coverImg;
        this.hotelName = hotelName;
        this.city = city;
        this.state = state;
        this.country = country;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.married = married;
        this.unmarried = unmarried;
        this.smoking = smoking;
        this.drinking = drinking;
        this.wifi = wifi;
        this.water = water;
        this.food = food;
        this.electricity = electricity;
        this.gym = gym;
        this.deleted = deleted;
    }
}
