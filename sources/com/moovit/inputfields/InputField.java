package com.moovit.inputfields;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class InputField implements Parcelable {
    public static final Parcelable.Creator<InputField> CREATOR = new C16064a();

    /* renamed from: i */
    public static final C16065b f41828i = new C16065b(InputField.class);

    /* renamed from: b */
    public final String f41829b;

    /* renamed from: c */
    public final InputFieldType f41830c;

    /* renamed from: d */
    public final String f41831d;

    /* renamed from: e */
    public final String f41832e;

    /* renamed from: f */
    public final String f41833f;

    /* renamed from: g */
    public final String f41834g;

    /* renamed from: h */
    public final int f41835h;

    /* renamed from: com.moovit.inputfields.InputField$a */
    public class C16064a implements Parcelable.Creator<InputField> {
        public final Object createFromParcel(Parcel parcel) {
            return (InputField) C19612n.m46981v(parcel, InputField.f41828i);
        }

        public final Object[] newArray(int i) {
            return new InputField[i];
        }
    }

    /* renamed from: com.moovit.inputfields.InputField$b */
    public class C16065b extends C19619s<InputField> {
        public C16065b(Class cls) {
            super(2, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 2;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            String str;
            int i2;
            String p = pVar.mo51947p();
            InputFieldType inputFieldType = (InputFieldType) InputFieldType.CODER.read(pVar);
            String p2 = pVar.mo51947p();
            String p3 = pVar.mo51947p();
            String str2 = null;
            if (i >= 1) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            if (i >= 1) {
                str2 = pVar.mo51948t();
            }
            String str3 = str2;
            if (i >= 2) {
                i2 = pVar.mo51924l();
            } else {
                i2 = -1;
            }
            return new InputField(p, inputFieldType, p2, p3, str, str3, i2);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            InputField inputField = (InputField) obj;
            qVar.mo51954p(inputField.f41829b);
            InputFieldType.CODER.write(inputField.f41830c, qVar);
            qVar.mo51954p(inputField.f41831d);
            qVar.mo51954p(inputField.f41832e);
            qVar.mo51955t(inputField.f41833f);
            qVar.mo51955t(inputField.f41834g);
            qVar.mo51939l(inputField.f41835h);
        }
    }

    public InputField(String str, InputFieldType inputFieldType, String str2, String str3, String str4, String str5, int i) {
        C21100e.m49373x(str, "id");
        this.f41829b = str;
        C21100e.m49373x(inputFieldType, "inputFieldType");
        this.f41830c = inputFieldType;
        C21100e.m49373x(str2, "hint");
        this.f41831d = str2;
        C21100e.m49373x(str3, "error");
        this.f41832e = str3;
        this.f41833f = str4;
        this.f41834g = str5;
        this.f41835h = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41828i);
    }
}
