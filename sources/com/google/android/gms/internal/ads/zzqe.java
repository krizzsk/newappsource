package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

public interface zzqe {
    int zza();

    int zzb(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzc();

    ByteBuffer zzf(int i);

    ByteBuffer zzg(int i);

    void zzi();

    void zzj(int i, int i2, int i3, long j, int i4);

    void zzk(int i, int i2, zzfz zzfz, long j, int i3);

    void zzl();

    void zzm(int i, long j);

    void zzn(int i, boolean z);

    void zzo(Surface surface);

    void zzp(Bundle bundle);

    void zzq(int i);

    boolean zzr();
}
