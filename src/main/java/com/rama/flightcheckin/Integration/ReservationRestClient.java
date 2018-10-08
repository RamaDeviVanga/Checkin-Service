package com.rama.flightcheckin.Integration;

import com.rama.flightcheckin.Integration.dto.Reservation;
import com.rama.flightcheckin.Integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {
	public Reservation findReservation(Long id);
	public Reservation updateReservation(ReservationUpdateRequest request);

}
