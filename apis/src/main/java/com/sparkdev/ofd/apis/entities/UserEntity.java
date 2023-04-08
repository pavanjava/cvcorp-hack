package com.sparkdev.ofd.apis.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "app_user")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    @Column
    private String userName;
    @Column
    private String email;
    @Column
    private String password;
    @Column
    private String phone;
    @Column
    private boolean isActive;
    @Column
    private String address;

}
