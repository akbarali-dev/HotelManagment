package uz.javthon.hotel_manage.entity;

import jakarta.persistence.Entity;
import lombok.*;
import uz.javthon.hotel_manage.common.entity.BaseEntity;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class RatePlan extends BaseEntity {

    private String code;
    private String name;
    private String policy;
    private String currency;
}
