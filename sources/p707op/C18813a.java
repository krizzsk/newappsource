package p707op;

import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.appboy.support.ValidationUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Vector;
import p559ii.C17601a;
import p581ji.C17854a;

/* renamed from: op.a */
public final class C18813a {

    /* renamed from: a */
    public final C17854a f47924a;

    /* renamed from: b */
    public final C17601a f47925b;

    /* renamed from: c */
    public final ByteArrayOutputStream f47926c;

    /* renamed from: op.a$a */
    public static class C18814a {

        /* renamed from: a */
        public final C17601a f47927a = new C17601a(new Vector());
    }

    public C18813a(C17854a aVar, C17601a aVar2, ByteArrayOutputStream byteArrayOutputStream) {
        this.f47924a = aVar;
        this.f47925b = aVar2;
        this.f47926c = byteArrayOutputStream;
    }

    /* renamed from: b */
    public static byte[] m45787b(byte[] bArr) {
        byte[] bArr2;
        char c;
        byte[] bArr3 = new byte[(bArr.length - 4)];
        System.arraycopy(bArr, 4, bArr3, 0, bArr.length - 4);
        String str = new String(bArr3, StandardCharsets.UTF_8);
        int length = str.length();
        if (length == 0) {
            bArr2 = new byte[0];
        } else {
            byte[] bArr4 = new byte[length];
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                int i2 = (length - 1) - i;
                if (charAt > 'J') {
                    c = 10;
                } else {
                    c = 17;
                }
                bArr4[i2] = (byte) (charAt - c);
            }
            byte[] byteArray = new BigInteger(new String(bArr4), 26).toByteArray();
            int i3 = (((length * 500) + 851) - 1) / 851;
            if (byteArray.length > i3) {
                i3 = byteArray.length;
            }
            byte[] bArr5 = new byte[i3];
            int length2 = byteArray.length - 1;
            int length3 = byteArray.length;
            int i4 = 0;
            while (i4 < length3) {
                bArr5[length2] = byteArray[i4];
                i4++;
                length2--;
            }
            bArr2 = bArr5;
        }
        int length4 = bArr2.length;
        do {
            length4--;
            if (length4 < 0 || bArr2[length4] != 0) {
            }
            length4--;
            break;
        } while (bArr2[length4] != 0);
        return Arrays.copyOfRange(bArr2, 0, ((length4 + RecyclerView.C1119a0.FLAG_IGNORE) / RecyclerView.C1119a0.FLAG_IGNORE) * RecyclerView.C1119a0.FLAG_IGNORE);
    }

    /* renamed from: a */
    public final byte[] mo51307a(byte[] bArr) throws IOException {
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        byte[] bArr3 = new byte[32];
        byte[] b = m45787b(bArr);
        System.arraycopy(b, (b.length / 2) - 16, bArr3, 0, 32);
        byte[] bArr4 = new byte[1];
        C21100e.m49311H0(6, 2, 1, bArr4);
        C21100e.m49311H0(4, 2, 1, bArr4);
        C21100e.m49311H0(0, 4, 0, bArr4);
        this.f47926c.flush();
        byte[] byteArray = this.f47926c.toByteArray();
        C17601a aVar = this.f47925b;
        C17854a aVar2 = this.f47924a;
        aVar.getClass();
        int length = byteArray.length + 4 + 8;
        if (length % 16 != 0) {
            length = ((length / 16) + 1) * 16;
        }
        byte[] bArr5 = new byte[length];
        int length2 = byteArray.length;
        System.arraycopy(new byte[]{(byte) ((length2 >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH), (byte) ((length2 >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH), (byte) ((length2 >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH), (byte) ((length2 >> 0) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)}, 0, bArr5, 0, 4);
        System.arraycopy(byteArray, 0, bArr5, 4, byteArray.length);
        aVar2.mo50426b(bArr3);
        aVar2.mo50425a(0, length / 16, bArr5);
        byte[] D = C21100e.m49302D(m45787b(bArr), C21100e.m49302D(bArr4, bArr5));
        int length3 = D.length;
        byte[] bArr6 = new byte[length3];
        System.arraycopy(D, 0, bArr6, 0, D.length);
        int i = ((((length3 * 851) + 500) - 1) / 500) + 0;
        byte[] bArr7 = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = 0;
            for (int i4 = length3 - 1; i4 >= 0; i4--) {
                int i5 = (i3 << 8) + (bArr6[i4] & 255);
                byte b2 = (byte) (i5 / 26);
                bArr6[i4] = b2;
                i3 = i5 - ((b2 & 255) * 26);
            }
            bArr7[i2] = (byte) (i3 + 65);
        }
        return C21100e.m49302D(bArr2, bArr7);
    }
}
