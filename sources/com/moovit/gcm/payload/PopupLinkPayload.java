package com.moovit.gcm.payload;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.gcm.payload.GcmPayload;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class PopupLinkPayload extends GcmPayload {
    public static final Parcelable.Creator<PopupLinkPayload> CREATOR = new C15942a();

    /* renamed from: c */
    public static final C15943b f41567c = new C15943b();

    /* renamed from: d */
    public static final C15944c f41568d = new C15944c(PopupLinkPayload.class);

    /* renamed from: com.moovit.gcm.payload.PopupLinkPayload$a */
    public class C15942a implements Parcelable.Creator<PopupLinkPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (PopupLinkPayload) C19612n.m46981v(parcel, PopupLinkPayload.f41568d);
        }

        public final Object[] newArray(int i) {
            return new PopupLinkPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.PopupLinkPayload$b */
    public class C15943b extends C19621u<PopupLinkPayload> {
        public C15943b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((PopupLinkPayload) obj).f41546b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.PopupLinkPayload$c */
    public class C15944c extends C19620t<PopupLinkPayload> {
        public C15944c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new PopupLinkPayload(pVar.mo51947p());
        }
    }

    public PopupLinkPayload(String str) {
        super(str);
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48018i(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "popup_link";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41567c);
    }
}
