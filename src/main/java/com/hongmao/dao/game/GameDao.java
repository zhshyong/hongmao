package com.hongmao.dao.game;

import com.hongmao.dto.game.GameDto;

import java.util.List;

/**
 *
 * @author
 * @version
 */
public interface GameDao {

    /**
     * 查询需要展示的竞猜
     * @return
     */
    List<GameDto> findShowGame();
}
