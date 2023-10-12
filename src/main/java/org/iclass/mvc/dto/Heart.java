package org.iclass.mvc.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Heart {		//tbl_hearts 테이블의 DTO
	private String userid;	//좋아요 누른 사용자
	private int idx;		//글번호
	private boolean CHECKED;
	

}
// 3-b. 좋아요 기능 dto
/*
create table TBL_HEARTS
(
    USERID  VARCHAR2(50) not null,
    IDX     NUMBER(5)    not null,
    CHECKED NUMBER(1) default 0				//확인여부
)
 */
