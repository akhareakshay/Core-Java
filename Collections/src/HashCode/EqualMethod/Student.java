package HashCode.EqualMethod;

import java.io.Serializable;

public class Student implements Serializable {
	int sno;
	String name;
	int whichClass;
	
	public Student(int sno, String name, int whichClass)
	{
		this.sno = sno;
		this.name = name;
		this.whichClass = whichClass;
	}
	
	public int hashCode()
	{
		return whichClass;
	}
	
	public boolean equals(Object obj) {
		
		if(obj instanceof Student)
		{
			Student st = (Student) obj;
			if(this.sno == st.sno && this.name.equals(st.name)
					&& this.whichClass == st.whichClass)
			{
				return true;
			}
		}
		return false;
	}
	public String toString() {
		return whichClass+" : "+name+" : "+sno;
	}

}
