package p168m4;

import org.xml.sax.Locator;
import org.xml.sax.helpers.AttributesImpl;
import p043ch.qos.logback.core.joran.spi.ActionException;
import p193o4.C5982h;
import p271u4.C6693d;

/* renamed from: m4.b */
public abstract class C5684b extends C6693d {
    /* renamed from: p */
    public static int m13976p(C5982h hVar) {
        Locator locator = hVar.f19133h.f19142f;
        if (locator != null) {
            return locator.getLineNumber();
        }
        return -1;
    }

    /* renamed from: m */
    public abstract void mo170m(C5982h hVar, String str, AttributesImpl attributesImpl) throws ActionException;

    /* renamed from: n */
    public void mo21538n(C5982h hVar, String str) throws ActionException {
    }

    /* renamed from: o */
    public abstract void mo171o(C5982h hVar, String str) throws ActionException;

    public final String toString() {
        return getClass().getName();
    }
}
