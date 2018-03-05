package com.character.service.impl;

import com.character.dao.CharacterMongoDao;
import com.character.model.pojo.Character;
import com.character.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

/**
 * @author flysLi
 * @date 2018/3/5
 */
@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterMongoDao characterMongoDao;


    @Override
    public Character save(Character character) {
        character.setId(System.currentTimeMillis() + new Random().nextLong());
        return characterMongoDao.save(character);
    }

    @Override
    public Character find(Long id) {
        return characterMongoDao.findById(id);
    }
}
