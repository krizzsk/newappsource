package com.moovit.payment.registration.steps.email;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class EmailInstructions implements Parcelable {
    public static final Parcelable.Creator<EmailInstructions> CREATOR = new C16367a();

    /* renamed from: d */
    public static final C16368b f42781d = new C16368b(EmailInstructions.class);

    /* renamed from: b */
    public final String f42782b;

    /* renamed from: c */
    public final String f42783c;

    /* renamed from: com.moovit.payment.registration.steps.email.EmailInstructions$a */
    public class C16367a implements Parcelable.Creator<EmailInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return (EmailInstructions) C19612n.m46981v(parcel, EmailInstructions.f42781d);
        }

        public final Object[] newArray(int i) {
            return new EmailInstructions[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.email.EmailInstructions$b */
    public class C16368b extends C19619s<EmailInstructions> {
        public C16368b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new EmailInstructions(pVar.mo51947p(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            EmailInstructions emailInstructions = (EmailInstructions) obj;
            qVar.mo51954p(emailInstructions.f42782b);
            qVar.mo51954p(emailInstructions.f42783c);
        }
    }

    public EmailInstructions(String str, String str2) {
        C21100e.m49373x(str, "title");
        this.f42782b = str;
        C21100e.m49373x(str2, "subtitle");
        this.f42783c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42781d);
    }
}
