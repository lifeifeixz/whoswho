package com.character.controller;

import com.character.model.pojo.Character;
import com.character.model.vo.AddCharacterVo;
import com.character.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

/**
 * @author flysLi
 * @date 2018/3/5
 */
@RestController
@RequestMapping(value = "/character")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @RequestMapping(value = "/test")
    @ResponseBody
    public Object test() {
        return new Date();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Character add(@RequestBody @Valid AddCharacterVo characterVo) {
        return characterService.save(characterVo.convertsIntoCharacter());
    }

    @RequestMapping(value = "/get", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public Character get(@Param("id") Long id) {
        return characterService.find(id);
    }
}
