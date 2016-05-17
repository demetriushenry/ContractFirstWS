package br.com.contractfirstws;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

