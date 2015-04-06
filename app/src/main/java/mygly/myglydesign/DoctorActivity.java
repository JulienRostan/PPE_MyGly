package mygly.myglydesign;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.matthieu.mygly.R;

/**
 * Created by julien on 01/04/2015.
 */
public class DoctorActivity extends ActionBarActivity {

    ListView lvListe;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        lvListe = (ListView) findViewById(R.id.lvListe);

        String[] listeStrings = {"France", "Allemagne", "Russie"};

        lvListe.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listeStrings));

    }
}

