package com.itwillbs.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.itwillbs.domain.ContractVO;
import com.itwillbs.domain.PagingVO;
import com.itwillbs.domain.ProductionVO;

public interface ContractService {
	
	//페이징처리 변수저장을 위한 serivce생성
	public PagingVO setPageInfoForContract(PagingVO pvo) throws Exception;
	
	// 수주 상세보기
	public ContractVO getContractInfo(String cont_id) throws Exception;

	// 수주 등록하기
	public void registContract(ContractVO cvo) throws Exception;

	// 수주 수정하기
	public Integer modifyContract(ContractVO cvo) throws Exception;

	// 수주 삭제하기
	public Integer removeContract(String cont_id) throws Exception;
	
	//cont_id 를 out_product 테이블에 넣기 
	public void contIdInsert(String cont_id) throws Exception;
	
	//수주번호 자동계산하기 
	public String contIdCount() throws Exception;

	//product_id로 상품정보 불러오기
	public ProductionVO getProductInfo(String product_id) throws Exception;
	
	//엑셀화일 다운로드
	public void downExcel(List<ContractVO> contractList, HttpServletResponse response) throws IOException;
	
	///////////////////페이징처리 서비스 ////////////////////////
	//전체 수주목록 갯수 계산하기 
	public int getListAll(PagingVO pvo) throws Exception; 

	//검색어 없을 때 페이징처리 수주목록 갯수 계산하기 
	public int getListPageSizeAll(PagingVO pvo) throws Exception;
	
	//검색어 있을 때 페이징처리 수주목록 갯수 계산하기 
	public int getListSearchAll(PagingVO pvo) throws Exception;
	
	//검색어 없을 때 페이징처리 수주목록 가져오기 
	public List<ContractVO> getListPageSizeObjectContractVO(PagingVO pvo) throws Exception;
	
	// 검색어 있을 때 페이징처리 수주목록 가져오기 
	public List<ContractVO> getListSearchObjectContractVO(PagingVO pvo) throws Exception;
	///////////////////페이징처리 서비스 ////////////////////////

}

