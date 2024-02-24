package com.example.ectravelwebapplication.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
public class HotelMedia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int hotelMediaId;

    private String mediaUrl;

    private String mediaType;

    public HotelMedia(String mediaUrl, String mediaType) {
        this.mediaUrl = mediaUrl;
        this.mediaType = mediaType;
    }
}
