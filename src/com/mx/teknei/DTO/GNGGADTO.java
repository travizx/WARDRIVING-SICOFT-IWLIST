
package com.mx.teknei.DTO;

import java.util.Date;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 28/10/2015
 * @class GNGGA_DTO
 */
public class GNGGADTO {

    private Date UTCtime;
    private double latitude;
    private boolean isNorth;
    private double longitude;
    private boolean isEast;
    private int qualityGPS;
    private int numSatellites;
    private double altitude;

    public GNGGADTO(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
    
    public GNGGADTO(Date UTCtime, double latitude, boolean isNorth, double longitude, boolean isEast) {
        this.UTCtime = UTCtime;
        this.latitude = latitude;
        this.isNorth = isNorth;
        this.longitude = longitude;
        this.isEast = isEast;
    }

    public GNGGADTO(Date UTCtime, double latitude, boolean isNorth, double longitude, boolean isEast, int qualityGPS, int numSatellites, double altitude) {
        this.UTCtime = UTCtime;
        this.latitude = latitude;
        this.isNorth = isNorth;
        this.longitude = longitude;
        this.isEast = isEast;
        this.qualityGPS = qualityGPS;
        this.numSatellites = numSatellites;
        this.altitude = altitude;
    }

    
    public Date getUTCtime() {
        return UTCtime;
    }

    public void setUTCtime(Date UTCtime) {
        this.UTCtime = UTCtime;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public boolean isIsNorth() {
        return isNorth;
    }

    public void setIsNorth(boolean isNorth) {
        this.isNorth = isNorth;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public boolean isIsEast() {
        return isEast;
    }

    public void setIsEast(boolean isEast) {
        this.isEast = isEast;
    }

    public int getQualityGPS() {
        return qualityGPS;
    }

    public void setQualityGPS(int qualityGPS) {
        this.qualityGPS = qualityGPS;
    }

    public int getNumSatellites() {
        return numSatellites;
    }

    public void setNumSatellites(int numSatellites) {
        this.numSatellites = numSatellites;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }
    
    
}
