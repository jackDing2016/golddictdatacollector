package com.jack.model.vo;

public class WordVO {

    private String name;

    private DefinitionVO definitionVO;

    public WordVO() {
    }

    public WordVO(String name, String definition) {
        this.name = name;
        DefinitionVO definitionVO = new DefinitionVO();
        definitionVO.setName(definition);
        this.definitionVO = definitionVO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DefinitionVO getDefinitionVO() {
        return definitionVO;
    }

    public void setDefinitionVO(DefinitionVO definitionVO) {
        this.definitionVO = definitionVO;
    }
}
