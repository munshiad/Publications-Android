package edu.grinnell.grinnell_publications_android.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.grinnell.grinnell_publications_android.Models.Interfaces.UserInterface;
import edu.grinnell.grinnell_publications_android.R;

/**
 * {@link Fragment} to display users' subscribed publications.
 * @author Larry Boateng Asante
 */
public class PublicationsFragment extends Fragment implements UserInterface{

    public PublicationsFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        initializeUI();
        return inflater.inflate(R.layout.fragment_publications, container, false);
    }

    @Override
    public void initializeUI() {
        buildSearchBar();
    }

    public void buildSearchBar() {
        
    }
}
