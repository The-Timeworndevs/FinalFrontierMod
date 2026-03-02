package net.timeworndevs.final_frontier.planet;

import org.jetbrains.annotations.NotNull;

public class Planet implements Comparable<Planet>{

    private String name;
    private String dimension;
    private Planet parent;
    private boolean drawClouds;
    private double cloudRotation;
    private double getCloudRotationRate;
    private int cloudLevel;



    @Override
    public int compareTo(@NotNull Planet o) {
        return 0;
    }
}
