package com.storage.mywarehouse.Entity;
// Generated Aug 12, 2017 5:46:27 PM by Hibernate Tools 4.3.1



/**
 * Warehouse generated by hbm2java
 */
public class Warehouse  implements java.io.Serializable {


     private int warehouseId;
     private String name;

    public Warehouse() {
    }

    public Warehouse(int warehouseId, String name) {
       this.warehouseId = warehouseId;
       this.name = name;
    }
   
    public int getWarehouseId() {
        return this.warehouseId;
    }
    
    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}

