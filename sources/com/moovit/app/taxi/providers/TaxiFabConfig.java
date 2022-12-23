package com.moovit.app.taxi.providers;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.utils.Color;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19619s;

public class TaxiFabConfig implements Parcelable {
    public static final Parcelable.Creator<TaxiFabConfig> CREATOR = new C15425a();

    /* renamed from: f */
    public static final C15426b f39938f = new C15426b(TaxiFabConfig.class);

    /* renamed from: b */
    public final List<TaxiFabPage> f39939b;

    /* renamed from: c */
    public final TaxiVisibility f39940c;

    /* renamed from: d */
    public final boolean f39941d;

    /* renamed from: e */
    public final Image f39942e;

    public static class TaxiFabPage implements Parcelable {
        public static final Parcelable.Creator<TaxiFabPage> CREATOR = new C15423a();

        /* renamed from: e */
        public static final C15424b f39943e = new C15424b(TaxiFabPage.class);

        /* renamed from: b */
        public final Image f39944b;

        /* renamed from: c */
        public final String f39945c;

        /* renamed from: d */
        public final Color f39946d;

        /* renamed from: com.moovit.app.taxi.providers.TaxiFabConfig$TaxiFabPage$a */
        public class C15423a implements Parcelable.Creator<TaxiFabPage> {
            public final Object createFromParcel(Parcel parcel) {
                return (TaxiFabPage) C19612n.m46981v(parcel, TaxiFabPage.f39943e);
            }

            public final Object[] newArray(int i) {
                return new TaxiFabPage[i];
            }
        }

        /* renamed from: com.moovit.app.taxi.providers.TaxiFabConfig$TaxiFabPage$b */
        public class C15424b extends C19619s<TaxiFabPage> {
            public C15424b(Class cls) {
                super(0, cls);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                C19617r rVar = C16019d.m40803a().f41718d;
                pVar.getClass();
                return new TaxiFabPage((Image) rVar.read(pVar), pVar.mo51948t(), (Color) Color.f41006j.read(pVar));
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                TaxiFabPage taxiFabPage = (TaxiFabPage) obj;
                Image image = taxiFabPage.f39944b;
                C19617r rVar = C16019d.m40803a().f41718d;
                qVar.getClass();
                rVar.write(image, qVar);
                qVar.mo51955t(taxiFabPage.f39945c);
                Color.f41005i.write(taxiFabPage.f39946d, qVar);
            }
        }

        public TaxiFabPage(Image image, String str, Color color) {
            C21100e.m49373x(image, "backgroundImage");
            this.f39944b = image;
            this.f39945c = str;
            C21100e.m49373x(color, "textColor");
            this.f39946d = color;
        }

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("TaxiFabPage{backgroundImage=");
            k.append(this.f39944b);
            k.append(", text='");
            C25541a.m63890u(k, this.f39945c, '\'', ", textColor=");
            k.append(this.f39946d);
            k.append('}');
            return k.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, f39943e);
        }
    }

    /* renamed from: com.moovit.app.taxi.providers.TaxiFabConfig$a */
    public class C15425a implements Parcelable.Creator<TaxiFabConfig> {
        public final Object createFromParcel(Parcel parcel) {
            return (TaxiFabConfig) C19612n.m46981v(parcel, TaxiFabConfig.f39938f);
        }

        public final Object[] newArray(int i) {
            return new TaxiFabConfig[i];
        }
    }

    /* renamed from: com.moovit.app.taxi.providers.TaxiFabConfig$b */
    public class C15426b extends C19619s<TaxiFabConfig> {
        public C15426b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new TaxiFabConfig(pVar.mo51959g(TaxiFabPage.f39943e), (TaxiVisibility) C13555b.m33968g(TaxiVisibility.CODER, pVar), pVar.mo51919b(), (Image) pVar.mo51962q(C16019d.m40803a().f41718d));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TaxiFabConfig taxiFabConfig = (TaxiFabConfig) obj;
            qVar.mo51965h(taxiFabConfig.f39939b, TaxiFabPage.f39943e);
            TaxiVisibility.CODER.write(taxiFabConfig.f39940c, qVar);
            qVar.mo51934b(taxiFabConfig.f39941d);
            qVar.mo51967q(taxiFabConfig.f39942e, C16019d.m40803a().f41718d);
        }
    }

    public TaxiFabConfig(ArrayList arrayList, TaxiVisibility taxiVisibility, boolean z, Image image) {
        C21100e.m49373x(arrayList, "pages");
        this.f39939b = Collections.unmodifiableList(arrayList);
        C21100e.m49373x(taxiVisibility, "visibility");
        this.f39940c = taxiVisibility;
        this.f39941d = z;
        this.f39942e = image;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TaxiFabConfig{pages=");
        k.append(this.f39939b);
        k.append(", visibility=");
        k.append(this.f39940c);
        k.append(", isRealTimeEtaSupported=");
        k.append(this.f39941d);
        k.append(", realTimeBackgroundImage=");
        k.append(this.f39942e);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39938f);
    }
}
