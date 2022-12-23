package com.google.android.gms.internal.mlkit_vision_face;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import p789se.C19448b;
import p789se.C19450d;
import p789se.C19452f;

final class zzdc implements C19452f {
    private boolean zza = false;
    private final C19448b zzb;
    private final C19450d zzc;

    public zzdc(C19448b bVar, C19450d dVar) {
        this.zzb = bVar;
        this.zzc = dVar;
    }

    private final void zza() {
        if (!this.zza) {
            this.zza = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    public final C19452f add(double d) throws IOException {
        zza();
        this.zzc.add(this.zzb, d);
        return this;
    }

    public final C19452f add(float f) throws IOException {
        zza();
        this.zzc.add(this.zzb, f);
        return this;
    }

    public final C19452f add(int i) throws IOException {
        zza();
        ((zzcy) this.zzc).zza(this.zzb, i);
        return this;
    }

    public final C19452f add(long j) throws IOException {
        zza();
        ((zzcy) this.zzc).zzb(this.zzb, j);
        return this;
    }

    public final C19452f add(String str) throws IOException {
        zza();
        this.zzc.add(this.zzb, (Object) str);
        return this;
    }

    public final C19452f add(boolean z) throws IOException {
        zza();
        ((zzcy) this.zzc).zzc(this.zzb, z);
        return this;
    }

    public final C19452f add(byte[] bArr) throws IOException {
        zza();
        this.zzc.add(this.zzb, (Object) bArr);
        return this;
    }
}
