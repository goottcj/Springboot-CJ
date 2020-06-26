package kr.goott.passion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import kr.goott.passion.dto.BoardDto;
import kr.goott.passion.service.BoardService;
import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class BoardController {
	private BoardService boardService;
	
	@GetMapping("/")
	public String list() {
		return "board/list.html";
	}
	
	@GetMapping("/post")
	public String wirte(){
		return "board/wirte.html";
	}
	
	@PostMapping("/post")
	public String wirte(BoardDto boardDto){
		boardService.savePost(boardDto);
		
		return "redirect:/";
	}
}
