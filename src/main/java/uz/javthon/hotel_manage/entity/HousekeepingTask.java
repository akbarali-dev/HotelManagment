package uz.javthon.hotel_manage.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.javthon.hotel_manage.common.entity.BaseEntity;


import java.time.LocalDate;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class HousekeepingTask extends BaseEntity {

    private LocalDate date;
    private String type;     // CLEAN, INSPECTION
    private String status;   // PENDING, DONE
    private Long assigneeId; // staff id

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
