package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TodRideVehicle implements Parcelable {
    public static final Parcelable.Creator<TodRideVehicle> CREATOR = new C15515a();

    /* renamed from: i */
    public static final C15516b f40301i = new C15516b(TodRideVehicle.class);

    /* renamed from: b */
    public final String f40302b;

    /* renamed from: c */
    public final String f40303c;

    /* renamed from: d */
    public final int f40304d;

    /* renamed from: e */
    public final boolean f40305e;

    /* renamed from: f */
    public final String f40306f;

    /* renamed from: g */
    public final Image f40307g;

    /* renamed from: h */
    public final boolean f40308h;

    /* renamed from: com.moovit.app.tod.model.TodRideVehicle$a */
    public class C15515a implements Parcelable.Creator<TodRideVehicle> {
        public final Object createFromParcel(Parcel parcel) {
            return (TodRideVehicle) C19612n.m46981v(parcel, TodRideVehicle.f40301i);
        }

        public final Object[] newArray(int i) {
            return new TodRideVehicle[i];
        }
    }

    /* renamed from: com.moovit.app.tod.model.TodRideVehicle$b */
    public class C15516b extends C19619s<TodRideVehicle> {
        public C15516b(Class cls) {
            super(3, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 3;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String str;
            boolean z;
            Image image;
            String t = pVar.mo51948t();
            String t2 = pVar.mo51948t();
            int l = pVar.mo51924l();
            boolean b = pVar.mo51919b();
            if (i <= 2) {
                pVar.mo51919b();
            }
            if (i >= 1) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            if (i < 1 || !pVar.mo51919b()) {
                z = false;
            } else {
                z = true;
            }
            if (i >= 2) {
                image = (Image) pVar.mo51962q(C16019d.m40803a().f41718d);
            } else {
                image = null;
            }
            return new TodRideVehicle(t, t2, l, b, str, image, z);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TodRideVehicle todRideVehicle = (TodRideVehicle) obj;
            qVar.mo51955t(todRideVehicle.f40302b);
            qVar.mo51955t(todRideVehicle.f40303c);
            qVar.mo51939l(todRideVehicle.f40304d);
            qVar.mo51934b(todRideVehicle.f40305e);
            qVar.mo51955t(todRideVehicle.f40306f);
            qVar.mo51934b(todRideVehicle.f40308h);
            qVar.mo51967q(todRideVehicle.f40307g, C16019d.m40803a().f41718d);
        }
    }

    public TodRideVehicle(String str, String str2, int i, boolean z, String str3, Image image, boolean z2) {
        this.f40302b = str;
        this.f40303c = str2;
        this.f40304d = i;
        this.f40305e = z;
        this.f40306f = str3;
        this.f40307g = image;
        this.f40308h = z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40301i);
    }
}
