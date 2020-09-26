package ca.humbermail.n01300070.lab01;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A fragment representing a list of Items.
 */
public class ActivitySelectFragment extends ListFragment {
    String[] activities = new String[] {"AIActivity", "VRActivity"};

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ActivitySelectFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity_select_list, container, false);

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, activities);
        setListAdapter(stringArrayAdapter);
        
        return view;
    }
    
    @Override
    public void onListItemClick(ListView listView, View view, int position, long id) {
        Intent intent;
    
        switch (position) {
            case 0:
                intent = new Intent(this.getActivity(), AIActivity.class);
                break;
            case 1:
                intent = new Intent(this.getActivity(), VRActivity.class);
                break;
            default:
                return;
        }
    
        startActivity(intent);
    }
}