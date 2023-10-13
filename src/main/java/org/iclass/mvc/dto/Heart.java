package org.iclass.mvc.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Heart {		//tbl_hearts 테이블의 DTO
	private String writer;	//글 주인(작성자)
	private String userid;	//좋아요 누른 사용자
	private int idx;		//글번호
	private String status;	//글 확인 여부
	private boolean value;	//좋아요 체크박스 상태 : true, false(테이블 컬럼과 상관 x)
	

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
