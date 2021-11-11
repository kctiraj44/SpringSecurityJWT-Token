package com.springJwt.SpringJwt.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    private int id;
    private String username;
    private String password;
    private String email;


}
