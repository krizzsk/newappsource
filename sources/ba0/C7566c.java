package ba0;

import android.telephony.PhoneNumberUtils;
import android.text.TextWatcher;
import com.google.i18n.phonenumbers.C14562a;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import java.util.Locale;

/* renamed from: ba0.c */
public final class C7566c implements TextWatcher {

    /* renamed from: b */
    public final C14562a f23059b;

    /* renamed from: c */
    public boolean f23060c;

    /* renamed from: d */
    public boolean f23061d;

    public C7566c() {
        this(Locale.getDefault().getCountry());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void afterTextChanged(android.text.Editable r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.f23061d     // Catch:{ all -> 0x00c5 }
            r1 = 1
            if (r0 == 0) goto L_0x0010
            int r12 = r12.length()     // Catch:{ all -> 0x00c5 }
            if (r12 != 0) goto L_0x000e
            r11.f23061d = r1     // Catch:{ all -> 0x00c5 }
        L_0x000e:
            monitor-exit(r11)
            return
        L_0x0010:
            boolean r0 = r11.f23060c     // Catch:{ all -> 0x00c5 }
            if (r0 == 0) goto L_0x0016
            monitor-exit(r11)
            return
        L_0x0016:
            int r0 = android.text.Selection.getSelectionEnd(r12)     // Catch:{ all -> 0x00c5 }
            com.google.i18n.phonenumbers.a r2 = r11.f23059b     // Catch:{ all -> 0x00c5 }
            r2.mo43865g()     // Catch:{ all -> 0x00c5 }
            int r0 = r0 - r1
            int r2 = r12.length()     // Catch:{ all -> 0x00c5 }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0029:
            if (r5 >= r2) goto L_0x0053
            char r8 = r12.charAt(r5)     // Catch:{ all -> 0x00c5 }
            boolean r9 = android.telephony.PhoneNumberUtils.isNonSeparator(r8)     // Catch:{ all -> 0x00c5 }
            if (r9 == 0) goto L_0x004d
            if (r6 == 0) goto L_0x004c
            if (r7 == 0) goto L_0x0042
            com.google.i18n.phonenumbers.a r3 = r11.f23059b     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = r3.mo43869k(r6, r1)     // Catch:{ all -> 0x00c5 }
            r3.f36758a = r6     // Catch:{ all -> 0x00c5 }
            goto L_0x004a
        L_0x0042:
            com.google.i18n.phonenumbers.a r3 = r11.f23059b     // Catch:{ all -> 0x00c5 }
            java.lang.String r6 = r3.mo43869k(r6, r4)     // Catch:{ all -> 0x00c5 }
            r3.f36758a = r6     // Catch:{ all -> 0x00c5 }
        L_0x004a:
            r3 = r6
            r7 = 0
        L_0x004c:
            r6 = r8
        L_0x004d:
            if (r5 != r0) goto L_0x0050
            r7 = 1
        L_0x0050:
            int r5 = r5 + 1
            goto L_0x0029
        L_0x0053:
            if (r6 == 0) goto L_0x0069
            if (r7 == 0) goto L_0x0060
            com.google.i18n.phonenumbers.a r0 = r11.f23059b     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = r0.mo43869k(r6, r1)     // Catch:{ all -> 0x00c5 }
            r0.f36758a = r2     // Catch:{ all -> 0x00c5 }
            goto L_0x0068
        L_0x0060:
            com.google.i18n.phonenumbers.a r0 = r11.f23059b     // Catch:{ all -> 0x00c5 }
            java.lang.String r2 = r0.mo43869k(r6, r4)     // Catch:{ all -> 0x00c5 }
            r0.f36758a = r2     // Catch:{ all -> 0x00c5 }
        L_0x0068:
            r3 = r2
        L_0x0069:
            if (r3 == 0) goto L_0x00b6
            com.google.i18n.phonenumbers.a r0 = r11.f23059b     // Catch:{ all -> 0x00c5 }
            boolean r2 = r0.f36763f     // Catch:{ all -> 0x00c5 }
            if (r2 != 0) goto L_0x0074
            int r0 = r0.f36772o     // Catch:{ all -> 0x00c5 }
            goto L_0x0096
        L_0x0074:
            r2 = 0
            r5 = 0
        L_0x0076:
            int r6 = r0.f36773p     // Catch:{ all -> 0x00c5 }
            if (r5 >= r6) goto L_0x0095
            java.lang.String r6 = r0.f36758a     // Catch:{ all -> 0x00c5 }
            int r6 = r6.length()     // Catch:{ all -> 0x00c5 }
            if (r2 >= r6) goto L_0x0095
            java.lang.StringBuilder r6 = r0.f36762e     // Catch:{ all -> 0x00c5 }
            char r6 = r6.charAt(r5)     // Catch:{ all -> 0x00c5 }
            java.lang.String r7 = r0.f36758a     // Catch:{ all -> 0x00c5 }
            char r7 = r7.charAt(r2)     // Catch:{ all -> 0x00c5 }
            if (r6 != r7) goto L_0x0092
            int r5 = r5 + 1
        L_0x0092:
            int r2 = r2 + 1
            goto L_0x0076
        L_0x0095:
            r0 = r2
        L_0x0096:
            r11.f23060c = r1     // Catch:{ all -> 0x00c5 }
            r6 = 0
            int r7 = r12.length()     // Catch:{ all -> 0x00c5 }
            r9 = 0
            int r10 = r3.length()     // Catch:{ all -> 0x00c5 }
            r5 = r12
            r8 = r3
            r5.replace(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = r12.toString()     // Catch:{ all -> 0x00c5 }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x00c5 }
            if (r1 == 0) goto L_0x00b4
            android.text.Selection.setSelection(r12, r0)     // Catch:{ all -> 0x00c5 }
        L_0x00b4:
            r11.f23060c = r4     // Catch:{ all -> 0x00c5 }
        L_0x00b6:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00c5 }
            r1 = 23
            if (r0 < r1) goto L_0x00c3
            int r0 = r12.length()     // Catch:{ all -> 0x00c5 }
            android.telephony.PhoneNumberUtils.addTtsSpan(r12, 0, r0)     // Catch:{ all -> 0x00c5 }
        L_0x00c3:
            monitor-exit(r11)
            return
        L_0x00c5:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ba0.C7566c.afterTextChanged(android.text.Editable):void");
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        if (!this.f23060c && !this.f23061d && i2 > 0) {
            int i4 = i;
            while (true) {
                if (i4 >= i + i2) {
                    z = false;
                    break;
                } else if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                    z = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (z) {
                this.f23061d = false;
                this.f23059b.mo43865g();
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        if (!this.f23060c && !this.f23061d && i3 > 0) {
            int i4 = i;
            while (true) {
                if (i4 >= i + i3) {
                    z = false;
                    break;
                } else if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i4))) {
                    z = true;
                    break;
                } else {
                    i4++;
                }
            }
            if (z) {
                this.f23061d = false;
                this.f23059b.mo43865g();
            }
        }
    }

    public C7566c(String str) {
        this.f23060c = false;
        this.f23061d = false;
        PhoneNumberUtil.m36283j().getClass();
        this.f23059b = new C14562a(str);
    }
}
