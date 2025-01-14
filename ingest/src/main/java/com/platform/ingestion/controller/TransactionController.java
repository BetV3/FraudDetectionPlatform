package com.platform.ingestion.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

public class TransactionController {
    private final List<String> transactions;

    TransactionController(List<String> transactions) {
        this.transactions = transactions;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/transaction")

}
