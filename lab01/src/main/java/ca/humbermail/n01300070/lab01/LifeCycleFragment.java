package ca.humbermail.n01300070.lab01;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class LifeCycleFragment extends Fragment {
    TextView lifeCycle;
    
    public LifeCycleFragment() {
        // Required empty public constructor
    }
    
    @Override
    public void onStart() {
        super.onStart();
        
        Toast.makeText(this.getContext(), getString(R.string.onStartExecuted), Toast.LENGTH_SHORT).show();
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Toast.makeText(this.getContext(), getString(R.string.onCreateViewExecuted), Toast.LENGTH_SHORT).show();
    
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_life_cycle, container, false);
    }
    
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    
        lifeCycle = Objects.requireNonNull(getView()).findViewById(R.id.textViewLifeCycleLog);
    }
    
    public void appendToLifeCycleLog(String string) {
        lifeCycle.append(string + "\n");
    }
}