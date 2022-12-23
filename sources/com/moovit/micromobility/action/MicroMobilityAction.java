package com.moovit.micromobility.action;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.micromobility.MicroMobilityConfirmationInfo;
import com.moovit.micromobility.action.requiredinfo.MicroMobilityRequiredInfo;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class MicroMobilityAction implements Parcelable {
    public static final Parcelable.Creator<MicroMobilityAction> CREATOR = new C4133a();

    /* renamed from: f */
    public static final C4134b f14843f = new C4134b(MicroMobilityAction.class);

    /* renamed from: b */
    public final String f14844b;

    /* renamed from: c */
    public final String f14845c;

    /* renamed from: d */
    public final MicroMobilityRequiredInfo f14846d;

    /* renamed from: e */
    public final MicroMobilityConfirmationInfo f14847e;

    /* renamed from: com.moovit.micromobility.action.MicroMobilityAction$a */
    public class C4133a implements Parcelable.Creator<MicroMobilityAction> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityAction) C19612n.m46981v(parcel, MicroMobilityAction.f14843f);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityAction[i];
        }
    }

    /* renamed from: com.moovit.micromobility.action.MicroMobilityAction$b */
    public class C4134b extends C19619s<MicroMobilityAction> {
        public C4134b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityAction(pVar.mo51947p(), pVar.mo51947p(), (MicroMobilityRequiredInfo) MicroMobilityRequiredInfo.f14854c0.read(pVar), (MicroMobilityConfirmationInfo) pVar.mo51962q(MicroMobilityConfirmationInfo.f14805g));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityAction microMobilityAction = (MicroMobilityAction) obj;
            qVar.mo51954p(microMobilityAction.f14844b);
            qVar.mo51954p(microMobilityAction.f14845c);
            MicroMobilityRequiredInfo.f14854c0.write(microMobilityAction.f14846d, qVar);
            qVar.mo51967q(microMobilityAction.f14847e, MicroMobilityConfirmationInfo.f14805g);
        }
    }

    public MicroMobilityAction(String str, String str2, MicroMobilityRequiredInfo microMobilityRequiredInfo, MicroMobilityConfirmationInfo microMobilityConfirmationInfo) {
        C21100e.m49373x(str, "actionId");
        this.f14844b = str;
        C21100e.m49373x(str2, "actionText");
        this.f14845c = str2;
        C21100e.m49373x(microMobilityRequiredInfo, "requiredInfo");
        this.f14846d = microMobilityRequiredInfo;
        this.f14847e = microMobilityConfirmationInfo;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroMobilityAction)) {
            return false;
        }
        MicroMobilityAction microMobilityAction = (MicroMobilityAction) obj;
        if (!this.f14844b.equals(microMobilityAction.f14844b) || !this.f14845c.equals(microMobilityAction.f14845c) || !this.f14846d.equals(microMobilityAction.f14846d) || !C20975x0.m49118e(this.f14847e, microMobilityAction.f14847e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f14844b), C17884p.m44335F(this.f14845c), C17884p.m44335F(this.f14846d), C17884p.m44335F(this.f14847e));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14843f);
    }
}
