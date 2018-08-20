package com.springdemo.vaultdemo

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rest/vault")
class VaultController{

    private final val configuration:VaultConfiguration?

    constructor(config: VaultConfiguration){
        this.configuration = config
    }

    var name = "World"

    @RequestMapping("/")
    fun home(): String {
        return "Hello ${this.configuration!!.url}"
    }

    @GetMapping("all")
    public fun configs(){
        val logger:Logger = LoggerFactory.getLogger(VaultController::class.java)

        logger.info("----------------------------------------");
        logger.info("Configuration properties");
        logger.info("        example.username is {}", configuration!!.username);
        logger.info("        example.password is {}", configuration!!.password);
        logger.info("----------------------------------------");
    }

}