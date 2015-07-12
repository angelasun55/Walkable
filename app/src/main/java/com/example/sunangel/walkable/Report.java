package com.example.sunangel.walkable;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by ian on 7/11/15.
 */
public class Report {

    private ReportType type;

    private LatLng location;

    public Report(ReportType type, LatLng location) {
        this.type = type;
        this.location = location;
    }

    public ReportType getType() {
        return type;
    }

    public LatLng getLocation() {
        return location;
    }
}
