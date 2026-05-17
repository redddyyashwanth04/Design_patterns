package Builder_pattern;

public class cilent {
    public static void main(String[] args) throws Exception {
        student s1=student.getbuilder().setAge(35).setEmail("yashwanth@gmail.com").setName("yashwanth").setPsp(90).build();
        System.out.println("created sucessfully");
    }
}
