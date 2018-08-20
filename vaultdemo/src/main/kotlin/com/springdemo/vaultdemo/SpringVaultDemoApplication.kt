package com.springdemo.vaultdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(VaultConfiguration::class)
class SpringVaultDemoApplication {


}
// this func is outside the class, as it needs to be static.
fun main(args: Array<String>) {
    runApplication<SpringVaultDemoApplication>(*args)
}


