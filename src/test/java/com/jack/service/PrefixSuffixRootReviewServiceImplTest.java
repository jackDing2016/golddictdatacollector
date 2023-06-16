package com.jack.service;

import com.jack.model.wordbaseconstruct.PrefixSuffixRootVO;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.Callable;

public class PrefixSuffixRootReviewServiceImplTest {

    @Test
    public void test() {
        System.out.println("Hello Test");
    }

    @Test
    public void getWordVOList() {
        WordReviewService<PrefixSuffixRootVO> wordReviewService =
                new PrefixSuffixRootReviewServiceImpl();
        List<PrefixSuffixRootVO> prefixSuffixRootVOList = wordReviewService.getWordVOList();
        System.out.println(prefixSuffixRootVOList.size());
    }

    @Test
    public void x() {
        PrefixSuffixRootVO prefixSuffixRootVO = new PrefixSuffixRootVO("pre", "advance", PrefixSuffixRootVO.Type.PREFIX);
        System.out.println(prefixSuffixRootVO.getName());
        System.out.println(prefixSuffixRootVO.getDefinitionVO());
        System.out.println(prefixSuffixRootVO.getType());
    }


}
