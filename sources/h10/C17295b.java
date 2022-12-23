package h10;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ce0.C21100e;
import com.moovit.gcm.messagebar.GcmMessageBar;
import com.usebutton.sdk.internal.api.AppActionRequest;
import g10.C17137a;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import p130j2.C5367a;
import p241s0.C6302b;
import p241s0.C6307g;
import p389bl.C13641g;
import p786rz.C19387a;
import p810sz.C19575a;
import p810sz.C19610m;

/* renamed from: h10.b */
public final class C17295b {

    /* renamed from: a */
    public static final C17295b f44674a = new C17295b();

    /* renamed from: b */
    public static final String f44675b;

    /* renamed from: c */
    public static final String f44676c;

    /* renamed from: d */
    public static final Uri f44677d = Uri.parse("moovit://gcm_message_bar");

    static {
        String name = C17295b.class.getName();
        f44675b = C25541a.m63881k(C25541a.m63881k(name, ".action"), ".broadcast_gcm_message_bar");
        f44676c = C25541a.m63881k(C25541a.m63881k(name, ".extra"), ".gcm_message_bar");
    }

    /* renamed from: a */
    public static C6302b m43339a(Context context) {
        boolean z;
        Collection<GcmMessageBar> collection = (Collection) C13641g.m34133v(context, "gcm_message_bars.dat", C19575a.m46957a(GcmMessageBar.f41509i, true));
        if (collection == null) {
            return new C6302b(1);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C17137a aVar = (C17137a) it.next();
            if (aVar == null || aVar.mo47961b().mo47941i(context)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                it.remove();
            }
        }
        C6302b bVar = new C6302b(collection.size());
        for (GcmMessageBar gcmMessageBar : collection) {
            bVar.put(gcmMessageBar.f41510b, gcmMessageBar);
        }
        return bVar;
    }

    /* renamed from: c */
    public static void m43340c(Context context, C6302b bVar) {
        boolean z;
        Collection values = bVar.values();
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        if (values != null) {
            Iterator it = ((C6307g.C6312e) values).iterator();
            while (it.hasNext()) {
                C17137a aVar = (C17137a) it.next();
                if (aVar == null || aVar.mo47961b().mo47941i(context)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    it.remove();
                }
            }
        }
        Collection values2 = bVar.values();
        GcmMessageBar.C15897b bVar2 = GcmMessageBar.f41508h;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(context.openFileOutput("gcm_message_bars.dat", 0));
            try {
                new C19610m(bufferedOutputStream2).mo51965h(values2, bVar2);
                C19387a.m46677i(bufferedOutputStream2);
            } catch (IOException unused) {
                bufferedOutputStream = bufferedOutputStream2;
                C19387a.m46677i(bufferedOutputStream);
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                C19387a.m46677i(bufferedOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
            C19387a.m46677i(bufferedOutputStream);
        } catch (Throwable th2) {
            th = th2;
            C19387a.m46677i(bufferedOutputStream);
            throw th;
        }
    }

    /* renamed from: b */
    public final synchronized void mo49827b(Context context, String str) {
        boolean z;
        C6302b a = m43339a(context);
        Collection values = a.values();
        if (values != null) {
            Iterator it = ((C6307g.C6312e) values).iterator();
            while (it.hasNext()) {
                C17137a aVar = (C17137a) it.next();
                if (aVar == null || !aVar.mo47961b().mo47939d1(context)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    it.remove();
                }
            }
        }
        Intent intent = new Intent(f44675b, f44677d.buildUpon().appendPath(str).build());
        intent.putExtra(f44676c, (GcmMessageBar) a.getOrDefault(str, null));
        C5367a.m13473a(context).mo21147c(intent);
    }
}
