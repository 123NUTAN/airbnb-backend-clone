package com.spring.projects.airBnbApp.service;

import com.spring.projects.airBnbApp.dto.HotelDto;
import com.spring.projects.airBnbApp.dto.HotelInfoDto;
import com.spring.projects.airBnbApp.dto.HotelInfoRequestDto;
import com.spring.projects.airBnbApp.entity.Hotel;

import java.util.List;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId, HotelInfoRequestDto hotelInfoRequestDto);

    List<HotelDto> getAllHotels();
}
