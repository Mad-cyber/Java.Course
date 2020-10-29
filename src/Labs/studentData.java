package Labs;

public class studentData {

	public static void main(String[] args) {
		//database details
		
		student stu1 = new student ("mary", "7894561");
		student stu2 = new student ("jane", "82894561");
		student stu3 = new student ("juan", "2314561");
		

	}
}

	class student {
		//data members
		private static int iD= 1001;
		private String studentName;
		private String userId;
		private String ssn;
		private String email;
		
		
		public student(String studentName, String ssn) {
			iD++;
			this.studentName = studentName;
			this.ssn = ssn;
			SetUserId();
			setEmail();
			
		}
		
		

		private void setEmail() {
			email = studentName + "." + iD +  "@studentemail.com";
			System.out.println("Student email: " + email);
			
		}
		
		private void SetUserId() {
			double randNum = (int) (Math.random() * 10000);
			System.out.println(randNum);
			userId = iD + "" + randNum + "" + ssn.substring(6);
			System.out.println(" Your StudentId Number: " + userId);
			
		}
		
		
	}

