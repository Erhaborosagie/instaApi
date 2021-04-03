package com.osagie.instaApi.entities;

import com.sun.istack.internal.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Column(unique = true)
    private String userId;

    @NotNull
    @Size(min = 2, message = "At least two characters")
    @Column(unique = true)
    private String userName;

    @NotNull
    private String name;

    private String profileImage;
}
