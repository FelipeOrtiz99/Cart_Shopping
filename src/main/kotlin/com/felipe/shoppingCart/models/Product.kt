package com.felipe.shoppingCart.models

import javax.persistence.*

@Entity
@Table(name="products")
class Product {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(columnDefinition = "serial") var id: Long? = null

    var nombre: String? = null
    var sku: String? = null
    var descripcion : String? = null

}