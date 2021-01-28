package com.felipe.shoppingCart.repos


import com.felipe.shoppingCart.models.Product
import  org.springframework.data.jpa.repository.JpaRepository

interface productRepo : JpaRepository<Product, Long>
