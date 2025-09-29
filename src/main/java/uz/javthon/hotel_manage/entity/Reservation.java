package uz.javthon.hotel_manage.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.javthon.hotel_manage.common.entity.BaseEntity;

import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Reservation extends BaseEntity {

    private String code;
    private LocalDate arrival;
    private LocalDate departure;
    private String status;
    private Integer adults;
    private Integer children;
    private String priceSummary;

    @ManyToOne @JoinColumn(name = "guest_id")
    private Guest guest;

    @ManyToOne @JoinColumn(name = "room_type_id")
    private RoomType roomType;

    @ManyToOne @JoinColumn(name = "room_id")
    private Room room;
}
