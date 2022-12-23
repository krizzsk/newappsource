package com.google.android.gms.internal.mlkit_common;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import p001a0.C0017h;
import p789se.C19448b;
import p789se.C19449c;
import p789se.C19450d;
import p789se.C19451e;

final class zzbk implements C19450d {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final C19448b zzb;
    private static final C19448b zzc;
    private static final C19449c zzd = zzbj.zza;
    private OutputStream zze;
    private final Map zzf;
    private final Map zzg;
    private final C19449c zzh;
    private final zzbo zzi = new zzbo(this);

    static {
        zzbi L = C0017h.m55L(1);
        HashMap hashMap = new HashMap();
        hashMap.put(L.annotationType(), L);
        zzb = new C19448b(LinksConfiguration.KEY_KEY, C16530d.m42017j(hashMap));
        zzbi L2 = C0017h.m55L(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(L2.annotationType(), L2);
        zzc = new C19448b("value", C16530d.m42017j(hashMap2));
    }

    public zzbk(OutputStream outputStream, Map map, Map map2, C19449c cVar) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = cVar;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, C19450d dVar) throws IOException {
        dVar.add(zzb, entry.getKey());
        dVar.add(zzc, entry.getValue());
    }

    private static int zzh(C19448b bVar) {
        zzbi zzbi = (zzbi) bVar.mo51855a(zzbi.class);
        if (zzbi != null) {
            return zzbi.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final long zzi(C19449c cVar, Object obj) throws IOException {
        OutputStream outputStream;
        zzbf zzbf = new zzbf();
        try {
            outputStream = this.zze;
            this.zze = zzbf;
            cVar.encode(obj, this);
            this.zze = outputStream;
            long zza2 = zzbf.zza();
            zzbf.close();
            return zza2;
        } catch (Throwable th) {
            try {
                zzbf.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    private static zzbi zzj(C19448b bVar) {
        zzbi zzbi = (zzbi) bVar.mo51855a(zzbi.class);
        if (zzbi != null) {
            return zzbi;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final zzbk zzk(C19449c cVar, C19448b bVar, Object obj, boolean z) throws IOException {
        long zzi2 = zzi(cVar, obj);
        if (z && zzi2 == 0) {
            return this;
        }
        zzn((zzh(bVar) << 3) | 2);
        zzo(zzi2);
        cVar.encode(obj, this);
        return this;
    }

    private final zzbk zzl(C19451e eVar, C19448b bVar, Object obj, boolean z) throws IOException {
        this.zzi.zza(bVar, z);
        eVar.encode(obj, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i) throws IOException {
        while (true) {
            int i2 = (((long) (i & -128)) > 0 ? 1 : (((long) (i & -128)) == 0 ? 0 : -1));
            OutputStream outputStream = this.zze;
            if (i2 != 0) {
                outputStream.write((i & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
                i >>>= 7;
            } else {
                outputStream.write(i & 127);
                return;
            }
        }
    }

    private final void zzo(long j) throws IOException {
        while (true) {
            int i = ((-128 & j) > 0 ? 1 : ((-128 & j) == 0 ? 0 : -1));
            OutputStream outputStream = this.zze;
            if (i != 0) {
                outputStream.write((((int) j) & 127) | RecyclerView.C1119a0.FLAG_IGNORE);
                j >>>= 7;
            } else {
                outputStream.write(((int) j) & 127);
                return;
            }
        }
    }

    public final C19450d add(C19448b bVar, double d) throws IOException {
        zza(bVar, d, true);
        return this;
    }

    public final C19450d inline(Object obj) throws IOException {
        zzf(obj);
        return this;
    }

    public final C19450d nested(C19448b bVar) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    public final C19450d zza(C19448b bVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        zzn((zzh(bVar) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d).array());
        return this;
    }

    public final C19450d zzb(C19448b bVar, float f, boolean z) throws IOException {
        if (z && f == BitmapDescriptorFactory.HUE_RED) {
            return this;
        }
        zzn((zzh(bVar) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f).array());
        return this;
    }

    public final C19450d zzc(C19448b bVar, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            zzn((zzh(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzn(bytes.length);
            this.zze.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object zzc2 : (Collection) obj) {
                zzc(bVar, zzc2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry zzk : ((Map) obj).entrySet()) {
                zzk(zzd, bVar, zzk, false);
            }
            return this;
        } else if (obj instanceof Double) {
            zza(bVar, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            zzb(bVar, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            zze(bVar, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            zzd(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            zzn((zzh(bVar) << 3) | 2);
            zzn(bArr.length);
            this.zze.write(bArr);
            return this;
        } else {
            C19449c cVar = (C19449c) this.zzf.get(obj.getClass());
            if (cVar != null) {
                zzk(cVar, bVar, obj, z);
                return this;
            }
            C19451e eVar = (C19451e) this.zzg.get(obj.getClass());
            if (eVar != null) {
                zzl(eVar, bVar, obj, z);
                return this;
            } else if (obj instanceof zzbg) {
                zzd(bVar, ((zzbg) obj).zza(), true);
                return this;
            } else if (obj instanceof Enum) {
                zzd(bVar, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                zzk(this.zzh, bVar, obj, z);
                return this;
            }
        }
    }

    public final zzbk zzd(C19448b bVar, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        zzbi zzj = zzj(bVar);
        zzbh zzbh = zzbh.DEFAULT;
        int ordinal = zzj.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzj.zza() << 3);
            zzn(i);
        } else if (ordinal == 1) {
            zzn(zzj.zza() << 3);
            zzn((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            zzn((zzj.zza() << 3) | 5);
            this.zze.write(zzm(4).putInt(i).array());
        }
        return this;
    }

    public final zzbk zze(C19448b bVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        zzbi zzj = zzj(bVar);
        zzbh zzbh = zzbh.DEFAULT;
        int ordinal = zzj.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzj.zza() << 3);
            zzo(j);
        } else if (ordinal == 1) {
            zzn(zzj.zza() << 3);
            zzo((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            zzn((zzj.zza() << 3) | 1);
            this.zze.write(zzm(8).putLong(j).array());
        }
        return this;
    }

    public final zzbk zzf(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        C19449c cVar = (C19449c) this.zzf.get(obj.getClass());
        if (cVar != null) {
            cVar.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
    }

    public final C19450d add(C19448b bVar, float f) throws IOException {
        zzb(bVar, f, true);
        return this;
    }

    public final C19450d nested(String str) throws IOException {
        return nested(C19448b.m46849b(str));
    }

    public final /* synthetic */ C19450d add(C19448b bVar, int i) throws IOException {
        zzd(bVar, i, true);
        return this;
    }

    public final /* synthetic */ C19450d add(C19448b bVar, long j) throws IOException {
        zze(bVar, j, true);
        return this;
    }

    public final C19450d add(C19448b bVar, Object obj) throws IOException {
        zzc(bVar, obj, true);
        return this;
    }

    public final /* synthetic */ C19450d add(C19448b bVar, boolean z) throws IOException {
        zzd(bVar, z ? 1 : 0, true);
        return this;
    }

    public final C19450d add(String str, double d) throws IOException {
        zza(C19448b.m46849b(str), d, true);
        return this;
    }

    public final C19450d add(String str, int i) throws IOException {
        zzd(C19448b.m46849b(str), i, true);
        return this;
    }

    public final C19450d add(String str, long j) throws IOException {
        zze(C19448b.m46849b(str), j, true);
        return this;
    }

    public final C19450d add(String str, Object obj) throws IOException {
        zzc(C19448b.m46849b(str), obj, true);
        return this;
    }

    public final C19450d add(String str, boolean z) throws IOException {
        zzd(C19448b.m46849b(str), z ? 1 : 0, true);
        return this;
    }
}
