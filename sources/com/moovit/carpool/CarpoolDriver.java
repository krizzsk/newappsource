package com.moovit.carpool;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.carpool.CarpoolCar;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p834tz.C19794a;

public class CarpoolDriver implements Parcelable {
    public static final Parcelable.Creator<CarpoolDriver> CREATOR = new C15700a();

    /* renamed from: s */
    public static final C15701b f40874s = new C15701b(CarpoolDriver.class);

    /* renamed from: b */
    public final String f40875b;

    /* renamed from: c */
    public final String f40876c;

    /* renamed from: d */
    public final String f40877d;

    /* renamed from: e */
    public final String f40878e;

    /* renamed from: f */
    public final CarpoolCar f40879f;

    /* renamed from: g */
    public final float f40880g;

    /* renamed from: h */
    public final Uri f40881h;

    /* renamed from: i */
    public final int f40882i;

    /* renamed from: j */
    public final String f40883j;

    /* renamed from: k */
    public final int f40884k;

    /* renamed from: l */
    public final int f40885l;

    /* renamed from: m */
    public final long f40886m;

    /* renamed from: n */
    public final int f40887n;

    /* renamed from: o */
    public final String f40888o;

    /* renamed from: p */
    public final CarpoolCompany f40889p;

    /* renamed from: q */
    public final boolean f40890q;

    /* renamed from: r */
    public final CarpoolConfirmationRate f40891r;

    /* renamed from: com.moovit.carpool.CarpoolDriver$a */
    public class C15700a implements Parcelable.Creator<CarpoolDriver> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolDriver) C19612n.m46981v(parcel, CarpoolDriver.f40874s);
        }

        public final Object[] newArray(int i) {
            return new CarpoolDriver[i];
        }
    }

    /* renamed from: com.moovit.carpool.CarpoolDriver$b */
    public class C15701b extends C19619s<CarpoolDriver> {
        public C15701b(Class cls) {
            super(5, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i <= 5;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19615p pVar2 = pVar;
            int i2 = i;
            if (i2 == 1) {
                return new CarpoolDriver(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), (CarpoolCar) CarpoolCar.f40863e.read(pVar2), pVar.mo51923j(), (Uri) pVar2.mo51962q(C19794a.f50326d), pVar.mo51924l(), pVar.mo51948t(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51925m(), pVar.mo51924l(), (String) null, (CarpoolCompany) null, false, (CarpoolConfirmationRate) null);
            } else if (i2 == 2) {
                return new CarpoolDriver(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), (CarpoolCar) CarpoolCar.f40863e.read(pVar2), pVar.mo51923j(), (Uri) pVar2.mo51962q(C19794a.f50326d), pVar.mo51924l(), pVar.mo51948t(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51925m(), pVar.mo51924l(), pVar.mo51948t(), (CarpoolCompany) null, false, (CarpoolConfirmationRate) null);
            } else if (i2 == 3) {
                return new CarpoolDriver(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), (CarpoolCar) CarpoolCar.f40863e.read(pVar2), pVar.mo51923j(), (Uri) pVar2.mo51962q(C19794a.f50326d), pVar.mo51924l(), pVar.mo51948t(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51925m(), pVar.mo51924l(), pVar.mo51948t(), (CarpoolCompany) pVar2.mo51962q(CarpoolCompany.f40867d), false, (CarpoolConfirmationRate) null);
            } else if (i2 == 4) {
                return new CarpoolDriver(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), (CarpoolCar) CarpoolCar.f40863e.read(pVar2), pVar.mo51923j(), (Uri) pVar2.mo51962q(C19794a.f50326d), pVar.mo51924l(), pVar.mo51948t(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51925m(), pVar.mo51924l(), pVar.mo51948t(), (CarpoolCompany) pVar2.mo51962q(CarpoolCompany.f40867d), pVar.mo51919b(), (CarpoolConfirmationRate) null);
            } else if (i2 != 5) {
                return new CarpoolDriver(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), (CarpoolCar) CarpoolCar.f40863e.read(pVar2), pVar.mo51923j(), (Uri) pVar2.mo51962q(C19794a.f50326d), pVar.mo51924l(), pVar.mo51948t(), 0, 0, 0, 0, (String) null, (CarpoolCompany) null, false, (CarpoolConfirmationRate) null);
            } else {
                return new CarpoolDriver(pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), (CarpoolCar) CarpoolCar.f40863e.read(pVar2), pVar.mo51923j(), (Uri) pVar2.mo51962q(C19794a.f50326d), pVar.mo51924l(), pVar.mo51948t(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51925m(), pVar.mo51924l(), pVar.mo51948t(), (CarpoolCompany) pVar2.mo51962q(CarpoolCompany.f40867d), pVar.mo51919b(), (CarpoolConfirmationRate) pVar2.mo51962q(CarpoolConfirmationRate.f40870e));
            }
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CarpoolDriver carpoolDriver = (CarpoolDriver) obj;
            qVar.mo51954p(carpoolDriver.f40875b);
            qVar.mo51954p(carpoolDriver.f40876c);
            qVar.mo51954p(carpoolDriver.f40877d);
            qVar.mo51955t(carpoolDriver.f40878e);
            CarpoolCar carpoolCar = carpoolDriver.f40879f;
            CarpoolCar.C15695b bVar = CarpoolCar.f40863e;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(carpoolCar, qVar);
            qVar.mo51938j(carpoolDriver.f40880g);
            qVar.mo51967q(carpoolDriver.f40881h, C19794a.f50326d);
            qVar.mo51939l(carpoolDriver.f40882i);
            qVar.mo51955t(carpoolDriver.f40883j);
            qVar.mo51939l(carpoolDriver.f40884k);
            qVar.mo51939l(carpoolDriver.f40887n);
            qVar.mo51939l(carpoolDriver.f40885l);
            qVar.mo51940m(carpoolDriver.f40886m);
            qVar.mo51955t(carpoolDriver.f40888o);
            qVar.mo51967q(carpoolDriver.f40889p, CarpoolCompany.f40867d);
            qVar.mo51934b(carpoolDriver.f40890q);
            qVar.mo51967q(carpoolDriver.f40891r, CarpoolConfirmationRate.f40870e);
        }
    }

    public CarpoolDriver(String str, String str2, String str3, String str4, CarpoolCar carpoolCar, float f, Uri uri, int i, String str5, int i2, int i3, long j, int i4, String str6, CarpoolCompany carpoolCompany, boolean z, CarpoolConfirmationRate carpoolConfirmationRate) {
        C21100e.m49373x(str, "id");
        this.f40875b = str;
        C21100e.m49373x(str2, "firstName");
        this.f40876c = str2;
        C21100e.m49373x(str3, "lastName");
        this.f40877d = str3;
        this.f40878e = str4;
        C21100e.m49373x(carpoolCar, "car");
        this.f40879f = carpoolCar;
        this.f40880g = f;
        this.f40881h = uri;
        this.f40882i = i;
        this.f40883j = str5;
        this.f40884k = i2;
        this.f40885l = i3;
        this.f40886m = j;
        this.f40887n = i4;
        this.f40888o = str6;
        this.f40889p = carpoolCompany;
        this.f40890q = z;
        this.f40891r = carpoolConfirmationRate;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40874s);
    }
}
