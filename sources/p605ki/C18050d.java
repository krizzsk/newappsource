package p605ki;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import mf0.C24362h;
import p364al.C13483d;
import p364al.C13487h;
import p680nm.C18576a;
import p725pj.C18926a;

/* renamed from: ki.d */
public final class C18050d<R> implements C13483d<Void> {

    /* renamed from: a */
    public final /* synthetic */ C18576a f46186a;

    public C18050d(C18576a aVar) {
        this.f46186a = aVar;
    }

    /* renamed from: C */
    public final C13487h<Void> mo40394C() {
        boolean z;
        C18576a aVar = this.f46186a;
        aVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - 86400000;
        File file = aVar.f47283a;
        C24362h.m61211f(file, "$this$deleteFilesOlderThan");
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : listFiles) {
                if (file2.lastModified() >= currentTimeMillis || !file2.isFile()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(file2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
        }
        return new C13487h<>(null, (C18926a) null);
    }
}
