package board.spring.mybatis;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
@Repository
public interface BoardDAO {
	public int insertBoard(BoardDTO dto) ;
	
	public int getTotalBoard();

	public List<BoardDTO> boardList(int[] limit);
	
	public int updateViewcount(int seq) ;
	
	public BoardDTO getDetail(int seq) ;
	
	public int deleteBoard(int seq) ;
	
	public int updateBoard(BoardDTO dto) ;
	
	public List<BoardDTO> searchList(HashMap map);
	
	public int getSearchBoard(HashMap map);
	
	public BoardMemberDTO boardWriterInform(int seq);
}






