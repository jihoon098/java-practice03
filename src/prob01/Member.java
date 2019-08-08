package prob01;

public class Member {
	
	String id;
	String name;
	int point;
	
	
	//name 변경, 반환
	void setName(String changeName) {
		this.id = changeName;
	}
	String getName() {
		return this.name;
	}
	
	
	//point 변경, 반환
	void setPoint(int changePoint) {
		this.point = changePoint;
	}
	int getPoint() {
		return this.point;
	}
	
	
	//id 변경, 반환
	void setId(String changeId) {
		this.id = changeId;
	}
	String getId() {
		return this.id;
	}
	
}