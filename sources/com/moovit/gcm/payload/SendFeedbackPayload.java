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

public class SendFeedbackPayload extends GcmPayload {
    public static final Parcelable.Creator<SendFeedbackPayload> CREATOR = new C15948a();

    /* renamed from: c */
    public static final C15949b f41571c = new C15949b();

    /* renamed from: d */
    public static final C15950c f41572d = new C15950c(SendFeedbackPayload.class);

    /* renamed from: com.moovit.gcm.payload.SendFeedbackPayload$a */
    public class C15948a implements Parcelable.Creator<SendFeedbackPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (SendFeedbackPayload) C19612n.m46981v(parcel, SendFeedbackPayload.f41572d);
        }

        public final Object[] newArray(int i) {
            return new SendFeedbackPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.SendFeedbackPayload$b */
    public class C15949b extends C19621u<SendFeedbackPayload> {
        public C15949b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((SendFeedbackPayload) obj).f41546b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.SendFeedbackPayload$c */
    public class C15950c extends C19620t<SendFeedbackPayload> {
        public C15950c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new SendFeedbackPayload(pVar.mo51947p());
        }
    }

    public SendFeedbackPayload(String str) {
        super(str);
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48020k(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "send_feedback";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41571c);
    }
}
