package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.moovit.app.animation.AnimationPlayer;
import com.moovit.app.tod.model.TodRideJourney;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TodRide implements Parcelable {
    public static final Parcelable.Creator<TodRide> CREATOR = new C15509a();

    /* renamed from: u */
    public static final C15510b f40263u = new C15510b(TodRide.class);

    /* renamed from: b */
    public final String f40264b;

    /* renamed from: c */
    public final long f40265c;

    /* renamed from: d */
    public final TodRideStatus f40266d;

    /* renamed from: e */
    public final TodRideJourney f40267e;

    /* renamed from: f */
    public final TodRideVehicle f40268f;

    /* renamed from: g */
    public final CurrencyAmount f40269g;

    /* renamed from: h */
    public final String f40270h;

    /* renamed from: i */
    public final int f40271i;

    /* renamed from: j */
    public final boolean f40272j;

    /* renamed from: k */
    public final String f40273k;

    /* renamed from: l */
    public final Image f40274l;

    /* renamed from: m */
    public final Image f40275m;

    /* renamed from: n */
    public final Integer f40276n;

    /* renamed from: o */
    public final boolean f40277o;

    /* renamed from: p */
    public final long f40278p;

    /* renamed from: q */
    public final boolean f40279q;

    /* renamed from: r */
    public final AnimationPlayer f40280r;

    /* renamed from: s */
    public final boolean f40281s;

    /* renamed from: t */
    public final long f40282t;

    /* renamed from: com.moovit.app.tod.model.TodRide$a */
    public class C15509a implements Parcelable.Creator<TodRide> {
        public final Object createFromParcel(Parcel parcel) {
            return (TodRide) C19612n.m46981v(parcel, TodRide.f40263u);
        }

        public final Object[] newArray(int i) {
            return new TodRide[i];
        }
    }

    /* renamed from: com.moovit.app.tod.model.TodRide$b */
    public class C15510b extends C19619s<TodRide> {
        public C15510b(Class cls) {
            super(8, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 8;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            Object obj;
            boolean z;
            long j;
            boolean z2;
            AnimationPlayer animationPlayer;
            Integer num;
            Image image;
            boolean z3;
            long j2;
            boolean z4;
            int i2;
            C19615p pVar2 = pVar;
            int i3 = i;
            String p = pVar.mo51947p();
            long m = pVar.mo51925m();
            TodRideStatus todRideStatus = (TodRideStatus) C13555b.m33968g(TodRideStatus.CODER, pVar2);
            TodRideJourney todRideJourney = (TodRideJourney) TodRideJourney.f40283k.read(pVar2);
            TodRideVehicle todRideVehicle = (TodRideVehicle) pVar2.mo51962q(TodRideVehicle.f40301i);
            if (i3 >= 3) {
                obj = pVar2.mo51962q(CurrencyAmount.f23843f);
            } else {
                obj = CurrencyAmount.f23843f.read(pVar2);
            }
            CurrencyAmount currencyAmount = (CurrencyAmount) obj;
            String t = pVar.mo51948t();
            int l = pVar.mo51924l();
            boolean b = pVar.mo51919b();
            String t2 = pVar.mo51948t();
            Image image2 = (Image) C16019d.m40803a().f41718d.read(pVar2);
            Integer num2 = null;
            if (i3 >= 1 && !(!pVar.mo51919b())) {
                num2 = Integer.valueOf(pVar.mo51924l());
            }
            if (i3 < 1 || !pVar.mo51919b()) {
                z = false;
            } else {
                z = true;
            }
            if (i3 >= 2) {
                j = pVar.mo51925m();
            } else {
                j = 0;
            }
            if (i3 < 4 || pVar.mo51919b()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i3 >= 5) {
                animationPlayer = (AnimationPlayer) AnimationPlayer.f37588c.read(pVar2);
            } else {
                animationPlayer = AnimationPlayer.f37589d;
            }
            AnimationPlayer animationPlayer2 = animationPlayer;
            if (i3 >= 6) {
                image = (Image) C16019d.m40803a().f41718d.read(pVar2);
                num = num2;
            } else {
                if (todRideVehicle == null || !todRideVehicle.f40308h) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4) {
                    i2 = R.drawable.img_map_autonomous_vehicle;
                } else {
                    i2 = R.drawable.img_map_vehicle;
                }
                num = num2;
                image = new ResourceImage(i2, new String[0]);
            }
            if (i3 < 7 || !pVar.mo51919b()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i3 >= 8) {
                j2 = pVar.mo51925m();
            } else {
                j2 = -1;
            }
            return new TodRide(p, m, todRideStatus, todRideJourney, todRideVehicle, currencyAmount, t, l, b, t2, image2, image, num, z, j, z2, animationPlayer2, z3, j2);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TodRide todRide = (TodRide) obj;
            qVar.mo51954p(todRide.f40264b);
            qVar.mo51940m(todRide.f40265c);
            TodRideStatus.CODER.write(todRide.f40266d, qVar);
            TodRideJourney todRideJourney = todRide.f40267e;
            TodRideJourney.C15512b bVar = TodRideJourney.f40283k;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(todRideJourney, qVar);
            qVar.mo51967q(todRide.f40268f, TodRideVehicle.f40301i);
            qVar.mo51967q(todRide.f40269g, CurrencyAmount.f23843f);
            qVar.mo51955t(todRide.f40270h);
            qVar.mo51939l(todRide.f40271i);
            qVar.mo51934b(todRide.f40272j);
            qVar.mo51955t(todRide.f40273k);
            C16019d.m40803a().f41718d.write(todRide.f40274l, qVar);
            Integer num = todRide.f40276n;
            if (num == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(num.intValue());
            }
            qVar.mo51934b(todRide.f40277o);
            qVar.mo51940m(todRide.f40278p);
            qVar.mo51934b(todRide.f40279q);
            AnimationPlayer animationPlayer = todRide.f40280r;
            AnimationPlayer.C14771b bVar2 = AnimationPlayer.f37588c;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(animationPlayer, qVar);
            C16019d.m40803a().f41718d.write(todRide.f40275m, qVar);
            qVar.mo51934b(todRide.f40281s);
            qVar.mo51940m(todRide.f40282t);
        }
    }

    public TodRide(String str, long j, TodRideStatus todRideStatus, TodRideJourney todRideJourney, TodRideVehicle todRideVehicle, CurrencyAmount currencyAmount, String str2, int i, boolean z, String str3, Image image, Image image2, Integer num, boolean z2, long j2, boolean z3, AnimationPlayer animationPlayer, boolean z4, long j3) {
        Image image3 = image;
        Image image4 = image2;
        C21100e.m49373x(str, "rideId");
        this.f40264b = str;
        this.f40265c = j;
        C21100e.m49373x(todRideStatus, ServerParameters.STATUS);
        this.f40266d = todRideStatus;
        C21100e.m49373x(todRideJourney, "journey");
        this.f40267e = todRideJourney;
        this.f40268f = todRideVehicle;
        this.f40269g = currencyAmount;
        this.f40270h = str2;
        this.f40271i = i;
        this.f40272j = z;
        this.f40273k = str3;
        C21100e.m49373x(image3, "providerIcon");
        this.f40274l = image3;
        C21100e.m49373x(image4, "providerMapIcon");
        this.f40275m = image4;
        this.f40276n = num;
        this.f40277o = z2;
        this.f40278p = j2;
        this.f40279q = z3;
        this.f40280r = animationPlayer;
        this.f40281s = z4;
        this.f40282t = j3;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodRide{rideId='");
        C25541a.m63890u(k, this.f40264b, '\'', ", orderTime=");
        k.append(this.f40265c);
        k.append(", status=");
        k.append(this.f40266d);
        k.append(", journey=");
        k.append(this.f40267e);
        k.append(", vehicle=");
        k.append(this.f40268f);
        k.append(", price=");
        k.append(this.f40269g);
        k.append(", supportPhoneNumber='");
        C25541a.m63890u(k, this.f40270h, '\'', ", numOfPassengers=");
        k.append(this.f40271i);
        k.append(", isAccessible=");
        k.append(this.f40272j);
        k.append(", providerName='");
        C25541a.m63890u(k, this.f40273k, '\'', ", providerIcon=");
        k.append(this.f40274l);
        k.append(", providerMapIcon=");
        k.append(this.f40275m);
        k.append(", rating=");
        k.append(this.f40276n);
        k.append(", ratable=");
        k.append(this.f40277o);
        k.append(", reservationLockTime=");
        k.append(this.f40278p);
        k.append(", isReservation=");
        k.append(this.f40279q);
        k.append(", animationPlayer=");
        k.append(this.f40280r);
        k.append(", hasPaymentIssue=");
        k.append(this.f40281s);
        k.append(", dropOffTime=");
        k.append(this.f40282t);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40263u);
    }
}
