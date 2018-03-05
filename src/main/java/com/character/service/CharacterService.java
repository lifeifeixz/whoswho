package com.character.service;

import com.character.model.pojo.Character;

/**
 * @author flysLi
 * @date 2018/3/5
 */
public interface CharacterService {

    Character save(Character character);

    Character find(Long id);
}
