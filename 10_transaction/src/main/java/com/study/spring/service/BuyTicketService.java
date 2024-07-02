package com.study.spring.service;

import com.study.spring.dao.ITransaction1Dao;
import com.study.spring.dao.ITransaction2Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

@Service
public class BuyTicketService implements IBuyTicketService{

    @Autowired
    ITransaction1Dao transaction1;
    @Autowired
    ITransaction2Dao transaction2;

    @Autowired
    PlatformTransactionManager transactionManager;
    @Autowired
    TransactionDefinition definition;

    @Override
    public int buy(String consumerId, int money, String error) {
        TransactionStatus status = transactionManager.getTransaction(definition);
        try {
            transaction1.pay(consumerId, money);
            if(error.equals("1")){
                int n = 10/0;
            }
            transaction2.pay(consumerId, money);
            transactionManager.commit(status);
            return 1;
        }catch (Exception e) {
            transactionManager.rollback(status);
            return 0;
        }
    }
}
