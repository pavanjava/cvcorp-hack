package com.sparkdev.ofd.apis.dto;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class UserDTO {
    private String userName;
    private String email;
    private String password;
    private String phone;
    private boolean isActive;
    private String address;
}
