package com.felipe.shoppingCart.controller

import com.felipe.shoppingCart.models.Cart
import  com.felipe.shoppingCart.repos.cartRepo
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("cart")
class cartControl (val cartRepository: cartRepo){

    @GetMapping
    fun getCart() = cartRepository.findAll()

    @RequestMapping(path = [("/{cartId}")], method = [RequestMethod.GET])
    fun getCart(@PathVariable("cartId") cartId: Long): Optional<Cart> {
        return cartRepository.findById(cartId)

    }

    @PostMapping
    fun postCart(@RequestBody cart: Cart): Cart {
        cartRepository.save(cart)
        return cart
    }

}