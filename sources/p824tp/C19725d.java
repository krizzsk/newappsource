package p824tp;

import android.annotation.SuppressLint;
import android.content.Context;
import ce0.C21100e;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: tp.d */
public final class C19725d {

    /* renamed from: a */
    public final Context f50161a;

    /* renamed from: b */
    public final List<C19726a> f50162b = Collections.synchronizedList(new ArrayList());

    /* renamed from: tp.d$a */
    public interface C19726a {
        /* renamed from: b */
        void mo44844b(Context context);
    }

    public C19725d(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f50161a = context;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public static C19725d m47191a(Context context) {
        return (C19725d) context.getSystemService("destruction_notifier");
    }

    /* renamed from: b */
    public final void mo52073b() {
        ArrayList arrayList;
        synchronized (this.f50162b) {
            arrayList = new ArrayList(this.f50162b);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C19726a) it.next()).mo44844b(this.f50161a);
        }
    }

    /* renamed from: c */
    public final void mo52074c(C19726a aVar) {
        this.f50162b.remove(aVar);
    }
}
