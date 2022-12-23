package com.moovit.app.general.userprofile.avatars;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class Avatar implements Parcelable {
    public static final Parcelable.Creator<Avatar> CREATOR = new C14900a();

    /* renamed from: e */
    public static final C14901b f38093e = new C14901b();

    /* renamed from: f */
    public static final C14902c f38094f = new C14902c(Avatar.class);

    /* renamed from: b */
    public final ServerId f38095b;

    /* renamed from: c */
    public final String f38096c;

    /* renamed from: d */
    public final Image f38097d;

    /* renamed from: com.moovit.app.general.userprofile.avatars.Avatar$a */
    public class C14900a implements Parcelable.Creator<Avatar> {
        public final Object createFromParcel(Parcel parcel) {
            return (Avatar) C19612n.m46981v(parcel, Avatar.f38094f);
        }

        public final Object[] newArray(int i) {
            return new Avatar[i];
        }
    }

    /* renamed from: com.moovit.app.general.userprofile.avatars.Avatar$b */
    public class C14901b extends C19621u<Avatar> {
        public C14901b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            Avatar avatar = (Avatar) obj;
            ServerId serverId = avatar.f38095b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51954p(avatar.f38096c);
            qVar.mo51967q(avatar.f38097d, C16019d.m40803a().f41718d);
        }
    }

    /* renamed from: com.moovit.app.general.userprofile.avatars.Avatar$c */
    public class C14902c extends C19620t<Avatar> {
        public C14902c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new Avatar((Image) pVar.mo51962q(C16019d.m40803a().f41718d), new ServerId(pVar.mo51924l()), pVar.mo51947p());
        }
    }

    public Avatar(Image image, ServerId serverId, String str) {
        this.f38095b = serverId;
        C21100e.m49373x(str, "name");
        this.f38096c = str;
        this.f38097d = image;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f38093e);
    }
}
