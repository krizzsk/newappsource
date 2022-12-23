package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzakk implements zzakl {
    private static final Logger zzb = Logger.getLogger(zzakk.class.getName());
    public final ThreadLocal zza = new zzakj(this);

    public abstract zzako zza(String str, byte[] bArr, String str2);

    public final zzako zzb(zzgpg zzgpg, zzakp zzakp) throws IOException {
        int zza2;
        long j;
        String str;
        long zzb2 = zzgpg.zzb();
        ((ByteBuffer) this.zza.get()).rewind().limit(8);
        do {
            zza2 = zzgpg.zza((ByteBuffer) this.zza.get());
            if (zza2 == 8) {
                ((ByteBuffer) this.zza.get()).rewind();
                long zze = zzakn.zze((ByteBuffer) this.zza.get());
                byte[] bArr = null;
                if (zze >= 8 || zze <= 1) {
                    byte[] bArr2 = new byte[4];
                    ((ByteBuffer) this.zza.get()).get(bArr2);
                    try {
                        String str2 = new String(bArr2, "ISO-8859-1");
                        if (zze == 1) {
                            ((ByteBuffer) this.zza.get()).limit(16);
                            zzgpg.zza((ByteBuffer) this.zza.get());
                            ((ByteBuffer) this.zza.get()).position(8);
                            j = zzakn.zzf((ByteBuffer) this.zza.get()) - 16;
                        } else if (zze == 0) {
                            j = zzgpg.zzc() - zzgpg.zzb();
                        } else {
                            j = zze - 8;
                        }
                        if ("uuid".equals(str2)) {
                            ((ByteBuffer) this.zza.get()).limit(((ByteBuffer) this.zza.get()).limit() + 16);
                            zzgpg.zza((ByteBuffer) this.zza.get());
                            bArr = new byte[16];
                            for (int position = ((ByteBuffer) this.zza.get()).position() - 16; position < ((ByteBuffer) this.zza.get()).position(); position++) {
                                bArr[position - (((ByteBuffer) this.zza.get()).position() - 16)] = ((ByteBuffer) this.zza.get()).get(position);
                            }
                            j -= 16;
                        }
                        long j2 = j;
                        if (zzakp instanceof zzako) {
                            str = ((zzako) zzakp).zza();
                        } else {
                            str = "";
                        }
                        zzako zza3 = zza(str2, bArr, str);
                        zza3.zzc(zzakp);
                        ((ByteBuffer) this.zza.get()).rewind();
                        zza3.zzb(zzgpg, (ByteBuffer) this.zza.get(), j2, this);
                        return zza3;
                    } catch (UnsupportedEncodingException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    Logger logger = zzb;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(zze);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
            }
        } while (zza2 >= 0);
        zzgpg.zze(zzb2);
        throw new EOFException();
    }
}
