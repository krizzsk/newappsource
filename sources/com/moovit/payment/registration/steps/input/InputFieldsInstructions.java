package com.moovit.payment.registration.steps.input;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.inputfields.InputField;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20942h0;
import p977zz.C20944i0;

public class InputFieldsInstructions implements Parcelable {
    public static final Parcelable.Creator<InputFieldsInstructions> CREATOR = new C16378a();

    /* renamed from: k */
    public static final C20942h0 f42802k;

    /* renamed from: l */
    public static final C16379b f42803l = new C16379b(InputFieldsInstructions.class);

    /* renamed from: b */
    public final String f42804b;

    /* renamed from: c */
    public final String f42805c;

    /* renamed from: d */
    public final Image f42806d;

    /* renamed from: e */
    public final String f42807e;

    /* renamed from: f */
    public final String f42808f;

    /* renamed from: g */
    public final List<InputField> f42809g;

    /* renamed from: h */
    public final C20944i0<String, String> f42810h;

    /* renamed from: i */
    public final C20944i0<String, String> f42811i;

    /* renamed from: j */
    public final String f42812j;

    /* renamed from: com.moovit.payment.registration.steps.input.InputFieldsInstructions$a */
    public class C16378a implements Parcelable.Creator<InputFieldsInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return (InputFieldsInstructions) C19612n.m46981v(parcel, InputFieldsInstructions.f42803l);
        }

        public final Object[] newArray(int i) {
            return new InputFieldsInstructions[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.input.InputFieldsInstructions$b */
    public class C16379b extends C19619s<InputFieldsInstructions> {
        public C16379b(Class cls) {
            super(2, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 2;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C20944i0 i0Var;
            C20944i0 i0Var2;
            String str;
            String p = pVar.mo51947p();
            String p2 = pVar.mo51947p();
            Image image = (Image) pVar.mo51962q(C16019d.m40803a().f41718d);
            String t = pVar.mo51948t();
            String t2 = pVar.mo51948t();
            ArrayList g = pVar.mo51959g(InputField.f41828i);
            if (i >= 1) {
                i0Var = (C20944i0) pVar.mo51962q(InputFieldsInstructions.f42802k);
            } else {
                i0Var = null;
            }
            if (i >= 1) {
                i0Var2 = (C20944i0) pVar.mo51962q(InputFieldsInstructions.f42802k);
            } else {
                i0Var2 = null;
            }
            if (i >= 2) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            return new InputFieldsInstructions(p, p2, image, t, t2, g, i0Var, i0Var2, str);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            InputFieldsInstructions inputFieldsInstructions = (InputFieldsInstructions) obj;
            qVar.mo51954p(inputFieldsInstructions.f42804b);
            qVar.mo51954p(inputFieldsInstructions.f42805c);
            qVar.mo51967q(inputFieldsInstructions.f42806d, C16019d.m40803a().f41718d);
            qVar.mo51955t(inputFieldsInstructions.f42807e);
            qVar.mo51955t(inputFieldsInstructions.f42808f);
            qVar.mo51965h(inputFieldsInstructions.f42809g, InputField.f41828i);
            C20944i0<String, String> i0Var = inputFieldsInstructions.f42810h;
            C20942h0 h0Var = InputFieldsInstructions.f42802k;
            qVar.mo51967q(i0Var, h0Var);
            qVar.mo51967q(inputFieldsInstructions.f42811i, h0Var);
            qVar.mo51955t(inputFieldsInstructions.f42812j);
        }
    }

    static {
        C19584i.C19588d dVar = C19584i.f49770b;
        f42802k = new C20942h0(dVar, dVar, dVar, dVar);
    }

    public InputFieldsInstructions(String str, String str2, Image image, String str3, String str4, ArrayList arrayList, C20944i0 i0Var, C20944i0 i0Var2, String str5) {
        C21100e.m49373x(str, "paymentContext");
        this.f42804b = str;
        C21100e.m49373x(str2, "id");
        this.f42805c = str2;
        this.f42806d = image;
        this.f42807e = str3;
        this.f42808f = str4;
        C21100e.m49373x(arrayList, "inputFields");
        this.f42809g = Collections.unmodifiableList(arrayList);
        this.f42810h = i0Var;
        this.f42811i = i0Var2;
        this.f42812j = str5;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42803l);
    }
}
