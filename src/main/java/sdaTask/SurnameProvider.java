package sdaTask;

import java.util.ArrayList;
import java.util.List;

public class SurnameProvider implements PeopleProvider {

    List<String> surnameList = new ArrayList<>();
    @Override
    public List<String> getPeopleList() {
        surnameList.add("a");
        surnameList.add("b");
        surnameList.add("c");
        surnameList.add("d");
        return null;
    }
}
