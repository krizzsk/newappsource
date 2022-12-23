package com.moovit.micromobility.action.requiredinfo;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.barcode.BarcodeFormat;
import com.moovit.barcode.scan.BarcodeScannerActivity;
import com.moovit.image.model.Image;
import com.moovit.micromobility.action.MicroMobilityAction;
import com.moovit.micromobility.action.requiredinfo.MicroMobilityRequiredInfo;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.Collections;
import m30.C5679b;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class MicroMobilityQrCodeRequiredInfo implements MicroMobilityRequiredInfo {
    public static final Parcelable.Creator<MicroMobilityQrCodeRequiredInfo> CREATOR = new C4139a();

    /* renamed from: d */
    public static final C4140b f14850d = new C4140b(MicroMobilityQrCodeRequiredInfo.class);

    /* renamed from: b */
    public final String f14851b;

    /* renamed from: c */
    public final String f14852c;

    /* renamed from: com.moovit.micromobility.action.requiredinfo.MicroMobilityQrCodeRequiredInfo$a */
    public class C4139a implements Parcelable.Creator<MicroMobilityQrCodeRequiredInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (MicroMobilityQrCodeRequiredInfo) C19612n.m46981v(parcel, MicroMobilityQrCodeRequiredInfo.f14850d);
        }

        public final Object[] newArray(int i) {
            return new MicroMobilityQrCodeRequiredInfo[i];
        }
    }

    /* renamed from: com.moovit.micromobility.action.requiredinfo.MicroMobilityQrCodeRequiredInfo$b */
    public class C4140b extends C19619s<MicroMobilityQrCodeRequiredInfo> {
        public C4140b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MicroMobilityQrCodeRequiredInfo(pVar.mo51948t(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MicroMobilityQrCodeRequiredInfo microMobilityQrCodeRequiredInfo = (MicroMobilityQrCodeRequiredInfo) obj;
            qVar.mo51955t(microMobilityQrCodeRequiredInfo.f14851b);
            qVar.mo51955t(microMobilityQrCodeRequiredInfo.f14852c);
        }
    }

    public MicroMobilityQrCodeRequiredInfo(String str, String str2) {
        this.f14851b = str;
        this.f14852c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e1 */
    public final void mo19450e1(ServerId serverId, MicroMobilityAction microMobilityAction, MicroMobilityRequiredInfo.C4143a aVar) {
        C5679b bVar = (C5679b) aVar;
        bVar.startActivityForResult(BarcodeScannerActivity.m40033y2(bVar.requireContext(), Collections.singleton(BarcodeFormat.QR_CODE), this.f14851b, (String) null, (Image) null, this.f14852c), 1001);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroMobilityQrCodeRequiredInfo)) {
            return false;
        }
        MicroMobilityQrCodeRequiredInfo microMobilityQrCodeRequiredInfo = (MicroMobilityQrCodeRequiredInfo) obj;
        if (!C20975x0.m49118e(this.f14851b, microMobilityQrCodeRequiredInfo.f14851b) || !C20975x0.m49118e(this.f14852c, microMobilityQrCodeRequiredInfo.f14852c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(getClass()), C17884p.m44335F(this.f14851b), C17884p.m44335F(this.f14852c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f14850d);
    }
}
