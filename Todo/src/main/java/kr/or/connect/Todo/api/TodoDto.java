package kr.or.connect.Todo.api;

public class TodoDto {
	private Long id;
	private String name;
	private String regdate;
	private Integer sequence;
	private String title;
	private String type;
	
	public TodoDto(Long todoId, String todoName, String todoRegdate, Integer todoSequence, String todotTitle, String todoType) {
		super();
		this.id = todoId;
		this.name = todoName;
		this.regdate = todoRegdate;
		this.sequence = todoSequence;
		this.title = todotTitle;
		this.type = todoType;
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return title + "등록날짜: "+ regdate + name + "우선순위" + sequence;
	}
	
	
}
