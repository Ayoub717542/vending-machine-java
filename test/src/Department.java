import java.util.ArrayList;
import java.util.List;

public class Department {
    int id;
    String name;

    private final List<teachers> teachers;

    public Department(int id, String name, List<teachers> teachers) {
        this.id = id;
        this.name = name;
        this.teachers = new ArrayList<>(teachers);
    }
    void addTeacher(teachers t){
        teachers.add(t);
    }

    void display_department(){

        for (teachers teacher : teachers) {
            System.out.println(teacher.name);
            System.out.println("id:"+id+" name: "+name+" Department :"+teacher.name);
        }

    }
}
