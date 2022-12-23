package com.moovit.sdk.protocol;

public enum ProtocolEnums$MVUserType {
    Regular(1),
    HealthCheck(4),
    Developer(5),
    FloatingUser(7),
    CarPoolDriver(9),
    CarPoolDriverDeveloper(11),
    FacebookBoot(12),
    BusDriver(13),
    ThirdParty(14),
    Sdk(15),
    SdkDeveloper(16);
    
    private final int value;

    private ProtocolEnums$MVUserType(int i) {
        this.value = i;
    }

    public static ProtocolEnums$MVUserType findByValue(int i) {
        if (i == 1) {
            return Regular;
        }
        if (i == 7) {
            return FloatingUser;
        }
        if (i == 9) {
            return CarPoolDriver;
        }
        if (i == 4) {
            return HealthCheck;
        }
        if (i == 5) {
            return Developer;
        }
        switch (i) {
            case 11:
                return CarPoolDriverDeveloper;
            case 12:
                return FacebookBoot;
            case 13:
                return BusDriver;
            case 14:
                return ThirdParty;
            case 15:
                return Sdk;
            case 16:
                return SdkDeveloper;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
