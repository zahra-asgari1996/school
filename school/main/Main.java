package school.main;

import school.*;

public class Main {

    public static void main(String[] args) {

        Course course = new Course("math", 1);
        Course course1 = new Course("computer", 2);
        Course course2 = new Course("physic", 3);
        Course course3 = new Course("history", 4);
        Course course4 = new Course("art", 5);


        School school =  new School("maktab", 1);
        School school1 = new School("madani", 2);
        School school2 = new School("alavi", 3);
        School school3 = new School("razavi", 3);
        School school4 = new School("jalal", 1);
        School school5 = new School("diba", 1);

        Teacher teacher=new FullTimeTeacher("zahra","asgari","1",2000);
        Teacher teacher2=new FullTimeTeacher("zahra","asgari","1",3000);
        Teacher teacher3=new FullTimeTeacher("zahra","asgari","1",4000);
        Teacher teacher4=new FullTimeTeacher("zahra","asgari","1",5000);
        Teacher teacher5=new FullTimeTeacher("zahra","asgari","1",6000);
        Teacher teacher6=new FullTimeTeacher("zahra","asgari","1",7000);
        Teacher teacher7=new FullTimeTeacher("zahra","asgari","1",8000);
        Teacher teacher8=new FullTimeTeacher("zahra","asgari","1",9000);
        Teacher teacher9=new FullTimeTeacher("zahra","asgari","1",10000);
        Teacher teacher10=new FullTimeTeacher("zahra","asgari","1",11000);

        Services services=new Services();
        services.getTeachers().add(teacher);
        services.getTeachers().add(teacher2);
        services.getTeachers().add(teacher3);
        services.getTeachers().add(teacher4);
        services.getTeachers().add(teacher5);
        services.getTeachers().add(teacher6);
        services.getTeachers().add(teacher7);
        services.getTeachers().add(teacher8);
        services.getTeachers().add(teacher9);
        services.getTeachers().add(teacher10);
        services.teachersHaveSalaryMoreThanOthers();

    }

}
