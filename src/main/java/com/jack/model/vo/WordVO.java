package com.jack.model.vo;

import java.util.ArrayList;
import java.util.List;

public class WordVO {

    private String name;

    private List<DefinitionVO> definitionVOList;

    public WordVO() {
    }

    public List<DefinitionVO> getDefinitionVOList() {
        return definitionVOList;
    }

    public void setDefinitionVOList(List<DefinitionVO> definitionVOList) {
        this.definitionVOList = definitionVOList;
    }

    public WordVO(String name, String... definitions) {
        this.name = name;
        if (definitions != null) {
            List<DefinitionVO> definitionVOList1= new ArrayList<>(definitions.length);
            for (String definition : definitions) {
                definitionVOList1.add(new DefinitionVO(definition));
            }
            this.definitionVOList = definitionVOList1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
