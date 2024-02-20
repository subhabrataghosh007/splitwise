package org.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Entity
public class Expense extends BaseModel {

    private String name;

    @Enumerated(EnumType.STRING)
    private ExpenseType expenseType;

    private double totalAmount;

    @OneToMany
    private List<ExpenseUser> paidBy;

    @OneToMany
    private List<ExpenseUser> owedBy;
}
