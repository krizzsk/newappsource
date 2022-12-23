package p664mu;

import aa0.C7543n;
import android.content.Context;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import com.moovit.image.entity.upload.C16024c;
import com.moovit.image.entity.upload.EntityImageUploadWorker;
import com.moovit.network.model.ServerId;
import com.moovit.view.p340cc.C7959a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p034c2.C1759a;
import p10.C18870e;
import p10.C18871f;
import p531he.C17399f0;
import p664mu.C18437c;
import r50.C19225a;
import r50.C19226b;
import r50.C19228d;

/* renamed from: mu.b */
public final /* synthetic */ class C18436b implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f46998b;

    /* renamed from: c */
    public final /* synthetic */ Object f46999c;

    /* renamed from: d */
    public final /* synthetic */ Object f47000d;

    /* renamed from: e */
    public final /* synthetic */ Object f47001e;

    public /* synthetic */ C18436b(int i, Object obj, Object obj2, Object obj3) {
        this.f46998b = i;
        this.f46999c = obj;
        this.f47000d = obj2;
        this.f47001e = obj3;
    }

    public /* synthetic */ C18436b(Context context, String str, C7959a aVar) {
        this.f46998b = 2;
        this.f47000d = context;
        this.f46999c = str;
        this.f47001e = aVar;
    }

    public final Object call() {
        int i;
        int i2;
        int i3;
        switch (this.f46998b) {
            case 0:
                C18437c cVar = (C18437c) this.f46999c;
                cVar.getClass();
                Context applicationContext = ((Context) this.f47000d).getApplicationContext();
                ArrayList arrayList = new ArrayList();
                for (ServerId serverId : (Collection) this.f47001e) {
                    C7543n<List<C18437c.C18438a>> a = cVar.mo50885a(applicationContext);
                    StringBuilder k = C13555b.m33972k("line_id_");
                    k.append(serverId.f15142b);
                    List list = a.get(k.toString());
                    if (!C13717b.m34258e(list)) {
                        C13720d.m34276f(list, (C13722f) null, new C17399f0(serverId, 0), arrayList);
                    }
                }
                return arrayList;
            case 1:
                C13752e eVar = (C13752e) this.f47000d;
                EntityImageUploadWorker.C16021a aVar = (EntityImageUploadWorker.C16021a) this.f47001e;
                ((C16024c) this.f46999c).getClass();
                try {
                    C1759a aVar2 = new C1759a(aVar.f41725b);
                    i3 = aVar2.mo6534g(0, "ImageWidth");
                    try {
                        i = aVar2.mo6534g(0, "ImageLength");
                        i2 = i3;
                    } catch (IOException unused) {
                        String str = aVar.f41726c;
                        i2 = i3;
                        i = 0;
                        File file = new File(aVar.f41725b);
                        long lastModified = file.lastModified();
                        String path = file.getPath();
                        return ((C18871f) new C18870e(eVar, aVar.f41726c, lastModified, i2, i, path.substring(path.lastIndexOf(".") + 1, path.length())).mo52626J()).f48040m;
                    }
                } catch (IOException unused2) {
                    i3 = 0;
                    String str2 = aVar.f41726c;
                    i2 = i3;
                    i = 0;
                    File file2 = new File(aVar.f41725b);
                    long lastModified2 = file2.lastModified();
                    String path2 = file2.getPath();
                    return ((C18871f) new C18870e(eVar, aVar.f41726c, lastModified2, i2, i, path2.substring(path2.lastIndexOf(".") + 1, path2.length())).mo52626J()).f48040m;
                }
                File file22 = new File(aVar.f41725b);
                long lastModified22 = file22.lastModified();
                String path22 = file22.getPath();
                return ((C18871f) new C18870e(eVar, aVar.f41726c, lastModified22, i2, i, path22.substring(path22.lastIndexOf(".") + 1, path22.length())).mo52626J()).f48040m;
            default:
                int i4 = C19228d.f48828u;
                return ((C19226b) new C19225a((Context) this.f47000d, (String) this.f46999c, (C7959a) this.f47001e).mo52626J()).f48827f;
        }
    }
}
