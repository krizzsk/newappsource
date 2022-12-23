package com.moovit.ticketing.validation.receipt.media;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MediaTicketReceiptContent implements Parcelable {
    public static final Parcelable.Creator<MediaTicketReceiptContent> CREATOR = new C7770a();

    /* renamed from: f */
    public static final C7771b f23585f = new C7771b(MediaTicketReceiptContent.class);

    /* renamed from: b */
    public final String f23586b;

    /* renamed from: c */
    public final byte[] f23587c;

    /* renamed from: d */
    public final String f23588d;

    /* renamed from: e */
    public final byte[] f23589e;

    /* renamed from: com.moovit.ticketing.validation.receipt.media.MediaTicketReceiptContent$a */
    public class C7770a implements Parcelable.Creator<MediaTicketReceiptContent> {
        public final Object createFromParcel(Parcel parcel) {
            return (MediaTicketReceiptContent) C19612n.m46981v(parcel, MediaTicketReceiptContent.f23585f);
        }

        public final Object[] newArray(int i) {
            return new MediaTicketReceiptContent[i];
        }
    }

    /* renamed from: com.moovit.ticketing.validation.receipt.media.MediaTicketReceiptContent$b */
    public class C7771b extends C19619s<MediaTicketReceiptContent> {
        public C7771b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new MediaTicketReceiptContent(pVar.mo51947p(), pVar.mo51948t(), pVar.mo51944d(), pVar.mo51944d());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MediaTicketReceiptContent mediaTicketReceiptContent = (MediaTicketReceiptContent) obj;
            qVar.mo51954p(mediaTicketReceiptContent.f23586b);
            qVar.mo51951e(mediaTicketReceiptContent.f23587c);
            qVar.mo51955t(mediaTicketReceiptContent.f23588d);
            qVar.mo51951e(mediaTicketReceiptContent.f23589e);
        }
    }

    public MediaTicketReceiptContent(String str, String str2, byte[] bArr, byte[] bArr2) {
        C21100e.m49373x(str, "frontUrl");
        this.f23586b = str;
        this.f23587c = bArr;
        this.f23588d = str2;
        this.f23589e = bArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23585f);
    }
}
