package com.moovit.navigation.event;

import android.os.Parcelable;
import ce0.C21100e;
import e40.C4553a;

public abstract class NavigationEvent implements Parcelable {

    /* renamed from: b */
    public final String f15109b;

    public NavigationEvent(String str) {
        C21100e.m49373x(str, "navigableId");
        this.f15109b = str;
    }

    /* renamed from: b */
    public abstract void mo19717b(C4553a aVar);

    /* renamed from: c */
    public abstract String mo19718c();
}
