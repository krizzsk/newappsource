package com.moovit.payment.registration.steps.input;

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

public class InputInstructions implements Parcelable {
    public static final Parcelable.Creator<InputInstructions> CREATOR = new C16380a();

    /* renamed from: c */
    public static final C16381b f42813c = new C16381b(InputInstructions.class);

    /* renamed from: b */
    public final InputFieldsInstructions f42814b;

    /* renamed from: com.moovit.payment.registration.steps.input.InputInstructions$a */
    public class C16380a implements Parcelable.Creator<InputInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return (InputInstructions) C19612n.m46981v(parcel, InputInstructions.f42813c);
        }

        public final Object[] newArray(int i) {
            return new InputInstructions[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.input.InputInstructions$b */
    public class C16381b extends C19619s<InputInstructions> {
        public C16381b(Class cls) {
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
            return new InputInstructions((InputFieldsInstructions) bVar.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            InputFieldsInstructions inputFieldsInstructions = ((InputInstructions) obj).f42814b;
            InputFieldsInstructions.C16379b bVar = InputFieldsInstructions.f42803l;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(inputFieldsInstructions, qVar);
        }
    }

    public InputInstructions(InputFieldsInstructions inputFieldsInstructions) {
        C21100e.m49373x(inputFieldsInstructions, "inputFieldsInstructions");
        this.f42814b = inputFieldsInstructions;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42813c);
    }
}
