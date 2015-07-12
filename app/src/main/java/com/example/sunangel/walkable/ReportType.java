package com.example.sunangel.walkable;

/**
 * Created by ian on 7/11/15.
 */
public class ReportType {
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
}
