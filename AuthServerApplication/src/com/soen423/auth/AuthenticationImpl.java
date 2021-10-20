/**
 * Developed to present JAX-WS usage for Distributes Systems (SOEN 423) course.
 * Developed by Brijesh Lakkad
 *
 * @author brijeshlakkad
 */
package com.soen423.auth;

import javax.jws.WebService;

@WebService(endpointInterface = "com.soen423.auth.Authentication")
public class AuthenticationImpl implements Authentication {
    @Override
    public boolean login(String username, String password) {
        return username.equalsIgnoreCase("423") && password.equals("SOEN");
    }
}
