package uz.javthon.hotel_manage.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.javthon.hotel_manage.common.entity.BaseEntity;

import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Availability extends BaseEntity {

    private LocalDate date;
    private Integer total;
    private Integer sold;
    private String closedFlags;

    @ManyToOne
    @JoinColumn(name = "room_type_id")
    private RoomType roomType;
}
