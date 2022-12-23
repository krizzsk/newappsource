package p413co;

import com.appboy.support.AppboyFileUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import mf0.C24362h;
import p584jl.C17885a;
import p846un.C19963e;

/* renamed from: co.i */
public final class C13862i {

    /* renamed from: a */
    public final File f34100a;

    /* renamed from: b */
    public final File f34101b;

    /* renamed from: c */
    public final C19963e f34102c;

    /* renamed from: co.i$a */
    public static final class C13863a {

        /* renamed from: a */
        public final File f34103a;

        /* renamed from: b */
        public final C19963e f34104b;

        public C13863a(File file, C19963e eVar) {
            C24362h.m61211f(eVar, "uuidGenerator");
            this.f34103a = file;
            this.f34104b = eVar;
        }

        /* renamed from: a */
        public final C13862i mo40812a(File file) {
            return new C13862i(file, this.f34103a, this.f34104b);
        }
    }

    public C13862i(File file, File file2, C19963e eVar) {
        C24362h.m61211f(file2, "temporaryFileDirectory");
        C24362h.m61211f(eVar, "uuidGenerator");
        this.f34100a = file;
        this.f34101b = file2;
        this.f34102c = eVar;
    }

    /* renamed from: a */
    public final ArrayList mo40809a() throws IOException, SecurityException {
        if (!this.f34100a.exists()) {
            throw new IOException("Cannot list files for a file which does not exist.");
        } else if (this.f34100a.isDirectory()) {
            File[] listFiles = this.f34100a.listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList(listFiles.length);
                for (File file : listFiles) {
                    C24362h.m61210e(file, AppboyFileUtils.FILE_SCHEME);
                    arrayList.add(file.getName());
                }
                return arrayList;
            }
            throw new IOException("Received a null list of files.");
        } else {
            throw new IOException("Cannot list files for a file which is not a directory.");
        }
    }

    /* renamed from: b */
    public final byte[] mo40810b() throws IOException, SecurityException {
        if (this.f34100a.isDirectory()) {
            throw new IOException("Cannot read a directory.");
        } else if (this.f34100a.exists()) {
            return C17885a.m44451n0(this.f34100a);
        } else {
            return null;
        }
    }

    /* renamed from: c */
    public final void mo40811c(byte[] bArr) throws IOException, SecurityException {
        if (!this.f34100a.isDirectory()) {
            File file = new File(this.f34101b.getPath(), this.f34102c.mo52262a().toString());
            C17885a.m44397E0(file, bArr);
            file.renameTo(this.f34100a);
            return;
        }
        throw new IOException("Cannot write to a directory.");
    }
}
