package kr.goott.passion.service;



import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import kr.goott.passion.domain.repository.BoardRepository;
import kr.goott.passion.dto.BoardDto;
import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class BoardService {
    private BoardRepository boardRepository;

    @Transactional
    public Long savePost(BoardDto boardDto) {
        return boardRepository.save(boardDto.toEntity()).getId();
    }
    
}
