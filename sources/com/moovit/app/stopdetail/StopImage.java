package com.moovit.app.stopdetail;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class StopImage implements Parcelable {
    public static final Parcelable.Creator<StopImage> CREATOR = new C15335a();

    /* renamed from: h */
    public static final C15336b f39694h = new C15336b();

    /* renamed from: i */
    public static final C15337c f39695i = new C15337c(StopImage.class);

    /* renamed from: b */
    public ServerId f39696b;

    /* renamed from: c */
    public String f39697c;

    /* renamed from: d */
    public int f39698d;

    /* renamed from: e */
    public int f39699e;

    /* renamed from: f */
    public long f39700f;

    /* renamed from: g */
    public String f39701g;

    /* renamed from: com.moovit.app.stopdetail.StopImage$a */
    public class C15335a implements Parcelable.Creator<StopImage> {
        public final Object createFromParcel(Parcel parcel) {
            return (StopImage) C19612n.m46981v(parcel, StopImage.f39695i);
        }

        public final Object[] newArray(int i) {
            return new StopImage[i];
        }
    }

    /* renamed from: com.moovit.app.stopdetail.StopImage$b */
    public class C15336b extends C19621u<StopImage> {
        public C15336b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            StopImage stopImage = (StopImage) obj;
            ServerId serverId = stopImage.f39696b;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            qVar.mo51955t(stopImage.f39697c);
            qVar.mo51939l(stopImage.f39698d);
            qVar.mo51939l(stopImage.f39699e);
            qVar.mo51940m(stopImage.f39700f);
            qVar.mo51955t(stopImage.f39701g);
        }
    }

    /* renamed from: com.moovit.app.stopdetail.StopImage$c */
    public class C15337c extends C19620t<StopImage> {
        public C15337c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            return new StopImage(serverId, pVar.mo51948t(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51925m(), pVar.mo51948t());
        }
    }

    public StopImage(ServerId serverId, String str, int i, int i2, long j, String str2) {
        this.f39696b = serverId;
        this.f39697c = str;
        this.f39698d = i;
        this.f39699e = i2;
        this.f39700f = j;
        this.f39701g = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.f39696b.f15142b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39694h);
    }
}
