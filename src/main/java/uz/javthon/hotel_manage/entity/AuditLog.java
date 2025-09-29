package uz.javthon.hotel_manage.entity;

import jakarta.persistence.Entity;
import lombok.*;
import uz.javthon.hotel_manage.common.entity.BaseEntity;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class AuditLog extends BaseEntity {

    private String actor;     
    private String action;    
    private String entity;    
    private Long entityId;
    private String diff;      
}
