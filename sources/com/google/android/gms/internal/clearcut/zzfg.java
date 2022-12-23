package com.google.android.gms.internal.clearcut;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;

abstract class zzfg {
    public static void zzc(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i2 = 0;
        while (i2 < length) {
            try {
                char charAt = charSequence.charAt(i2);
                if (charAt >= 128) {
                    break;
                }
                byteBuffer.put(position + i2, (byte) charAt);
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                int position2 = byteBuffer.position();
                char charAt2 = charSequence.charAt(i2);
                StringBuilder sb = new StringBuilder(37);
                sb.append("Failed writing ");
                sb.append(charAt2);
                sb.append(" at index ");
                sb.append(Math.max(i2, (position - byteBuffer.position()) + 1) + position2);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
        }
        if (i2 == length) {
            byteBuffer.position(position + i2);
            return;
        }
        position += i2;
        while (i2 < length) {
            char charAt3 = charSequence.charAt(i2);
            if (charAt3 < 128) {
                byteBuffer.put(position, (byte) charAt3);
            } else if (charAt3 < 2048) {
                i = position + 1;
                try {
                    byteBuffer.put(position, (byte) ((charAt3 >>> 6) | 192));
                    byteBuffer.put(i, (byte) ((charAt3 & '?') | 128));
                    position = i;
                } catch (IndexOutOfBoundsException unused2) {
                    position = i;
                    int position22 = byteBuffer.position();
                    char charAt22 = charSequence.charAt(i2);
                    StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Failed writing ");
                    sb2.append(charAt22);
                    sb2.append(" at index ");
                    sb2.append(Math.max(i2, (position - byteBuffer.position()) + 1) + position22);
                    throw new ArrayIndexOutOfBoundsException(sb2.toString());
                }
            } else if (charAt3 < 55296 || 57343 < charAt3) {
                i = position + 1;
                byteBuffer.put(position, (byte) ((charAt3 >>> 12) | 224));
                position = i + 1;
                byteBuffer.put(i, (byte) (((charAt3 >>> 6) & 63) | RecyclerView.C1119a0.FLAG_IGNORE));
                byteBuffer.put(position, (byte) ((charAt3 & '?') | 128));
            } else {
                int i3 = i2 + 1;
                if (i3 != length) {
                    try {
                        char charAt4 = charSequence.charAt(i3);
                        if (Character.isSurrogatePair(charAt3, charAt4)) {
                            int codePoint = Character.toCodePoint(charAt3, charAt4);
                            int i4 = position + 1;
                            try {
                                byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                position = i4 + 1;
                                byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | RecyclerView.C1119a0.FLAG_IGNORE));
                                i4 = position + 1;
                                byteBuffer.put(position, (byte) (((codePoint >>> 6) & 63) | RecyclerView.C1119a0.FLAG_IGNORE));
                                byteBuffer.put(i4, (byte) ((codePoint & 63) | RecyclerView.C1119a0.FLAG_IGNORE));
                                position = i4;
                                i2 = i3;
                            } catch (IndexOutOfBoundsException unused3) {
                                position = i4;
                                i2 = i3;
                                int position222 = byteBuffer.position();
                                char charAt222 = charSequence.charAt(i2);
                                StringBuilder sb22 = new StringBuilder(37);
                                sb22.append("Failed writing ");
                                sb22.append(charAt222);
                                sb22.append(" at index ");
                                sb22.append(Math.max(i2, (position - byteBuffer.position()) + 1) + position222);
                                throw new ArrayIndexOutOfBoundsException(sb22.toString());
                            }
                        } else {
                            i2 = i3;
                        }
                    } catch (IndexOutOfBoundsException unused4) {
                        i2 = i3;
                        int position2222 = byteBuffer.position();
                        char charAt2222 = charSequence.charAt(i2);
                        StringBuilder sb222 = new StringBuilder(37);
                        sb222.append("Failed writing ");
                        sb222.append(charAt2222);
                        sb222.append(" at index ");
                        sb222.append(Math.max(i2, (position - byteBuffer.position()) + 1) + position2222);
                        throw new ArrayIndexOutOfBoundsException(sb222.toString());
                    }
                }
                throw new zzfi(i2, length);
            }
            i2++;
            position++;
        }
        byteBuffer.position(position);
    }

    public abstract int zzb(int i, byte[] bArr, int i2, int i3);

    public abstract int zzb(CharSequence charSequence, byte[] bArr, int i, int i2);

    public abstract void zzb(CharSequence charSequence, ByteBuffer byteBuffer);

    public final boolean zze(byte[] bArr, int i, int i2) {
        return zzb(0, bArr, i, i2) == 0;
    }
}
