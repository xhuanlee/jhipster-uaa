package com.jhipster.uaa.config;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;

/**
 * @author lixianghuan@allcomchina.com
 * @date 2019/1/28 10:20
 * @extra code change the world
 * @description
 */
public class DomainClientDetailsService implements ClientDetailsService {

    @Override
    public ClientDetails loadClientByClientId(String s) throws ClientRegistrationException {
        return null;
    }

}
