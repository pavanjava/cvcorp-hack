package com.sparkdev.ofd.apis.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class UserDTO {
    private String userName;
    private String email;
    private String password;
    private String phone;
    private boolean isActive;
    private String address;
}
