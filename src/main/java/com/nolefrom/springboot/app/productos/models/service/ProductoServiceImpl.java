package com.nolefrom.springboot.app.productos.models.service;

import com.nolefrom.springboot.app.productos.models.dao.ProductoDao;
import com.nolefrom.springboot.app.productos.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true) //De Spring Framework
    public List<Producto> findAll() {
        return productoDao.findAll();
    }

    @Override
    @Transactional(readOnly = true) //De Spring Framework
    public Producto findById(Long id) {
        return productoDao.findById(id).orElse(null);
    }
}
