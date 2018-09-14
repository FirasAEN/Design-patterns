package Memento;

public class PersonDataHistory {
    public static void main(String[] args){

        Person person = new Person();
        PersonHistoryCareTaker  history = new PersonHistoryCareTaker();

        person.setFullName("John Smith");
        person.setPhoneNumber("555-4812-547");
        person.setAddress("some where");
        System.out.println(person);
        history.save(person);

        person.setPhoneNumber("74775-8974-645");
        System.out.println(person);
        history.save(person);

        person.setPhoneNumber("5487-8974-645"); // this modification is not saved

        history.revert(person);
        System.out.println(person);

        history.revert(person);
        System.out.println(person);
    }
}
