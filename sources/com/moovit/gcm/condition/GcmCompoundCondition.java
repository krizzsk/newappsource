package com.moovit.gcm.condition;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import f10.C16936g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class GcmCompoundCondition implements GcmCondition {
    public static final Parcelable.Creator<GcmCompoundCondition> CREATOR = new C15887a();

    /* renamed from: c */
    public static final C15888b f41498c = new C15888b();

    /* renamed from: d */
    public static final C15889c f41499d = new C15889c(GcmCompoundCondition.class);

    /* renamed from: b */
    public final Collection<GcmCondition> f41500b;

    /* renamed from: com.moovit.gcm.condition.GcmCompoundCondition$a */
    public class C15887a implements Parcelable.Creator<GcmCompoundCondition> {
        public final Object createFromParcel(Parcel parcel) {
            return (GcmCompoundCondition) C19612n.m46981v(parcel, GcmCompoundCondition.f41499d);
        }

        public final Object[] newArray(int i) {
            return new GcmCompoundCondition[i];
        }
    }

    /* renamed from: com.moovit.gcm.condition.GcmCompoundCondition$b */
    public class C15888b extends C19621u<GcmCompoundCondition> {
        public C15888b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51965h(((GcmCompoundCondition) obj).f41500b, C16936g.f43956c);
        }
    }

    /* renamed from: com.moovit.gcm.condition.GcmCompoundCondition$c */
    public class C15889c extends C19620t<GcmCompoundCondition> {
        public C15889c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new GcmCompoundCondition(pVar.mo51959g(C16936g.f43956c));
        }
    }

    public GcmCompoundCondition(ArrayList arrayList) {
        C21100e.m49373x(arrayList, "conditions");
        this.f41500b = arrayList;
    }

    /* renamed from: d1 */
    public final boolean mo47939d1(Context context) {
        for (GcmCondition d1 : this.f41500b) {
            if (!d1.mo47939d1(context)) {
                return false;
            }
        }
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo47941i(Context context) {
        for (GcmCondition i : this.f41500b) {
            if (i.mo47941i(context)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41498c);
    }
}
