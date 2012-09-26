package es.sabadowdev.android.example.selector;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new MyAdapter(this));
        getListView().setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        
        getListView().setFocusable(false);
    }

    
}
