package classdefinition;

/**
 * @author 1040231
 *
 */
public class Parent {
	private int id;
	private String name;
	private String schoolName;

	public int getId() {
		return id;
	}

	public Parent() {
	}
	
	public Parent(int id, String name, String schoolName) {
		this.id = id;
		this.name = name;
		this.schoolName = schoolName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	@Override
	public String toString() {
		return "id : " + id + " name : " + name + " schoolName : " + schoolName + " class " + this.getClass().getSimpleName();
	}
	
	@Override
	public boolean equals(Object obj) {
		Parent p = (Parent) obj;
		boolean isEquals = false;
		if(this == obj) {
			return true;
		}
		if(this.id == p.id && this.name == p.name){
			isEquals = true;
		}
		return isEquals;
	}
	
	/*@Override
	public int hashCode() {
		return this.name.hashCode();
	}*/
	
}
