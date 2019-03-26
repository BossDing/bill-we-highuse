package com.geekq.billhighuse.service.impl;

import com.geekq.billhighuse.jdbc.GeekQSourceConnection;
import com.geekq.billhighuse.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 邱润泽 bullock
 */
@Service("testService")
public class testServiceImpl implements testService {


    @GeekQSourceConnection("datasource1")
    @Override
    public int testNum() {
        return 1;
    }
}
