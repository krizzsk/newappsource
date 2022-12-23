package ka0;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebViewClient;
import ce0.C21100e;

/* renamed from: ka0.b */
public class C12823b extends WebViewClient {

    /* renamed from: a */
    public final Activity f31702a;

    public C12823b(Activity activity) {
        C21100e.m49373x(activity, "activity");
        this.f31702a = activity;
    }

    /* renamed from: a */
    public void mo39653a(String str) {
        try {
            this.f31702a.startActivity(Intent.parseUri(str, 1));
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|4|5|6|7) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = ".pdf"
            boolean r0 = r9.endsWith(r0)
            java.lang.String r1 = "android.intent.action.VIEW"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x003c
            r8 = 1074266112(0x40080000, float:2.125)
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x0020 }
            android.net.Uri r4 = android.net.Uri.parse(r9)     // Catch:{ ActivityNotFoundException -> 0x0020 }
            r0.<init>(r1, r4)     // Catch:{ ActivityNotFoundException -> 0x0020 }
            r0.addFlags(r8)     // Catch:{ ActivityNotFoundException -> 0x0020 }
            android.app.Activity r4 = r7.f31702a     // Catch:{ ActivityNotFoundException -> 0x0020 }
            r4.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x0020 }
            goto L_0x003b
        L_0x0020:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x003b }
            java.lang.String r4 = "https://docs.google.com/viewer?url=%s"
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch:{ ActivityNotFoundException -> 0x003b }
            r5[r2] = r9     // Catch:{ ActivityNotFoundException -> 0x003b }
            java.lang.String r9 = java.lang.String.format(r4, r5)     // Catch:{ ActivityNotFoundException -> 0x003b }
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ ActivityNotFoundException -> 0x003b }
            r0.<init>(r1, r9)     // Catch:{ ActivityNotFoundException -> 0x003b }
            r0.addFlags(r8)     // Catch:{ ActivityNotFoundException -> 0x003b }
            android.app.Activity r8 = r7.f31702a     // Catch:{ ActivityNotFoundException -> 0x003b }
            r8.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x003b }
        L_0x003b:
            return r3
        L_0x003c:
            boolean r0 = android.net.MailTo.isMailTo(r9)
            if (r0 == 0) goto L_0x008b
            android.net.MailTo r9 = android.net.MailTo.parse(r9)
            java.lang.String r0 = r9.getTo()
            java.lang.String r1 = r9.getSubject()
            java.lang.String r4 = r9.getBody()
            java.lang.String r9 = r9.getCc()
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.SEND"
            r5.<init>(r6)
            java.lang.String r6 = "message/rfc822"
            r5.setType(r6)
            if (r0 == 0) goto L_0x006d
            java.lang.String[] r6 = new java.lang.String[r3]
            r6[r2] = r0
            java.lang.String r0 = "android.intent.extra.EMAIL"
            r5.putExtra(r0, r6)
        L_0x006d:
            if (r4 == 0) goto L_0x0074
            java.lang.String r0 = "android.intent.extra.TEXT"
            r5.putExtra(r0, r4)
        L_0x0074:
            if (r1 == 0) goto L_0x007b
            java.lang.String r0 = "android.intent.extra.SUBJECT"
            r5.putExtra(r0, r1)
        L_0x007b:
            if (r9 == 0) goto L_0x0082
            java.lang.String r0 = "android.intent.extra.CC"
            r5.putExtra(r0, r9)
        L_0x0082:
            android.app.Activity r9 = r7.f31702a
            r9.startActivity(r5)
            r8.reload()
            return r3
        L_0x008b:
            java.lang.String r0 = "tel:"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L_0x00a4
            android.content.Intent r8 = new android.content.Intent
            android.net.Uri r9 = android.net.Uri.parse(r9)
            java.lang.String r0 = "android.intent.action.DIAL"
            r8.<init>(r0, r9)
            android.app.Activity r9 = r7.f31702a
            r9.startActivity(r8)
            return r3
        L_0x00a4:
            java.lang.String r0 = "market:"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L_0x00d0
            android.net.Uri r9 = android.net.Uri.parse(r9)
            android.app.Activity r0 = r7.f31702a     // Catch:{ ActivityNotFoundException -> 0x00bb }
            android.content.Intent r2 = new android.content.Intent     // Catch:{ ActivityNotFoundException -> 0x00bb }
            r2.<init>(r1, r9)     // Catch:{ ActivityNotFoundException -> 0x00bb }
            r0.startActivity(r2)     // Catch:{ ActivityNotFoundException -> 0x00bb }
            goto L_0x00cf
        L_0x00bb:
            java.lang.String r0 = "https://play.google.com/store/apps/details?"
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            java.lang.String r9 = r9.getQuery()
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.loadUrl(r9)
        L_0x00cf:
            return r3
        L_0x00d0:
            java.lang.String r8 = "http"
            boolean r8 = r9.startsWith(r8)
            if (r8 != 0) goto L_0x00dc
            r7.mo39653a(r9)
            return r3
        L_0x00dc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ka0.C12823b.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }
}
