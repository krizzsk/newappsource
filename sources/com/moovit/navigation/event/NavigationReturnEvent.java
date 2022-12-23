package com.moovit.navigation.event;

import android.os.Parcel;
import android.os.Parcelable;
import e40.C4553a;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class NavigationReturnEvent extends NavigationEvent {
    public static final Parcelable.Creator<NavigationReturnEvent> CREATOR = new C4242a();

    /* renamed from: d */
    public static final C4243b f15128d = new C4243b();

    /* renamed from: e */
    public static final C4244c f15129e = new C4244c(NavigationReturnEvent.class);

    /* renamed from: c */
    public final int f15130c;

    /* renamed from: com.moovit.navigation.event.NavigationReturnEvent$a */
    public class C4242a implements Parcelable.Creator<NavigationReturnEvent> {
        public final Object createFromParcel(Parcel parcel) {
            return (NavigationReturnEvent) C19612n.m46981v(parcel, NavigationReturnEvent.f15129e);
        }

        public final Object[] newArray(int i) {
            return new NavigationReturnEvent[i];
        }
    }

    /* renamed from: com.moovit.navigation.event.NavigationReturnEvent$b */
    public class C4243b extends C19621u<NavigationReturnEvent> {
        public C4243b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            NavigationReturnEvent navigationReturnEvent = (NavigationReturnEvent) obj;
            qVar.mo51954p(navigationReturnEvent.f15109b);
            qVar.mo51939l(navigationReturnEvent.f15130c);
        }
    }

    /* renamed from: com.moovit.navigation.event.NavigationReturnEvent$c */
    public class C4244c extends C19620t<NavigationReturnEvent> {
        public C4244c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new NavigationReturnEvent(pVar.mo51947p(), pVar.mo51924l());
        }
    }

    public NavigationReturnEvent(String str, int i) {
        super(str);
        this.f15130c = i;
    }

    /* renamed from: b */
    public final void mo19717b(C4553a aVar) {
        aVar.mo19869f(this);
    }

    /* renamed from: c */
    public final String mo19718c() {
        return "com.moovit.navigation_event.action.navigation_return";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15128d);
    }
}
