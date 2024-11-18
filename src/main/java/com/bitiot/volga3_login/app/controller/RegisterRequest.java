package com.bitiot.volga3_login.app.controller;

import com.bitiot.volga3_login.app.models.RoleEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    private Long id;

    private String nombre;

    private String apellido;

    private String username;

    private String password;

    private String email;

    private String empresaUserId;

    private Boolean userState;

    private Date userCreationDate;

    private String userIp;

    private Integer notificacionDispositivoOffline;

    private Set<RoleEntity> roles = new HashSet<>();

    @Transient
    private boolean admin;
}
