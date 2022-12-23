package aa0;

import android.content.Context;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import java.io.File;
import p741pz.C19044c;
import p810sz.C19589j;
import p810sz.C19600l;

/* renamed from: aa0.i */
public class C7537i<T> extends C19044c<T> {

    /* renamed from: h */
    public final ServerId f23014h;

    public C7537i(Context context, String str, ServerId serverId, C19589j<? extends T> jVar, C19600l<? super T> lVar) {
        super(context, jVar, lVar, str);
        C21100e.m49373x(serverId, "metroId");
        this.f23014h = serverId;
    }

    /* renamed from: g */
    public File mo23800g(String str) {
        return new File(new File(new File(this.f48431a.getFilesDir(), "stores"), str), String.valueOf(this.f23014h.f15142b));
    }
}
