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

public class InputFieldValue implements Parcelable {
    public static final Parcelable.Creator<InputFieldValue> CREATOR = new C16066a();

    /* renamed from: d */
    public static final C16067b f41836d = new C16067b(InputFieldValue.class);

    /* renamed from: b */
    public final String f41837b;

    /* renamed from: c */
    public final String f41838c;

    /* renamed from: com.moovit.inputfields.InputFieldValue$a */
    public class C16066a implements Parcelable.Creator<InputFieldValue> {
        public final Object createFromParcel(Parcel parcel) {
            return (InputFieldValue) C19612n.m46981v(parcel, InputFieldValue.f41836d);
        }

        public final Object[] newArray(int i) {
            return new InputFieldValue[i];
        }
    }

    /* renamed from: com.moovit.inputfields.InputFieldValue$b */
    public class C16067b extends C19619s<InputFieldValue> {
        public C16067b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new InputFieldValue(pVar.mo51947p(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            InputFieldValue inputFieldValue = (InputFieldValue) obj;
            qVar.mo51954p(inputFieldValue.f41837b);
            qVar.mo51954p(inputFieldValue.f41838c);
        }
    }

    public InputFieldValue(String str, String str2) {
        C21100e.m49373x(str, "id");
        this.f41837b = str;
        C21100e.m49373x(str2, "value");
        this.f41838c = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41836d);
    }
}
