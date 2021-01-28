package com.felipe.shoppingCart.entity

import javax.persistence.*

@MappedSuperclass
abstract class productCartEntity  protected constructor(){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val idCart: Long?

    init {
        idCart = null
    }



}