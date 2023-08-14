

import java.util.*;

public class Class{
	private List<student> students;

	private int WebMin;
	private int WebMax;
	private int WebAvg;
	
	private int OOPMin;
	private int OOPMax;
	private int OOPAvg;
	
	private int DSMin;
	private int DSMax;
	private int DSAvg;
	
	public Class() {
		this.students = new ArrayList<>();

	}
	
	//method
	
	public void Web() {
		int min=99999;
		int max=-9999;
		int sum=0;
		for(student s:students) {
			if(s.getWebProgramming()<min) {
				min=s.getWebProgramming();
			}
			if(s.getWebProgramming()>max) {
				max=s.getWebProgramming();
			}
			sum+=s.getWebProgramming();
		}
		WebAvg=sum/students.size();
		WebMin=min;
		WebMax=max;
	}
	
	public void OOP() {
		int min=99999;
		int max=-9999;
		int sum=0;
		for(student s:students) {
			if(s.getOOP()<min) {
				min=s.getOOP();
			}
			if(s.getOOP()>max) {
				max=s.getOOP();
			}
			sum+=s.getOOP();
		}
		OOPAvg=sum/students.size();
		OOPMin=min;
		OOPMax=max;
	}

	public void DS() {
		int min=99999;
		int max=-9999;
		int sum=0;
		for(student s:students) {
			if(s.getDS()<min) {
				min=s.getDS();
			}
			if(s.getDS()>max) {
				max=s.getDS();
			}
			sum+=s.getDS();
		}
		DSAvg=sum/students.size();
		DSMin=min;
		DSMax=max;
	}
	
		public void addStudent(student s) {
			students.add(s);
		}
		
		
		
		public int getWebMin() {
			return WebMin;
		}

		public void setWebMin(int webMin) {
			WebMin = webMin;
		}

		public int getWebMax() {
			return WebMax;
		}

		public void setWebMax(int webMax) {
			WebMax = webMax;
		}

		public int getWebAvg() {
			return WebAvg;
		}

		public void setWebAvg(int webAvg) {
			WebAvg = webAvg;
		}

		
		

		public int getOOPMin() {
			return OOPMin;
		}

		public void setOOPMin(int oOPMin) {
			OOPMin = oOPMin;
		}

		public int getOOPMax() {
			return OOPMax;
		}

		public void setOOPMax(int oOPMax) {
			OOPMax = oOPMax;
		}

		public int getOOPAvg() {
			return OOPAvg;
		}

		public void setOOPAvg(int oOPAvg) {
			OOPAvg = oOPAvg;
		}

		public int getDSMin() {
			return DSMin;
		}

		public void setDSMin(int dSMin) {
			DSMin = dSMin;
		}

		public int getDSMax() {
			return DSMax;
		}

		public void setDSMax(int dSMax) {
			DSMax = dSMax;
		}

		public int getDSAvg() {
			return DSAvg;
		}

		public void setDSAvg(int dSAvg) {
			DSAvg = dSAvg;
		}

		public student search_id(String id) {
			student results = new student();
			for(student s:students) {
				if(s.getId().equalsIgnoreCase(id)) {
					results.setName(s.getName());
					results.setWebProgramming(s.getWebProgramming());
					results.setOOP(s.getOOP());
					results.setDS(s.getDS());
				}
			}
			return results;
		}
		
		
		public void deleteStudent(student s) {
			
			students.remove(s);
			
		}
		
		public List<student> getAllStudents(){
			return students;
		}
		

}
