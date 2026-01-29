void main() {
    Department dep1 = new Department(1, "dep1", new ArrayList<>());
    teachers teacher1 = new teachers(1, "ayman", "logecial d'un application",dep1);
    dep1.addTeacher(teacher1);
    dep1.display_department();


}
