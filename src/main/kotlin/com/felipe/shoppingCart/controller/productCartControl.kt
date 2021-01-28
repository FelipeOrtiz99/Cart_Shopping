package com.felipe.shoppingCart.controller

import com.felipe.shoppingCart.models.ProductCart
import com.felipe.shoppingCart.repos.productCartRepo
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("productcart")
class productCartControl {

        @GetMapping
        fun getCart() = productCartRepo.findAll()

        @RequestMapping(path = [("/{productcartId}")], method = [RequestMethod.GET])
        fun getCart(@PathVariable("productcartId") productcartId: Long): Optional<ProductCart> {
            return productCartRepo.findById(productcartId)

        }

        @PostMapping
        fun postCart(@RequestBody productcart: ProductCart): ProductCart {
            productCartRepo.save(productcart)
            return productcart
        }


}