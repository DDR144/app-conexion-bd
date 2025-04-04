package pe.edu.idat.demo_ventas_idat.service;

import org.springframework.stereotype.Service;
import pe.edu.idat.demo_ventas_idat.model.CategoryModel;
import pe.edu.idat.demo_ventas_idat.repository.CategoryRepository;

import java.util.List;
@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryModel> obtenerCategorias(){
        //select * from categories
        return categoryRepository.findAll();
    }

    public void guardarCategoria(CategoryModel category){
        //insert into categories values (...)
        //update categories set ... where ...
        categoryRepository.save(category);
    }

    public CategoryModel obtenerCategoriaXid(int id){
        //select * from categories where categoryid=:id
        return categoryRepository.findById(id).orElse(null);
    }

    public void eliminarCategoria(int id){

    }
}
