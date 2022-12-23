package com.moovit.gcm.condition;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class AlwaysValidGcmCondition implements GcmCondition {
    public static final Parcelable.Creator<AlwaysValidGcmCondition> CREATOR = new C15882a();

    /* renamed from: b */
    public static final C15883b f41494b = new C15883b(AlwaysValidGcmCondition.class);

    /* renamed from: com.moovit.gcm.condition.AlwaysValidGcmCondition$a */
    public class C15882a implements Parcelable.Creator<AlwaysValidGcmCondition> {
        public final Object createFromParcel(Parcel parcel) {
            return (AlwaysValidGcmCondition) C19612n.m46981v(parcel, AlwaysValidGcmCondition.f41494b);
        }

        public final Object[] newArray(int i) {
            return new AlwaysValidGcmCondition[i];
        }
    }

    /* renamed from: com.moovit.gcm.condition.AlwaysValidGcmCondition$b */
    public class C15883b extends C19619s<AlwaysValidGcmCondition> {
        public C15883b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new AlwaysValidGcmCondition();
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo179c(Object obj, C19616q qVar) throws IOException {
            AlwaysValidGcmCondition alwaysValidGcmCondition = (AlwaysValidGcmCondition) obj;
        }
    }

    /* renamed from: d1 */
    public final boolean mo47939d1(Context context) {
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo47941i(Context context) {
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41494b);
    }
}
