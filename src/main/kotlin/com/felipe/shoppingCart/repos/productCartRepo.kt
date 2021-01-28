package com.felipe.shoppingCart.repos

import com.felipe.shoppingCart.models.ProductCart
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface productCartRepo : JpaRepository<ProductCart,Long>