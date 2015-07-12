package com.example.sunangel.walkable;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ian on 7/11/15.
 */
public class ReportType {
    static final List<ReportType> reportTypes = new ArrayList<>();

    static {
        reportTypes.add(new ReportType(R.drawable.common_signin_btn_icon_dark, "Police", 1.0));
        reportTypes.add(new ReportType(R.drawable.common_signin_btn_icon_dark, "Suspicious Person", 1.0));
        reportTypes.add(new ReportType(R.drawable.common_signin_btn_icon_dark, "No Lighting", 1.0));
        reportTypes.add(new ReportType(R.drawable.common_signin_btn_icon_dark, "Busy Area", 1.0));
    }

    private String name;
    private int icon;

    // How much this report influences the navigation, [0, 1]
    private double factor = 1.0;

    public ReportType(int icon, String name, double factor) {
        this.icon = icon;
        this.name = name;
        this.factor = factor;
    }

    public String getName() {
        return name;
    }

    public int getIcon() {
        return icon;
    }

    public double getFactor() {
        return factor;
    }

    public Report createReport(LatLng location) {
        return new Report(this, location);
    }
}
