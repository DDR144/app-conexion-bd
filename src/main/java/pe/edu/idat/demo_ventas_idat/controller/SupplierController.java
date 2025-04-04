package pe.edu.idat.demo_ventas_idat.controller;

import pe.edu.idat.demo_ventas_idat.service.SupplierService;

public class SupplierController {
    private final SupplierService supplierService;
    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

}
