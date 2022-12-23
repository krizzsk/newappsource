package p358af;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: af.h */
public final class C13441h {

    /* renamed from: a */
    public static final byte f33296a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f33297b = Byte.parseByte("00001111", 2);

    /* renamed from: a */
    public static String m33720a() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b = array[0];
        array[16] = b;
        array[0] = (byte) ((b & f33297b) | f33296a);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
