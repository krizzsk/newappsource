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

public class NavigationStartEvent extends NavigationEvent {
    public static final Parcelable.Creator<NavigationStartEvent> CREATOR = new C4245a();

    /* renamed from: c */
    public static final C4246b f15131c = new C4246b();

    /* renamed from: d */
    public static final C4247c f15132d = new C4247c(NavigationStartEvent.class);

    /* renamed from: com.moovit.navigation.event.NavigationStartEvent$a */
    public class C4245a implements Parcelable.Creator<NavigationStartEvent> {
        public final Object createFromParcel(Parcel parcel) {
            return (NavigationStartEvent) C19612n.m46981v(parcel, NavigationStartEvent.f15132d);
        }

        public final Object[] newArray(int i) {
            return new NavigationStartEvent[i];
        }
    }

    /* renamed from: com.moovit.navigation.event.NavigationStartEvent$b */
    public class C4246b extends C19621u<NavigationStartEvent> {
        public C4246b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((NavigationStartEvent) obj).f15109b);
        }
    }

    /* renamed from: com.moovit.navigation.event.NavigationStartEvent$c */
    public class C4247c extends C19620t<NavigationStartEvent> {
        public C4247c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new NavigationStartEvent(pVar.mo51947p());
        }
    }

    public NavigationStartEvent(String str) {
        super(str);
    }

    /* renamed from: b */
    public final void mo19717b(C4553a aVar) {
        aVar.mo19867d(this);
    }

    /* renamed from: c */
    public final String mo19718c() {
        return "com.moovit.navigation_event.action.navigation_start";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15131c);
    }
}
