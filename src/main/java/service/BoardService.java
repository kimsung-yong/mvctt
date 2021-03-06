package service;

import domain.Criteria;
import domain.board.BoardVO;

import java.util.List;

public interface BoardService {

    public List<BoardVO> read(Criteria cri);

    public BoardVO readInfo(BoardVO vo);

    public int readTotal();

    public int write(BoardVO vo);

    public int modify(BoardVO vo);

    public int remove(int idx);


}
