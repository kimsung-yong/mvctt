package mapper;

import domain.board.BoardVO;

import java.util.List;

public interface BoardMapper {

    public int insertBoardContents(BoardVO vo); // 게시물 등록
    public int SelectBoardCount(); // 총 게시물의 숫자를 읽어온다
    public List<BoardVO> selectBoardList(BoardVO vo); // 리스트 읽어온다
    public BoardVO selectBoardInfo(BoardVO vo); // 게시물의 정보를 읽어온다
    public int updateBoardContents(BoardVO vo); // 게시물 수정
    public int deleteBoardContents(int idx); // 게시물 삭제


}
