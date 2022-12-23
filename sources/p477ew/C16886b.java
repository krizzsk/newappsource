package p477ew;

import c00.C13720d;
import c00.C13722f;
import c00.C13733n;
import c70.C13746a;
import c70.C13780t;
import com.moovit.app.stopdetail.StopImage;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.stopDetails.MVStopImage;
import com.tranzmate.moovit.protocol.stopDetails.MVStopImageResponse;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.thrift.TBase;

/* renamed from: ew.b */
public final class C16886b extends C13780t<C16885a, C16886b, MVStopImageResponse> {

    /* renamed from: o */
    public static final C16887a f43908o = new C16887a();

    /* renamed from: m */
    public ArrayList f43909m = new ArrayList();

    /* renamed from: n */
    public String f43910n;

    /* renamed from: ew.b$a */
    public class C16887a implements C13733n<MVStopImage, StopImage> {
        public final Object convert(Object obj) throws Exception {
            MVStopImage mVStopImage = (MVStopImage) obj;
            return new StopImage(new ServerId(mVStopImage.stopId), mVStopImage.url, mVStopImage.width, mVStopImage.height, mVStopImage.timestamp, mVStopImage.userName);
        }
    }

    public C16886b() {
        super(MVStopImageResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C16885a aVar2 = (C16885a) aVar;
        MVStopImageResponse mVStopImageResponse = (MVStopImageResponse) tBase;
        this.f43909m = C13720d.m34273c(mVStopImageResponse.images, (C13722f) null, f43908o);
        this.f43910n = mVStopImageResponse.thumbnailUrl;
    }
}
