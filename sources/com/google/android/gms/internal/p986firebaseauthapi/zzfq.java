package com.google.android.gms.internal.p986firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.CharConversionException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfq */
public final class zzfq {
    private final SharedPreferences zza;
    private final String zzb = "GenericIdpKeyset";

    public zzfq(Context context, String str, String str2) throws IOException {
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            this.zza = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        } else {
            this.zza = applicationContext.getSharedPreferences(str2, 0);
        }
    }

    private final byte[] zzc() throws IOException {
        try {
            String string = this.zza.getString(this.zzb, (String) null);
            if (string == null) {
                throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", new Object[]{this.zzb}));
            } else if (string.length() % 2 == 0) {
                int length = string.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i2 = i + i;
                    int digit = Character.digit(string.charAt(i2), 16);
                    int digit2 = Character.digit(string.charAt(i2 + 1), 16);
                    if (digit == -1 || digit2 == -1) {
                        throw new IllegalArgumentException("input is not hexadecimal");
                    }
                    bArr[i] = (byte) ((digit * 16) + digit2);
                }
                return bArr;
            } else {
                throw new IllegalArgumentException("Expected a string of even length");
            }
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", new Object[]{this.zzb}));
        }
    }

    public final zzlq zza() throws IOException {
        return zzlq.zzc(zzc(), zzabu.zza());
    }

    public final zznh zzb() throws IOException {
        return zznh.zzf(zzc(), zzabu.zza());
    }
}
