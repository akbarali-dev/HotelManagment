package uz.javthon.hotel_manage.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.javthon.hotel_manage.common.entity.BaseEntity;

import java.time.LocalDateTime;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Invoice extends BaseEntity {

    private String number;
    private String pdfRef;
    private LocalDateTime issuedAt;

    @ManyToOne
    @JoinColumn(name = "folio_id")
    private Folio folio;
}
