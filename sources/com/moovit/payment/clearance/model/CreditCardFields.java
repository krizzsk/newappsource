package com.moovit.payment.clearance.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class CreditCardFields implements Parcelable {
    public static final Parcelable.Creator<CreditCardFields> CREATOR = new C16306a();

    /* renamed from: f */
    public static C16307b f42607f = new C16307b(CreditCardFields.class);

    /* renamed from: b */
    public final boolean f42608b;

    /* renamed from: c */
    public final boolean f42609c;

    /* renamed from: d */
    public final boolean f42610d;

    /* renamed from: e */
    public final boolean f42611e;

    /* renamed from: com.moovit.payment.clearance.model.CreditCardFields$a */
    public class C16306a implements Parcelable.Creator<CreditCardFields> {
        public final Object createFromParcel(Parcel parcel) {
            return (CreditCardFields) C19612n.m46981v(parcel, CreditCardFields.f42607f);
        }

        public final Object[] newArray(int i) {
            return new CreditCardFields[i];
        }
    }

    /* renamed from: com.moovit.payment.clearance.model.CreditCardFields$b */
    public class C16307b extends C19619s<CreditCardFields> {
        public C16307b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            boolean z;
            boolean b = pVar.mo51919b();
            boolean b2 = pVar.mo51919b();
            boolean b3 = pVar.mo51919b();
            if (i >= 1) {
                z = pVar.mo51919b();
            } else {
                z = false;
            }
            return new CreditCardFields(b, b2, b3, z);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CreditCardFields creditCardFields = (CreditCardFields) obj;
            qVar.mo51934b(creditCardFields.f42608b);
            qVar.mo51934b(creditCardFields.f42609c);
            qVar.mo51934b(creditCardFields.f42610d);
            qVar.mo51934b(creditCardFields.f42611e);
        }
    }

    public CreditCardFields(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f42608b = z;
        this.f42609c = z2;
        this.f42610d = z3;
        this.f42611e = z4;
    }

    /* renamed from: b */
    public final int mo48870b() {
        boolean z = this.f42608b;
        if (this.f42609c) {
            z |= true;
        }
        if (this.f42610d) {
            z |= true;
        }
        return this.f42611e ? z | true ? 1 : 0 : z ? 1 : 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditCardFields)) {
            return false;
        }
        CreditCardFields creditCardFields = (CreditCardFields) obj;
        if (!C20975x0.m49118e(Boolean.valueOf(this.f42608b), Boolean.valueOf(creditCardFields.f42608b)) || !C20975x0.m49118e(Boolean.valueOf(this.f42609c), Boolean.valueOf(creditCardFields.f42609c)) || !C20975x0.m49118e(Boolean.valueOf(this.f42610d), Boolean.valueOf(creditCardFields.f42610d)) || !C20975x0.m49118e(Boolean.valueOf(this.f42611e), Boolean.valueOf(creditCardFields.f42611e))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f42608b;
        return C17884p.m44333D(z ? 1 : 0, this.f42609c, this.f42610d, this.f42611e);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42607f);
    }
}
