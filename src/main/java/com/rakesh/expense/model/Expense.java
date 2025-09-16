package com.rakesh.expense.model;

import lombok.Data;
import javax.persistence.*;
import java.time.Instant;

@Entity
@Data
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long groupId;
    private String paidBy;
    private double amount;
    private Instant timestamp;
}