package com.moovit.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;

public enum NavigationReportType implements Parcelable {
    APP_IN_FG,
    APP_IN_BG,
    GPS_ON,
    GPS_OFF,
    WIFI_ON,
    WIFI_OFF,
    NAVIGATION_ON,
    NAVIGATION_OFF;
    
    public static C19584i<NavigationReportType> CODER;
    public static final Parcelable.Creator<NavigationReportType> CREATOR = null;

    /* renamed from: com.moovit.navigation.NavigationReportType$a */
    public class C4221a implements Parcelable.Creator<NavigationReportType> {
        public final Object createFromParcel(Parcel parcel) {
            return (NavigationReportType) C19612n.m46981v(parcel, NavigationReportType.CODER);
        }

        public final Object[] newArray(int i) {
            return new NavigationReportType[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        NavigationReportType navigationReportType;
        NavigationReportType navigationReportType2;
        NavigationReportType navigationReportType3;
        NavigationReportType navigationReportType4;
        NavigationReportType navigationReportType5;
        NavigationReportType navigationReportType6;
        NavigationReportType navigationReportType7;
        NavigationReportType navigationReportType8;
        CREATOR = new C4221a();
        CODER = new C19577c(NavigationReportType.class, navigationReportType, navigationReportType2, navigationReportType3, navigationReportType4, navigationReportType5, navigationReportType6, navigationReportType7, navigationReportType8);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
