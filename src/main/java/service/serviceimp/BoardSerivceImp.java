package service.serviceimp;

import lombok.Setter;
import mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.BoardService;
import domain.board.BoardVO;

import java.util.List;

@Service("boardService")
public class BoardSerivceImp implements BoardService {

    @Setter(onMethod_ = @Autowired)
    BoardMapper boardMapper;

    @Transactional
    @Override
    public List<BoardVO> read(BoardVO vo) {
        return boardMapper.selectBoardList(vo);
    }

    @Override
    public BoardVO readInfo(BoardVO vo) {
        return boardMapper.selectBoardInfo(vo);
    }

    @Override
    public int readTotal() {
        return boardMapper.SelectBoardCount();
    }

    @Override
    public int write(BoardVO vo) {
        return boardMapper.insertBoardContents(vo);
    }

    @Override
    public int modify(BoardVO vo) {
         return boardMapper.updateBoardContents(vo);
    }

    @Override
    public int remove(int idx) {
        return boardMapper.deleteBoardContents(idx);
    }
}
