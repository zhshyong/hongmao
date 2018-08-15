package com.hongmao.controller.bill;

import com.hongmao.common.constant.Constant;
import com.hongmao.common.enums.Message;
import com.hongmao.dto.bill.BillDto;
import com.hongmao.service.BillService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author
 * @version
 */
@Controller
public class BillController {

    private static final Logger logger = LoggerFactory.getLogger(BillController.class);

    @Autowired
    private BillService billService;

    @ResponseBody
    @RequestMapping(value = "saveBill.do", method = RequestMethod.POST,
            produces = "application/json;charset=utf-8")
    public Map<String, String> loginAction(HttpServletRequest request){
        HttpSession session = request.getSession();
        String userName = session.getAttribute("userName") == null ? "":
                session.getAttribute("userName").toString();
        Map<String, String> resultMap = new HashMap<>();
        if (StringUtils.isEmpty(userName)) {
            resultMap.put("flag", Constant.ERROR_CODE);
            resultMap.put("msg", "登陆已过期,请重新登陆!");
            return resultMap;
        }
        String gameId = request.getParameter("gameId");
        String bet = request.getParameter("bet");
        String amount = request.getParameter("amount");
        String odds = request.getParameter("odds");
        BillDto billDto = new BillDto();
        billDto.setAmount(Integer.valueOf(amount));
        billDto.setBet(bet);
        billDto.setOdds(Double.valueOf(odds));
        billDto.setGameId(Integer.valueOf(gameId));
        Double number = Math.floor(Integer.valueOf(amount)*Double.valueOf(odds));
        billDto.setBackAmount(Integer.valueOf(amount) + number.intValue());
        billDto.setFlag(Constant.ONE);
        billDto.setStatus(Constant.ZERO);
        billDto.setUserName(userName);
        int flag = billService.saveBill(billDto);
        if (flag == 1) {
            resultMap.put("flag", Constant.SUCCESS_CODE);
            resultMap.put("msg", "下注成功!");
            return resultMap;
        }
        resultMap.put("flag", Constant.ERROR_CODE);
        resultMap.put("msg", "服务器内部异常!");
        return resultMap;
    }
}
