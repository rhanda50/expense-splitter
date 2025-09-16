package com.rakesh.expense.controller;

import com.rakesh.expense.model.Expense;
import com.rakesh.expense.repository.ExpenseRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/expense")
public class ExpenseController {

    private final ExpenseRepository expenseRepository;

    public ExpenseController(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @PostMapping("/expenses")
    public ResponseEntity<Expense> add(@RequestBody Expense e) {
        return ResponseEntity.ok(expenseRepository.save(e));
    }

    @GetMapping("/expenses/group/{groupId}")
    public ResponseEntity<List<Expense>> list(@PathVariable Long groupId) {
        return ResponseEntity.ok(expenseRepository.findAll()); // simplified for starter
    }
}