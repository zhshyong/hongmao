package com.hongmao.controller.user;

import com.hongmao.common.enums.Message;
import com.hongmao.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * 登陆Controller
 * @author zhsha
 * @version
 */
@RequestMapping("/hongmao")
@Controller
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    /**
     *
     * @return
     */
    @RequestMapping(value="/index.do", method=RequestMethod.GET)
    public String testIndex(){
        System.out.println("input index.do");
        return "/index";
    }
    /**
     * 登陆
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "login.do", method = RequestMethod.POST,
            produces = "application/json;charset=utf-8")
    public Map<String, String> loginAction(HttpServletRequest request){
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        logger.debug("userName" + userName + "  passWord:" + passWord);
        Map<String, String> resultMap = new HashMap<>();
        if (StringUtils.isEmpty(userName) || StringUtils.isEmpty(passWord) ){
            resultMap.put("code", Message.LOGIN_FAILURE.getCode());
            resultMap.put("msg","用户名或密码不能为空");
            return resultMap;
        }
        resultMap = userService.loginUser(userName,passWord);
        return resultMap;
    }
}
