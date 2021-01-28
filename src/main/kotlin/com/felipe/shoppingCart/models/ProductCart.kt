package com.felipe.shoppingCart.models

import javax.persistence.*

@Entity
@Table(name = "product_cars")
class ProductCart() {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(columnDefinition = "serial") var cart_id: Long? = null

    var id_product: Long? = null
    var quantity : Long? = null

}