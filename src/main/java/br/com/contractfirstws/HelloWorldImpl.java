
package br.com.contractfirstws;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.contractfirstws.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

