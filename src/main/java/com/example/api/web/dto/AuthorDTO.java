package com.example.api.web.dto;

import com.example.api.persistence.entities.User;
import lombok.*;

import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private String name;

    public AuthorDTO(User user){
        this.id = user.getId();
        this.name = user.getName();
    }
}
