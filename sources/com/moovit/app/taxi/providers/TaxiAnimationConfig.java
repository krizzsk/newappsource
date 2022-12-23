package com.moovit.app.taxi.providers;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.animation.Animation;
import com.moovit.app.animation.AnimationPlayer;
import java.io.IOException;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TaxiAnimationConfig implements Parcelable {
    public static final Parcelable.Creator<TaxiAnimationConfig> CREATOR = new C15415a();

    /* renamed from: e */
    public static final C15416b f39918e = new C15416b(TaxiAnimationConfig.class);

    /* renamed from: b */
    public final String f39919b;

    /* renamed from: c */
    public final List<Animation> f39920c;

    /* renamed from: d */
    public final AnimationPlayer f39921d;

    /* renamed from: com.moovit.app.taxi.providers.TaxiAnimationConfig$a */
    public class C15415a implements Parcelable.Creator<TaxiAnimationConfig> {
        public final Object createFromParcel(Parcel parcel) {
            return (TaxiAnimationConfig) C19612n.m46981v(parcel, TaxiAnimationConfig.f39918e);
        }

        public final Object[] newArray(int i) {
            return new TaxiAnimationConfig[i];
        }
    }

    /* renamed from: com.moovit.app.taxi.providers.TaxiAnimationConfig$b */
    public class C15416b extends C19619s<TaxiAnimationConfig> {
        public C15416b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new TaxiAnimationConfig(pVar.mo51947p(), pVar.mo51959g(Animation.f37585d));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TaxiAnimationConfig taxiAnimationConfig = (TaxiAnimationConfig) obj;
            qVar.mo51954p(taxiAnimationConfig.f39919b);
            qVar.mo51965h(taxiAnimationConfig.f39920c, Animation.f37585d);
        }
    }

    public TaxiAnimationConfig(String str, List<Animation> list) {
        C21100e.m49373x(str, "baseUrl");
        this.f39919b = str;
        C21100e.m49373x(list, "title");
        this.f39920c = list;
        this.f39921d = new AnimationPlayer(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TaxiAnimationConfig{baseUrl='");
        C25541a.m63890u(k, this.f39919b, '\'', ", animations=");
        k.append(this.f39920c);
        k.append(", animationPlayer=");
        k.append(this.f39921d);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39918e);
    }
}
