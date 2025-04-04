package pe.edu.idat.demo_ventas_idat.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_ventas_idat.model.SupplierModel;
import pe.edu.idat.demo_ventas_idat.repository.SupplierRepository;

import java.util.List;

@Service
public class SupplierService {
    private final SupplierRepository supplierRepository;

    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public List<SupplierModel> obtenerProveedor(){
        return supplierRepository.findAll();
    }

    public void guardarProveedor(SupplierModel supplier){
        supplierRepository.save(supplier);
    }

    public SupplierModel obtenerProveedorXid(int id){
        return supplierRepository.findById(id).orElse(null);
    }
}
