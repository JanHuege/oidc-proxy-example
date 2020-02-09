package de.huege.example.oidccookieproxy.controller

import org.slf4j.LoggerFactory
import org.springframework.security.oauth2.jwt.Jwt
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class RootController {
    /**
     * Simple endpoint to demonstrates how to inject OAuth2Authentication.
     */
    @GetMapping
    fun getRoot(auth: JwtAuthenticationToken): String {
        logger.info("Authenticated as principal {}", auth.name)
        return java.lang.String.format("It Works! Principal: '%s'", (auth.token as Jwt).tokenValue)
    }

    companion object {
        private val logger = LoggerFactory.getLogger(RootController::class.java)
    }
}