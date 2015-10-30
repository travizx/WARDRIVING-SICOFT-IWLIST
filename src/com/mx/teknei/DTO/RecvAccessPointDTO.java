
package com.mx.teknei.DTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Logger;

/**
 * @author HEYDRICH ABRAHAM ENCISO - [haenciso@teknei.com.mx]
 * @date 28/10/2015
 * @class RecvAccessPointDTO
 */
public class RecvAccessPointDTO {

    private Date fechaRecv;
    private GNGGADTO geolocal;
    private ArrayList<CellDTO> cells;

    public RecvAccessPointDTO(Date fechaRecv, GNGGADTO geolocal) {
        this.fechaRecv = fechaRecv;
        this.geolocal = geolocal;
    }

    public RecvAccessPointDTO() {
        this.fechaRecv = null;
        this.geolocal = null;
        this.cells = null;
    }
    

    public void setFechaRecv(Date fechaRecv) {
        this.fechaRecv = fechaRecv;
    }

    public void setGeolocal(GNGGADTO geolocal) {
        this.geolocal = geolocal;
    }

    public void addCells(CellDTO cell){
        this.cells.add(cell);
    }
    
    public Date getFechaRecv() {
        return fechaRecv;
    }

    public GNGGADTO getGeolocal() {
        return geolocal;
    }

    public ArrayList<CellDTO> getCells() {
        return cells;
    }
    
}
