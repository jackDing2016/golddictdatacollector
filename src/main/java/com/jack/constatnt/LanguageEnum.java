package com.jack.constatnt;

public enum LanguageEnum {

    ENGLISH("English", 1),
    JAPANESE("Japanese", 2);

    private String name;

    private Integer code;

    LanguageEnum(String name, int i) {
        this.name = name;
        this.code = i;
    }

    public String getName() {
        return name;
    }

    public Integer getCode() {
        return code;
    }
}
