package pe.devpicon.android.mykotlinandroidapp;

import java.util.Arrays;
import java.util.List;

/**
 * Created by armando on 5/12/17.
 */

public class MainPresenter {

    private final MainView view;

    private List<String> anotherList = Arrays.asList("otro elemento 1", "otro elemento 2", "otro elemento 3", "otro elemento 4");

    public MainPresenter(MainView view) {
        this.view = view;
    }

    public void loadElements() {
        view.showElements(anotherList);
    }
}
