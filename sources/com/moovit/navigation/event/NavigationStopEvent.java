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

public class NavigationStopEvent extends NavigationEvent {
    public static final Parcelable.Creator<NavigationStopEvent> CREATOR = new C4248a();

    /* renamed from: d */
    public static final C4249b f15133d = new C4249b();

    /* renamed from: e */
    public static final C4250c f15134e = new C4250c(NavigationStopEvent.class);

    /* renamed from: c */
    public boolean f15135c;

    /* renamed from: com.moovit.navigation.event.NavigationStopEvent$a */
    public class C4248a implements Parcelable.Creator<NavigationStopEvent> {
        public final Object createFromParcel(Parcel parcel) {
            return (NavigationStopEvent) C19612n.m46981v(parcel, NavigationStopEvent.f15134e);
        }

        public final Object[] newArray(int i) {
            return new NavigationStopEvent[i];
        }
    }

    /* renamed from: com.moovit.navigation.event.NavigationStopEvent$b */
    public class C4249b extends C19621u<NavigationStopEvent> {
        public C4249b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            NavigationStopEvent navigationStopEvent = (NavigationStopEvent) obj;
            qVar.mo51954p(navigationStopEvent.f15109b);
            qVar.mo51934b(navigationStopEvent.f15135c);
        }
    }

    /* renamed from: com.moovit.navigation.event.NavigationStopEvent$c */
    public class C4250c extends C19620t<NavigationStopEvent> {
        public C4250c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new NavigationStopEvent(pVar.mo51947p(), pVar.mo51919b());
        }
    }

    public NavigationStopEvent(String str, boolean z) {
        super(str);
        this.f15135c = z;
    }

    /* renamed from: b */
    public final void mo19717b(C4553a aVar) {
        aVar.mo19866c(this);
    }

    /* renamed from: c */
    public final String mo19718c() {
        return "com.moovit.navigation_event.action.navigation_stop";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15133d);
    }
}
