package uz.javthon.hotel_manage.entity;

import jakarta.persistence.Entity;
import lombok.*;
import uz.javthon.hotel_manage.common.entity.BaseEntity;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Guest extends BaseEntity {

    private String fullName;
    private String contacts;     // telefon/email JSON
    private String docInfo;      // passport/ID
    private String preferences;  // JSON: non-smoking, vegan
    private String flags;        // VIP, Blacklist
}
