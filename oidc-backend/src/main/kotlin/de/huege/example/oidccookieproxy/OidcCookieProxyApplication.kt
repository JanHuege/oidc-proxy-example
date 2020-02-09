package de.huege.example.oidccookieproxy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OidcCookieProxyApplication

fun main(args: Array<String>) {
	runApplication<OidcCookieProxyApplication>(*args)
}
