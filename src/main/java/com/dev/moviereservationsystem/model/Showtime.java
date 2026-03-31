package com.dev.moviereservationsystem.model;

import com.dev.moviereservationsystem.roles.Reservation_Seat_Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Showtimes")
public class Showtime {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @ManyToOne
    private Movie movie;
    private LocalDateTime startTime;
    private LocalDateTime finishTime;
    @ManyToOne
    private Room room;
    private Double price;
    @OneToMany
    private List<Seat> availableSeats;
    private Reservation_Seat_Role role;
}
