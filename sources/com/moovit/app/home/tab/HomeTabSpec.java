package com.moovit.app.home.tab;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0965s;
import androidx.fragment.app.FragmentManager;
import ce0.C21100e;
import p450dt.C16703d;

public final class HomeTabSpec implements Parcelable {
    public static final Parcelable.Creator<HomeTabSpec> CREATOR = new C15012a();

    /* renamed from: b */
    public final HomeTab f38422b;

    /* renamed from: c */
    public final Class<? extends C16703d> f38423c;

    /* renamed from: d */
    public final Bundle f38424d;

    /* renamed from: com.moovit.app.home.tab.HomeTabSpec$a */
    public class C15012a implements Parcelable.Creator<HomeTabSpec> {
        public final Object createFromParcel(Parcel parcel) {
            return new HomeTabSpec(parcel);
        }

        public final Object[] newArray(int i) {
            return new HomeTabSpec[i];
        }
    }

    public HomeTabSpec() {
        throw null;
    }

    public HomeTabSpec(HomeTab homeTab, Class<? extends C16703d> cls) {
        C21100e.m49373x(homeTab, "tab");
        this.f38422b = homeTab;
        this.f38423c = cls;
        this.f38424d = null;
    }

    /* renamed from: b */
    public final C16703d mo45224b(FragmentManager fragmentManager) {
        C0965s G = fragmentManager.mo3929G();
        this.f38423c.getClassLoader();
        C16703d dVar = (C16703d) G.mo3992a(this.f38423c.getName());
        Bundle bundle = this.f38424d;
        if (bundle != null) {
            bundle.setClassLoader(this.f38423c.getClassLoader());
            dVar.setArguments(this.f38424d);
        }
        return dVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f38422b, i);
        parcel.writeSerializable(this.f38423c);
        parcel.writeParcelable(this.f38424d, i);
    }

    public HomeTabSpec(Parcel parcel) {
        this.f38422b = (HomeTab) parcel.readParcelable(HomeTab.class.getClassLoader());
        Class<? extends C16703d> cls = (Class) parcel.readSerializable();
        this.f38423c = cls;
        this.f38424d = (Bundle) parcel.readParcelable(cls.getClassLoader());
    }
}
