package p583jk;

import androidx.lifecycle.C1042u;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import mf0.C24361g;
import p581ji.C17854a;
import p581ji.C17855b;
import p846un.C19959a;

/* renamed from: jk.n */
public final class C17881n {

    /* renamed from: a */
    public final C17854a f45872a;

    /* renamed from: b */
    public final C17855b f45873b;

    /* renamed from: c */
    public final C1042u f45874c;

    /* renamed from: jk.n$a */
    public static class C17882a {

        /* renamed from: a */
        public final byte[] f45875a;

        /* renamed from: b */
        public final C19959a f45876b;

        public C17882a(byte[] bArr, C19959a aVar) {
            this.f45875a = bArr;
            this.f45876b = aVar;
        }
    }

    public C17881n(byte[] bArr, C1042u uVar) {
        this.f45874c = uVar;
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        try {
            long readLong = dataInputStream.readLong();
            int read = dataInputStream.read();
            int[] iArr = new int[read];
            for (int i = 0; i < read; i++) {
                iArr[i] = dataInputStream.readInt();
            }
            int read2 = dataInputStream.read();
            int[] iArr2 = new int[read2];
            for (int i2 = 0; i2 < read2; i2++) {
                iArr2[i2] = dataInputStream.readInt();
            }
            C17855b bVar = new C17855b(iArr, readLong, iArr2);
            dataInputStream.close();
            this.f45873b = bVar;
            C17854a M = C24361g.m61143M(false);
            this.f45872a = M;
            M.mo50426b((byte[]) null);
        } catch (Exception unused) {
            throw new RuntimeException("Failed to load key");
        }
    }

    /* renamed from: a */
    public static byte[] m44328a(byte[] bArr, C17854a aVar) throws Exception {
        int length = bArr.length + 0;
        int i = 0;
        while (i < length) {
            aVar.mo50430h(aVar.f45845c, C17854a.f45837i);
            int i2 = 0;
            while (i2 < 16) {
                bArr[i] = (byte) (bArr[i] ^ aVar.f45845c[i2]);
                i2++;
                i++;
            }
            i -= 16;
            int i3 = 0;
            while (i3 < 16) {
                byte[] bArr2 = aVar.f45845c;
                bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i]);
                i3++;
                i++;
            }
        }
        int i4 = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int length2 = bArr.length - 4;
        if (i4 < 1 || i4 > length2) {
            throw new Exception(C25541a.m63878h("Incorrectly decrypted msgLength(", i4, ")"));
        }
        byte[] bArr3 = new byte[i4];
        System.arraycopy(bArr, 4, bArr3, 0, i4);
        return bArr3;
    }
}
