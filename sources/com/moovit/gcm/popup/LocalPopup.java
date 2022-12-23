package com.moovit.gcm.popup;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.MoovitActivity;
import com.moovit.gcm.condition.GcmCondition;
import com.moovit.gcm.condition.GcmTimePeriodCondition;
import com.moovit.gcm.notification.GcmNotification;
import com.moovit.gcm.payload.GcmPayload;
import f10.C16930a;
import f10.C16936g;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19620t;
import p810sz.C19621u;

public class LocalPopup extends GcmPopup {
    public static final Parcelable.Creator<LocalPopup> CREATOR = new C15984a();

    /* renamed from: e */
    public static final C15985b f41611e = new C15985b();

    /* renamed from: f */
    public static final C15986c f41612f = new C15986c(LocalPopup.class);

    /* renamed from: com.moovit.gcm.popup.LocalPopup$a */
    public class C15984a implements Parcelable.Creator<LocalPopup> {
        public final Object createFromParcel(Parcel parcel) {
            return (LocalPopup) C19612n.m46981v(parcel, LocalPopup.f41612f);
        }

        public final Object[] newArray(int i) {
            return new LocalPopup[i];
        }
    }

    /* renamed from: com.moovit.gcm.popup.LocalPopup$b */
    public class C15985b extends C19621u<LocalPopup> {
        public C15985b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            LocalPopup localPopup = (LocalPopup) obj;
            GcmCondition gcmCondition = localPopup.f41608b;
            C19617r rVar = C16936g.f43956c;
            qVar.getClass();
            rVar.write(gcmCondition, qVar);
            C16936g.f43954a.write(localPopup.f41609c, qVar);
            qVar.mo51967q(localPopup.f41610d, GcmNotification.f41517k);
        }
    }

    /* renamed from: com.moovit.gcm.popup.LocalPopup$c */
    public class C15986c extends C19620t<LocalPopup> {
        public C15986c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 1 || i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            if (i == 1) {
                C19617r rVar = C16936g.f43956c;
                pVar.getClass();
                return new LocalPopup((GcmCondition) rVar.read(pVar), (GcmPayload) C16936g.f43954a.read(pVar), (GcmNotification) pVar.mo51962q(GcmNotification.f41518l));
            }
            return new LocalPopup(new GcmTimePeriodCondition(pVar.mo51925m(), pVar.mo51925m()), (GcmPayload) C16936g.f43954a.read(pVar), (GcmNotification) pVar.mo51962q(GcmNotification.f41518l));
        }
    }

    public LocalPopup(GcmCondition gcmCondition, GcmPayload gcmPayload, GcmNotification gcmNotification) {
        super(gcmCondition, gcmPayload, gcmNotification);
    }

    /* renamed from: d */
    public final void mo48119d(MoovitActivity moovitActivity) {
        GcmPayload.C15923a<Void> e = C16930a.m42749a().mo49554e(moovitActivity);
        if (e != null) {
            this.f41609c.mo47976b(e);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41611e);
    }
}
