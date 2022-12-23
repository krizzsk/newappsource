package com.moovit.payment.registration.steps.external;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.registration.steps.input.InputFieldsInstructions;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class ExternalAccountInstructions implements Parcelable {
    public static final Parcelable.Creator<ExternalAccountInstructions> CREATOR = new C16369a();

    /* renamed from: c */
    public static final C16370b f42784c = new C16370b(ExternalAccountInstructions.class);

    /* renamed from: b */
    public final InputFieldsInstructions f42785b;

    /* renamed from: com.moovit.payment.registration.steps.external.ExternalAccountInstructions$a */
    public class C16369a implements Parcelable.Creator<ExternalAccountInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return (ExternalAccountInstructions) C19612n.m46981v(parcel, ExternalAccountInstructions.f42784c);
        }

        public final Object[] newArray(int i) {
            return new ExternalAccountInstructions[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.external.ExternalAccountInstructions$b */
    public class C16370b extends C19619s<ExternalAccountInstructions> {
        public C16370b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            InputFieldsInstructions.C16379b bVar = InputFieldsInstructions.f42803l;
            pVar.getClass();
            return new ExternalAccountInstructions((InputFieldsInstructions) bVar.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            InputFieldsInstructions inputFieldsInstructions = ((ExternalAccountInstructions) obj).f42785b;
            InputFieldsInstructions.C16379b bVar = InputFieldsInstructions.f42803l;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(inputFieldsInstructions, qVar);
        }
    }

    public ExternalAccountInstructions(InputFieldsInstructions inputFieldsInstructions) {
        C21100e.m49373x(inputFieldsInstructions, "loginInstructions");
        this.f42785b = inputFieldsInstructions;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42784c);
    }
}
