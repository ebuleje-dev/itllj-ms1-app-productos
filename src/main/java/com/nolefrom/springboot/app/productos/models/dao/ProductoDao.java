package com.nolefrom.springboot.app.productos.models.dao;

import com.nolefrom.springboot.app.productos.models.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto,Long> {
}
