package human04_2;

public class Member {
	public String name;
	public int age;
	
	public Member(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public int hashCode() {
		//	hash코드는 숫자이므로 문자에만 적용.
		return this.name.hashCode() + this.age;
		//	m1,m3는 이름과 나이가 같기 때문에.
		//	동일한 hash 코드를 갖는다. (hashCode에 대해서는 이름만으로 정의)
	}
	public boolean equlas(Object obj) {
		// Object obj = new Member("김우진",26);
		// 자동타입변환 처리가 된 것입니다.
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			// 자동타입변환 후 강제타입변환
		if (this.name.equals(mem.name)){
			// 이름만으로 비교하기 때문에 m1,m3는 같은 것으로 인식함.
			return true;
			
		}
	}
	return false;
}

}
