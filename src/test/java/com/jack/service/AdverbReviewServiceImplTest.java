package com.jack.service;

import com.jack.model.wordbaseconstruct.AdverbVO;
import com.jack.model.wordbaseconstruct.PrefixSuffixRootVO;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AdverbReviewServiceImplTest {

    @Test
    public void test() {
        System.out.println("Hello Test");
    }

    @Test
    public void getWordVOList() {
        WordReviewService<AdverbVO> wordReviewService =
                new AdverbReviewServiceImpl();
        List<AdverbVO> adverbVOList = wordReviewService.getWordVOList();
        System.out.println(adverbVOList.size());
    }

    @Test
    public void x() {
        PrefixSuffixRootVO prefixSuffixRootVO = new PrefixSuffixRootVO("pre", "advance", PrefixSuffixRootVO.Type.PREFIX);
        System.out.println(prefixSuffixRootVO.getName());
        System.out.println(prefixSuffixRootVO.getDefinitionVOList());
        System.out.println(prefixSuffixRootVO.getType());
    }


}
