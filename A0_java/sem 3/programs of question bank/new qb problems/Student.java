class Student {
    int id = 1;// data member (also instance variable)
    String name = "hansi"; // data member (also instance variable)

    public static void main(String args[]) {
        Student s1 = new Student();// creating an object of Student
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
