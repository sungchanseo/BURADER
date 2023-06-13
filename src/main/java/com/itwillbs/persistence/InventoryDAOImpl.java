package com.itwillbs.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.itwillbs.domain.MaterialVO;

@Repository
public class InventoryDAOImpl implements InventoryDAO {

	 // => 1.2 디비연결 
	  // => SqlSessionFactory 객체 주입
	  // => 3. SQL 작성 & pstmt
	  //    ??? 추가
	  //    => inventory.xml SQL 작성
	  //    4. SQL 실행
	  //    5. (select) 데이터 처리
	
	
	// session 설정
	@Inject
	private SqlSession sqlSession;
	
	// mapper 변수 설정
	private static final String NAMESPACE = "com.itwillbs.mappers.inventoryMapper";
	
	

	private static final Logger logger = LoggerFactory.getLogger(InventoryDAOImpl.class);
	@Override
	public List<MaterialVO> getInventoryList() {
		logger.debug("#####DAO 호출완료######");
		return sqlSession.selectList(NAMESPACE + ".getInventoryList");
	}

}
