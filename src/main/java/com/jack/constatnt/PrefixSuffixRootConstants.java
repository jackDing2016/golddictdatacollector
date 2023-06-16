package com.jack.constatnt;

import com.jack.model.wordbaseconstruct.PrefixSuffixRootVO;

import java.util.List;

public class PrefixSuffixRootConstants {

    public final static List<PrefixSuffixRootVO> prefixVOList;

    public final static List<PrefixSuffixRootVO> suffixVOList;

    public final static List<PrefixSuffixRootVO> rootVOList;

    static {
        prefixVOList = List.of(
                new PrefixSuffixRootVO("pre", "before,in advance", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("post", "after", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("mono", "one", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("poly", "many", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("uni", "one", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("bi", "two", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("tri", "three", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("quad", "four", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("co,com", "together,with", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("contra,counter", "against,opposite", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("sub", "under,below", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("super,sur", "over,above,beyond", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("un", "not,none", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("dis", "not,none", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("inter", "among or between", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("intra", "within,inside", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("circ,circum", "round,around", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("trans", "across,through", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("mal", "bad or badly,wrong,ill", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("mis", "bad or badly,wrong", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("re", "again,back", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("sym,syn", "together,same", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("hypo", "under,below,less", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("hyper", "over,beyond,high or extremely", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("ex", "out", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("ben", "good", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("phon", "sound", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("eu", "good", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("anthro", "man", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("di", "two", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("dia", "through", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("epi", "upon", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("in or im or il or ir", "not or opposite or in", PrefixSuffixRootVO.Type.PREFIX)
//                , new PrefixSuffixRootVO("in", "not or in ", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("bell", "war", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("carn", "fresh", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("cogn", "to learn", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("apo", "away from", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("pan", "all", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("para", "beside", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("peri", "around", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("pro", "forward or for or in favour of", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("con", "with", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("de", "down,completely or reversing action or take away", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("en", "in or on or put in", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("anglo", "english", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("ante", "before", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("anti", "against", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("arch", "supreme,most", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("auto", "self", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("cent(i)", "hundredth", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("cyber", "computer,internet", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("e", "electronic,internet", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("eco", "environment", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("euro", "european", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("ex", "former", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("extra", "exceptionally,outside", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("fore", "before", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("geo", "earth", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("ill", "badly", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("kilo", "thousand", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("mega", "million or extremely", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("micro", "very small", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("mid", "in the middle of", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("milli", "thousandth", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("mini", "little", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("neo", "new(ly)", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("omni", "all", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("out", "do/be more than", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("over", "too much", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("pan", "right across", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("photo", "light", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("pseudo", "false", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("psycho", "mind,mental", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("semi", "half", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("socio", "society", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("tele", "distant", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("thermo", "heat", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("ultra", "extreme,beyond", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("under", "too little?", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("vice", "deputy", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.PREFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.PREFIX)
        );

        suffixVOList = List.of(
                new PrefixSuffixRootVO("able", "able to be", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ible", "able to do", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("less", "without", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ology", "study of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("phobia", "fear of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ian,or", "a person who, support of, related to citizen of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ance,ancy,ence,ency", "process/state of or quality of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("cracy", "rule", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("gress", "step", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ward", "in the direction of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("age", "instance of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("al", "instance of or related to", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ation", "process/state of or product of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ee", "object of verb", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("er", "belonging to", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("er or or", "person/thing that does", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ess", "female", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ette", "small", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ful", "amount held in or full of, providing", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("hood", "quality,group,time of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ing", "quantity of material activity", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ism", "belief,practice", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ity", "quality of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ment", "process/result of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ness", "quality of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ocracy", "government by", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("phile", "lover of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("phobe", "hater,fearer of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("phobia", "irrational fear of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ship", "status,state,quality of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ese", "inhabitant of, language of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ist", "practitioner of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("centric", "centred on", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ed", "having", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ic", "related to", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ical", "related to", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ish", "rather like inhabitant of,language of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ive", "can do,does", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("like", "like", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ly", "with the quality of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ous", "having", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("proof", "protected/-ing against", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("y", "like,characterised by", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ate", "causative", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("en", "make,become", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ify", "causative:make", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("ise/ize", "various", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("dom", "the condition or state of or the rank of; an area ruled by or the group of", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.SUFFIX)

        );

        rootVOList = List.of(
                new PrefixSuffixRootVO("pathy", "feeling", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("fract,frag", "broken", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("min", "to make smaller", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("mit", "to send", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("scribe,script", "to write", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("punct", "pointed", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("put", "to consider", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("quisit", "to ask", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("rog", "to ask", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("sequ", "to follow", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("ec", "out of", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("cit", "move", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("e", "out of or from", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("fact", "made", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("fic", "to do", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("gen", "born", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("graph", "to write", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("ig", "to act or do", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("pend", "to hang", PrefixSuffixRootVO.Type.ROOT)                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("reg", "rule", PrefixSuffixRootVO.Type.ROOT)
//                , new PrefixSuffixRootVO("geo", "earth", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)
                , new PrefixSuffixRootVO("", "", PrefixSuffixRootVO.Type.ROOT)

        );

    }

}
