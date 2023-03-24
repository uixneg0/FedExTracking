package org.uixneg0.entities;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class OAuthResponse {
    public String access_token;

    public String getAccessToken(){
        return access_token;
    }
}
