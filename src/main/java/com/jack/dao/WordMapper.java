package com.jack.dao;

import java.util.List;

import com.jack.model.Word;
import com.jack.model.WordExample;
import com.jack.model.vo.WordVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface WordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_word
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    long countByExample(WordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_word
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    int deleteByExample(WordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_word
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_word
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    int insert(Word row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_word
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    int insertSelective(Word row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_word
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    List<Word> selectByExample(WordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_word
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    Word selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_word
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    int updateByExampleSelective(@Param("row") Word row, @Param("example") WordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_word
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    int updateByExample(@Param("row") Word row, @Param("example") WordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_word
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    int updateByPrimaryKeySelective(Word row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tm_word
     *
     * @mbg.generated Wed May 31 00:09:41 EDT 2023
     */
    int updateByPrimaryKey(Word row);


    @Select("SELECT * FROM tm_word WHERE ID = #{id}")
    Word selectWord(Integer id);

    Word selectTest();

    String getRandomWord(@Param("wordLanguage") Integer wordLanguage);

    String getRandomWordWithNoDefinition();

    List<WordVO> getRandomWordVOList(@Param("wordLanguage") Integer wordLanguage);

    List<WordVO> getWordVOList(@Param(value = "rootNameList") List<String> rootNameList);

}