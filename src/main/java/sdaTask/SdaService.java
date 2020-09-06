package sdaTask;

import java.util.ArrayList;
import java.util.List;

public class SdaService {

    private PeopleProvider peopleProvider;

    public SdaService(PeopleProvider peopleProvider) {
        this.peopleProvider = peopleProvider;
    }

    public SdaService() {

    }



    public void run(){
        //System.out.println("Hello SDA");
        List<String> list = new ArrayList<>(peopleProvider.getPeopleList());
        System.out.println(list.toString());
    }
}
