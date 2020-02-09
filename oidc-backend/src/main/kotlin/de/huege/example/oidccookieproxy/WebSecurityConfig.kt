package de.huege.example.oidccookieproxy

import org.springframework.beans.factory.annotation.Value
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.config.http.SessionCreationPolicy


@EnableWebSecurity
class WebSecurityConfig : WebSecurityConfigurerAdapter() {

     //@Value("\${security.oauth2.resourceserver.jwt.issuer-uri}")
     @Value("\${security.oauth2.resourceserver.jwt.jwk-set-uri}")
     private val jwksUri: String? = null

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http
                .csrf()
                .disable()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .oauth2ResourceServer()
                .jwt().jwkSetUri(jwksUri)
    }
}
