package com.tranzmate.moovit.protocol.users;

public enum MVUserType {
    Regular(1),
    Web(2),
    Driver(3),
    HealthCheck(4),
    Developer(5),
    ExternalApis(6),
    FloatingUser(7),
    Operations(8),
    CarPoolDriver(9),
    GtfsEditor(10),
    CarPoolDriverDeveloper(11),
    FacebookBoot(12),
    BusDriver(13),
    ThirdParty(14),
    Sdk(15),
    SdkDeveloper(16),
    ReportManager(17),
    OD(18),
    DailyGraphViewer(19),
    CarPoolDriverMDR(20),
    DataAdmin(21),
    MDR(22),
    WalletWeb(23),
    TodDriver(24),
    TodDebugDriver(25),
    TodWeb(26),
    UserManagement(27),
    Customers(28),
    BusDriverDebug(29),
    AdHocWebUser(30),
    EmployersPortal(31),
    AuditLog(32),
    AdsManager(33);
    
    private final int value;

    private MVUserType(int i) {
        this.value = i;
    }

    public static MVUserType findByValue(int i) {
        switch (i) {
            case 1:
                return Regular;
            case 2:
                return Web;
            case 3:
                return Driver;
            case 4:
                return HealthCheck;
            case 5:
                return Developer;
            case 6:
                return ExternalApis;
            case 7:
                return FloatingUser;
            case 8:
                return Operations;
            case 9:
                return CarPoolDriver;
            case 10:
                return GtfsEditor;
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
            case 17:
                return ReportManager;
            case 18:
                return OD;
            case 19:
                return DailyGraphViewer;
            case 20:
                return CarPoolDriverMDR;
            case 21:
                return DataAdmin;
            case 22:
                return MDR;
            case 23:
                return WalletWeb;
            case 24:
                return TodDriver;
            case 25:
                return TodDebugDriver;
            case 26:
                return TodWeb;
            case 27:
                return UserManagement;
            case 28:
                return Customers;
            case 29:
                return BusDriverDebug;
            case 30:
                return AdHocWebUser;
            case 31:
                return EmployersPortal;
            case 32:
                return AuditLog;
            case 33:
                return AdsManager;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
