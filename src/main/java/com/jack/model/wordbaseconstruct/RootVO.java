package com.jack.model.wordbaseconstruct;

import com.jack.model.vo.WordVO;

public class RootVO extends WordVO {

    private String origin;

    public RootVO() {
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public RootVO(String name, String definition) {
        super(name, definition);
    }
}
