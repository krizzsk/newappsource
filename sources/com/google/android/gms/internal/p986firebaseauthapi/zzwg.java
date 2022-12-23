package com.google.android.gms.internal.p986firebaseauthapi;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import p382be.C13597f;
import p743qd.C19107d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwg */
public final class zzwg extends AsyncTask {
    private static final Logger zza = new Logger("FirebaseAuth", "GetAuthDomainTask");
    private final String zzb;
    private final String zzc;
    private final WeakReference zzd;
    private final Uri.Builder zze;
    private final String zzf;
    private final C19107d zzg;

    public zzwg(String str, String str2, Intent intent, C19107d dVar, zzwi zzwi) {
        this.zzb = Preconditions.checkNotEmpty(str);
        this.zzg = (C19107d) Preconditions.checkNotNull(dVar);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(intent);
        String checkNotEmpty = Preconditions.checkNotEmpty(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder buildUpon = Uri.parse(zzwi.zzc(checkNotEmpty)).buildUpon();
        buildUpon.appendPath("getProjectConfig").appendQueryParameter(LinksConfiguration.KEY_KEY, checkNotEmpty).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) Preconditions.checkNotNull(str2));
        this.zzc = buildUpon.build().toString();
        this.zzd = new WeakReference(zzwi);
        this.zze = zzwi.zzb(intent, str, str2);
        this.zzf = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* access modifiers changed from: private */
    /* renamed from: zza */
    public final void onPostExecute(zzwf zzwf) {
        String str;
        Uri.Builder builder;
        zzwi zzwi = (zzwi) this.zzd.get();
        String str2 = null;
        if (zzwf != null) {
            str2 = zzwf.zzc();
            str = zzwf.zzd();
        } else {
            str = null;
        }
        if (zzwi == null) {
            zza.mo65852e("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str2) || (builder = this.zze) == null) {
            zzwi.zze(this.zzb, C13597f.m34015a(str));
        } else {
            builder.authority(str2);
            zzwi.zzf(this.zze.build(), this.zzb);
        }
    }

    private static byte[] zzb(InputStream inputStream, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[RecyclerView.C1119a0.FLAG_IGNORE];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e9, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ea, code lost:
        zza.mo65852e("ConversionException encountered: ".concat(java.lang.String.valueOf(r1.getMessage())), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0100, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0101, code lost:
        zza.mo65852e("Null pointer encountered: ".concat(java.lang.String.valueOf(r1.getMessage())), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0117, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0118, code lost:
        zza.mo65852e("IOException occurred: ".concat(java.lang.String.valueOf(r1.getMessage())), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00ce A[Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e9 A[ExcHandler: zzui (r1v8 'e' com.google.android.gms.internal.firebase-auth-api.zzui A[CUSTOM_DECLARE]), Splitter:B:4:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0100 A[ExcHandler: NullPointerException (r1v4 'e' java.lang.NullPointerException A[CUSTOM_DECLARE]), Splitter:B:4:0x0014] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r7) {
        /*
            r6 = this;
            java.lang.Void[] r7 = (java.lang.Void[]) r7
            java.lang.String r7 = r6.zzf
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r0 = 0
            if (r7 != 0) goto L_0x0013
            java.lang.String r7 = r6.zzf
            com.google.android.gms.internal.firebase-auth-api.zzwf r0 = com.google.android.gms.internal.p986firebaseauthapi.zzwf.zza(r7)
            goto L_0x012d
        L_0x0013:
            r7 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.lang.String r2 = r6.zzc     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.lang.ref.WeakReference r2 = r6.zzd     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            com.google.android.gms.internal.firebase-auth-api.zzwi r2 = (com.google.android.gms.internal.p986firebaseauthapi.zzwi) r2     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.net.HttpURLConnection r1 = r2.zzd(r1)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/json; charset=UTF-8"
            r1.addRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r3 = 60000(0xea60, float:8.4078E-41)
            r1.setConnectTimeout(r3)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            com.google.android.gms.internal.firebase-auth-api.zzws r3 = new com.google.android.gms.internal.firebase-auth-api.zzws     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            android.content.Context r2 = r2.zza()     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            qd.d r4 = r6.zzg     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            com.google.android.gms.internal.firebase-auth-api.zzwq r5 = com.google.android.gms.internal.p986firebaseauthapi.zzwq.zza()     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.lang.String r5 = r5.zzb()     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r3.<init>(r2, r4, r5)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r3.zza(r1)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 128(0x80, float:1.794E-43)
            if (r2 == r3) goto L_0x00ab
            int r3 = r1.getResponseCode()     // Catch:{ IOException -> 0x0079, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r5 = 400(0x190, float:5.6E-43)
            if (r3 < r5) goto L_0x0077
            java.io.InputStream r1 = r1.getErrorStream()     // Catch:{ IOException -> 0x0079, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            if (r1 != 0) goto L_0x0065
            java.lang.String r1 = "WEB_INTERNAL_ERROR:Could not retrieve the authDomain for this project but did not receive an error response from the network request. Please try again."
            goto L_0x008c
        L_0x0065:
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x0079, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            byte[] r1 = zzb(r1, r4)     // Catch:{ IOException -> 0x0079, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0079, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r1 = com.google.android.gms.internal.p986firebaseauthapi.zzwn.zza(r3, r1)     // Catch:{ IOException -> 0x0079, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IOException -> 0x0079, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            goto L_0x008c
        L_0x0077:
            r1 = r0
            goto L_0x008c
        L_0x0079:
            r1 = move-exception
            com.google.android.gms.common.logging.Logger r3 = zza     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.lang.String r4 = "Error parsing error message from response body in getErrorMessageFromBody. "
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.lang.String r1 = r4.concat(r1)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r3.mo65859w(r1, r4)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            goto L_0x0077
        L_0x008c:
            com.google.android.gms.common.logging.Logger r3 = zza     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r4[r7] = r1     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r5 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r4[r5] = r2     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.lang.String r2 = "Error getting project config. Failed with %s %s"
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.lang.Object[] r4 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r3.mo65852e(r2, r4)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            com.google.android.gms.internal.firebase-auth-api.zzwf r0 = com.google.android.gms.internal.p986firebaseauthapi.zzwf.zzb(r1)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            goto L_0x012d
        L_0x00ab:
            com.google.android.gms.internal.firebase-auth-api.zzyz r2 = new com.google.android.gms.internal.firebase-auth-api.zzyz     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r2.<init>()     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.lang.String r3 = new java.lang.String     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.io.InputStream r1 = r1.getInputStream()     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            byte[] r1 = zzb(r1, r4)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            r2.zzb(r3)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.util.List r1 = r2.zzc()     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
        L_0x00c8:
            boolean r2 = r1.hasNext()     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            if (r2 == 0) goto L_0x012d
            java.lang.Object r2 = r1.next()     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            java.lang.String r3 = "firebaseapp.com"
            boolean r3 = r2.endsWith(r3)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            if (r3 != 0) goto L_0x00e4
            java.lang.String r3 = "web.app"
            boolean r3 = r2.endsWith(r3)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            if (r3 == 0) goto L_0x00c8
        L_0x00e4:
            com.google.android.gms.internal.firebase-auth-api.zzwf r0 = com.google.android.gms.internal.p986firebaseauthapi.zzwf.zza(r2)     // Catch:{ IOException -> 0x0117, NullPointerException -> 0x0100, zzui -> 0x00e9 }
            goto L_0x012d
        L_0x00e9:
            r1 = move-exception
            com.google.android.gms.common.logging.Logger r2 = zza
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "ConversionException encountered: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.mo65852e(r1, r7)
            goto L_0x012d
        L_0x0100:
            r1 = move-exception
            com.google.android.gms.common.logging.Logger r2 = zza
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "Null pointer encountered: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.mo65852e(r1, r7)
            goto L_0x012d
        L_0x0117:
            r1 = move-exception
            com.google.android.gms.common.logging.Logger r2 = zza
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "IOException occurred: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r2.mo65852e(r1, r7)
        L_0x012d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p986firebaseauthapi.zzwg.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public final /* synthetic */ void onCancelled(Object obj) {
        zzwf zzwf = (zzwf) obj;
        onPostExecute((zzwf) null);
    }
}
