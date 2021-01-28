package com.felipe.shoppingCart.models

import javax.persistence.*
import javax.persistence.JoinColumn




@Entity
@Table(name="carts")
class Cart {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(columnDefinition = "serial") var id: Long? = null

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "id")
    private val productcart: ProductCart? = null


    var status: String? = null
 }