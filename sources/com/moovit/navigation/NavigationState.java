package com.moovit.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.navigation.event.NavigationProgressEvent;
import d40.C4343a;
import d40.C4366l;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19620t;
import p810sz.C19621u;

public class NavigationState implements Parcelable {
    public static final Parcelable.Creator<NavigationState> CREATOR = new C4222a();

    /* renamed from: e */
    public static final C4223b f15077e = new C4223b();

    /* renamed from: f */
    public static final C4224c f15078f = new C4224c(NavigationState.class);

    /* renamed from: b */
    public final Navigable f15079b;

    /* renamed from: c */
    public final C4366l<C4343a> f15080c;

    /* renamed from: d */
    public NavigationProgressEvent f15081d = null;

    /* renamed from: com.moovit.navigation.NavigationState$a */
    public class C4222a implements Parcelable.Creator<NavigationState> {
        public final Object createFromParcel(Parcel parcel) {
            return (NavigationState) C19612n.m46981v(parcel, NavigationState.f15078f);
        }

        public final Object[] newArray(int i) {
            return new NavigationState[i];
        }
    }

    /* renamed from: com.moovit.navigation.NavigationState$b */
    public class C4223b extends C19621u<NavigationState> {
        public C4223b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            NavigationState navigationState = (NavigationState) obj;
            Navigable navigable = navigationState.f15079b;
            C19617r u = NavigationService.m11308u();
            qVar.getClass();
            u.write(navigable, qVar);
            C4366l<C4343a> lVar = navigationState.f15080c;
            C4366l.C4368b bVar = C4366l.f15360d;
            qVar.mo51939l(bVar.f49804u);
            bVar.mo19622a(lVar, qVar);
        }
    }

    /* renamed from: com.moovit.navigation.NavigationState$c */
    public class C4224c extends C19620t<NavigationState> {
        public C4224c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            C19617r u = NavigationService.m11308u();
            pVar.getClass();
            return new NavigationState((Navigable) u.read(pVar), (C4366l) C4366l.f15361e.read(pVar));
        }
    }

    public NavigationState(Navigable navigable, C4366l lVar) {
        C21100e.m49373x(navigable, "navigable");
        this.f15079b = navigable;
        this.f15081d = null;
        C21100e.m49373x(lVar, "accurateNavigatorState");
        this.f15080c = lVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15077e);
    }
}
