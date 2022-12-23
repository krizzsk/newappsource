package com.moovit.gcm.condition;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.MoovitApplication;
import com.moovit.appdata.UserContextLoader;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p824tp.C19722a0;

public class GcmMetroCondition implements GcmCondition {
    public static final Parcelable.Creator<GcmMetroCondition> CREATOR = new C15890a();

    /* renamed from: c */
    public static final C15891b f41501c = new C15891b();

    /* renamed from: d */
    public static final C15892c f41502d = new C15892c(GcmMetroCondition.class);

    /* renamed from: b */
    public final ServerId f41503b;

    /* renamed from: com.moovit.gcm.condition.GcmMetroCondition$a */
    public class C15890a implements Parcelable.Creator<GcmMetroCondition> {
        public final Object createFromParcel(Parcel parcel) {
            return (GcmMetroCondition) C19612n.m46981v(parcel, GcmMetroCondition.f41502d);
        }

        public final Object[] newArray(int i) {
            return new GcmMetroCondition[i];
        }
    }

    /* renamed from: com.moovit.gcm.condition.GcmMetroCondition$b */
    public class C15891b extends C19621u<GcmMetroCondition> {
        public C15891b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            ServerId serverId = ((GcmMetroCondition) obj).f41503b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
        }
    }

    /* renamed from: com.moovit.gcm.condition.GcmMetroCondition$c */
    public class C15892c extends C19620t<GcmMetroCondition> {
        public C15892c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new GcmMetroCondition(new ServerId(pVar.mo51924l()));
        }
    }

    public GcmMetroCondition(ServerId serverId) {
        this.f41503b = serverId;
    }

    /* renamed from: d1 */
    public final boolean mo47939d1(Context context) {
        C19722a0 a0Var;
        if (UserContextLoader.m40004l(context) && (a0Var = (C19722a0) MoovitApplication.f37317k.f37321e.mo50695h("USER_CONTEXT", false)) != null && this.f41503b.equals(a0Var.f50160a.f32927c)) {
            return true;
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo47941i(Context context) {
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41501c);
    }
}
