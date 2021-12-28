package com.musinsa.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryVO {
    private long id;
    private String categoryTitle;
    private String code;
    private long highCode;
    private char useYn;
}
