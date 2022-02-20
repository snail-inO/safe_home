package com.cusehack.safe_home.dao.beans;

public class Location {
    private long locationId;
    private String address;
    private double latitude;
    private double longitude;

    public Location(long locationId, String address, double latitude, double longitude) {
        this.locationId = locationId;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
