package school;

import school.enums.TeacherType;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Services {
    List<Teacher> teachers=new ArrayList<>();

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addSchoolToTeacher(Teacher teacher, School school){
        teacher.getSchool().add(school);
    }
    public void addCourseToTeacher(Teacher teacher,Course course){
        teacher.getCourse().add(course);
    }

    public List<Teacher> teachersHaveSalaryMoreThanOthers(){
        Double avg= teachers.stream().filter(t->t.getType().equals( TeacherType.FULL_TIME)).mapToDouble(Teacher::calculateSalary).average().orElse(Double.NaN);
        return teachers.stream().filter(teacher -> teacher.calculateSalary()>avg).collect(Collectors.toList());
    }

    public List<String> nameOfSchools(){
        return teachers.stream
    }
}
