package p413co;

import com.masabi.justride.sdk.crypto.CryptoException;
import com.masabi.justride.sdk.platform.storage.FileStorageException;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import p413co.C13862i;
import p868vl.C20157d;

/* renamed from: co.g */
public final class C13859g {

    /* renamed from: a */
    public final C13866l f34093a;

    /* renamed from: b */
    public final C20157d f34094b;

    public C13859g(C13866l lVar, C20157d dVar) {
        this.f34093a = lVar;
        this.f34094b = dVar;
    }

    /* renamed from: a */
    public final void mo40802a(String str) throws FileStorageException {
        List<String> list;
        String b = mo40803b(str);
        C13866l lVar = this.f34093a;
        lVar.getClass();
        try {
            String path = new File(lVar.f34118c, lVar.f34117b.mo50969a(b)).getPath();
            C13873s sVar = lVar.f34116a;
            sVar.f34122b.mo40807a();
            sVar.f34122b.mo40807a();
            File file = new File(path);
            C13862i.C13863a aVar = sVar.f34121a;
            C13862i iVar = new C13862i(file, aVar.f34103a, aVar.f34104b);
            if (!iVar.f34100a.exists()) {
                list = new LinkedList<>();
            } else {
                try {
                    list = iVar.mo40809a();
                } catch (IOException | SecurityException e) {
                    throw new FileStorageException("Failed listing files in directory", e);
                }
            }
            for (String file2 : list) {
                sVar.mo40820a(new File(path, file2).getAbsolutePath());
            }
        } catch (CryptoException e2) {
            throw new FileStorageException(String.format("Obfuscation failed for folder %s", new Object[]{b}), e2);
        }
    }

    /* renamed from: b */
    public final String mo40803b(String str) {
        return this.f34094b.mo52405a(str);
    }

    /* renamed from: c */
    public final byte[] mo40804c(String str, String str2) throws FileStorageException {
        String b = mo40803b(str);
        C13866l lVar = this.f34093a;
        String a = lVar.mo40816a(b, str2);
        C13873s sVar = lVar.f34116a;
        sVar.f34122b.mo40807a();
        try {
            return sVar.f34121a.mo40812a(new File(a)).mo40810b();
        } catch (IOException | SecurityException e) {
            throw new FileStorageException("Failed reading file", e);
        }
    }

    /* renamed from: d */
    public final Date mo40805d(String str, String str2) throws FileStorageException {
        String b = mo40803b(str);
        C13866l lVar = this.f34093a;
        String a = lVar.mo40816a(b, str2);
        lVar.f34116a.f34122b.mo40807a();
        File file = new File(a);
        try {
            if (file.exists()) {
                return new Date(file.lastModified());
            }
            throw new FileStorageException("File does not exist");
        } catch (SecurityException e) {
            throw new FileStorageException("Failed to get file data", e);
        }
    }

    /* renamed from: e */
    public final void mo40806e(String str, String str2, byte[] bArr) throws FileStorageException {
        String b = mo40803b(str);
        C13866l lVar = this.f34093a;
        String a = lVar.mo40816a(b, str2);
        C13873s sVar = lVar.f34116a;
        sVar.f34122b.mo40807a();
        C13862i a2 = sVar.f34121a.mo40812a(new File(a));
        File parentFile = a2.f34100a.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        try {
            a2.mo40811c(bArr);
        } catch (IOException | SecurityException e) {
            throw new FileStorageException("Failed writing to file", e);
        }
    }
}
