package com.savisoft.apirest.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "locals")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Please, add the local's name")
    private String name;
    private String floor;
    @Length(min = 3, max = 5)
    private String code;

}
