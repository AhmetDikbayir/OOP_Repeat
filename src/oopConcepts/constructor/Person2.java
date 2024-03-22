package oopConcepts.constructor;


import lombok.Builder;

@Builder
public class Person2 {

    private String name;
    private String surname;
    private int age;
    private int phoneNumber;

    public static void main(String[] args) {
        //!!! name + surname ile nesne uretilim :
        Person2 person = Person2.builder()
                .name("Mirac")
                .surname("Instructor")
                .build();

        System.out.println(person.name);

        //!!! name + surname + age  ile nesne uretelim
        Person2 person2 = Person2.builder()
                .name("Ahmet")
                .surname("Kutlu")
                .age(40)
                .build();

        System.out.println(person2.name);

        //!!! nam + surname + phoneNumber ile nesne üretimi
        Person2 person3 = Person2.builder()
                .name("Hakan")
                .surname("Karatay")
                .phoneNumber(000)
                .build();

        System.out.println(person3.phoneNumber);
    }
}