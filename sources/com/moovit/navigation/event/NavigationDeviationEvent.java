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

public class NavigationDeviationEvent extends NavigationEvent {
    public static final Parcelable.Creator<NavigationDeviationEvent> CREATOR = new C4236a();

    /* renamed from: d */
    public static final C4237b f15106d = new C4237b();

    /* renamed from: e */
    public static final C4238c f15107e = new C4238c(NavigationDeviationEvent.class);

    /* renamed from: c */
    public final int f15108c;

    /* renamed from: com.moovit.navigation.event.NavigationDeviationEvent$a */
    public class C4236a implements Parcelable.Creator<NavigationDeviationEvent> {
        public final Object createFromParcel(Parcel parcel) {
            return (NavigationDeviationEvent) C19612n.m46981v(parcel, NavigationDeviationEvent.f15107e);
        }

        public final Object[] newArray(int i) {
            return new NavigationDeviationEvent[i];
        }
    }

    /* renamed from: com.moovit.navigation.event.NavigationDeviationEvent$b */
    public class C4237b extends C19621u<NavigationDeviationEvent> {
        public C4237b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            NavigationDeviationEvent navigationDeviationEvent = (NavigationDeviationEvent) obj;
            qVar.mo51954p(navigationDeviationEvent.f15109b);
            qVar.mo51939l(navigationDeviationEvent.f15108c);
        }
    }

    /* renamed from: com.moovit.navigation.event.NavigationDeviationEvent$c */
    public class C4238c extends C19620t<NavigationDeviationEvent> {
        public C4238c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new NavigationDeviationEvent(pVar.mo51947p(), pVar.mo51924l());
        }
    }

    public NavigationDeviationEvent(String str, int i) {
        super(str);
        this.f15108c = i;
    }

    /* renamed from: b */
    public final void mo19717b(C4553a aVar) {
        aVar.mo19868e(this);
    }

    /* renamed from: c */
    public final String mo19718c() {
        return "com.moovit.navigation_event.action.navigation_deviation";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15106d);
    }
}
