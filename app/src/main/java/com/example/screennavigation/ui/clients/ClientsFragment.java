package com.example.screennavigation.ui.clients;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.screennavigation.R;
import com.squareup.picasso.Picasso;

import java.net.URI;
import java.net.URL;

public class ClientsFragment extends Fragment {

    private ClientsViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(ClientsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_clients, container, false);

    //        String url = "http://i.imgur.com/DvpvklR.png";
        String url = "https://i.imgur.com/vMyOl05b.jpg";
        ImageView ourimageview = (ImageView)root.findViewById(R.id.imageView4);

        Picasso.with(getActivity()).load(url).into(ourimageview);

        return root;
    }
}