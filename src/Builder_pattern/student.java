package Builder_pattern;

public class student {
    String name;
    String gender;
    int age;
    String email;
    float psp;
    private student(builder b){
        this.age=b.getAge();
        this.email=b.getEmail();
        this.gender=b.getGender();
        this.name=b.getName();
        this.psp=b.getPsp();

    }
    public static builder getbuilder(){
        return new builder();
    }
    public static class builder{//the Builder class were non-static (an inner class), you would first need an instance of a Student to create a Builder.

        String gender;
        int age;
        String email;
        String name;
        float psp;
        public float getPsp() {
            return psp;
        }



        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public int getAge() {
            return age;
        }

        public String getEmail() {
            return email;
        }

        private builder(){

        }
        public builder setName(String name) {
            this.name = name;
            return  this;
        }

        public  builder Gender(String gender) {
            this.gender = gender;
            return this;
        }

        public builder setAge(int age) {
            this.age = age;
            return this;
        }

        public builder setEmail(String email) {
            this.email = email;
            return  this;
        }
        public builder setPsp(float psp) {
            this.psp = psp;
            return  this;
        }
        public student build() throws Exception{
          if(!validate()){
              throw new Exception("cannot create the object");
          }
          return new student(this);
        }
        public  boolean validate() {
            if (age > 24 && psp < 70) {
                return false;
            }

            if (age < 18) {
                return false;
            }
            return true;
        }
    }
}
