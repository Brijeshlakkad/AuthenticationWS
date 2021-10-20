/**
 * Developed to present JAX-WS usage for Distributes Systems (SOEN 423) course.
 * Developed by Brijesh Lakkad
 *
 * @author brijeshlakkad
 */
package com.soen423.auth;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Authentication {
	@WebMethod
	boolean login(String username, String password);
}
