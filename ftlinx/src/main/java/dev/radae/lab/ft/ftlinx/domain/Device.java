package dev.radae.lab.ft.ftlinx.domain;

import java.io.Serializable;

public class Device implements Serializable {
    private int id;
    private String version;
    private String localIP;
    private String name;

    public Device(int id, String version, String localIP, String Name)
    {
        this.id = id;
        this.localIP = localIP;
        this.version = version;
        this.name= Name;
    }
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalIP() {
        return localIP;
    }

    public void setLocalIP(String localIP) {
        this.localIP = localIP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
