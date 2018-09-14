package Memento;

public class PersonMemento {

    private final String name;
    private final String phone;

    public PersonMemento(Person person){
        this.name = person.getFullName();
        this.phone = person.getPhoneNumber();
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "PersonMemento{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
