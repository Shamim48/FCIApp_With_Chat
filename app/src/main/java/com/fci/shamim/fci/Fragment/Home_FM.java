package com.fci.shamim.fci.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fci.shamim.fci.About_FCI;
import com.fci.shamim.fci.Principal;
import com.fci.shamim.fci.R;


public class Home_FM extends Fragment implements View.OnClickListener {
  private CardView aboutFCICv;
  private CardView principalCv;

    public Home_FM() {
        // Required empty public constructor
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home__fm, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        aboutFCICv=view.findViewById(R.id.aboutFCICvId);
        principalCv=view.findViewById(R.id.principalCVId);
        aboutFCICv.setOnClickListener(this);

        super.onViewCreated(view, savedInstanceState);
    }


    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.aboutFCICvId){

            Intent i=new Intent(getContext(), About_FCI.class);
            startActivity(i);
        }
        else if(view.getId()==R.id.principalCVId){
            //sss
            Intent i=new Intent(getContext(), Principal.class);
            startActivity(i);
        }
    }
}
