package com.cbahsler.YouTubeCalandar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_profile_circle} factory method to
 * create an instance of this fragment.
 */
public class fragment_profile_circle extends Fragment {


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragment_profile_circle() {
        super(R.layout.fragment_profile_circle);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_circle, container, false);
    }
}