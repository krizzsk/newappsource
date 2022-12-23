package p180n4;

import bk0.C21086a;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;
import p001a0.C0016g;
import p043ch.qos.logback.core.joran.spi.JoranException;
import p070e4.C4549d;
import p193o4.C5978d;
import p271u4.C6692c;
import p271u4.C6694e;
import p283v4.C6862g;

/* renamed from: n4.e */
public final class C5856e extends DefaultHandler implements C6692c {

    /* renamed from: b */
    public final C6694e f18844b;

    /* renamed from: c */
    public ArrayList f18845c = new ArrayList();

    /* renamed from: d */
    public Locator f18846d;

    /* renamed from: e */
    public C5978d f18847e = new C5978d();

    public C5856e(C4549d dVar) {
        this.f18844b = new C6694e(dVar, this);
    }

    /* renamed from: a */
    public final void mo21722a(String str) {
        this.f18844b.mo21722a(str);
    }

    /* renamed from: b */
    public final void mo20064b(C4549d dVar) {
        this.f18844b.mo20064b(dVar);
    }

    /* renamed from: c */
    public final void mo21723c(InputSource inputSource) throws JoranException {
        try {
            C21086a aVar = new C21086a();
            try {
                aVar.setFeature("http://xml.org/sax/features/validation", false);
            } catch (SAXNotSupportedException unused) {
            }
            aVar.setFeature("http://xml.org/sax/features/namespaces", true);
            try {
                aVar.f52907a = this;
                aVar.f52908b = this;
                aVar.parse(inputSource);
            } catch (EOFException e) {
                String localizedMessage = e.getLocalizedMessage();
                SAXParseException sAXParseException = new SAXParseException(e.getLocalizedMessage(), this.f18846d, e);
                mo21727f(localizedMessage, sAXParseException);
                throw new JoranException(localizedMessage, sAXParseException);
            } catch (IOException e2) {
                mo21727f("I/O error occurred while parsing xml file", e2);
                throw new JoranException("I/O error occurred while parsing xml file", e2);
            } catch (SAXException e3) {
                throw new JoranException("Problem parsing XML document. See previously reported errors.", e3);
            } catch (Exception e4) {
                mo21727f("Unexpected exception while parsing XML document.", e4);
                throw new JoranException("Unexpected exception while parsing XML document.", e4);
            }
        } catch (Exception e5) {
            mo21727f("Parser configuration error occurred", e5);
            throw new JoranException("Parser configuration error occurred", e5);
        }
    }

    public final void characters(char[] cArr, int i, int i2) {
        C5855d dVar;
        boolean z;
        String str = new String(cArr, i, i2);
        if (this.f18845c.isEmpty()) {
            dVar = null;
        } else {
            dVar = (C5855d) this.f18845c.get(this.f18845c.size() - 1);
        }
        if (dVar instanceof C5852a) {
            C5852a aVar = (C5852a) dVar;
            aVar.f18840d = C0016g.m31o(new StringBuilder(), aVar.f18840d, str);
            return;
        }
        if (str.trim().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f18845c.add(new C5852a(str, this.f18846d));
        }
    }

    public final void endElement(String str, String str2, String str3) {
        if (str3 == null || str3.length() == 0) {
            str3 = str2;
        }
        this.f18845c.add(new C5853b(str, str2, str3, this.f18846d));
        C5978d dVar = this.f18847e;
        if (!dVar.f19124a.isEmpty()) {
            ArrayList<String> arrayList = dVar.f19124a;
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void error(SAXParseException sAXParseException) throws SAXException {
        StringBuilder k = C13555b.m33972k("XML_PARSING - Parsing error on line ");
        k.append(sAXParseException.getLineNumber());
        k.append(" and column ");
        k.append(sAXParseException.getColumnNumber());
        mo21727f(k.toString(), sAXParseException);
    }

    /* renamed from: f */
    public final void mo21727f(String str, Throwable th) {
        this.f18844b.mo21727f(str, th);
    }

    public final void fatalError(SAXParseException sAXParseException) throws SAXException {
        StringBuilder k = C13555b.m33972k("XML_PARSING - Parsing fatal error on line ");
        k.append(sAXParseException.getLineNumber());
        k.append(" and column ");
        k.append(sAXParseException.getColumnNumber());
        mo21727f(k.toString(), sAXParseException);
    }

    public final void setDocumentLocator(Locator locator) {
        this.f18846d = locator;
    }

    public final void startDocument() {
    }

    public final void startElement(String str, String str2, String str3, Attributes attributes) {
        String str4;
        String str5;
        if (str3 == null || str3.length() == 0) {
            str4 = str2;
        } else {
            str4 = str3;
        }
        if (str2 == null || str2.length() < 1) {
            str5 = str4;
        } else {
            str5 = str2;
        }
        this.f18847e.f19124a.add(str5);
        C5978d dVar = this.f18847e;
        dVar.getClass();
        new C5978d().f19124a.addAll(dVar.f19124a);
        this.f18845c.add(new C5857f(str, str2, str4, attributes, this.f18846d));
    }

    public final void warning(SAXParseException sAXParseException) throws SAXException {
        StringBuilder k = C13555b.m33972k("XML_PARSING - Parsing warning on line ");
        k.append(sAXParseException.getLineNumber());
        k.append(" and column ");
        k.append(sAXParseException.getColumnNumber());
        String sb = k.toString();
        C6694e eVar = this.f18844b;
        eVar.getClass();
        eVar.mo22869c(new C6862g(eVar.f20775d, sb, sAXParseException));
    }
}
