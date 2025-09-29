package uz.javthon.hotel_manage.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.javthon.hotel_manage.common.entity.BaseEntity;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Folio extends BaseEntity {

    private Double balance;
    private String currency;

    @ManyToOne
    @JoinColumn(name = "reservation_id")
    private Reservation reservation;
}
