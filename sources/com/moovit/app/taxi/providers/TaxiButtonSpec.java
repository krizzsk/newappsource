package com.moovit.app.taxi.providers;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.MessageButton;
import com.moovit.commons.utils.Color;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20937f;
import p977zz.C20939g;

public class TaxiButtonSpec implements Parcelable {
    public static final Parcelable.Creator<TaxiButtonSpec> CREATOR = new C15419a();

    /* renamed from: e */
    public static final C15420b f39927e = new C15420b(TaxiButtonSpec.class);

    /* renamed from: b */
    public final String f39928b;

    /* renamed from: c */
    public final Color f39929c;

    /* renamed from: d */
    public final Color f39930d;

    /* renamed from: com.moovit.app.taxi.providers.TaxiButtonSpec$a */
    public class C15419a implements Parcelable.Creator<TaxiButtonSpec> {
        public final Object createFromParcel(Parcel parcel) {
            return (TaxiButtonSpec) C19612n.m46981v(parcel, TaxiButtonSpec.f39927e);
        }

        public final Object[] newArray(int i) {
            return new TaxiButtonSpec[i];
        }
    }

    /* renamed from: com.moovit.app.taxi.providers.TaxiButtonSpec$b */
    public class C15420b extends C19619s<TaxiButtonSpec> {
        public C15420b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String p = pVar.mo51947p();
            C20939g gVar = Color.f41006j;
            return new TaxiButtonSpec(p, (Color) gVar.read(pVar), (Color) gVar.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TaxiButtonSpec taxiButtonSpec = (TaxiButtonSpec) obj;
            qVar.mo51954p(taxiButtonSpec.f39928b);
            Color color = taxiButtonSpec.f39929c;
            C20937f fVar = Color.f41005i;
            fVar.write(color, qVar);
            fVar.write(taxiButtonSpec.f39930d, qVar);
        }
    }

    public TaxiButtonSpec(String str, Color color, Color color2) {
        C21100e.m49373x(str, MessageButton.TEXT);
        this.f39928b = str;
        this.f39929c = color;
        this.f39930d = color2;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TaxiButtonSpec{text='");
        C25541a.m63890u(k, this.f39928b, '\'', ", textColor=");
        k.append(this.f39929c);
        k.append(", backgroundColor=");
        k.append(this.f39930d);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39927e);
    }
}
