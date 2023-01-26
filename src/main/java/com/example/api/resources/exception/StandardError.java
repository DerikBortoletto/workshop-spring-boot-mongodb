package com.example.api.resources.exception;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
public class StandardError implements Serializable {
    private static final long serialVersionUID = 1l;

    @Getter
    @Setter
     private Long timestamp;

     @Getter
     @Setter
     private Integer status;

     @Getter
     @Setter
     private String error;

     @Getter
     @Setter
     private String message;

     @Getter
     @Setter
     private String path;


}
