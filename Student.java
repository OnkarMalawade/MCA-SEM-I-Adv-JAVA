public class Student implements Comparable<Student>{
	int rollNo;
	String nm;
	int m1, m2, m3;
	
	public Student(int rollNo, String nm, int m1, int m2, int m3) {
		this.rollNo = rollNo;
		this.nm = nm;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", nm=" + nm + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}

	@Override
	public int compareTo(Student o) {
		if((m1+m2+m3) < (o.m1+o.m2+o.m3)) {
			return 1;
		}
		else if((m1+m2+m3) > (o.m1+o.m2+o.m3)) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
}
