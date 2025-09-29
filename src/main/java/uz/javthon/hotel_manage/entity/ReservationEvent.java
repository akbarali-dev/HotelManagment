package uz.javthon.hotel_manage.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.javthon.hotel_manage.common.entity.BaseEntity;

import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class ReservationEvent extends BaseEntity {

    private String type;
    private LocalDateTime ts;
    private String payload;   // JSON data

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
}
