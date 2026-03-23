package co.empresa.productoservice.domain.service;

import co.empresa.productoservice.domain.model.Producto;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Interface que define los métodos que se pueden realizar sobre la entidad Producto
 */
public interface IProductoService {
    Producto save(Producto producto);
    void delete(Producto producto);
    Producto findById(Long id);
    Producto update(Producto producto);
    List<Producto> findAll();
    Page<Producto> findAll(Pageable pageable);
}