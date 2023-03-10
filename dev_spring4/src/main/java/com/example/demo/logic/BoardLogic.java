package com.example.demo.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.dao.BoardDao;

public class BoardLogic {
	private static final Logger logger = LoggerFactory.getLogger(BoardLogic.class);
	// @Autowired
	// 아래 코드는 자바코드(내부)에서 직접 인스턴스화 하지 않는다 - 제어역전이 아니다
	private BoardDao boardDao = null;

	// 직접 인스턴스화 하는 것 대신에 해야할 일이 있다. - 생성자객체주입법과 setter 객체 주입법이 있다
	// 생성자 객체주입은 xml에서 함. setter객체주입은 자바에서 함
	// 그러면 양이 줄어드는 것도 아니다 - 객체 라이프 사이클 관리 받는다 - 제어역전 - IoC
	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	public List<Map<String, Object>> boardList(Map<String, Object> pMap) {
		logger.info("boardList호출 : "+ pMap);
		List<Map<String, Object>> bList = new ArrayList<>();
		bList = boardDao.boardList(pMap);
		return bList;
	}

}
