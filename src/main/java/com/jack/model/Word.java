package com.jack.model;

import java.time.LocalDateTime;

public class Word {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tm_word.id
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tm_word.name
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tm_word.type
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tm_word.count
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    private Integer count;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tm_word.is_favorite
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    private Integer isFavorite;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tm_word.id
     *
     * @return the value of tm_word.id
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tm_word.id
     *
     * @param id the value for tm_word.id
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tm_word.name
     *
     * @return the value of tm_word.name
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tm_word.name
     *
     * @param name the value for tm_word.name
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tm_word.type
     *
     * @return the value of tm_word.type
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tm_word.type
     *
     * @param type the value for tm_word.type
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tm_word.count
     *
     * @return the value of tm_word.count
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tm_word.count
     *
     * @param count the value for tm_word.count
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tm_word.is_favorite
     *
     * @return the value of tm_word.is_favorite
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    public Integer getIsFavorite() {
        return isFavorite;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tm_word.is_favorite
     *
     * @param isFavorite the value for tm_word.is_favorite
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    public void setIsFavorite(Integer isFavorite) {
        this.isFavorite = isFavorite;
    }


    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}