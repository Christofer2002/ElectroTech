package com.bank.segura.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "account")
@Inheritance(strategy = InheritanceType.JOINED)
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_account")
    private Long idAccount;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id_user")
    private User user;

    @Column(nullable = false, name = "creation_date_account")
    private String creationDate;

    @Column(nullable = false, name = "account_number")
    private String accountNumber;

    @Column(nullable = false, name = "account_balance")
    private Double accountBalance;


}
