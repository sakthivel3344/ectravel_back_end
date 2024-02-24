package com.example.ectravelwebapplication.service.Impl;

import com.example.ectravelwebapplication.DTO.AddHotelDTO;
import com.example.ectravelwebapplication.DTO.AddHotelRoomDTO;
import com.example.ectravelwebapplication.DTO.GetAllHotelResponseDTO;
import com.example.ectravelwebapplication.DTO.GetAllHotelRoomResponseDTO;
import com.example.ectravelwebapplication.entity.Hotel;
import com.example.ectravelwebapplication.entity.HotelMedia;
import com.example.ectravelwebapplication.entity.HotelRoom;
import com.example.ectravelwebapplication.repository.service.HotelMediaRepoService;
import com.example.ectravelwebapplication.repository.service.HotelRepoService;
import com.example.ectravelwebapplication.repository.service.HotelRoomRepoService;
import com.example.ectravelwebapplication.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelMediaRepoService hotelMediaRepoService;

    @Autowired
    HotelRepoService hotelRepoService;

    @Autowired
    HotelRoomRepoService hotelRoomRepoService;

    @Override
    public ResponseEntity<String> addHotel(AddHotelDTO addHotelDTO) {
        HotelMedia hotelMedia = new HotelMedia(
                addHotelDTO.getCoverImgUrl(),
                "IMAGE"
        );
        hotelMediaRepoService.saveHotelMedia(hotelMedia);
        Hotel hotel = new Hotel(
                hotelMedia,
                addHotelDTO.getHotelName(),
                addHotelDTO.getCity(),
                addHotelDTO.getState(),
                addHotelDTO.getCountry(),
                addHotelDTO.getDescription(),
                addHotelDTO.getLatitude(),
                addHotelDTO.getLongitude(),
                addHotelDTO.isMarried(),
                addHotelDTO.isUnmarried(),
                addHotelDTO.isSmoking(),
                addHotelDTO.isDrinking(),
                addHotelDTO.isWifi(),
                addHotelDTO.isWater(),
                addHotelDTO.isFood(),
                addHotelDTO.isElectricity(),
                addHotelDTO.isGym(),
                false
        );
        hotelRepoService.saveHotel(hotel);
        for (AddHotelRoomDTO addHotelRoomDTO: addHotelDTO.getRoomList()) {
            HotelRoom hotelRoom = new HotelRoom(
                    hotel,
                    addHotelRoomDTO.getAdultCount(),
                    addHotelRoomDTO.getChildrenCount(),
                    addHotelRoomDTO.getPrice(),
                    addHotelRoomDTO.getRoomCount(),
                    addHotelRoomDTO.getRoomCount(),
                    addHotelRoomDTO.isAirConditioner(),
                    false
            );
            hotelRoomRepoService.saveHotelRoom(hotelRoom);
        }
        return new ResponseEntity<>("Hotel Created Successfully!", HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<GetAllHotelResponseDTO>> getAllHotel() {
        List<Hotel> hotelList = hotelRepoService.findAllByDeleted(false);
        List<GetAllHotelResponseDTO> getAllHotelResponseDTOList = new ArrayList<>();
        for (Hotel hotel: hotelList) {
            List<GetAllHotelRoomResponseDTO> getAllHotelRoomResponseDTOArrayList = new ArrayList<>();
            List<HotelRoom> hotelRoomList = hotelRoomRepoService.findByHotel_HotelIdAndDeleted(hotel.getHotelId(),false);
            for (HotelRoom hotelRoom: hotelRoomList) {
                GetAllHotelRoomResponseDTO getAllHotelRoomResponseDTO = new GetAllHotelRoomResponseDTO(
                        hotelRoom.getHotelRoomId(),
                        hotelRoom.getInitialAvailCount(),
                        hotelRoom.getAdultCount(),
                        hotelRoom.getChildrenCount(),
                        hotelRoom.getPrice(),
                        hotelRoom.isAirConditioner()
                );
                getAllHotelRoomResponseDTOArrayList.add(getAllHotelRoomResponseDTO);
            }

            GetAllHotelResponseDTO getAllHotelResponseDTO = new GetAllHotelResponseDTO(
                    hotel.getCoverImg().getMediaUrl(),
                    hotel.getHotelName(),
                    hotel.getCity(),
                    hotel.getState(),
                    hotel.getCountry(),
                    hotel.getDescription(),
                    hotel.getLatitude(),
                    hotel.getLongitude(),
                    hotel.isMarried(),
                    hotel.isUnmarried(),
                    hotel.isSmoking(),
                    hotel.isDrinking(),
                    hotel.isWifi(),
                    hotel.isWater(),
                    hotel.isFood(),
                    hotel.isElectricity(),
                    hotel.isGym(),
                    getAllHotelRoomResponseDTOArrayList
            );
            getAllHotelResponseDTOList.add(getAllHotelResponseDTO);
        }
        return new ResponseEntity<>(getAllHotelResponseDTOList, HttpStatus.OK);
    }
}
