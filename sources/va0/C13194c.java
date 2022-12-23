package va0;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import ma0.C12895a;
import na0.C12925d;
import na0.C12928f;

/* renamed from: va0.c */
public abstract class C13194c implements C13196e {

    /* renamed from: b */
    public C12925d f32763b;

    /* renamed from: c */
    public long f32764c;

    public C13194c(C12928f fVar, C12925d dVar, long j) {
        this.f32763b = dVar;
        long j2 = j + fVar.f32023d;
        this.f32764c = j2;
        C12925d.C12926a aVar = dVar.f32003a;
        synchronized (aVar) {
            aVar.f32014a.mo39771c(j2, C12925d.C12926a.f32013b);
        }
    }

    /* renamed from: H */
    public final void mo40071H() {
    }

    /* renamed from: a */
    public void mo40072a(byte[] bArr) {
        if (bArr != null && this.f32763b.f32004b.mo39768b(this.f32764c, bArr)) {
            C12895a aVar = this.f32763b.f32005c;
            long j = this.f32764c;
            synchronized (aVar) {
                if (aVar.f31909a != 0) {
                    aVar.f31910b += bArr.length;
                    aVar.f31911c.mo40146d(j, bArr);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo40073b(BufferedInputStream bufferedInputStream) {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e) {
                e.getMessage();
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                } catch (IOException e2) {
                    e2.getMessage();
                }
                throw th;
            }
        }
        byteArrayOutputStream.flush();
        mo40072a(byteArrayOutputStream.toByteArray());
        try {
            byteArrayOutputStream.close();
            bufferedInputStream.close();
        } catch (IOException e3) {
            e3.getMessage();
        }
    }

    public final void cancel() {
        C12925d.C12926a aVar = this.f32763b.f32003a;
        long j = this.f32764c;
        synchronized (aVar) {
            aVar.f32014a.mo40150d(j);
        }
    }
}
