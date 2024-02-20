package org.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class ExpenseUser extends BaseModel {

    @ManyToOne
    private User user;

    private double totalAmount;
}
