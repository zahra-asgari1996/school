package school;

import school.enums.TeacherType;

import java.util.ArrayList;
import java.util.List;

public class Services {
    List<Teacher> teachers=new ArrayList<>();

    public void addSchoolToTeacher(Teacher teacher,School school){
        teacher.getSchool().add(school);
    }
    public void addCourseToTeacher(Teacher teacher,Course course){
        teacher.getCourse().add(course);
    }

    public List<Teacher> teachersHaveSalaryMoreThanOthers(){
        teachers.stream().filter(t->t.getType().equals( TeacherType.FULL_TIME));
    }
}
