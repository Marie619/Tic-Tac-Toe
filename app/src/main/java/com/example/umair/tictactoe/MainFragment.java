package com.example.umair.tictactoe;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {

    private AlertDialog mDialog;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_main,container,false);

        View aboutButotn = rootView.findViewById(R.id.about_button);
        aboutButotn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity())
                        .setTitle(R.string.about_title)
                        .setMessage(R.string.about_text)
                        .setCancelable(false)
                        .setPositiveButton(R.string.ok_label,
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                });
                mDialog= builder.show();
            }
        });



        return rootView;
    }

    @Override
    public void onPause() {
        super.onPause();
        if(mDialog != null){
            mDialog.dismiss();
        }
    }
}
