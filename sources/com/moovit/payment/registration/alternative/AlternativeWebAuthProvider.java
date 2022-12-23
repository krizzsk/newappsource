package com.moovit.payment.registration.alternative;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.registration.alternative.AlternativeAuthProvider;
import r60.C19243h;
import r60.C19244i;

public class AlternativeWebAuthProvider extends AlternativeAuthProvider {
    public static final Parcelable.Creator<AlternativeWebAuthProvider> CREATOR = new C16362a();

    /* renamed from: b */
    public final String f42770b;

    /* renamed from: c */
    public final String f42771c;

    /* renamed from: com.moovit.payment.registration.alternative.AlternativeWebAuthProvider$a */
    public class C16362a implements Parcelable.Creator<AlternativeWebAuthProvider> {
        public final Object createFromParcel(Parcel parcel) {
            return new AlternativeWebAuthProvider(parcel);
        }

        public final Object[] newArray(int i) {
            return new AlternativeWebAuthProvider[i];
        }
    }

    public AlternativeWebAuthProvider(String str, String str2) {
        C21100e.m49373x(str, "url");
        this.f42770b = str;
        C21100e.m49373x(str2, "redirectUrl");
        this.f42771c = str2;
    }

    /* renamed from: b */
    public final void mo49026b(AlternativeAuthProvider.C16361a aVar) {
        C19243h hVar = (C19243h) aVar;
        String str = hVar.mo50500p2().f42758b;
        Bundle bundle = new Bundle();
        C21100e.m49373x(str, "paymentContext");
        bundle.putString("paymentContext", str);
        bundle.putParcelable("provider", this);
        C19244i iVar = new C19244i();
        iVar.setArguments(bundle);
        hVar.mo51660y2(iVar);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42770b);
        parcel.writeString(this.f42771c);
    }

    public AlternativeWebAuthProvider(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "url");
        this.f42770b = readString;
        String readString2 = parcel.readString();
        C21100e.m49373x(readString2, "redirectUrl");
        this.f42771c = readString2;
    }
}
