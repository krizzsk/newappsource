package p973zv;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.share.MVGetShareEntityLinkRequest;
import java.util.concurrent.Callable;

/* renamed from: zv.a */
public final class C20911a extends C13778r<C20911a, C20912b, MVGetShareEntityLinkRequest> implements Callable<C20912b> {

    /* renamed from: w */
    public static final /* synthetic */ int f52657w = 0;

    public C20911a(C13752e eVar, MVGetShareEntityLinkRequest mVGetShareEntityLinkRequest) {
        super(eVar, R.string.api_path_get_share_entity_link, C20912b.class);
        this.f33922v = mVGetShareEntityLinkRequest;
    }

    public final Object call() throws Exception {
        return (C20912b) mo52626J();
    }
}
