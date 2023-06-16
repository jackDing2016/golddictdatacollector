package com.jack.service;

import com.jack.constatnt.PrefixSuffixRootConstants;
import com.jack.model.wordbaseconstruct.PrefixSuffixRootVO;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PrefixSuffixRootReviewServiceImpl implements WordReviewService<PrefixSuffixRootVO>, RandomDataService {
    @Override
    public List<PrefixSuffixRootVO> getWordVOList() {
        List<PrefixSuffixRootVO> result = new ArrayList<>();
        result.addAll(PrefixSuffixRootConstants.prefixVOList);
        result.addAll(PrefixSuffixRootConstants.suffixVOList);
        result.addAll(PrefixSuffixRootConstants.rootVOList);
//        return result.stream().filter(Objects::nonNull).toList();
        return result.stream().filter(x -> StringUtils.isNotEmpty(x.getName())).toList();
//        return result.stream().filter(x -> x.getName() != null).toList();
    }
}
