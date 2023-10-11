package com.kloster.pocpiramidedetestes.domain;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


@Entity
@Getter
@Setter
public class Produto {

    @Id
    private Long id;
    private String nome;
    private double preco;

}