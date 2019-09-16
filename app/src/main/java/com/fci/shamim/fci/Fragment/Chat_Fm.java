package com.fci.shamim.fci.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fci.shamim.fci.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Chat_Fm extends Fragment {


    public Chat_Fm() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat__fm, container, false);
    }

}
