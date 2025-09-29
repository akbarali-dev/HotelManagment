package uz.javthon.hotel_manage.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.javthon.hotel_manage.common.entity.BaseEntity;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class FolioLine extends BaseEntity {

    private String kind;    // charge, tax, service
    private Double amount;
    private Double tax;
    private String note;

    @ManyToOne
    @JoinColumn(name = "folio_id")
    private Folio folio;
}
