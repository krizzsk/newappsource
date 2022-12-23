package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.ExecutionException;
import p434dd.C16546c0;
import p554id.C17565d;

/* renamed from: com.google.android.play.core.assetpacks.j0 */
public final class C14279j0 {

    /* renamed from: a */
    public final C16546c0 f35918a;

    public C14279j0(C16546c0 c0Var) {
        this.f35918a = c0Var;
    }

    /* renamed from: a */
    public final ParcelFileDescriptor.AutoCloseInputStream mo42847a(int i, int i2, String str, String str2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C17565d.m43680a(((C14341y2) this.f35918a.zza()).mo42875d(i, i2, str, str2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new zzck(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), i);
        } catch (ExecutionException e) {
            throw new zzck(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), e, i);
        } catch (InterruptedException e2) {
            throw new zzck("Extractor was interrupted while waiting for chunk file.", e2, i);
        }
    }
}
