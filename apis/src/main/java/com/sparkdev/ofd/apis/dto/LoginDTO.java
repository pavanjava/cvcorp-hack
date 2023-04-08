package com.sparkdev.ofd.apis.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class LoginDTO {
    private String email;
    private String password;
}
