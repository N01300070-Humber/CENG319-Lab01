package ca.humbermail.n01300070.lab01;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VRActivity extends AppCompatActivity {
	LifeCycleFragment lifeCycleFragment;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vr);
		
		lifeCycleFragment.appendToLifeCycleLog(getString(R.string.onCreateExecuted));
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		
		lifeCycleFragment.appendToLifeCycleLog(getString(R.string.onStartExecuted));
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		
		lifeCycleFragment.appendToLifeCycleLog(getString(R.string.onDestroyExecuted));
	}
	
	@Override
	protected void onStop() {
		super.onStop();
		
		lifeCycleFragment.appendToLifeCycleLog(getString(R.string.onStopExecuted));
	}
	
	@Nullable
	@Override
	public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
		View view = super.onCreateView(name, context, attrs);
		
		lifeCycleFragment = (LifeCycleFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentVRLifeCycle);
		
		return view;
	}
}