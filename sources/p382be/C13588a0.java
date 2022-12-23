package p382be;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.internal.p986firebaseauthapi.zzaq;
import com.google.android.gms.internal.p986firebaseauthapi.zzau;
import com.google.android.gms.internal.p986firebaseauthapi.zzbj;
import com.google.android.gms.internal.p986firebaseauthapi.zzei;
import com.google.android.gms.internal.p986firebaseauthapi.zzen;
import com.google.android.gms.internal.p986firebaseauthapi.zzfl;
import com.google.android.gms.internal.p986firebaseauthapi.zzfn;
import com.google.android.gms.internal.p986firebaseauthapi.zzu;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* renamed from: be.a0 */
public final class C13588a0 {

    /* renamed from: c */
    public static C13588a0 f33561c;

    /* renamed from: a */
    public final String f33562a;

    /* renamed from: b */
    public final zzfn f33563b;

    public C13588a0(Context context, String str) {
        zzfn zzfn;
        this.f33562a = str;
        try {
            zzei.zza();
            zzfl zzfl = new zzfl();
            zzfl.zzf(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", new Object[]{str}));
            zzfl.zzd(zzen.zza);
            zzfl.zze(String.format("android-keystore://firebear_master_key_id.%s", new Object[]{str}));
            zzfn = zzfl.zzg();
        } catch (IOException | GeneralSecurityException e) {
            "Exception encountered during crypto setup:\n".concat(String.valueOf(e.getMessage()));
            zzfn = null;
        }
        this.f33563b = zzfn;
    }

    /* renamed from: a */
    public static C13588a0 m34012a(Context context, String str) {
        C13588a0 a0Var = f33561c;
        if (a0Var == null || !zzu.zza(a0Var.f33562a, str)) {
            f33561c = new C13588a0(context, str);
        }
        return f33561c;
    }

    /* renamed from: b */
    public final String mo40486b(String str) {
        String str2;
        zzfn zzfn = this.f33563b;
        if (zzfn != null) {
            try {
                synchronized (zzfn) {
                    str2 = new String(((zzau) this.f33563b.zza().zze(zzau.class)).zza(Base64.decode(str, 8), (byte[]) null), "UTF-8");
                }
                return str2;
            } catch (UnsupportedEncodingException | GeneralSecurityException e) {
                "Exception encountered while decrypting bytes:\n".concat(String.valueOf(e.getMessage()));
            }
        }
        return null;
    }

    /* renamed from: c */
    public final String mo40487c() {
        if (this.f33563b == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        zzbj zza = zzaq.zza(byteArrayOutputStream);
        try {
            synchronized (this.f33563b) {
                this.f33563b.zza().zzb().zzg(zza);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e) {
            "Exception encountered when attempting to get Public Key:\n".concat(String.valueOf(e.getMessage()));
            return null;
        }
    }
}
