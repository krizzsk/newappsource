package com.moovit.gcm.popup;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.MoovitActivity;
import com.moovit.gcm.condition.GcmCondition;
import com.moovit.gcm.condition.GcmTimePeriodCondition;
import com.moovit.gcm.notification.GcmNotification;
import com.moovit.gcm.payload.GcmPayload;
import f10.C16936g;
import java.io.IOException;
import k10.C17996b;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19620t;
import p810sz.C19621u;

public class RemotePopup extends GcmPopup {
    public static final Parcelable.Creator<RemotePopup> CREATOR = new C15987a();

    /* renamed from: g */
    public static final C15988b f41613g = new C15988b();

    /* renamed from: h */
    public static final C15989c f41614h = new C15989c(RemotePopup.class);

    /* renamed from: e */
    public final String f41615e;

    /* renamed from: f */
    public final String f41616f;

    /* renamed from: com.moovit.gcm.popup.RemotePopup$a */
    public class C15987a implements Parcelable.Creator<RemotePopup> {
        public final Object createFromParcel(Parcel parcel) {
            return (RemotePopup) C19612n.m46981v(parcel, RemotePopup.f41614h);
        }

        public final Object[] newArray(int i) {
            return new RemotePopup[i];
        }
    }

    /* renamed from: com.moovit.gcm.popup.RemotePopup$b */
    public class C15988b extends C19621u<RemotePopup> {
        public C15988b() {
            super(2);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            RemotePopup remotePopup = (RemotePopup) obj;
            GcmCondition gcmCondition = remotePopup.f41608b;
            C19617r rVar = C16936g.f43956c;
            qVar.getClass();
            rVar.write(gcmCondition, qVar);
            C16936g.f43954a.write(remotePopup.f41609c, qVar);
            qVar.mo51967q(remotePopup.f41610d, GcmNotification.f41517k);
            qVar.mo51955t(remotePopup.f41615e);
            qVar.mo51955t(remotePopup.f41616f);
        }
    }

    /* renamed from: com.moovit.gcm.popup.RemotePopup$c */
    public class C15989c extends C19620t<RemotePopup> {
        public C15989c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 2 || i == 1 || i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            if (i == 2) {
                C19617r rVar = C16936g.f43956c;
                pVar.getClass();
                return new RemotePopup((GcmCondition) rVar.read(pVar), (GcmPayload) C16936g.f43954a.read(pVar), (GcmNotification) pVar.mo51962q(GcmNotification.f41518l), pVar.mo51948t(), pVar.mo51948t());
            } else if (i == 1) {
                long m = pVar.mo51925m();
                long m2 = pVar.mo51925m();
                String t = pVar.mo51948t();
                String t2 = pVar.mo51948t();
                return new RemotePopup(new GcmTimePeriodCondition(m, m2), (GcmPayload) C16936g.f43954a.read(pVar), (GcmNotification) pVar.mo51962q(GcmNotification.f41518l), t, t2);
            } else {
                long m3 = pVar.mo51925m();
                long m4 = pVar.mo51925m();
                pVar.mo51948t();
                String t3 = pVar.mo51948t();
                String t4 = pVar.mo51948t();
                return new RemotePopup(new GcmTimePeriodCondition(m3, m4), (GcmPayload) C16936g.f43954a.read(pVar), (GcmNotification) pVar.mo51962q(GcmNotification.f41518l), t3, t4);
            }
        }
    }

    public RemotePopup(GcmCondition gcmCondition, GcmPayload gcmPayload, GcmNotification gcmNotification, String str, String str2) {
        super(gcmCondition, gcmPayload, gcmNotification);
        this.f41615e = str;
        this.f41616f = str2;
    }

    /* renamed from: c */
    public final boolean mo48118c() {
        return this.f41615e == null;
    }

    /* renamed from: d */
    public final void mo48119d(MoovitActivity moovitActivity) {
        int i = C17996b.f46078i;
        Bundle bundle = new Bundle();
        bundle.putParcelable("remote_popup", this);
        C17996b bVar = new C17996b();
        bVar.setArguments(bundle);
        bVar.show(moovitActivity.getSupportFragmentManager(), "popup_fragment_tag");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41613g);
    }
}
