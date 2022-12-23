package com.moovit.gcm.condition;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class GcmTimePeriodCondition implements GcmCondition {
    public static final Parcelable.Creator<GcmTimePeriodCondition> CREATOR = new C15893a();

    /* renamed from: d */
    public static final C15894b f41504d = new C15894b();

    /* renamed from: e */
    public static final C15895c f41505e = new C15895c(GcmTimePeriodCondition.class);

    /* renamed from: b */
    public final long f41506b;

    /* renamed from: c */
    public final long f41507c;

    /* renamed from: com.moovit.gcm.condition.GcmTimePeriodCondition$a */
    public class C15893a implements Parcelable.Creator<GcmTimePeriodCondition> {
        public final Object createFromParcel(Parcel parcel) {
            return (GcmTimePeriodCondition) C19612n.m46981v(parcel, GcmTimePeriodCondition.f41505e);
        }

        public final Object[] newArray(int i) {
            return new GcmTimePeriodCondition[i];
        }
    }

    /* renamed from: com.moovit.gcm.condition.GcmTimePeriodCondition$b */
    public class C15894b extends C19621u<GcmTimePeriodCondition> {
        public C15894b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            GcmTimePeriodCondition gcmTimePeriodCondition = (GcmTimePeriodCondition) obj;
            qVar.mo51940m(gcmTimePeriodCondition.f41506b);
            qVar.mo51940m(gcmTimePeriodCondition.f41507c);
        }
    }

    /* renamed from: com.moovit.gcm.condition.GcmTimePeriodCondition$c */
    public class C15895c extends C19620t<GcmTimePeriodCondition> {
        public C15895c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new GcmTimePeriodCondition(pVar.mo51925m(), pVar.mo51925m());
        }
    }

    public GcmTimePeriodCondition(long j, long j2) {
        this.f41506b = j;
        this.f41507c = j2;
    }

    /* renamed from: d1 */
    public final boolean mo47939d1(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f41506b > currentTimeMillis || currentTimeMillis > this.f41507c) {
            return false;
        }
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo47941i(Context context) {
        if (System.currentTimeMillis() > this.f41507c) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41504d);
    }
}
