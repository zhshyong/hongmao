package com.hongmao.service.impl;

import com.hongmao.dao.game.GameDao;
import com.hongmao.dto.game.GameDto;
import com.hongmao.service.GameService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author
 * @version
 */
@Service("gameService")
public class GameServiceImpl implements GameService {

    private static final Logger logger = LoggerFactory.getLogger(GameServiceImpl.class);
    @Autowired
    private GameDao gameDao;

    @Override
    public List<GameDto> findShowGame() {
        return gameDao.findShowGame();
    }
}
