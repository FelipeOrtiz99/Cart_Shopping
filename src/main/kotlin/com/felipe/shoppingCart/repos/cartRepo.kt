package com.felipe.shoppingCart.repos

import com.felipe.shoppingCart.models.Cart
import org.springframework.data.jpa.repository.JpaRepository

interface cartRepo : JpaRepository<Cart,Long>