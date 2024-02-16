package edu.kh.todoList.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.kh.todoList.model.dao.TodoListDAO;
import edu.kh.todoList.model.dao.TodoListDAOImpl;
import edu.kh.todoList.model.dto.Todo;

public class TodoListServiceImpl implements TodoListService {

	// 필드
	private TodoListDAO dao = null;
	
	// 기본 생성자
	public TodoListServiceImpl() throws FileNotFoundException, IOException, ClassNotFoundException {
		
		// TodoListServiceImpl 객체가 생성 될 때
		
		dao = new TodoListDAOImpl(); // TodoListDAOImpl 객체 생성
		
	}
	
	@Override
	public void method1() {
		
	}

	// --------------------------------------------------------------------------
	
	/* todoListFullView */
	@Override
	public Map<String, Object> todoListFullView() {
		
		// 1. 할 일 목록 DAO에서 얻어오기
		List<Todo> todoList = dao.todoListFullView();
		
		// 2. 할 일 목록에서 완료(complete 필드 값이 true)인 요소가
		int completeCount = 0;
		
		for(Todo todo : todoList) { // TodoList 순차 접근
			
			// isComplete() == getComplete()
			if(todo.isComplete()) { // true인 경우
				completeCount++;
			}
		}
		
		// 3. todoList, completeCount를 저장할 Map 생성
		// -> 메서드는 반환을 하나 밖에 못해서
		// 
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("todoList", todoList);
		map.put("completeCount", completeCount);
		
		// 4. map 반환
		return map;
	}

	//--------------------------------------------------------------
	
	@Override
	public String dateFormat(LocalDateTime regDate) {
		return null;
	}

	@Override
	public String todoDetailView(int index) {
		return null;
	}

	@Override
	public int todoAdd(String title, String detail) throws FileNotFoundException, IOException {
		return 0;
	}

	@Override
	public boolean todoComplete(int index) throws FileNotFoundException, IOException {
		return false;
	}

	@Override
	public boolean todoUpdate(int index, String title, String detail) throws FileNotFoundException, IOException {
		return false;
	}

	@Override
	public String todoDelete(int index) throws FileNotFoundException, IOException {
		return null;
	}

}
