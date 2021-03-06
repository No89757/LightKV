package com.horizon.lightkvdemo.util;


import com.horizon.lightkv.LightKV;
import com.horizon.lightkv.SyncKV;
import com.horizon.lightkvdemo.config.GlobalConfig;

public class SyncData {
    private final SyncKV DATA;

    private SyncData() {
        DATA = new LightKV.Builder(GlobalConfig.INSTANCE.getAppContext(), "sync_data")
                .keys(Keys.class)
                .logger(AppLogger.INSTANCE)
                .sync();
    }

    public SyncKV data() {
        return DATA;
    }

    public static SyncData newInstance(){
        return new SyncData();
    }
}
