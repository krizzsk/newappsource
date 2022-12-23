package p033c1;

import com.google.android.play.core.assetpacks.C14243a0;
import com.google.android.play.core.assetpacks.C14313r2;
import com.google.android.play.core.assetpacks.C14315s0;
import com.google.android.play.core.assetpacks.C14326v;
import com.google.android.play.core.assetpacks.C14337x2;
import java.util.ArrayList;
import java.util.HashSet;
import p229r1.C6235e;
import p241s0.C6313h;
import p434dd.C16552f0;
import p533hg.C17431b;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: c1.a */
public final class C1757a implements C16552f0 {

    /* renamed from: b */
    public final Object f6158b;

    /* renamed from: c */
    public final Object f6159c;

    /* renamed from: d */
    public final Object f6160d;

    /* renamed from: e */
    public final Object f6161e;

    public /* synthetic */ C1757a(int i) {
        C17431b.C17432a aVar = C17431b.f44899a;
        this.f6160d = new ConcurrentHashMap();
        this.f6161e = new ConcurrentHashMap();
        this.f6158b = "/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto";
        this.f6159c = aVar;
    }

    /* renamed from: a */
    public final void mo6515a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((C6313h) this.f6159c).getOrDefault(obj, null);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        mo6515a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        return new C14326v(((C14337x2) ((C16552f0) this.f6158b)).mo42910a(), (C14243a0) ((C16552f0) this.f6159c).zza(), (C14313r2) ((C16552f0) this.f6160d).zza(), (C14315s0) ((C16552f0) this.f6161e).zza());
    }

    public /* synthetic */ C1757a(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f6158b = obj;
        this.f6159c = obj2;
        this.f6160d = obj3;
        this.f6161e = obj4;
    }

    public /* synthetic */ C1757a() {
        this.f6158b = new C6235e(10);
        this.f6159c = new C6313h();
        this.f6160d = new ArrayList();
        this.f6161e = new HashSet();
    }
}
