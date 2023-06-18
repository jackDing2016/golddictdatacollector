package com.jack.model.vo;

import java.util.List;

public class DefinitionVO {
    private String name;

    private List<String> exampleList;

    public DefinitionVO() {
    }

    public DefinitionVO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
