package com.example.lab3.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "Users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @Column
    private String id;
    @Temporal(TemporalType.DATE)
    @Column(name = "create_date")
    private Date createDate;
    @Temporal(TemporalType.DATE)
    @Column(name = "edit_date")
    private Date editDate;
    @Column(name = "full_name")
    private String fullName;
    @Column
    private String login;
    @Column
    private String password;
    @Enumerated(EnumType.STRING)
    @Column
    private Role role;
}
