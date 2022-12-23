package t10;

import com.moovit.commons.request.BadResponseException;
import com.moovit.image.C16028g;
import com.moovit.image.glide.data.ImageData;
import com.tranzmate.moovit.protocol.common.MVImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import k40.C5481e;
import org.apache.thrift.TBase;
import p906wz.C20431c;

/* renamed from: t10.b */
public final class C19626b extends C5481e<C19625a, C19626b, MVImage> {

    /* renamed from: g */
    public ImageData f49805g;

    public C19626b() {
        super(MVImage.class);
    }

    /* renamed from: e */
    public final void mo21366e(C20431c cVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException {
        C19625a aVar = (C19625a) cVar;
        this.f49805g = C16028g.m40824b((MVImage) tBase);
    }
}
