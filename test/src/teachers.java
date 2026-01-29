public class teachers {
    int id ;
    String name;
    String subject;
    Department department;

    teachers(int id, String name, String subject,  Department department) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.department = department;
    }


    void display(){
        System.out.println("id:"+id+" name: "+name+" subject:"+subject);
}


}
