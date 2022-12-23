package com.moovit.payment.clearance.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.clearance.ClearanceProviderType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p583jk.C17884p;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class ClearanceProviderInstructions implements Parcelable {
    public static final Parcelable.Creator<ClearanceProviderInstructions> CREATOR = new C16304a();

    /* renamed from: e */
    public static C16305b f42603e = new C16305b(ClearanceProviderInstructions.class);

    /* renamed from: b */
    public final String f42604b;

    /* renamed from: c */
    public final ClearanceProviderType f42605c;

    /* renamed from: d */
    public final Map<String, String> f42606d;

    /* renamed from: com.moovit.payment.clearance.model.ClearanceProviderInstructions$a */
    public class C16304a implements Parcelable.Creator<ClearanceProviderInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return (ClearanceProviderInstructions) C19612n.m46981v(parcel, ClearanceProviderInstructions.f42603e);
        }

        public final Object[] newArray(int i) {
            return new ClearanceProviderInstructions[i];
        }
    }

    /* renamed from: com.moovit.payment.clearance.model.ClearanceProviderInstructions$b */
    public class C16305b extends C19619s<ClearanceProviderInstructions> {
        public C16305b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            Map map;
            String p = pVar.mo51947p();
            ClearanceProviderType clearanceProviderType = (ClearanceProviderType) C13555b.m33968g(ClearanceProviderType.CODER, pVar);
            if (i >= 1) {
                C19589j.C19598i iVar = C19589j.f49779k;
                map = pVar.mo51961o(iVar, iVar, new HashMap());
            } else {
                map = Collections.emptyMap();
            }
            return new ClearanceProviderInstructions(p, clearanceProviderType, map);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ClearanceProviderInstructions clearanceProviderInstructions = (ClearanceProviderInstructions) obj;
            qVar.mo51954p(clearanceProviderInstructions.f42604b);
            ClearanceProviderType.CODER.write(clearanceProviderInstructions.f42605c, qVar);
            Map<String, String> map = clearanceProviderInstructions.f42606d;
            C19600l.C19609i iVar = C19600l.f49790t;
            qVar.mo51966o(map, iVar, iVar);
        }
    }

    public ClearanceProviderInstructions(String str, ClearanceProviderType clearanceProviderType, Map<String, String> map) {
        C21100e.m49373x(str, "serverKey");
        this.f42604b = str;
        C21100e.m49373x(clearanceProviderType, "type");
        this.f42605c = clearanceProviderType;
        C21100e.m49373x(map, "properties");
        this.f42606d = Collections.unmodifiableMap(map);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClearanceProviderInstructions)) {
            return false;
        }
        ClearanceProviderInstructions clearanceProviderInstructions = (ClearanceProviderInstructions) obj;
        if (!C20975x0.m49118e(this.f42604b, clearanceProviderInstructions.f42604b) || !this.f42605c.equals(clearanceProviderInstructions.f42605c) || !C20975x0.m49118e(this.f42606d, clearanceProviderInstructions.f42606d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f42604b), C17884p.m44335F(this.f42605c), C17884p.m44335F(this.f42606d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42603e);
    }
}
