package ac.za.cput.cardealership.domain.people;



public class Person {

    private String id;
    private String firstname;
    private String lastname;
    private  String phoneNumber;


    public Person() {

    }


    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }





    public Person(Builder builder){

        this.id = builder.id;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.phoneNumber = builder.phoneNumber;

    }

    public static class Builder{

        private String id;
        private String firstname;
        private String lastname;
        private  String phoneNumber;



        public  Builder id(String id){
            this.id = id;
            return this;
        }

        public  Builder firstname(String firstname){
            this.firstname = firstname;
            return this;
        }

        public  Builder lastname(String lastname){
            this.lastname = lastname;
            return this;
        }

        public  Builder phoneNumber(String phoneNumber){
            this.phoneNumber= phoneNumber;
            return this;
        }



        public Person build (){
            return new Person(this);

        }

        @Override
        public String toString() {
            return "Builder{" +
                    "id='" + id + '\'' +
                    ", firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }
    }
}
