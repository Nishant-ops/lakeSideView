package com.Nishant.LakeSideHotel.service;

import com.Nishant.LakeSideHotel.model.BookedRoom;

import java.util.List;

public interface IBookedRoomService {

    void cancelBooking(Long bookingId);

    List<BookedRoom> getAllBookingsByRoomId(Long roomId);

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> getAllBookings();

    List<BookedRoom> getBookingsByUserEmail(String email);
}