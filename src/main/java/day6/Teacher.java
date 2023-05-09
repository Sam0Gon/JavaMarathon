package day6;

public class Teacher {
    String name;
    String topic;
    public Teacher(String name, String topic){
        this.name=name;
        this.topic=topic;
    }
    public void Evaluate (Student baran){
        int ball = (int)(Math.random()*4+1.9);
        String ballString = null;
        switch (ball){
            case 2 : ballString ="неудовлетворительно";
                break;
            case 3 : ballString ="удовлетворительно";
                break;
            case 4 : ballString ="хорошо";
                break;
            case 5 : ballString ="отлично";
                break;
        }
        System.out.println("Преподаватель "+name+" оценил студента с именем "+baran.getNameStudent() +" по предмету "+topic +" на оценку "+ ballString);
    }

}
