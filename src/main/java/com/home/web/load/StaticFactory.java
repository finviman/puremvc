package com.home.web.load;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liyang on 11/22/19.
 * liyang27@le.com;
 * only in letv.
 */
public class StaticFactory {

    // TODO config
    private static Map<String, StubVendor> pile_vendor = new HashMap<>();

    static{
        pile_vendor.put("kelinOld",new StubVendor("http://110.249.208.243:11028/kecharge"));
        pile_vendor.put("kelinNew",new StubVendor("http://39.107.251.41:10028/kecharge"));
    }

    /**
     * 根据桩号选择充电供应商
     * @param pileNo
     * @return
     */
    public static StubVendor getVendor(String pileNo){

        if ("KE0000001019".equals(pileNo)) {
            return pile_vendor.get("kelinNew");
        }else{
            return pile_vendor.get("kelinOld");
        }
    }
}
