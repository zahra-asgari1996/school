package school;

import school.enums.Degree;
import school.enums.TeacherType;

import java.util.*;
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
        List<Teacher> newList;
        newList= teachers.stream().filter(teacher -> teacher.getType().equals(TeacherType.FULL_TIME)).collect(Collectors.toList());
        Double avg=newList.stream().mapToDouble(Teacher::calculateSalary).average().getAsDouble();
        System.out.println(avg);
        return teachers.stream().filter(teacher -> teacher.calculateSalary()>avg).collect(Collectors.toList());
    }

    public List<Teacher> ListOfTeacherWithBSAndPart(){
        return teachers.stream().filter(t->t.getType().equals(TeacherType.PART_TIME))
                .filter(t->t.getDegree().equals(Degree.BS))
                .filter(t->t.getSchool().stream().anyMatch(school -> school.getDegree()==2))
                .filter(teacher -> teacher.getCourse().size()>=2).collect(Collectors.toList());
    }

    public Set<String> nameOfSchools(){
        Set<String> SchoolName = new HashSet<>();
        for (Teacher teacher : teachers){
            List <String> name;
            name=teacher.getSchool().stream().map(school -> school.getName()).collect(Collectors.toList());
            for (String s:name) {
                SchoolName.add(s);
            }
        }
        return SchoolName;
    }

    public Map<TeacherType,List<Teacher>> findTeachersByExperience(){
        Map<TeacherType,List<Teacher>> map=new HashMap<>();
        map.put(TeacherType.FULL_TIME
                ,teachers.stream().filter(teacher -> teacher.getExperienceYear()==10)
                        .filter(teacher -> teacher.getType().equals(TeacherType.FULL_TIME))
                        .collect(Collectors.toList()));

        map.put(TeacherType.PART_TIME,
                teachers.stream().filter(teacher -> teacher.getExperienceYear()==10)
                        .filter(teacher -> teacher.getType().equals(TeacherType.PART_TIME))
                        .collect(Collectors.toList())
        );

        return map;
    }

    public Map<String,List<Teacher>> findSchoolNameAndTeachers(){
        Map<String,List<Teacher>> map=new HashMap<>();
        Set<String> schoolName=nameOfSchools();
        for (String name:schoolName) {
            map.put(name
                    ,teachers.stream().filter
                            (teacher -> teacher.getSchool().stream().anyMatch(school -> school.getName().equalsIgnoreCase(name)))
                            .collect(Collectors.toList()));
        }
        return map;
    }
}
