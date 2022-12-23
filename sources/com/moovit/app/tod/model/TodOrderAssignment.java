package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.tod.model.TodRideJourney;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.util.CurrencyAmount;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TodOrderAssignment implements Parcelable {
    public static final Parcelable.Creator<TodOrderAssignment> CREATOR = new C15505a();

    /* renamed from: n */
    public static final C15506b f40243n = new C15506b(TodOrderAssignment.class);

    /* renamed from: b */
    public final ServerId f40244b;

    /* renamed from: c */
    public final Image f40245c;

    /* renamed from: d */
    public final Image f40246d;

    /* renamed from: e */
    public final String f40247e;

    /* renamed from: f */
    public final long f40248f;

    /* renamed from: g */
    public final long f40249g;

    /* renamed from: h */
    public final TodRideJourney f40250h;

    /* renamed from: i */
    public final TodRideVehicle f40251i;

    /* renamed from: j */
    public final CurrencyAmount f40252j;

    /* renamed from: k */
    public final boolean f40253k;

    /* renamed from: l */
    public final long f40254l;

    /* renamed from: m */
    public final String f40255m;

    /* renamed from: com.moovit.app.tod.model.TodOrderAssignment$a */
    public class C15505a implements Parcelable.Creator<TodOrderAssignment> {
        public final Object createFromParcel(Parcel parcel) {
            return (TodOrderAssignment) C19612n.m46981v(parcel, TodOrderAssignment.f40243n);
        }

        public final Object[] newArray(int i) {
            return new TodOrderAssignment[i];
        }
    }

    /* renamed from: com.moovit.app.tod.model.TodOrderAssignment$b */
    public class C15506b extends C19619s<TodOrderAssignment> {
        public C15506b(Class cls) {
            super(7, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 7;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            Object obj;
            long j;
            String str;
            Image image;
            ServerId serverId;
            C19615p pVar2 = pVar;
            int i2 = i;
            Image image2 = (Image) pVar2.mo51962q(C16019d.m40803a().f41718d);
            String p = pVar.mo51947p();
            long m = pVar.mo51925m();
            long m2 = pVar.mo51925m();
            TodRideJourney todRideJourney = (TodRideJourney) TodRideJourney.f40283k.read(pVar2);
            TodRideVehicle todRideVehicle = (TodRideVehicle) pVar2.mo51962q(TodRideVehicle.f40301i);
            if (i2 >= 2) {
                obj = pVar2.mo51962q(CurrencyAmount.f23843f);
            } else {
                obj = CurrencyAmount.f23843f.read(pVar2);
            }
            CurrencyAmount currencyAmount = (CurrencyAmount) obj;
            boolean b = pVar.mo51919b();
            if (i2 >= 1) {
                j = pVar.mo51925m();
            } else {
                j = 0;
            }
            long j2 = j;
            if (3 <= i2 && i2 <= 5) {
                pVar.mo51919b();
            }
            if (i2 >= 4) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            if (i2 >= 5) {
                image = (Image) C16019d.m40803a().f41718d.read(pVar2);
            } else {
                image = null;
            }
            if (i2 >= 7) {
                serverId = new ServerId(pVar.mo51924l());
            } else {
                serverId = new ServerId(-1);
            }
            return new TodOrderAssignment(serverId, image2, image, p, m, m2, todRideJourney, todRideVehicle, currencyAmount, b, j2, str);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TodOrderAssignment todOrderAssignment = (TodOrderAssignment) obj;
            qVar.mo51967q(todOrderAssignment.f40245c, C16019d.m40803a().f41718d);
            qVar.mo51954p(todOrderAssignment.f40247e);
            qVar.mo51940m(todOrderAssignment.f40248f);
            qVar.mo51940m(todOrderAssignment.f40249g);
            TodRideJourney todRideJourney = todOrderAssignment.f40250h;
            TodRideJourney.C15512b bVar = TodRideJourney.f40283k;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(todRideJourney, qVar);
            qVar.mo51967q(todOrderAssignment.f40251i, TodRideVehicle.f40301i);
            qVar.mo51967q(todOrderAssignment.f40252j, CurrencyAmount.f23843f);
            qVar.mo51934b(todOrderAssignment.f40253k);
            qVar.mo51940m(todOrderAssignment.f40254l);
            qVar.mo51955t(todOrderAssignment.f40255m);
            C16019d.m40803a().f41718d.write(todOrderAssignment.f40246d, qVar);
            qVar.mo51939l(todOrderAssignment.f40244b.f15142b);
        }
    }

    public TodOrderAssignment(ServerId serverId, Image image, Image image2, String str, long j, long j2, TodRideJourney todRideJourney, TodRideVehicle todRideVehicle, CurrencyAmount currencyAmount, boolean z, long j3, String str2) {
        this.f40244b = serverId;
        C21100e.m49373x(image, "providerImage");
        this.f40245c = image;
        C21100e.m49373x(image2, "providerMapImage");
        this.f40246d = image2;
        C21100e.m49373x(str, "assignmentId");
        this.f40247e = str;
        this.f40248f = j;
        this.f40249g = j2;
        C21100e.m49373x(todRideJourney, "journey");
        this.f40250h = todRideJourney;
        this.f40251i = todRideVehicle;
        this.f40252j = currencyAmount;
        this.f40253k = z;
        this.f40254l = j3;
        this.f40255m = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40243n);
    }
}
