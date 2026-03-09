package net.timeworndevs.final_frontier.planet;

import net.timeworndevs.final_frontier.networking.server_client.PlanetDynamicDataS2C;

import java.util.ArrayList;

public class PlanetList {

    private static PlanetList instance = null;
    private static PlanetList clientInstance = null;

    private ArrayList<Planet> planetList = new ArrayList<Planet>();
    private ArrayList<Planet> planetListBuffer = new ArrayList<Planet>();
    private PlanetDynamicDataS2C dynamicData = null;



    public static PlanetList get() {
        if (instance == null) {
            instance = new PlanetList();
        }

        return instance;
    }

    public static PlanetList getClient() {
        if (clientInstance == null) {
            clientInstance = new PlanetList();
        }

        return clientInstance;
    }

    public static void reset() {
        instance = null;
        clientInstance = null;
    }



}
