package pe.edu.idat.demo_ventas_idat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.idat.demo_ventas_idat.model.CategoryModel;
import pe.edu.idat.demo_ventas_idat.model.ProductModel;
import pe.edu.idat.demo_ventas_idat.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String index(Model model){
        model.addAttribute("productos",productService.obtenerProductos());
        return  "product/index";
    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("product", new ProductModel());
        return "product/create";
    }

    @GetMapping("/edit/{id}")
    public String edit(Model model, @PathVariable int id){
        model.addAttribute("product", productService.obtenerProductoXid(id));
        return "product/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("product")ProductModel product){
        productService.guardarProducto(product);
        return "redirect:/product";
    }
}
