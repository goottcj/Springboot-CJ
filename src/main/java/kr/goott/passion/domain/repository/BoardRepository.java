package kr.goott.passion.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.goott.passion.domain.entity.BoardEntity;
									//JpaRepository 일반적으로 많이사용하는 데이터조작을 다루는 함수가정의돼서, CRUD작업 편리
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
	
}
