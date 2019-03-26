package com.geekq.billhighuse.service.impl;

import com.geekq.billhighuse.jdbc.GeekQSourceConnection;
import com.geekq.billhighuse.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

/**
 * @author 邱润泽 bullock
 */
@Service("testService")
public class testServiceImpl implements testService {


    @Autowired
    private PlatformTransactionManager transactionManager;

    @Override
    public int testNum() {
        return 0;
    }

//    @GeekQSourceConnection("datasource1")
//    @Override
//    public void testNum() {

//        try {
//        DefaultTransactionDefinition definition = new DefaultTransactionDefinition();
//        TransactionStatus transaction = transactionManager.getTransaction(definition);
//            transactionManager.commit(transaction);
//        } catch (Exception e) {
//            transactionManager.rollback(transaction);
//        }
//    }
}
