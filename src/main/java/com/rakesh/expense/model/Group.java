package com.rakesh.expense.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class GroupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}