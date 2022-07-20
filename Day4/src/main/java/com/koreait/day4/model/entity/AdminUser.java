package com.koreait.day4.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@SequenceGenerator(
        name="seq_adminuser",
        sequenceName = "seq_adminuser",
        initialValue = 1,
        allocationSize = 1
)
@Builder
@EntityListeners(AuditingEntityListener.class)
public class AdminUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_adminuser")
    private Long id;
    private String userid;
    private String userpw;
    private String name;
    private String status;
    @LastModifiedDate
    private LocalDateTime lastLoginAt;
    @CreatedBy
    private String create_by;
    @CreatedDate
    private LocalDateTime regDate;
}
