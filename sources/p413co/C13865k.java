package p413co;

import android.content.Context;
import ce0.C21100e;
import com.masabi.justride.sdk.crypto.CryptoException;
import com.masabi.justride.sdk.platform.storage.FileStorageException;
import java.io.File;
import mf0.C24362h;
import p358af.C13437d;
import p441dk.C16672a;
import p677nj.C18570m;
import p868vl.C20157d;

/* renamed from: co.k */
public final class C13865k {

    /* renamed from: a */
    public final int f34110a = 1;

    /* renamed from: b */
    public final Context f34111b;

    /* renamed from: c */
    public final C20157d f34112c;

    /* renamed from: d */
    public final C18570m f34113d;

    /* renamed from: e */
    public final String f34114e;

    /* renamed from: f */
    public final C13874t f34115f;

    public C13865k(Context context, C20157d dVar, C18570m mVar, String str, C13874t tVar) {
        C24362h.m61211f(context, "applicationContext");
        C24362h.m61211f(dVar, "prependBrandFunction");
        C24362h.m61211f(mVar, "stringObfuscator");
        C24362h.m61211f(str, "pathToJustrideDirectory");
        this.f34111b = context;
        this.f34112c = dVar;
        this.f34113d = mVar;
        this.f34114e = str;
        this.f34115f = tVar;
    }

    /* renamed from: a */
    public final void mo40814a() throws CryptoException, FileStorageException, SecurityException {
        if (!this.f34115f.mo40822b(this.f34110a)) {
            File file = new File(this.f34114e);
            file.mkdirs();
            if (file.exists()) {
                mo40815b(C21100e.m49337e0());
                mo40815b(C21100e.m49333b0());
                mo40815b(C21100e.m49331Z());
                mo40815b(C21100e.m49327V());
                mo40815b(C21100e.m49326U());
                mo40815b(C21100e.m49347j0());
                mo40815b(C21100e.m49332a0());
                mo40815b(C21100e.m49334c0());
                this.f34115f.mo40823c(this.f34110a);
                return;
            }
            throw new FileStorageException("Failed to create justride folder.");
        }
    }

    /* renamed from: b */
    public final void mo40815b(String str) throws CryptoException, FileStorageException, SecurityException {
        boolean z;
        String a = this.f34113d.mo50969a(this.f34112c.mo52405a(str));
        C24362h.m61210e(a, "stringObfuscator.obfuscate(brandedFolderName)");
        File file = new File(this.f34114e, a);
        if (!file.exists()) {
            File dir = this.f34111b.getDir(a, 0);
            C24362h.m61210e(dir, "applicationContext.getDi…er, Context.MODE_PRIVATE)");
            File[] listFiles = dir.listFiles();
            if (listFiles != null) {
                if (listFiles.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (!dir.renameTo(file)) {
                        throw new FileStorageException(C13555b.m33971j(new Object[]{C16672a.f43391M, C13437d.m33706k("Failed migration to the justride folder for ", str, " folder.")}, 2, "[%d]: %s", "java.lang.String.format(format, *args)"));
                    }
                    return;
                }
            }
            dir.delete();
        }
    }
}
