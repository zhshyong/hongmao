package com.hongmao.service;

import com.hongmao.dto.bill.BillDto;

/**
 *
 * @author
 * @version
 */
public interface BillService {

    public int saveBill(BillDto billDto);

    public int rechange(BillDto billDto);
}
