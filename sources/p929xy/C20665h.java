package p929xy;

import android.content.Context;
import c70.C13752e;
import c70.C13772m;
import c70.C13777q;
import com.bumptech.glide.Priority;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.image.C16028g;
import com.moovit.image.glide.data.ImageData;
import com.tranzmate.moovit.protocol.common.MVImage;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p583jk.C17884p;
import p646lz.C18299a;
import p824tp.C19728f;
import p824tp.C19746x;
import r10.C19220d;

/* renamed from: xy.h */
public final class C20665h extends C20664g<Boolean> {

    /* renamed from: xy.h$a */
    public static class C20666a extends C13777q<C20666a, MVImage, ImageData> {
        public C20666a() {
            super(MVImage.class);
        }

        /* renamed from: e */
        public final Object mo40535e(TBase tBase) throws BadResponseException {
            return C16028g.m40824b((MVImage) tBase);
        }
    }

    /* renamed from: k */
    public static boolean m48588k(int i, C13752e eVar) throws IOException, ServerException {
        Context context = eVar.f33852a;
        C20666a aVar = (C20666a) new C13772m(eVar, C13772m.m34412M(context, i, "0", eVar.f33853b, (C19728f) null), C20666a.class).mo52626J();
        if (!aVar.mo52635a()) {
            return false;
        }
        ArrayList<ImageData> arrayList = aVar.f33921g;
        arrayList.size();
        for (ImageData Y : arrayList) {
            ((C19220d) C17884p.m44353X(context).mo51641u().mo10855Y(Y)).mo22740y(Priority.HIGH).mo10862d0();
        }
        return true;
    }

    /* renamed from: j */
    public final Object mo23772j(C18299a aVar, C13752e eVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        boolean z;
        boolean k = m48588k(C19746x.api_path_global_preloaded_images_path, eVar);
        boolean k2 = m48588k(C19746x.api_path_metro_preloaded_images_path, eVar);
        if (k || k2) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
