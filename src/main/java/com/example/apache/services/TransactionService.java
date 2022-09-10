package com.example.apache.services;

import com.example.apache.entities.Transaction;
import com.example.apache.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    private TransactionRepository repository;

    public TransactionService(TransactionRepository repository){
        this.repository=repository;
    }

    public List<Transaction> getTransactionList(){
        return this.repository.findAll();
    }

    public Transaction createTransaction(Transaction newTransaction){
        return this.repository.save(newTransaction);
    }

    public Optional<Transaction> getId(long id){
        return this.repository.findById(id);
    }

    public void deleteId(long id){
        this.repository.deleteById( id);
    }
}
