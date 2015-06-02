package com.forcast.gugolf.hello_world;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.forcast.gugolf.hello_world.R;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class FindPeopleFragment extends Fragment {
	
	public FindPeopleFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_find_people, container, false);
         
        return rootView;
    }
}
