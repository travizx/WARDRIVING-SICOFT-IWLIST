package com.mx.teknei.DTO;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 29/10/2015
 * @class CellDTO
 */
public class CellDTO {

    private String address;
    private double frecuency;
    private String quality;
    private double signalLevel;
    private String ESSID;

    public CellDTO() {
        this.address = null;
        this.frecuency = Double.NaN;
        this.quality = null;
        this.signalLevel = Double.NaN;
        this.ESSID = null;
    }

    public CellDTO(String address, double frecuency, String quality, double signalLevel, String ESSID) {
        this.address = address;
        this.frecuency = frecuency;
        this.quality = quality;
        this.signalLevel = signalLevel;
        this.ESSID = ESSID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getFrecuency() {
        return frecuency;
    }

    public void setFrecuency(double frecuency) {
        this.frecuency = frecuency;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public double getSignalLevel() {
        return signalLevel;
    }

    public void setSignalLevel(double signalLevel) {
        this.signalLevel = signalLevel;
    }

    public String getESSID() {
        return ESSID;
    }

    public void setESSID(String ESSID) {
        this.ESSID = ESSID;
    }

}
