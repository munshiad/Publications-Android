package edu.grinnell.grinnell_publications_android.Activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import edu.grinnell.grinnell_publications_android.Models.Interfaces.UserInterface;
import edu.grinnell.grinnell_publications_android.R;

/**
 * {@link AppCompatActivity} to display relevant settings and configuration options
 * @author Larry Boateng Asante
 */
public class MainSettingsActivity extends AppCompatActivity implements UserInterface {

    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        toolbar = (Toolbar)findViewById(R.id.settings_toolbar);

        initializeUI(findViewById(android.R.id.content));
    }

    @Override
    public void initializeUI(View view) {
        setSupportActionBar(toolbar);
        if (toolbar != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    protected void onDestroy() {
        toolbar = null;
        super.onDestroy();
    }
}
