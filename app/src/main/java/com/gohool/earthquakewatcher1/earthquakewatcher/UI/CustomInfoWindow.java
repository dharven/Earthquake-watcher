package com.gohool.earthquakewatcher1.earthquakewatcher.UI;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.gohool.earthquakewatcher1.earthquakewatcher.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by paulodichone on 4/22/17.
 */

public class CustomInfoWindow implements GoogleMap.InfoWindowAdapter {
    private final View view;

    @SuppressLint("InflateParams")
    public CustomInfoWindow(Context context) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.custom_info_window, null);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {

        TextView title = view.findViewById(R.id.winTitle);
        title.setText(marker.getTitle());

        TextView magnitude = view.findViewById(R.id.magnitude);
        magnitude.setText(marker.getSnippet());
        return view;
    }
}
