package com.jack.service;

import com.jack.model.vo.WordVO;

import java.util.List;

public interface WordReviewService<T extends WordVO> {

    List<T> getWordVOList();

}
