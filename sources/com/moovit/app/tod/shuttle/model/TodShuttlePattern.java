package com.moovit.app.tod.shuttle.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TodShuttlePattern implements Parcelable {
    public static final Parcelable.Creator<TodShuttlePattern> CREATOR = new C15554a();

    /* renamed from: f */
    public static final C15555b f40417f = new C15555b(TodShuttlePattern.class);

    /* renamed from: b */
    public final String f40418b;

    /* renamed from: c */
    public final String f40419c;

    /* renamed from: d */
    public final List<TodShuttleStop> f40420d;

    /* renamed from: e */
    public final List<TodShuttlePatternStopRestriction> f40421e;

    /* renamed from: com.moovit.app.tod.shuttle.model.TodShuttlePattern$a */
    public class C15554a implements Parcelable.Creator<TodShuttlePattern> {
        public final Object createFromParcel(Parcel parcel) {
            return (TodShuttlePattern) C19612n.m46981v(parcel, TodShuttlePattern.f40417f);
        }

        public final Object[] newArray(int i) {
            return new TodShuttlePattern[i];
        }
    }

    /* renamed from: com.moovit.app.tod.shuttle.model.TodShuttlePattern$b */
    public class C15555b extends C19619s<TodShuttlePattern> {
        public C15555b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ArrayList<TodShuttlePatternStopRestriction> arrayList;
            String p = pVar.mo51947p();
            String p2 = pVar.mo51947p();
            ArrayList g = pVar.mo51959g(TodShuttleStop.f40426e);
            if (i >= 1) {
                arrayList = pVar.mo51958f(TodShuttlePatternStopRestriction.CODER);
            } else {
                arrayList = null;
            }
            return new TodShuttlePattern(p, p2, g, arrayList);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TodShuttlePattern todShuttlePattern = (TodShuttlePattern) obj;
            qVar.mo51954p(todShuttlePattern.f40418b);
            qVar.mo51954p(todShuttlePattern.f40419c);
            qVar.mo51965h(todShuttlePattern.f40420d, TodShuttleStop.f40426e);
            qVar.mo51964g(todShuttlePattern.f40421e, TodShuttlePatternStopRestriction.CODER);
        }
    }

    public TodShuttlePattern(String str, String str2, ArrayList arrayList, List list) {
        List<TodShuttlePatternStopRestriction> list2;
        C21100e.m49373x(str, "id");
        this.f40418b = str;
        C21100e.m49373x(str2, "name");
        this.f40419c = str2;
        C21100e.m49373x(arrayList, "stops");
        this.f40420d = Collections.unmodifiableList(arrayList);
        if (list != null) {
            list2 = Collections.unmodifiableList(list);
        } else {
            list2 = null;
        }
        this.f40421e = list2;
        if (list != null && list.size() != arrayList.size()) {
            throw new IllegalStateException("stops and stop restrictions must have the same size!");
        }
    }

    /* renamed from: b */
    public final TodShuttleStop mo46434b(int i) {
        List<TodShuttleStop> list = this.f40420d;
        C21100e.m49375y(0, list.size() - 1, "index", i);
        return list.get(i);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodShuttlePattern{id='");
        C25541a.m63890u(k, this.f40418b, '\'', ", name='");
        C25541a.m63890u(k, this.f40419c, '\'', ", stops=");
        k.append(this.f40420d);
        k.append(", stopRestrictions=");
        return C13555b.m33970i(k, this.f40421e, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40417f);
    }
}
