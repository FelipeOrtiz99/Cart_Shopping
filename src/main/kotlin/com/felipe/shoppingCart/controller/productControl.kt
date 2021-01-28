package com.felipe.shoppingCart.controller


import com.felipe.shoppingCart.models.Product
import  com.felipe.shoppingCart.repos.productRepo
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/product")
class productControl (val productRepository: productRepo){

    @GetMapping
    fun  getProduct() = productRepository.findAll()

    @RequestMapping(path = [("/{productId}")], method = [RequestMethod.GET])
    fun getProduct(@PathVariable("productId") productId: Long): Optional<Product> {
        return productRepository.findById(productId)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun postProduct(@RequestBody product:Product):Product{
        productRepository.save(product)
        return product
    }


    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    fun updateProduct(@RequestBody product:Product):Product{
        productRepository.save(product)
        return product
    }

    @DeleteMapping
    @RequestMapping(path = [("/{productId}")], method = [RequestMethod.DELETE])
    fun removeProduct(@PathVariable("productId") productId: Long) {
        return productRepository.deleteById(productId)
    }


}

