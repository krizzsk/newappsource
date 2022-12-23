package com.moovit.app.mot.purchase.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MotQrCodeLinePrediction implements Parcelable {
    public static final Parcelable.Creator<MotQrCodeLinePrediction> CREATOR = new C15165a();

    /* renamed from: e */
    public static final C15166b f39057e = new C15166b(MotQrCodeLinePrediction.class);

    /* renamed from: b */
    public final ServerId f39058b;

    /* renamed from: c */
    public final ServerId f39059c;

    /* renamed from: d */
    public final double f39060d;

    /* renamed from: com.moovit.app.mot.purchase.model.MotQrCodeLinePrediction$a */
    public class C15165a implements Parcelable.Creator<MotQrCodeLinePrediction> {
        public final Object createFromParcel(Parcel parcel) {
            return (MotQrCodeLinePrediction) C19612n.m46981v(parcel, MotQrCodeLinePrediction.f39057e);
        }

        public final Object[] newArray(int i) {
            return new MotQrCodeLinePrediction[i];
        }
    }

    /* renamed from: com.moovit.app.mot.purchase.model.MotQrCodeLinePrediction$b */
    public class C15166b extends C19619s<MotQrCodeLinePrediction> {
        public C15166b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new MotQrCodeLinePrediction(new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()), pVar.mo51922i());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MotQrCodeLinePrediction motQrCodeLinePrediction = (MotQrCodeLinePrediction) obj;
            ServerId serverId = motQrCodeLinePrediction.f39058b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51939l(motQrCodeLinePrediction.f39059c.f15142b);
            qVar.mo51937i(motQrCodeLinePrediction.f39060d);
        }
    }

    public MotQrCodeLinePrediction(ServerId serverId, ServerId serverId2, double d) {
        this.f39058b = serverId;
        this.f39059c = serverId2;
        this.f39060d = d;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39057e);
    }
}
