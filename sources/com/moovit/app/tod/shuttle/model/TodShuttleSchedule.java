package com.moovit.app.tod.shuttle.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.util.Arrays;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TodShuttleSchedule implements Parcelable {
    public static final Parcelable.Creator<TodShuttleSchedule> CREATOR = new C15558a();

    /* renamed from: c */
    public static final C15559b f40424c = new C15559b(TodShuttleSchedule.class);

    /* renamed from: b */
    public final long[] f40425b;

    /* renamed from: com.moovit.app.tod.shuttle.model.TodShuttleSchedule$a */
    public class C15558a implements Parcelable.Creator<TodShuttleSchedule> {
        public final Object createFromParcel(Parcel parcel) {
            return (TodShuttleSchedule) C19612n.m46981v(parcel, TodShuttleSchedule.f40424c);
        }

        public final Object[] newArray(int i) {
            return new TodShuttleSchedule[i];
        }
    }

    /* renamed from: com.moovit.app.tod.shuttle.model.TodShuttleSchedule$b */
    public class C15559b extends C19619s<TodShuttleSchedule> {
        public C15559b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new TodShuttleSchedule(pVar.mo51946n());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51953n(((TodShuttleSchedule) obj).f40425b);
        }
    }

    public TodShuttleSchedule(long[] jArr) {
        this.f40425b = jArr;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodShuttleSchedule{times=");
        k.append(Arrays.toString(this.f40425b));
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40424c);
    }
}
