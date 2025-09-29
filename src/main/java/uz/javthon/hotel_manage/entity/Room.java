package uz.javthon.hotel_manage.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.javthon.hotel_manage.common.entity.BaseEntity;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Room extends BaseEntity {

    private String roomNo;
    private Integer floor;
    private String status;    
    private String features;  

    @ManyToOne
    @JoinColumn(name = "type_id")
    private RoomType type;
}
