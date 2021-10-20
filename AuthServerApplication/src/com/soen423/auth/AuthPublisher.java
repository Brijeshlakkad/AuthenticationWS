/**
 * Developed to present JAX-WS usage for Distributes Systems (SOEN 423) course.
 * Developed by Brijesh Lakkad
 *
 * @author brijeshlakkad
 */
package com.soen423.auth;

import javax.xml.ws.Endpoint;

public class AuthPublisher {

    public static void main(String[] args) {
        Endpoint ep = Endpoint.create(new AuthenticationImpl());
        ep.publish("http://127.0.0.1:8080/auth");
    }

}
