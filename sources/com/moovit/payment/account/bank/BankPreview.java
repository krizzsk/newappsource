package com.moovit.payment.account.bank;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class BankPreview implements Parcelable {
    public static final Parcelable.Creator<BankPreview> CREATOR = new C25633a();

    /* renamed from: e */
    public static final C25634b f63933e = new C25634b(BankPreview.class);

    /* renamed from: b */
    public final String f63934b;

    /* renamed from: c */
    public final Image f63935c;

    /* renamed from: d */
    public final String f63936d;

    /* renamed from: com.moovit.payment.account.bank.BankPreview$a */
    public class C25633a implements Parcelable.Creator<BankPreview> {
        public final Object createFromParcel(Parcel parcel) {
            return (BankPreview) C19612n.m46981v(parcel, BankPreview.f63933e);
        }

        public final Object[] newArray(int i) {
            return new BankPreview[i];
        }
    }

    /* renamed from: com.moovit.payment.account.bank.BankPreview$b */
    public class C25634b extends C19619s<BankPreview> {
        public C25634b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new BankPreview((Image) C16019d.m40803a().f41718d.read(pVar), pVar.mo51947p(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            BankPreview bankPreview = (BankPreview) obj;
            qVar.mo51954p(bankPreview.f63934b);
            C16019d.m40803a().f41718d.write(bankPreview.f63935c, qVar);
            qVar.mo51955t(bankPreview.f63936d);
        }
    }

    public BankPreview(Image image, String str, String str2) {
        C21100e.m49373x(image, "icon");
        this.f63935c = image;
        C21100e.m49373x(str, "name");
        this.f63934b = str;
        this.f63936d = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f63933e);
    }
}
