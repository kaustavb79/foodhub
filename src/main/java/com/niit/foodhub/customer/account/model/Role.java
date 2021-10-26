package com.niit.foodhub.customer.account.model;

import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name = "customer_role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Set<Customer> users;
    public Role(Long id, String name, Set<Customer> users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<Customer> getUsers() {
        return users;
    }
    public void setUsers(Set<Customer> users) {
        this.users = users;
    }
    
}
