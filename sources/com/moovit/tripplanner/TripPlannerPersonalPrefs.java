package com.moovit.tripplanner;

import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import f00.C16913a;
import f00.C16919g;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TripPlannerPersonalPrefs implements Parcelable {
    public static final Parcelable.Creator<TripPlannerPersonalPrefs> CREATOR = new C7852a();

    /* renamed from: d */
    public static final C7853b f23792d = new C7853b(TripPlannerPersonalPrefs.class);

    /* renamed from: b */
    public final boolean f23793b;

    /* renamed from: c */
    public final short f23794c;

    /* renamed from: com.moovit.tripplanner.TripPlannerPersonalPrefs$a */
    public class C7852a implements Parcelable.Creator<TripPlannerPersonalPrefs> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlannerPersonalPrefs) C19612n.m46981v(parcel, TripPlannerPersonalPrefs.f23792d);
        }

        public final Object[] newArray(int i) {
            return new TripPlannerPersonalPrefs[i];
        }
    }

    /* renamed from: com.moovit.tripplanner.TripPlannerPersonalPrefs$b */
    public class C7853b extends C19619s<TripPlannerPersonalPrefs> {
        public C7853b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new TripPlannerPersonalPrefs(pVar.mo51919b(), pVar.mo51926r());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TripPlannerPersonalPrefs tripPlannerPersonalPrefs = (TripPlannerPersonalPrefs) obj;
            qVar.mo51934b(tripPlannerPersonalPrefs.f23793b);
            qVar.mo51941r(tripPlannerPersonalPrefs.f23794c);
        }
    }

    /* renamed from: com.moovit.tripplanner.TripPlannerPersonalPrefs$c */
    public static class C7854c extends C16913a<TripPlannerPersonalPrefs> {

        /* renamed from: d */
        public final C16919g.C16920a f23795d = new C16919g.C16920a(C16913a.m42705e("trip_planner_personal_prefs", "slow_walking"), false);

        /* renamed from: e */
        public final C16919g.C16927h f23796e = new C16919g.C16927h(C16913a.m42705e("trip_planner_personal_prefs", "walking_time"), -1);

        public C7854c(TripPlannerPersonalPrefs tripPlannerPersonalPrefs) {
            super("trip_planner_personal_prefs", tripPlannerPersonalPrefs);
        }

        /* renamed from: f */
        public final Object mo24471f(SharedPreferences sharedPreferences) {
            Boolean e = this.f23795d.mo19759a(sharedPreferences);
            return new TripPlannerPersonalPrefs(e.booleanValue(), ((Short) this.f23796e.mo19759a(sharedPreferences)).shortValue());
        }

        /* renamed from: h */
        public final void mo24472h(SharedPreferences.Editor editor) {
            editor.remove(this.f23795d.f43935a);
            editor.remove(this.f23796e.f43935a);
        }

        /* renamed from: i */
        public final void mo24473i(SharedPreferences.Editor editor, Object obj) {
            TripPlannerPersonalPrefs tripPlannerPersonalPrefs = (TripPlannerPersonalPrefs) obj;
            this.f23795d.mo19760c(editor, Boolean.valueOf(tripPlannerPersonalPrefs.f23793b));
            this.f23796e.mo19760c(editor, Short.valueOf(tripPlannerPersonalPrefs.f23794c));
        }
    }

    public TripPlannerPersonalPrefs(boolean z, short s) {
        this.f23793b = z;
        this.f23794c = s;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripPlannerPersonalPrefs)) {
            return false;
        }
        TripPlannerPersonalPrefs tripPlannerPersonalPrefs = (TripPlannerPersonalPrefs) obj;
        if (this.f23793b == tripPlannerPersonalPrefs.f23793b && this.f23794c == tripPlannerPersonalPrefs.f23794c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.f23793b;
        return C17884p.m44333D(z ? 1 : 0, this.f23794c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23792d);
    }
}
