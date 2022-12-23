package p168m4;

import com.appboy.support.AppboyFileUtils;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import org.xml.sax.helpers.AttributesImpl;
import p001a0.C0016g;
import p043ch.qos.logback.core.joran.spi.ActionException;
import p043ch.qos.logback.core.joran.spi.JoranException;
import p193o4.C5982h;
import p296w4.C6990g;
import p296w4.C6992h;
import p358af.C13437d;

/* renamed from: m4.a */
public abstract class C5683a extends C5684b {

    /* renamed from: e */
    public String f18470e;

    /* renamed from: f */
    public boolean f18471f;

    /* renamed from: q */
    public static void m13969q(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a A[SYNTHETIC, Splitter:B:23:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo170m(p193o4.C5982h r9, java.lang.String r10, org.xml.sax.helpers.AttributesImpl r11) throws p043ch.qos.logback.core.joran.spi.ActionException {
        /*
            r8 = this;
            r10 = 0
            r8.f18470e = r10
            java.lang.String r0 = "optional"
            java.lang.String r0 = r11.getValue(r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000e
            goto L_0x0022
        L_0x000e:
            java.lang.String r0 = r0.trim()
            java.lang.String r3 = "true"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 == 0) goto L_0x001d
            r0 = 1
            goto L_0x0023
        L_0x001d:
            java.lang.String r3 = "false"
            r3.equalsIgnoreCase(r0)
        L_0x0022:
            r0 = 0
        L_0x0023:
            r8.f18471f = r0
            java.lang.String r0 = "file"
            java.lang.String r3 = r11.getValue(r0)
            java.lang.String r4 = "url"
            java.lang.String r5 = r11.getValue(r4)
            java.lang.String r6 = "resource"
            java.lang.String r7 = r11.getValue(r6)
            boolean r3 = p296w4.C6992h.m16474c(r3)
            r3 = r3 ^ r2
            boolean r5 = p296w4.C6992h.m16474c(r5)
            if (r5 != 0) goto L_0x0045
            int r3 = r3 + 1
        L_0x0045:
            boolean r5 = p296w4.C6992h.m16474c(r7)
            if (r5 != 0) goto L_0x004d
            int r3 = r3 + 1
        L_0x004d:
            r5 = 2
            r7 = 3
            if (r3 != 0) goto L_0x0060
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r1] = r0
            r3[r2] = r6
            r3[r5] = r4
            java.lang.String r0 = "One of \"%1$s\", \"%2$s\" or \"%3$s\" attributes must be set."
            java.lang.String r0 = java.lang.String.format(r0, r3)
            goto L_0x0070
        L_0x0060:
            if (r3 <= r2) goto L_0x0074
            java.lang.Object[] r3 = new java.lang.Object[r7]
            r3[r1] = r0
            r3[r2] = r6
            r3[r5] = r4
            java.lang.String r0 = "Only one of \"%1$s\", \"%2$s\" or \"%3$s\" attributes should be set."
            java.lang.String r0 = java.lang.String.format(r0, r3)
        L_0x0070:
            r8.mo21536t(r0, r10)
            goto L_0x0077
        L_0x0074:
            if (r3 != r2) goto L_0x0098
            r1 = 1
        L_0x0077:
            if (r1 != 0) goto L_0x007a
            return
        L_0x007a:
            java.net.URL r10 = r8.mo21534r(r9, r11)     // Catch:{ JoranException -> 0x0084 }
            if (r10 == 0) goto L_0x0097
            r8.mo21537u(r9, r10)     // Catch:{ JoranException -> 0x0084 }
            goto L_0x0097
        L_0x0084:
            r9 = move-exception
            java.lang.String r10 = "Error while parsing "
            java.lang.StringBuilder r10 = p379.C13555b.m33972k(r10)
            java.lang.String r11 = r8.f18470e
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r8.mo21536t(r10, r9)
        L_0x0097:
            return
        L_0x0098:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Count value ["
            java.lang.String r11 = "] is not expected"
            java.lang.String r10 = p379.C25541a.m63878h(r10, r3, r11)
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p168m4.C5683a.mo170m(o4.h, java.lang.String, org.xml.sax.helpers.AttributesImpl):void");
    }

    /* renamed from: o */
    public void mo171o(C5982h hVar, String str) throws ActionException {
    }

    /* renamed from: r */
    public final URL mo21534r(C5982h hVar, AttributesImpl attributesImpl) {
        URL url;
        String str;
        StringBuilder sb;
        String value = attributesImpl.getValue(AppboyFileUtils.FILE_SCHEME);
        String value2 = attributesImpl.getValue("url");
        String value3 = attributesImpl.getValue("resource");
        if (!C6992h.m16474c(value)) {
            String q = hVar.mo21977q(value);
            this.f18470e = q;
            File file = new File(q);
            if (!file.exists() || !file.isFile()) {
                mo21536t(C13437d.m33706k("File does not exist [", q, "]"), new FileNotFoundException(q));
                return null;
            }
            try {
                return file.toURI().toURL();
            } catch (MalformedURLException e) {
                e.printStackTrace();
                return null;
            }
        } else if (!C6992h.m16474c(value2)) {
            String q2 = hVar.mo21977q(value2);
            this.f18470e = q2;
            try {
                URL url2 = new URL(q2);
                FirebasePerfUrlConnection.openStream(url2).close();
                return url2;
            } catch (MalformedURLException e2) {
                e = e2;
                sb = C0016g.m36t("URL [", q2);
                str = "] is not well formed.";
                sb.append(str);
                mo21536t(sb.toString(), e);
                return null;
            } catch (IOException e3) {
                e = e3;
                sb = C0016g.m36t("URL [", q2);
                str = "] cannot be opened.";
                sb.append(str);
                mo21536t(sb.toString(), e);
                return null;
            }
        } else if (!C6992h.m16474c(value3)) {
            String q3 = hVar.mo21977q(value3);
            this.f18470e = q3;
            boolean z = C6990g.f21761a;
            ClassLoader classLoader = C6990g.class.getClassLoader();
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            try {
                url = classLoader.getResource(q3);
            } catch (Throwable unused) {
                url = null;
            }
            if (url != null) {
                return url;
            }
            mo21536t("Could not find resource corresponding to [" + q3 + "]", (Exception) null);
            return null;
        } else {
            throw new IllegalStateException("A URL stream should have been returned");
        }
    }

    /* renamed from: s */
    public void mo21535s(String str, Exception exc) {
        if (exc == null || (!(exc instanceof FileNotFoundException) && !(exc instanceof UnknownHostException))) {
            mo21727f(str, exc);
        } else {
            mo22868l(str, exc);
        }
    }

    /* renamed from: t */
    public final void mo21536t(String str, Exception exc) {
        if (!this.f18471f) {
            mo21535s(str, exc);
        }
    }

    /* renamed from: u */
    public abstract void mo21537u(C5982h hVar, URL url) throws JoranException;
}
