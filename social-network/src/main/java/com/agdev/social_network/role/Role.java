package com.agdev.social_network.role;

import com.agdev.social_network.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "role")
@EntityListeners(AuditingEntityListener.class)
public class Role {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(unique = true)
    private String name;

    @ManyToMany(mappedBy = "roles" )
    @JsonIgnore
    private List<User> users;

    @CreatedDate
    @Column(nullable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    @Column(insertable = false)
    private LocalDateTime lastModifiedDate;


}
