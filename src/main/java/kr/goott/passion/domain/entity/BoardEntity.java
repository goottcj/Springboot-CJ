package kr.goott.passion.domain.entity;

import javax.persistence.*;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter //@Getter 자동생성  @Setter 도 자동생성이지만 무분별한 Setter 생성은 안좋음 -> builder패턴 사용  @Getter + @Setter = @Data
@Entity
@Table(name= "board")

public class BoardEntity extends TimeEntity{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //파라메터가 없는 기본 생성자를 추가하는  어노테이션(jpa사용시 필수 기본생성자)
	private Long id;
	
	@Column(length = 10, nullable = false)
	private String writer;
	
	@Column(length = 100, nullable = false)
	private String title;
	
	@Column(columnDefinition = "Text", nullable = false)
	private String content;
	
	@Builder
	
		public BoardEntity(Long id, String title, String content, String writer) {
		this.id = id;
		this.writer = writer;
		this.title = title;
		this.content = content;
	}

	public static Object buider() {
		// TODO Auto-generated method stub
		return null;
	}
}
