package com.character.dao;

import com.character.model.pojo.Character;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author flysLi
 * @date 2018/3/5
 */
public interface CharacterMongoDao extends MongoRepository<Character, String> {

    Character findById(Long id);
}
