package com.character.model.pojo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author flysLi
 * @date 2018/3/5
 */
@Document(collection = "character")
public class Character {

    /**
     * id
     **/
    @Id
    private Long id;

    /**
     * 本名
     **/
    private String name;

    /**
     * 别名
     **/
    private String alias;

    /**
     * 所处时代
     **/
    private String times;

    /**
     * 职业
     **/
    private String office;

    /**
     * 民族
     **/
    private String nation;

    /**
     * 爵位、尊称、俗称
     **/
    private String investitive;

    /**
     * 出生日期
     **/
    private String birthday;

    /**
     * 主要成就
     **/
    private String majorAchievements;

    /**
     * 去世时间
     **/
    private String deathTime;

    /**
     * 影响力
     **/
    private int effect;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getInvestitive() {
        return investitive;
    }

    public void setInvestitive(String investitive) {
        this.investitive = investitive;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMajorAchievements() {
        return majorAchievements;
    }

    public void setMajorAchievements(String majorAchievements) {
        this.majorAchievements = majorAchievements;
    }

    public String getDeathTime() {
        return deathTime;
    }

    public void setDeathTime(String deathTime) {
        this.deathTime = deathTime;
    }

    public int getEffect() {
        return effect;
    }

    public void setEffect(int effect) {
        this.effect = effect;
    }
}
