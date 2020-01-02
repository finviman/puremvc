package com.home.web.load;

import lombok.extern.slf4j.Slf4j;

/**
 * kelin rpc请求
 *
 * @author <a href="mailto:nkbaixiaojie@gmail.com">spark.bai</a>
 * @date 25/06/2017 11:55 AM
 */
@Slf4j
public class StubVendor {


    private String SERVICE_URL_PREFIX = "";

    private String URI_LOGIN ;
    private String URI_GET_PILE_STATE ;
    private String URI_CHARGE_START ;
    private String URI_CHARGE_OVER ;
    private String URI_CHARGE_DATA ;
    private String URI_CHARGE_INFO ;

    public StubVendor(String url) {
        System.out.println("cache object:"+url);
        this.SERVICE_URL_PREFIX = url;
        URI_LOGIN = SERVICE_URL_PREFIX + "/login.json";
        URI_GET_PILE_STATE = SERVICE_URL_PREFIX + "/getPileState.json";
        URI_CHARGE_START = SERVICE_URL_PREFIX + "/chargeStart.json";
        URI_CHARGE_OVER = SERVICE_URL_PREFIX + "/chargeOver.json";
        URI_CHARGE_DATA = SERVICE_URL_PREFIX + "/chargeData.json";
        URI_CHARGE_INFO = SERVICE_URL_PREFIX + "/getPileChargeRcd.json";
    }


    public void logStaticField() {
        System.out.println(URI_LOGIN);
    }
}
