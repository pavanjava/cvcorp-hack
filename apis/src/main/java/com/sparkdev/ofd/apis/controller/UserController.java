package com.sparkdev.ofd.apis.controller;

import com.sparkdev.ofd.apis.dto.LoginDTO;
import com.sparkdev.ofd.apis.dto.UserDTO;
import com.sparkdev.ofd.apis.entities.UserEntity;
import com.sparkdev.ofd.apis.service.UserOperationsService;
import com.sparkdev.ofd.apis.util.DtoToEntityMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
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
        userEntity = userOperationsService.registerUser(userEntity);
        return ResponseEntity.ok().body(userEntity);
    }

    @GetMapping("/user")
    public ResponseEntity<List<UserEntity>> fetchAllUsers(){
        List<UserEntity> userEntities = userOperationsService.fetchAllUsers();
        return ResponseEntity.ok().body(userEntities);
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, Boolean>> login(@RequestBody LoginDTO loginDTO){
        boolean response = userOperationsService.login(loginDTO);
        Map<String, Boolean> loginResponse = new HashMap<>();
        loginResponse.put("login", response);
        return ResponseEntity.ok().body(loginResponse);
    }

}
