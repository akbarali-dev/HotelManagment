package uz.javthon.hotel_manage.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.javthon.hotel_manage.common.entity.BaseEntity;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class WorkOrder extends BaseEntity {

    private String issue;
    private String priority;   // LOW, MEDIUM, HIGH
    private String status;     // OPEN, IN_PROGRESS, CLOSED
    private Long assigneeId;
    private Double cost;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
