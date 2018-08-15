package com.hongmao.service.impl;

import com.hongmao.dao.bill.BillDao;
import com.hongmao.dto.bill.BillDto;
import com.hongmao.service.BillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author
 * @version
 */
@Service("billService")
public class BillServiceImpl implements BillService {

    private static final Logger logger = LoggerFactory.getLogger(BillServiceImpl.class);

    private BillDao billDao;

    @Override
    public int saveBill(BillDto billDto) {
        //调用充值转账
        int isSuccess = rechange(billDto);
        //充值失败
        if (0 == isSuccess) {
            return 0;
        }
        return billDao.saveBill(billDto);
    }

    @Override
    public int rechange(BillDto billDto) {
        return 1;
    }
}
