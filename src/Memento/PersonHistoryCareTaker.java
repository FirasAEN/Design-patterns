package Memento;

import java.util.Stack;

public class PersonHistoryCareTaker {

    private Stack<PersonMemento> history = new Stack<>();

    public void save(Person item){
        history.push(new PersonMemento(item));
    }

    public void revert(Person person){
        person.revert(history.pop());
    }
}
