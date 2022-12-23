package com.moovit.gcm.messagebar;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.MessageButton;
import com.moovit.gcm.condition.GcmCondition;
import com.moovit.gcm.condition.GcmTimePeriodCondition;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import f10.C16936g;
import g10.C17137a;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class GcmMessageBar implements Parcelable, C17137a {
    public static final Parcelable.Creator<GcmMessageBar> CREATOR = new C15896a();

    /* renamed from: h */
    public static final C15897b f41508h = new C15897b();

    /* renamed from: i */
    public static final C15898c f41509i = new C15898c(GcmMessageBar.class);

    /* renamed from: b */
    public final String f41510b;

    /* renamed from: c */
    public final GcmCondition f41511c;

    /* renamed from: d */
    public final String f41512d;

    /* renamed from: e */
    public final Image f41513e;

    /* renamed from: f */
    public final int f41514f;

    /* renamed from: g */
    public final GcmPayload f41515g;

    /* renamed from: com.moovit.gcm.messagebar.GcmMessageBar$a */
    public class C15896a implements Parcelable.Creator<GcmMessageBar> {
        public final Object createFromParcel(Parcel parcel) {
            return (GcmMessageBar) C19612n.m46981v(parcel, GcmMessageBar.f41509i);
        }

        public final Object[] newArray(int i) {
            return new GcmMessageBar[i];
        }
    }

    /* renamed from: com.moovit.gcm.messagebar.GcmMessageBar$b */
    public class C15897b extends C19621u<GcmMessageBar> {
        public C15897b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            GcmMessageBar gcmMessageBar = (GcmMessageBar) obj;
            qVar.mo51954p(gcmMessageBar.f41510b);
            C16936g.f43956c.write(gcmMessageBar.f41511c, qVar);
            qVar.mo51954p(gcmMessageBar.f41512d);
            qVar.mo51967q(gcmMessageBar.f41513e, C16019d.m40803a().f41718d);
            qVar.mo51939l(gcmMessageBar.f41514f);
            C16936g.f43954a.write(gcmMessageBar.f41515g, qVar);
        }
    }

    /* renamed from: com.moovit.gcm.messagebar.GcmMessageBar$c */
    public class C15898c extends C19620t<GcmMessageBar> {
        public C15898c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 1 || i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            C19615p pVar2 = pVar;
            if (i == 1) {
                return new GcmMessageBar(pVar.mo51947p(), (GcmCondition) C16936g.f43956c.read(pVar2), pVar.mo51947p(), (Image) pVar2.mo51962q(C16019d.m40803a().f41718d), pVar.mo51924l(), (GcmPayload) C16936g.f43954a.read(pVar2));
            }
            return new GcmMessageBar(pVar.mo51947p(), new GcmTimePeriodCondition(pVar.mo51925m(), pVar.mo51925m()), pVar.mo51947p(), (Image) pVar2.mo51962q(C16019d.m40803a().f41718d), pVar.mo51924l(), (GcmPayload) C16936g.f43954a.read(pVar2));
        }
    }

    public GcmMessageBar(String str, GcmCondition gcmCondition, String str2, Image image, int i, GcmPayload gcmPayload) {
        this.f41510b = str;
        C21100e.m49373x(str, "screen");
        C21100e.m49373x(gcmCondition, "condition");
        this.f41511c = gcmCondition;
        C21100e.m49373x(str2, MessageButton.TEXT);
        this.f41512d = str2;
        this.f41513e = image;
        this.f41514f = i;
        C21100e.m49373x(gcmPayload, "payload");
        this.f41515g = gcmPayload;
    }

    /* renamed from: b */
    public final GcmCondition mo47961b() {
        return this.f41511c;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GcmMessageBar)) {
            return false;
        }
        return this.f41515g.equals(((GcmMessageBar) obj).f41515g);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f41515g);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41508h);
    }
}
