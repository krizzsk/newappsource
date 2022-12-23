package com.moovit.map;

import p810sz.C19577c;

public enum MapImplType {
    NUTITEQ("com.moovit.map.nutiteq.NutiteqMapsFactory"),
    BAIDU("com.moovit.map.baidu.BaiduMapsFactory"),
    GOOGLE("com.moovit.map.google.GoogleMapsFactory");
    
    public static final C19577c<MapImplType> CODER = null;
    private final String factoryClassName;

    /* access modifiers changed from: public */
    static {
        MapImplType mapImplType;
        MapImplType mapImplType2;
        MapImplType mapImplType3;
        CODER = new C19577c<>(MapImplType.class, mapImplType, mapImplType2, mapImplType3);
    }

    private MapImplType(String str) {
        this.factoryClassName = str;
    }

    public String getFactoryClassName() {
        return this.factoryClassName;
    }
}
