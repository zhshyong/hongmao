/**
 * ymm56.com Inc.
 * Copyright (c) 2013-2018 All Rights Reserved.
 */
package com.hongmao.controller.game;

import com.hongmao.controller.user.LoginController;
import com.hongmao.dto.game.GameDto;
import com.hongmao.service.GameService;
import com.hongmao.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 *
 * @author zhsha
 * @version $Id: GameController.java, v 0.1 2018-08-14 9:41 zhsha Exp $$
 */
@Controller
public class GameController {


    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private GameService gameService;

    @ResponseBody
    @RequestMapping(value = "getGameList.do", method = RequestMethod.GET,
            produces = "application/json;charset=utf-8")
    public List<GameDto> findShowGame(HttpServletRequest request){
        List<GameDto> list  = gameService.findShowGame();
        return list;
    }
}
