package q10;

import c70.C13752e;
import com.moovit.image.entity.upload.C16023b;
import com.moovit.image.entity.upload.EntityImageUploadWorker;
import com.moovit.network.model.ServerId;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import p034c2.C1759a;
import p10.C18866a;
import p10.C18867b;

/* renamed from: q10.a */
public final /* synthetic */ class C19074a implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C16023b f48493b;

    /* renamed from: c */
    public final /* synthetic */ C13752e f48494c;

    /* renamed from: d */
    public final /* synthetic */ EntityImageUploadWorker.C16021a f48495d;

    public /* synthetic */ C19074a(C16023b bVar, C13752e eVar, EntityImageUploadWorker.C16021a aVar) {
        this.f48493b = bVar;
        this.f48494c = eVar;
        this.f48495d = aVar;
    }

    public final Object call() {
        int i;
        int i2;
        int i3;
        C16023b bVar = this.f48493b;
        C13752e eVar = this.f48494c;
        EntityImageUploadWorker.C16021a aVar = this.f48495d;
        bVar.getClass();
        ServerId b = ServerId.m11392b(aVar.f41726c);
        try {
            C1759a aVar2 = new C1759a(aVar.f41725b);
            i3 = aVar2.mo6534g(0, "ImageWidth");
            try {
                i = aVar2.mo6534g(0, "ImageLength");
                i2 = i3;
            } catch (IOException unused) {
                i2 = i3;
                i = 0;
                File file = new File(aVar.f41725b);
                long lastModified = file.lastModified();
                String path = file.getPath();
                return ((C18867b) new C18866a(eVar, b, lastModified, aVar.f41727d, i2, i, path.substring(path.lastIndexOf(".") + 1, path.length())).mo52626J()).f48038m;
            }
        } catch (IOException unused2) {
            i3 = 0;
            i2 = i3;
            i = 0;
            File file2 = new File(aVar.f41725b);
            long lastModified2 = file2.lastModified();
            String path2 = file2.getPath();
            return ((C18867b) new C18866a(eVar, b, lastModified2, aVar.f41727d, i2, i, path2.substring(path2.lastIndexOf(".") + 1, path2.length())).mo52626J()).f48038m;
        }
        File file22 = new File(aVar.f41725b);
        long lastModified22 = file22.lastModified();
        String path22 = file22.getPath();
        return ((C18867b) new C18866a(eVar, b, lastModified22, aVar.f41727d, i2, i, path22.substring(path22.lastIndexOf(".") + 1, path22.length())).mo52626J()).f48038m;
    }
}
