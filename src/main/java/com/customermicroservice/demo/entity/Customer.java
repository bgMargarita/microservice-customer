package com.customermicroservice.demo.entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.springframework.data.annotation.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table
public class Customer {
    @Id
    UUID id;
    String name;

}
