package com.jack.model.wordbaseconstruct;

import com.jack.model.vo.WordVO;

public class PrefixSuffixRootVO extends WordVO {


    private Type type;

    public PrefixSuffixRootVO(String name, String definition, Type type) {
        super(name, definition);
        this.type = type;
    }

    public enum Type {
        PREFIX,
        SUFFIX,
        ROOT
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
