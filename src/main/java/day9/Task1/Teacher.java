package day9.Task1;

 public class Teacher extends Human {
    String subjectName;
   // super(name);
     public Teacher(String name, String subjectName) {
         super(name);
         this.subjectName = subjectName;
     }
     public String getsubjectName() {
         return subjectName;
     }
     public void printInfo(){
         super.printInfo();
         System.out.println("Этот преподаватель с именем "+ name);
     }
}
