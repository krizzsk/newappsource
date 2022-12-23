package p083f5;

import com.airbnb.lottie.C1864c;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: f5.d */
public final class C4685d {

    /* renamed from: a */
    public final C4684c f15951a;

    public C4685d(C1864c cVar) {
        this.f15951a = cVar;
    }

    /* renamed from: a */
    public static String m11992a(String str, FileExtension fileExtension, boolean z) {
        String str2;
        StringBuilder k = C13555b.m33972k("lottie_cache_");
        k.append(str.replaceAll("\\W+", ""));
        if (z) {
            str2 = fileExtension.tempExtension();
        } else {
            str2 = fileExtension.extension;
        }
        k.append(str2);
        return k.toString();
    }

    /* renamed from: b */
    public final File mo20204b() {
        C1864c cVar = (C1864c) this.f15951a;
        cVar.getClass();
        File file = new File(cVar.f6444a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: c */
    public final File mo20205c(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        FileOutputStream fileOutputStream;
        File file = new File(mo20204b(), m11992a(str, fileExtension, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}
