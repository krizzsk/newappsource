package com.moovit.gcm.condition;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p824tp.C19731i;

public class GcmClientVersionCondition implements GcmCondition {
    public static final Parcelable.Creator<GcmClientVersionCondition> CREATOR = new C15884a();

    /* renamed from: c */
    public static final C15885b f41495c = new C15885b();

    /* renamed from: d */
    public static final C15886c f41496d = new C15886c(GcmClientVersionCondition.class);

    /* renamed from: b */
    public final String f41497b;

    /* renamed from: com.moovit.gcm.condition.GcmClientVersionCondition$a */
    public class C15884a implements Parcelable.Creator<GcmClientVersionCondition> {
        public final Object createFromParcel(Parcel parcel) {
            return (GcmClientVersionCondition) C19612n.m46981v(parcel, GcmClientVersionCondition.f41496d);
        }

        public final Object[] newArray(int i) {
            return new GcmClientVersionCondition[i];
        }
    }

    /* renamed from: com.moovit.gcm.condition.GcmClientVersionCondition$b */
    public class C15885b extends C19621u<GcmClientVersionCondition> {
        public C15885b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((GcmClientVersionCondition) obj).f41497b);
        }
    }

    /* renamed from: com.moovit.gcm.condition.GcmClientVersionCondition$c */
    public class C15886c extends C19620t<GcmClientVersionCondition> {
        public C15886c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new GcmClientVersionCondition(pVar.mo51947p());
        }
    }

    public GcmClientVersionCondition(String str) {
        C21100e.m49373x(str, "clientVersion");
        this.f41497b = str;
    }

    /* renamed from: d1 */
    public final boolean mo47939d1(Context context) {
        return this.f41497b.equals(C19731i.m47197a(context).f50171a.f50152c);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo47941i(Context context) {
        return !mo47939d1(context);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41495c);
    }
}
