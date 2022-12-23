package p428cv;

import android.content.Context;
import ce0.C21100e;
import com.tranzmate.R;
import java.util.HashMap;
import k40.C5477a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cv.g */
public final class C16506g extends C5477a<C16506g, C16507h> {

    /* renamed from: s */
    public final String f43105s;

    /* renamed from: t */
    public final JSONObject f43106t;

    public C16506g(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        super(context, (int) R.string.zooz_base_url, (int) R.string.api_path_zooz_set_cc_workaround_api, C16507h.class);
        C21100e.m49373x(str, "paymentToken");
        this.f43105s = str;
        HashMap hashMap = new HashMap();
        hashMap.put("command", "addPaymentMethod");
        hashMap.put("email", str6);
        hashMap.put("paymentToken", str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("rememberPaymentMethod", Boolean.TRUE);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("cardHolderName", (Object) null);
        hashMap3.put("cardNumber", str2);
        hashMap3.put("cvvNumber", str3);
        hashMap3.put("expirationDate", C13715c.m34245k(new StringBuilder(), str4, "/", str5));
        hashMap3.put("userIdNumber", (Object) null);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("configuration", hashMap2);
        hashMap4.put("paymentMethodDetails", hashMap3);
        hashMap4.put("paymentMethodType", "CreditCard");
        hashMap.put("paymentMethod", hashMap4);
        this.f43106t = new JSONObject(hashMap);
    }

    /* renamed from: L */
    public final JSONObject mo21361L() throws JSONException {
        return this.f43106t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0142, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0150, code lost:
        if (r5 == null) goto L_0x0155;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012b A[Catch:{ IOException -> 0x0140, all -> 0x0142 }, LOOP:2: B:49:0x0124->B:52:0x012b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0142 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:46:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014a A[SYNTHETIC, Splitter:B:59:0x014a] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0220  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6590u(p906wz.C20432d r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            super.mo6590u(r18)
            android.content.Context r2 = r1.f51759b
            java.lang.String r3 = "ZooZResponseType"
            java.lang.String r4 = "JSon"
            r0.mo52633b(r3, r4)
            r3 = 2131889849(0x7f120eb9, float:1.9414373E38)
            java.lang.String r3 = r2.getString(r3)
            java.lang.String r4 = "programId"
            r0.mo52633b(r4, r3)
            java.lang.String r3 = "android.permission.READ_PHONE_STATE"
            int r4 = r2.checkCallingOrSelfPermission(r3)
            r5 = 0
            r6 = 1
            if (r4 != 0) goto L_0x0028
            r4 = 1
            goto L_0x0029
        L_0x0028:
            r4 = 0
        L_0x0029:
            java.lang.String r7 = "phone"
            if (r4 == 0) goto L_0x0038
            java.lang.Object r4 = r2.getSystemService(r7)
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4
            java.lang.String r4 = r4.getDeviceId()
            goto L_0x0039
        L_0x0038:
            r4 = 0
        L_0x0039:
            boolean r8 = p428cv.C16510k.m41993c(r4)
            java.lang.String r9 = "android_id"
            if (r8 != 0) goto L_0x0047
            boolean r8 = p428cv.C16510k.m41994d(r4)
            if (r8 == 0) goto L_0x004f
        L_0x0047:
            android.content.ContentResolver r4 = r2.getContentResolver()
            java.lang.String r4 = android.provider.Settings.Secure.getString(r4, r9)
        L_0x004f:
            boolean r8 = p428cv.C16510k.m41993c(r4)
            java.lang.String r10 = "\\-"
            java.lang.String r11 = ""
            if (r8 != 0) goto L_0x005f
            boolean r8 = p428cv.C16510k.m41994d(r4)
            if (r8 == 0) goto L_0x00a8
        L_0x005f:
            java.lang.String r4 = "EMULATOR_UDID"
            java.lang.String r8 = p428cv.C16510k.m41991a(r2, r4)
            if (r8 == 0) goto L_0x0069
        L_0x0067:
            r4 = r8
            goto L_0x00a8
        L_0x0069:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
        L_0x006e:
            int r12 = r8.length()
            r13 = 15
            if (r12 >= r13) goto L_0x00a0
            java.util.UUID r12 = java.util.UUID.randomUUID()
            java.lang.String r12 = r12.toString()
            java.lang.String r12 = r12.replaceAll(r10, r11)
            r14 = 0
        L_0x0083:
            int r15 = r12.length()
            if (r14 >= r15) goto L_0x006e
            char r15 = r12.charAt(r14)
            boolean r16 = java.lang.Character.isDigit(r15)
            if (r16 == 0) goto L_0x009d
            r8.append(r15)
            int r15 = r8.length()
            if (r15 != r13) goto L_0x009d
            goto L_0x006e
        L_0x009d:
            int r14 = r14 + 1
            goto L_0x0083
        L_0x00a0:
            java.lang.String r8 = r8.toString()
            p428cv.C16510k.m41995e(r2, r4, r8)     // Catch:{ Exception -> 0x0067 }
            goto L_0x0067
        L_0x00a8:
            java.lang.String r8 = "ZooZ-UDID"
            r0.mo52633b(r8, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r8 = "ZoozEcommAndroidSDK/1.01/"
            r4.append(r8)
            java.lang.String r8 = r2.getPackageName()
            r4.append(r8)
            java.lang.String r8 = " ("
            r4.append(r8)
            java.lang.String r8 = android.os.Build.MODEL
            r4.append(r8)
            java.lang.String r8 = "; Android/"
            r4.append(r8)
            int r8 = android.os.Build.VERSION.SDK_INT
            r4.append(r8)
            java.lang.String r8 = ")"
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            java.lang.String r8 = "User-Agent"
            r0.mo52633b(r8, r4)
            java.lang.String r4 = r1.f43105s
            java.lang.String r8 = "ZooZ-Token"
            r0.mo52633b(r8, r4)
            android.accounts.AccountManager r4 = android.accounts.AccountManager.get(r2)     // Catch:{ SecurityException -> 0x00f9 }
            java.lang.String r8 = "com.google"
            android.accounts.Account[] r4 = r4.getAccountsByType(r8)     // Catch:{ SecurityException -> 0x00f9 }
            int r8 = r4.length     // Catch:{ SecurityException -> 0x00f9 }
            if (r8 <= 0) goto L_0x00f9
            r4 = r4[r5]     // Catch:{ SecurityException -> 0x00f9 }
            java.lang.String r4 = r4.name     // Catch:{ SecurityException -> 0x00f9 }
            goto L_0x00fa
        L_0x00f9:
            r4 = 0
        L_0x00fa:
            java.lang.String r5 = "devicePersonalizedName"
            r0.mo52633b(r5, r4)
            java.lang.String r4 = "applicationVersion"
            java.lang.String r5 = "1.01"
            r0.mo52633b(r4, r5)
            r4 = 10
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r5 = "/system/bin/cat"
            java.lang.String r8 = "/proc/cpuinfo"
            java.lang.String[] r5 = new java.lang.String[]{r5, r8}     // Catch:{ IOException -> 0x014e, all -> 0x0146 }
            java.lang.ProcessBuilder r8 = new java.lang.ProcessBuilder     // Catch:{ IOException -> 0x014e, all -> 0x0146 }
            r8.<init>(r5)     // Catch:{ IOException -> 0x014e, all -> 0x0146 }
            java.lang.Process r5 = r8.start()     // Catch:{ IOException -> 0x014e, all -> 0x0146 }
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ IOException -> 0x014e, all -> 0x0146 }
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch:{ IOException -> 0x0144, all -> 0x0142 }
            r12 = r11
        L_0x0124:
            int r13 = r5.read(r8)     // Catch:{ IOException -> 0x0140, all -> 0x0142 }
            r14 = -1
            if (r13 == r14) goto L_0x0152
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0140, all -> 0x0142 }
            r13.<init>()     // Catch:{ IOException -> 0x0140, all -> 0x0142 }
            r13.append(r12)     // Catch:{ IOException -> 0x0140, all -> 0x0142 }
            java.lang.String r14 = new java.lang.String     // Catch:{ IOException -> 0x0140, all -> 0x0142 }
            r14.<init>(r8)     // Catch:{ IOException -> 0x0140, all -> 0x0142 }
            r13.append(r14)     // Catch:{ IOException -> 0x0140, all -> 0x0142 }
            java.lang.String r12 = r13.toString()     // Catch:{ IOException -> 0x0140, all -> 0x0142 }
            goto L_0x0124
        L_0x0140:
            goto L_0x0150
        L_0x0142:
            r0 = move-exception
            goto L_0x0148
        L_0x0144:
            goto L_0x014f
        L_0x0146:
            r0 = move-exception
            r5 = 0
        L_0x0148:
            if (r5 == 0) goto L_0x014d
            r5.close()     // Catch:{ IOException -> 0x014d }
        L_0x014d:
            throw r0
        L_0x014e:
            r5 = 0
        L_0x014f:
            r12 = r11
        L_0x0150:
            if (r5 == 0) goto L_0x0155
        L_0x0152:
            r5.close()     // Catch:{ IOException -> 0x0155 }
        L_0x0155:
            java.lang.String r5 = "line.separator"
            java.lang.String r5 = java.lang.System.getProperty(r5)
            java.lang.String[] r5 = r12.split(r5)
            int r8 = r5.length
            r12 = 0
            r13 = 0
        L_0x0162:
            if (r12 >= r8) goto L_0x0184
            r14 = r5[r12]
            java.lang.String r15 = "Serial"
            boolean r15 = r14.startsWith(r15)
            if (r15 == 0) goto L_0x0181
            java.lang.String r13 = ":"
            java.lang.String[] r13 = r14.split(r13)
            int r14 = r13.length
            if (r14 <= r6) goto L_0x017e
            r13 = r13[r6]
            java.lang.String r13 = r13.trim()
            goto L_0x0181
        L_0x017e:
            r14 = 0
            r13 = r13[r14]
        L_0x0181:
            int r12 = r12 + 1
            goto L_0x0162
        L_0x0184:
            boolean r5 = p428cv.C16510k.m41993c(r13)
            if (r5 != 0) goto L_0x0192
            java.lang.String r5 = "0000000000000000"
            boolean r5 = r13.equals(r5)
            if (r5 == 0) goto L_0x019a
        L_0x0192:
            java.lang.String r5 = "EMULATOR_CPU"
            java.lang.String r13 = p428cv.C16510k.m41991a(r2, r5)
            if (r13 == 0) goto L_0x019c
        L_0x019a:
            r5 = 0
            goto L_0x01b5
        L_0x019c:
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.replaceAll(r10, r11)
            r10 = 16
            r12 = 0
            java.lang.String r13 = r8.substring(r12, r10)
            p428cv.C16510k.m41995e(r2, r5, r13)     // Catch:{ Exception -> 0x01b3 }
            goto L_0x019a
        L_0x01b3:
            goto L_0x019a
        L_0x01b5:
            java.util.Locale r8 = java.util.Locale.ENGLISH
            java.lang.String r8 = r13.toUpperCase(r8)
            r4[r5] = r8
            java.lang.String r5 = android.os.Build.DISPLAY
            r4[r6] = r5
            r5 = 2
            java.lang.String r8 = android.os.Build.DEVICE
            r4[r5] = r8
            r5 = 3
            java.lang.String r8 = android.os.Build.FINGERPRINT
            r4[r5] = r8
            r5 = 4
            java.lang.String r8 = android.os.Build.HARDWARE
            r4[r5] = r8
            r5 = 5
            java.lang.String r8 = android.os.Build.ID
            r4[r5] = r8
            r5 = 6
            java.lang.String r8 = "MemTotal"
            java.lang.String r8 = p428cv.C16510k.m41992b(r8)
            r4[r5] = r8
            r5 = 7
            java.lang.String r8 = "Slab"
            java.lang.String r8 = p428cv.C16510k.m41992b(r8)
            r4[r5] = r8
            r5 = 8
            java.lang.String r8 = "os.version"
            java.lang.String r8 = java.lang.System.getProperty(r8)
            r4[r5] = r8
            int r3 = r2.checkCallingOrSelfPermission(r3)
            if (r3 != 0) goto L_0x01f8
            goto L_0x01f9
        L_0x01f8:
            r6 = 0
        L_0x01f9:
            if (r6 == 0) goto L_0x0206
            java.lang.Object r3 = r2.getSystemService(r7)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            java.lang.String r3 = r3.getDeviceId()
            goto L_0x0207
        L_0x0206:
            r3 = 0
        L_0x0207:
            android.content.ContentResolver r2 = r2.getContentResolver()
            java.lang.String r2 = android.provider.Settings.Secure.getString(r2, r9)
            java.lang.String r5 = "IMEI="
            java.lang.String r6 = ";AndroidId="
            java.lang.String r2 = p379.C25541a.m63882l(r5, r3, r6, r2)
            r3 = 9
            r4[r3] = r2
            r2 = 0
        L_0x021c:
            java.lang.String r5 = "\""
            if (r2 >= r3) goto L_0x0250
            r6 = r4[r2]
            boolean r6 = p428cv.C16510k.m41993c(r6)
            if (r6 != 0) goto L_0x024d
            java.lang.StringBuilder r6 = p379.C13555b.m33972k(r11)
            r7 = r4[r2]
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r5)
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r6.append(r5)
            java.lang.String r5 = ","
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r11 = r5
        L_0x024d:
            int r2 = r2 + 1
            goto L_0x021c
        L_0x0250:
            java.lang.StringBuilder r3 = p379.C13555b.m33972k(r11)
            r2 = r4[r2]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            r4.append(r2)
            r4.append(r5)
            java.lang.String r2 = r4.toString()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "deviceSignature"
            r0.mo52633b(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p428cv.C16506g.mo6590u(wz.d):void");
    }
}
