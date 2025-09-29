package uz.javthon.hotel_manage.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.javthon.hotel_manage.common.entity.BaseEntity;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Payment extends BaseEntity {

    private String method;   // CASH, CARD, TRANSFER
    private Double amount;
    private String rrn;      // transaction reference
    private String status;   // PENDING, SUCCESS, FAILED

    @ManyToOne
    @JoinColumn(name = "folio_id")
    private Folio folio;
}
