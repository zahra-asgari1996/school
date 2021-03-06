package school.main;

import school.*;
import school.enums.Degree;

import java.util.Arrays;

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
        Teacher teacher2=new FullTimeTeacher("zahra","asgari","11",3000);
        Teacher teacher3=new FullTimeTeacher("zahra","asgari","12",4000);
        Teacher teacher4=new FullTimeTeacher("zahra","asgari","13",5000);
        Teacher teacher5=new FullTimeTeacher("zahra","asgari","14",6000);
        Teacher teacher6=new FullTimeTeacher("zahra","asgari","15",7000);
        Teacher teacher7=new FullTimeTeacher("zahra","asgari","16",8000);
        Teacher teacher8=new FullTimeTeacher("zahra","asgari","17",9000);
        Teacher teacher9=new FullTimeTeacher("zahra","asgari","18",10000);
        Teacher teacher10=new PartTimeTeacher("zahra","asgari","19",12,30000);

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
        teacher10.getCourse().add(course);
        teacher10.getCourse().add(course3);
        teacher10.setDegree(Degree.BS);
        teacher10.getSchool().add(school1);
        teacher2.getSchool().add(school5);
        teacher3.getSchool().add(school);
        teacher4.getSchool().add(school);
        teacher5.getSchool().add(school5);
        teacher5.getSchool().add(school4);
        teacher9.getSchool().add(school);
        teacher7.getSchool().add(school5);
        teacher8.getSchool().add(school3);
        teacher3.getSchool().add(school3);
        //services.teachersHaveSalaryMoreThanOthers().stream().forEach(System.out::println);
        services.ListOfTeacherWithBSAndPart().stream().forEach(System.out::println);
        services.nameOfSchools().stream().forEach(System.out::println);
        System.out.println(Arrays.asList(services.findSchoolNameAndTeachers()));

        //services.nameOfSchools().stream().forEach(System.out::println);


    }

}
