package p848up;

import android.content.Context;
import androidx.camera.camera2.internal.C0510d;
import com.moovit.MoovitExecutors;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import p584jl.C17885a;
import p646lz.C18299a;
import p824tp.C19722a0;
import p929xy.C20664g;

/* renamed from: up.a */
public final class C19976a extends C20664g<C17885a> {
    /* renamed from: d */
    public final Object mo22058d(Context context, C18299a aVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        C17885a aVar2 = new C17885a();
        MoovitExecutors.f37327IO.execute(new C0510d(4, aVar2, context, (C19722a0) aVar.mo50690c("USER_CONTEXT")));
        return aVar2;
    }
}
