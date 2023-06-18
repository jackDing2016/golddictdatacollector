package com.jack.service;

import com.jack.model.wordbaseconstruct.AdverbVO;
import com.jack.model.wordbaseconstruct.PrefixSuffixRootVO;
import com.jack.model.wordbaseconstruct.RootVO;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RootReviewServiceImplTest {


    @Test
    public void getWordVOList() {
        WordReviewService<RootVO> wordReviewService =
                new RootReviewServiceImpl();
        List<RootVO> rootVOList = wordReviewService.getWordVOList();
        System.out.println(rootVOList.size());
    }

    @Test
    public void x() {
        PrefixSuffixRootVO prefixSuffixRootVO = new PrefixSuffixRootVO("pre", "advance", PrefixSuffixRootVO.Type.PREFIX);
        System.out.println(prefixSuffixRootVO.getName());
        System.out.println(prefixSuffixRootVO.getDefinitionVOList());
        System.out.println(prefixSuffixRootVO.getType());
    }


}
