package u10;

import android.content.Context;
import ce0.C21100e;
import com.moovit.image.glide.data.ImageData;
import com.moovit.image.model.Image;
import com.moovit.image.model.RemoteImage;
import com.moovit.network.model.ServerId;
import com.usebutton.sdk.internal.api.AppActionRequest;
import p025b6.C1492e;
import p108h6.C5104n;
import p108h6.C5106o;
import p108h6.C5112r;
import s10.C19396c;
import s10.C19397d;

/* renamed from: u10.c */
public final class C19862c implements C5104n<RemoteImage, ImageData> {

    /* renamed from: a */
    public final Context f50479a;

    /* renamed from: u10.c$a */
    public static final class C19863a implements C5106o<RemoteImage, ImageData> {

        /* renamed from: a */
        public final Context f50480a;

        public C19863a(Context context) {
            this.f50480a = context;
        }

        /* renamed from: b */
        public final C5104n<RemoteImage, ImageData> mo20818b(C5112r rVar) {
            return new C19862c(this.f50480a);
        }
    }

    public C19862c(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f50479a = context;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo20815a(Object obj) {
        RemoteImage remoteImage = (RemoteImage) obj;
        return true;
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        RemoteImage remoteImage = (RemoteImage) obj;
        return new C5104n.C5105a(new C19396c((Image) remoteImage), new C19397d(this.f50479a, (ServerId) remoteImage.f41804c));
    }
}
