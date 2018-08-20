package com.springdemo.vaultdemo

import org.springframework.boot.context.properties.ConfigurationProperties


// $ vault kv put secret/vaultdemo demo.username=demouser demo.password=demovault demo.url=notyetset
// ConfigurationProperties = demo
// as demo.username, demo.password, demo.url
//
@ConfigurationProperties("demo")
class VaultConfiguration(
        var username:String="",
        var password:String="",
        var url:String=""
)
