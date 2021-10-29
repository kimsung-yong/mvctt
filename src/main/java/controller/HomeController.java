package controller;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import service.BoardService;
import domain.board.BoardVO;

import java.util.List;

@Controller
@Log4j
public class HomeController {

    @Autowired
    BoardService boardService;

    @RequestMapping("/")
    public ModelAndView home(BoardVO vo){

        List<BoardVO> list = null;
        ModelAndView mv = new ModelAndView();
        int total = boardService.readTotal();
        if(total >= 1 ){
            list = this.boardService.read(vo);
        }
        mv.setViewName("index");
        String data = "확인 합니다";
        mv.addObject("data",data);
        mv.addObject("total",total);
        mv.addObject("list",list);
        return mv;
    }
    @RequestMapping("/get")
    public ModelAndView get(BoardVO vo){
        ModelAndView mv = new ModelAndView();

        mv.addObject("vo",boardService.readInfo(vo));
        mv.setViewName("detail");
        return mv;

    }
}
