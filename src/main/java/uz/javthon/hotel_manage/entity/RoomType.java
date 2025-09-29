package uz.javthon.hotel_manage.entity;

import jakarta.persistence.Entity;
import lombok.*;
import uz.javthon.hotel_manage.common.entity.BaseEntity;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class RoomType extends BaseEntity {

    private String name;
    private Integer capacity;         
    private String bedConfig;         
    private String amenities;         
    private Double basePrice;
}
