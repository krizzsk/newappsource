package com.moovit.image.model;

import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class RemoteImage extends Image implements C5384a {

    /* renamed from: f */
    public static final C16055a f41817f = new C16055a(RemoteImage.class);

    /* renamed from: com.moovit.image.model.RemoteImage$a */
    public class C16055a extends C19619s<RemoteImage> {
        public C16055a(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new RemoteImage(new ServerId(pVar.mo51924l()), pVar.mo51949u());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            RemoteImage remoteImage = (RemoteImage) obj;
            qVar.getClass();
            qVar.mo51939l(((ServerId) remoteImage.f41804c).f15142b);
            qVar.mo51956u(remoteImage.f41805d);
        }
    }

    public RemoteImage(ServerId serverId, String... strArr) {
        super("RemoteImage", serverId, strArr, true);
    }

    public final ServerId getServerId() {
        return (ServerId) this.f41804c;
    }
}
