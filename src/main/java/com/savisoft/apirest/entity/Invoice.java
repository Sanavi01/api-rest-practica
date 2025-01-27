package com.savisoft.apirest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;


@Entity
@Table(name = "invoices")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Invoice {

    @Id
    @GeneratedValue
    private Long id;
    private Long price;
    private int quantity;
    @CreationTimestamp
    private Date creationDate;

}
