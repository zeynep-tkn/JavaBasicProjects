
public class MainBS {

	public static void main(String[] args) {
		Teacher t1 =new Teacher("Ayşe","000", "trh");
		Teacher t2=new Teacher("Zeynep", "111", "fzk");
		Teacher t3=new Teacher("Aslı", "222", "bio");
		
		Course tarih=new Course("tarih", "555", "trh");
        tarih.addTeacher(t1);
        
        Course fizik=new Course("fizik","444", "fzk");
        fizik.addTeacher(t2);
        
        Course biyoloji=new Course("biyoloji","333", "bio");
        biyoloji.addTeacher(t3);
        
        
          Student s1=new Student("Elif", "123", "4",tarih,fizik,biyoloji);
          Student s2=new Student("Zehra", "321", "4",tarih,fizik,biyoloji);
          
          s1.addBulkExamNote(100,60,80);
          s1.isPass();
          s2.addBulkExamNote(40,30,20);
          s2.isPass();
	}

}
