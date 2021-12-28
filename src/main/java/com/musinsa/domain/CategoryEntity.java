package com.musinsa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Table(name = "CATEGORY")
@Entity
@Getter @Setter
public class CategoryEntity {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;                  //pk

    @ManyToOne
    @JoinColumn(name="highCode_id",nullable = true)
    private CategoryEntity highCodeId;            //상위카테고리코드 id

    @Column
    private String categoryTitle;     //카테고리 타이틀

    @Column
    private LocalDateTime updateDate; //수정시간

    @Column
    private LocalDateTime createDate; //작성시간

    @Column
    private char useYn;              //사용 유무
}
