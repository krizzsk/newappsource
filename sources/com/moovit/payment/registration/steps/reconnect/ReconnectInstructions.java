package com.moovit.payment.registration.steps.reconnect;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class ReconnectInstructions implements Parcelable {
    public static final Parcelable.Creator<ReconnectInstructions> CREATOR = new C16408a();

    /* renamed from: e */
    public static final C16409b f42871e = new C16409b(ReconnectInstructions.class);

    /* renamed from: b */
    public final Image f42872b;

    /* renamed from: c */
    public final String f42873c;

    /* renamed from: d */
    public final String f42874d;

    /* renamed from: com.moovit.payment.registration.steps.reconnect.ReconnectInstructions$a */
    public class C16408a implements Parcelable.Creator<ReconnectInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return (ReconnectInstructions) C19612n.m46981v(parcel, ReconnectInstructions.f42871e);
        }

        public final Object[] newArray(int i) {
            return new ReconnectInstructions[i];
        }
    }

    /* renamed from: com.moovit.payment.registration.steps.reconnect.ReconnectInstructions$b */
    public class C16409b extends C19619s<ReconnectInstructions> {
        public C16409b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new ReconnectInstructions((Image) pVar.mo51962q(C16019d.m40803a().f41718d), pVar.mo51948t(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ReconnectInstructions reconnectInstructions = (ReconnectInstructions) obj;
            qVar.mo51967q(reconnectInstructions.f42872b, C16019d.m40803a().f41718d);
            qVar.mo51955t(reconnectInstructions.f42873c);
            qVar.mo51955t(reconnectInstructions.f42874d);
        }
    }

    public ReconnectInstructions(Image image, String str, String str2) {
        this.f42872b = image;
        this.f42873c = str;
        this.f42874d = str2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42871e);
    }
}
