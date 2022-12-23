package com.moovit.app.home.tab;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;

public enum HomeTab implements Parcelable {
    DASHBOARD(r1),
    NEARBY(r4),
    LINES(r7),
    EXPLORE(r4),
    TICKETING_WALLET(HomeTabUi.WALLET),
    TRIP_PLANNER(r1),
    TRANSIT_TYPE_STATIONS(r4),
    TRANSIT_TYPE_LINES(r7),
    WONDO_NEARBY(HomeTabUi.WONDO_NEARBY);
    
    public static C19577c<HomeTab> CODER;
    public static final Parcelable.Creator<HomeTab> CREATOR = null;

    /* renamed from: ui */
    private final HomeTabUi f38421ui;

    /* renamed from: com.moovit.app.home.tab.HomeTab$a */
    public class C15011a implements Parcelable.Creator<HomeTab> {
        public final Object createFromParcel(Parcel parcel) {
            return (HomeTab) C19612n.m46981v(parcel, HomeTab.CODER);
        }

        public final Object[] newArray(int i) {
            return new HomeTab[i];
        }
    }

    /* access modifiers changed from: public */
    static {
        HomeTab homeTab;
        HomeTab homeTab2;
        HomeTab homeTab3;
        HomeTab homeTab4;
        HomeTab homeTab5;
        HomeTab homeTab6;
        HomeTab homeTab7;
        HomeTab homeTab8;
        HomeTab homeTab9;
        CREATOR = new C15011a();
        CODER = new C19577c<>(HomeTab.class, homeTab, homeTab2, homeTab3, homeTab6, homeTab7, homeTab8, homeTab4, homeTab9, homeTab5);
    }

    private HomeTab(HomeTabUi homeTabUi) {
        C21100e.m49373x(homeTabUi, "ui");
        this.f38421ui = homeTabUi;
    }

    public int describeContents() {
        return 0;
    }

    public HomeTabUi getUi() {
        return this.f38421ui;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, CODER);
    }
}
