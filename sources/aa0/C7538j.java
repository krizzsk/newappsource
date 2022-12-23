package aa0;

import android.content.Context;
import com.moovit.network.model.ServerId;
import java.io.File;
import p810sz.C19589j;
import p810sz.C19600l;

/* renamed from: aa0.j */
public final class C7538j<T> extends C7537i<T> {

    /* renamed from: i */
    public final long f23015i;

    public C7538j(Context context, String str, ServerId serverId, long j, C19589j<? extends T> jVar, C19600l<? super T> lVar) {
        super(context, str, serverId, jVar, lVar);
        this.f23015i = j;
    }

    /* renamed from: g */
    public final File mo23800g(String str) {
        return new File(super.mo23800g(str), String.valueOf(this.f23015i));
    }
}
