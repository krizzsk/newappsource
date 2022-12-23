package p083f5;

import com.airbnb.lottie.C1867f;
import com.airbnb.lottie.C1868g;
import com.airbnb.lottie.C1904r;
import com.airbnb.lottie.network.FileExtension;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import p107h5.C5055c;

/* renamed from: f5.e */
public final class C4686e {

    /* renamed from: a */
    public final C4685d f15952a;

    /* renamed from: b */
    public final C4683b f15953b;

    public C4686e(C4685d dVar, C4683b bVar) {
        this.f15952a = dVar;
        this.f15953b = bVar;
    }

    /* renamed from: a */
    public final C1904r<C1867f> mo20206a(String str, InputStream inputStream, String str2, String str3) throws IOException {
        FileExtension fileExtension;
        C1904r<C1867f> rVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str.split("\\?")[0].endsWith(".lottie")) {
            C5055c.m12895a();
            fileExtension = FileExtension.ZIP;
            if (str3 == null) {
                rVar = C1868g.m5249g(new ZipInputStream(inputStream), (String) null);
            } else {
                rVar = C1868g.m5249g(new ZipInputStream(new FileInputStream(this.f15952a.mo20205c(str, inputStream, fileExtension))), str);
            }
        } else {
            C5055c.m12895a();
            fileExtension = FileExtension.JSON;
            if (str3 == null) {
                rVar = C1868g.m5245c(inputStream, (String) null);
            } else {
                rVar = C1868g.m5245c(new FileInputStream(this.f15952a.mo20205c(str, inputStream, fileExtension).getAbsolutePath()), str);
            }
        }
        if (!(str3 == null || rVar.f6703a == null)) {
            C4685d dVar = this.f15952a;
            dVar.getClass();
            File file = new File(dVar.mo20204b(), C4685d.m11992a(str, fileExtension, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            C5055c.m12895a();
            if (!renameTo) {
                StringBuilder k = C13555b.m33972k("Unable to rename cache file ");
                k.append(file.getAbsolutePath());
                k.append(" to ");
                k.append(file2.getAbsolutePath());
                k.append(".");
                C5055c.m12896b(k.toString());
            }
        }
        return rVar;
    }
}
