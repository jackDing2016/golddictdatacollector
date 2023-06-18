package com.jack.service;

import com.jack.constatnt.RootConstants;
import com.jack.model.wordbaseconstruct.RootVO;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class RootReviewServiceImpl implements WordReviewService<RootVO>, RandomDataService {
    @Override
    public List<RootVO> getWordVOList() {
        return RootConstants.rootVOList.stream().filter(x -> StringUtils.isNotEmpty(x.getName())).toList();
    }
}
