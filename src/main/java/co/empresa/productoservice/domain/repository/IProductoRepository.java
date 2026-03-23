package co.empresa.productoservice.domain.repository;

import co.empresa.productoservice.domain.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface que hereda de CrudRepository para realizar las
 * operaciones de CRUD sobre la entidad Producto
 */
public interface IProductoRepository extends JpaRepository<Producto, Long> {
}