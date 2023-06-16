package com.jack.service;

import com.jack.constatnt.AdverbConstants;
import com.jack.model.wordbaseconstruct.AdverbVO;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

public class AdverbReviewServiceImpl implements WordReviewService<AdverbVO>, RandomDataService {
    @Override
    public List<AdverbVO> getWordVOList() {
        return AdverbConstants.adverbVOList.stream()
                .filter(x -> StringUtils.isNotEmpty(x.getName()))
                .toList();
    }
}
