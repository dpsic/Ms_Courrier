package com.example.ms_courrier.entites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Courrier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long value;
    private Date date;
    private String destination;
    private Boolean depart;
    @ManyToOne
    @JoinColumn(name = "ID_THEME")
    private  Theme theme;
    @ManyToOne
    @JoinColumn(name = "ID_TYPE")
    private Type type;


}
