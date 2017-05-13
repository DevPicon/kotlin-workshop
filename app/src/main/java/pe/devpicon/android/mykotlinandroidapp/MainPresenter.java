package pe.devpicon.android.mykotlinandroidapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by armando on 5/12/17.
 */

public class MainPresenter {

    private final MainView view;
    private List<PersonModel> personModelList = new ArrayList<>();

    public MainPresenter(MainView view) {
        this.view = view;

        PersonModel personModel = new PersonModel();
        personModelList.add(personModel);

        for (int i = 0; i < 10; i++) {
            personModel = new PersonModel();
            personModel.setName("Persona " + (i + 1));
            personModel.setAge(30 + i);
            personModelList.add(personModel);
        }
    }

    public void loadElements() {
        view.showPersons(personModelList);
    }
}
