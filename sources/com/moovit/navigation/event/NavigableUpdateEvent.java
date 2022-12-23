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

public class NavigableUpdateEvent extends NavigationEvent {
    public static final Parcelable.Creator<NavigableUpdateEvent> CREATOR = new C4233a();

    /* renamed from: c */
    public static final C4234b f15104c = new C4234b();

    /* renamed from: d */
    public static final C4235c f15105d = new C4235c(NavigableUpdateEvent.class);

    /* renamed from: com.moovit.navigation.event.NavigableUpdateEvent$a */
    public class C4233a implements Parcelable.Creator<NavigableUpdateEvent> {
        public final Object createFromParcel(Parcel parcel) {
            return (NavigableUpdateEvent) C19612n.m46981v(parcel, NavigableUpdateEvent.f15105d);
        }

        public final Object[] newArray(int i) {
            return new NavigableUpdateEvent[i];
        }
    }

    /* renamed from: com.moovit.navigation.event.NavigableUpdateEvent$b */
    public class C4234b extends C19621u<NavigableUpdateEvent> {
        public C4234b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((NavigableUpdateEvent) obj).f15109b);
        }
    }

    /* renamed from: com.moovit.navigation.event.NavigableUpdateEvent$c */
    public class C4235c extends C19620t<NavigableUpdateEvent> {
        public C4235c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new NavigableUpdateEvent(pVar.mo51947p());
        }
    }

    public NavigableUpdateEvent(String str) {
        super(str);
    }

    /* renamed from: b */
    public final void mo19717b(C4553a aVar) {
        aVar.mo19865b(this);
    }

    /* renamed from: c */
    public final String mo19718c() {
        return "com.moovit.navigation_event.action.navigation_update";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15104c);
    }
}
