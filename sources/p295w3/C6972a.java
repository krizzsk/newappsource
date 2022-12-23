package p295w3;

import java.io.FileNotFoundException;
import java.net.URL;
import java.net.UnknownHostException;
import p043ch.qos.logback.core.joran.spi.JoranException;
import p168m4.C5683a;
import p193o4.C5982h;

/* renamed from: w3.a */
public final class C6972a extends C5683a {

    /* renamed from: w3.a$a */
    public class C6973a {

        /* renamed from: a */
        public URL f21737a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo170m(p193o4.C5982h r3, java.lang.String r4, org.xml.sax.helpers.AttributesImpl r5) throws p043ch.qos.logback.core.joran.spi.ActionException {
        /*
            r2 = this;
            java.util.Stack<java.lang.Object> r0 = r3.f19130e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0017
            java.lang.Object r0 = r3.mo21974n()
            boolean r1 = r0 instanceof p295w3.C6972a.C6973a
            if (r1 == 0) goto L_0x0017
            w3.a$a r0 = (p295w3.C6972a.C6973a) r0
            java.net.URL r0 = r0.f21737a
            if (r0 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r0 = 0
        L_0x0018:
            if (r0 == 0) goto L_0x001b
            return
        L_0x001b:
            super.mo170m(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p295w3.C6972a.mo170m(o4.h, java.lang.String, org.xml.sax.helpers.AttributesImpl):void");
    }

    /* renamed from: s */
    public final void mo21535s(String str, Exception exc) {
        if (exc == null || (exc instanceof FileNotFoundException) || (exc instanceof UnknownHostException)) {
            mo22865i(str);
        } else {
            mo22868l(str, exc);
        }
    }

    /* renamed from: u */
    public final void mo21537u(C5982h hVar, URL url) throws JoranException {
        C6973a aVar = new C6973a();
        aVar.f21737a = url;
        hVar.mo21976p(aVar);
    }
}
