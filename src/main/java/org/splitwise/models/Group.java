package org.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "splitwise_group")
public class Group extends BaseModel {

    @ManyToMany
    private List<User> users;
    private boolean isSimplifiedDebtOn;
    private String name;
    @OneToMany
    private List<Expense> expenses;

}
