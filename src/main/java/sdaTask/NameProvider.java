package sdaTask;

import java.util.ArrayList;
import java.util.List;

public class NameProvider implements PeopleProvider {

    List<String> nameList = new ArrayList<>();

    @Override
    public List<String> getPeopleList() {
        nameList.add("Piotrek");
        nameList.add("Bartek");
        nameList.add("Anka");
        nameList.add("Olga");
        return nameList;
    }
}
