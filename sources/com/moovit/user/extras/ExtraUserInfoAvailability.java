package com.moovit.user.extras;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class ExtraUserInfoAvailability implements Parcelable {
    public static final Parcelable.Creator<ExtraUserInfoAvailability> CREATOR = new C7878a();

    /* renamed from: e */
    public static final C7879b f23838e = new C7879b(ExtraUserInfoAvailability.class);

    /* renamed from: b */
    public final boolean f23839b;

    /* renamed from: c */
    public final boolean f23840c;

    /* renamed from: d */
    public final boolean f23841d;

    /* renamed from: com.moovit.user.extras.ExtraUserInfoAvailability$a */
    public class C7878a implements Parcelable.Creator<ExtraUserInfoAvailability> {
        public final Object createFromParcel(Parcel parcel) {
            return (ExtraUserInfoAvailability) C19612n.m46981v(parcel, ExtraUserInfoAvailability.f23838e);
        }

        public final Object[] newArray(int i) {
            return new ExtraUserInfoAvailability[i];
        }
    }

    /* renamed from: com.moovit.user.extras.ExtraUserInfoAvailability$b */
    public class C7879b extends C19619s<ExtraUserInfoAvailability> {
        public C7879b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new ExtraUserInfoAvailability(pVar.mo51919b(), pVar.mo51919b(), pVar.mo51919b());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ExtraUserInfoAvailability extraUserInfoAvailability = (ExtraUserInfoAvailability) obj;
            qVar.mo51934b(extraUserInfoAvailability.f23839b);
            qVar.mo51934b(extraUserInfoAvailability.f23840c);
            qVar.mo51934b(extraUserInfoAvailability.f23841d);
        }
    }

    public ExtraUserInfoAvailability(boolean z, boolean z2, boolean z3) {
        this.f23839b = z;
        this.f23840c = z2;
        this.f23841d = z3;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23838e);
    }
}
