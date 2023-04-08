package com.sparkdev.ofd.apis.controller;

import com.sparkdev.ofd.apis.dto.UserDTO;
import com.sparkdev.ofd.apis.entities.UserEntity;
import com.sparkdev.ofd.apis.service.UserOperationsService;
import com.sparkdev.ofd.apis.util.DtoToEntityMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserOperationsService userOperationsService;

    @PostMapping("/user")
    public ResponseEntity<Object> createUser(@RequestBody UserDTO userDTO){
        Map<String, Object> response = new HashMap<>();
        log.info(userDTO.toString());
        UserEntity userEntity = DtoToEntityMapper.getUserEntityFromUserDto(userDTO);
        boolean result = userOperationsService.registerUser(userEntity);
        response.put("user created", result);
        return ResponseEntity.ok().body(response);
    }

}
