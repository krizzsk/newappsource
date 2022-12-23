package com.moovit.payment.registration.steps.terms;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.utils.LinkedText;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TermsOfUseInstructions implements Parcelable {
    public static final Parcelable.Creator<TermsOfUseInstructions> CREATOR = new C16410a();

    /* renamed from: g */
    public static C16411b f42875g = new C16411b(TermsOfUseInstructions.class);

    /* renamed from: b */
    public final Image f42876b;

    /* renamed from: c */
    public final String f42877c;

    /* renamed from: d */
    public final String f42878d;

    /* renamed from: e */
    public LinkedText f42879e;

    /* renamed from: f */
    public int f42880f;

    /* renamed from: com.moovit.payment.registration.steps.terms.TermsOfUseInstructions$a */
    public class C16410a implements Parcelable.Creator<TermsOfUseInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return (TermsOfUseInstructions) C19612n.m46981v(parcel, TermsOfUseInstructions.f42875g);
        }

        public final Object[] newArray(int i) {
            return new TermsOfUseInstructions[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.terms.TermsOfUseInstructions$b */
    public class C16411b extends C19619s<TermsOfUseInstructions> {
        public C16411b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new TermsOfUseInstructions((Image) pVar.mo51962q(C16019d.m40803a().f41718d), pVar.mo51948t(), pVar.mo51948t(), (LinkedText) LinkedText.f41026d.read(pVar), pVar.mo51924l());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TermsOfUseInstructions termsOfUseInstructions = (TermsOfUseInstructions) obj;
            qVar.mo51967q(termsOfUseInstructions.f42876b, C16019d.m40803a().f41718d);
            qVar.mo51955t(termsOfUseInstructions.f42877c);
            qVar.mo51955t(termsOfUseInstructions.f42878d);
            LinkedText linkedText = termsOfUseInstructions.f42879e;
            LinkedText.C15774b bVar = LinkedText.f41026d;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(linkedText, qVar);
            qVar.mo51939l(termsOfUseInstructions.f42880f);
        }
    }

    public TermsOfUseInstructions(Image image, String str, String str2, LinkedText linkedText, int i) {
        this.f42876b = image;
        this.f42877c = str;
        this.f42878d = str2;
        C21100e.m49373x(linkedText, "termsOfUse");
        this.f42879e = linkedText;
        this.f42880f = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42875g);
    }
}
