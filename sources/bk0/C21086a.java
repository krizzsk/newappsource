package bk0;

import ak0.C21006a;
import java.io.IOException;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.p982v1.XmlPullParser;
import org.xmlpull.p982v1.XmlPullParserException;

/* renamed from: bk0.a */
public final class C21086a implements Locator, XMLReader, Attributes {

    /* renamed from: a */
    public ContentHandler f52907a = new DefaultHandler();

    /* renamed from: b */
    public ErrorHandler f52908b = new DefaultHandler();

    /* renamed from: c */
    public String f52909c;

    /* renamed from: d */
    public XmlPullParser f52910d;

    public C21086a() throws XmlPullParserException {
        C21006a a = C21006a.m49161a();
        a.f52759c.put(XmlPullParser.FEATURE_PROCESS_NAMESPACES, new Boolean(true));
        this.f52910d = a.mo53086b();
    }

    public final int getColumnNumber() {
        return this.f52910d.getColumnNumber();
    }

    public final ContentHandler getContentHandler() {
        return this.f52907a;
    }

    public final DTDHandler getDTDHandler() {
        return null;
    }

    public final EntityResolver getEntityResolver() {
        return null;
    }

    public final ErrorHandler getErrorHandler() {
        return this.f52908b;
    }

    public final boolean getFeature(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        if ("http://xml.org/sax/features/namespaces".equals(str)) {
            return this.f52910d.getFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES);
        }
        if ("http://xml.org/sax/features/namespace-prefixes".equals(str)) {
            return this.f52910d.getFeature(XmlPullParser.FEATURE_REPORT_NAMESPACE_ATTRIBUTES);
        }
        if ("http://xml.org/sax/features/validation".equals(str)) {
            return this.f52910d.getFeature(XmlPullParser.FEATURE_VALIDATION);
        }
        return this.f52910d.getFeature(str);
    }

    public final int getIndex(String str, String str2) {
        for (int i = 0; i < this.f52910d.getAttributeCount(); i++) {
            if (this.f52910d.getAttributeNamespace(i).equals(str) && this.f52910d.getAttributeName(i).equals(str2)) {
                return i;
            }
        }
        return -1;
    }

    public final int getLength() {
        return this.f52910d.getAttributeCount();
    }

    public final int getLineNumber() {
        return this.f52910d.getLineNumber();
    }

    public final String getLocalName(int i) {
        return this.f52910d.getAttributeName(i);
    }

    public final Object getProperty(String str) throws SAXNotRecognizedException, SAXNotSupportedException {
        if (!"http://xml.org/sax/properties/declaration-handler".equals(str) && !"http://xml.org/sax/properties/lexical-handler".equals(str)) {
            return this.f52910d.getProperty(str);
        }
        return null;
    }

    public final String getPublicId() {
        return null;
    }

    public final String getQName(int i) {
        String attributePrefix = this.f52910d.getAttributePrefix(i);
        if (attributePrefix == null) {
            return this.f52910d.getAttributeName(i);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(attributePrefix);
        stringBuffer.append(':');
        stringBuffer.append(this.f52910d.getAttributeName(i));
        return stringBuffer.toString();
    }

    public final String getSystemId() {
        return this.f52909c;
    }

    public final String getType(int i) {
        return this.f52910d.getAttributeType(i);
    }

    public final String getURI(int i) {
        return this.f52910d.getAttributeNamespace(i);
    }

    public final String getValue(int i) {
        return this.f52910d.getAttributeValue(i);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = new java.io.FileInputStream(r13.f52909c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = new java.lang.StringBuffer();
        r2.append("could not open file with systemId ");
        r2.append(r13.f52909c);
        r13.f52908b.fatalError(new org.xml.sax.SAXParseException(r2.toString(), r13, r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void parse(org.xml.sax.InputSource r14) throws org.xml.sax.SAXException, java.io.IOException {
        /*
            r13 = this;
            java.lang.String r0 = r14.getSystemId()
            r13.f52909c = r0
            org.xml.sax.ContentHandler r0 = r13.f52907a
            r0.setDocumentLocator(r13)
            java.io.Reader r0 = r14.getCharacterStream()
            java.lang.String r1 = "parsing initialization error: "
            if (r0 != 0) goto L_0x006b
            java.io.InputStream r0 = r14.getByteStream()     // Catch:{ XmlPullParserException -> 0x020c }
            java.lang.String r2 = r14.getEncoding()     // Catch:{ XmlPullParserException -> 0x020c }
            if (r0 != 0) goto L_0x0065
            java.lang.String r14 = r14.getSystemId()     // Catch:{ XmlPullParserException -> 0x020c }
            r13.f52909c = r14     // Catch:{ XmlPullParserException -> 0x020c }
            if (r14 != 0) goto L_0x0032
            org.xml.sax.SAXParseException r14 = new org.xml.sax.SAXParseException     // Catch:{ XmlPullParserException -> 0x020c }
            java.lang.String r0 = "null source systemId"
            r14.<init>(r0, r13)     // Catch:{ XmlPullParserException -> 0x020c }
            org.xml.sax.ErrorHandler r0 = r13.f52908b     // Catch:{ XmlPullParserException -> 0x020c }
            r0.fatalError(r14)     // Catch:{ XmlPullParserException -> 0x020c }
            return
        L_0x0032:
            java.net.URL r14 = new java.net.URL     // Catch:{ MalformedURLException -> 0x003e }
            java.lang.String r0 = r13.f52909c     // Catch:{ MalformedURLException -> 0x003e }
            r14.<init>(r0)     // Catch:{ MalformedURLException -> 0x003e }
            java.io.InputStream r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.openStream(r14)     // Catch:{ MalformedURLException -> 0x003e }
            goto L_0x0065
        L_0x003e:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0046 }
            java.lang.String r14 = r13.f52909c     // Catch:{ FileNotFoundException -> 0x0046 }
            r0.<init>(r14)     // Catch:{ FileNotFoundException -> 0x0046 }
            goto L_0x0065
        L_0x0046:
            r14 = move-exception
            org.xml.sax.SAXParseException r0 = new org.xml.sax.SAXParseException     // Catch:{ XmlPullParserException -> 0x020c }
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ XmlPullParserException -> 0x020c }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x020c }
            java.lang.String r3 = "could not open file with systemId "
            r2.append(r3)     // Catch:{ XmlPullParserException -> 0x020c }
            java.lang.String r3 = r13.f52909c     // Catch:{ XmlPullParserException -> 0x020c }
            r2.append(r3)     // Catch:{ XmlPullParserException -> 0x020c }
            java.lang.String r2 = r2.toString()     // Catch:{ XmlPullParserException -> 0x020c }
            r0.<init>(r2, r13, r14)     // Catch:{ XmlPullParserException -> 0x020c }
            org.xml.sax.ErrorHandler r14 = r13.f52908b     // Catch:{ XmlPullParserException -> 0x020c }
            r14.fatalError(r0)     // Catch:{ XmlPullParserException -> 0x020c }
            return
        L_0x0065:
            org.xmlpull.v1.XmlPullParser r14 = r13.f52910d     // Catch:{ XmlPullParserException -> 0x020c }
            r14.setInput(r0, r2)     // Catch:{ XmlPullParserException -> 0x020c }
            goto L_0x0070
        L_0x006b:
            org.xmlpull.v1.XmlPullParser r14 = r13.f52910d     // Catch:{ XmlPullParserException -> 0x020c }
            r14.setInput(r0)     // Catch:{ XmlPullParserException -> 0x020c }
        L_0x0070:
            org.xml.sax.ContentHandler r14 = r13.f52907a     // Catch:{ XmlPullParserException -> 0x01f1 }
            r14.startDocument()     // Catch:{ XmlPullParserException -> 0x01f1 }
            org.xmlpull.v1.XmlPullParser r14 = r13.f52910d     // Catch:{ XmlPullParserException -> 0x01f1 }
            r14.next()     // Catch:{ XmlPullParserException -> 0x01f1 }
            org.xmlpull.v1.XmlPullParser r14 = r13.f52910d     // Catch:{ XmlPullParserException -> 0x01f1 }
            int r14 = r14.getEventType()     // Catch:{ XmlPullParserException -> 0x01f1 }
            r0 = 2
            if (r14 == r0) goto L_0x00a5
            org.xml.sax.SAXParseException r14 = new org.xml.sax.SAXParseException     // Catch:{ XmlPullParserException -> 0x01f1 }
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ XmlPullParserException -> 0x01f1 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x01f1 }
            java.lang.String r2 = "expected start tag not"
            r0.append(r2)     // Catch:{ XmlPullParserException -> 0x01f1 }
            org.xmlpull.v1.XmlPullParser r2 = r13.f52910d     // Catch:{ XmlPullParserException -> 0x01f1 }
            java.lang.String r2 = r2.getPositionDescription()     // Catch:{ XmlPullParserException -> 0x01f1 }
            r0.append(r2)     // Catch:{ XmlPullParserException -> 0x01f1 }
            java.lang.String r0 = r0.toString()     // Catch:{ XmlPullParserException -> 0x01f1 }
            r14.<init>(r0, r13)     // Catch:{ XmlPullParserException -> 0x01f1 }
            org.xml.sax.ErrorHandler r0 = r13.f52908b     // Catch:{ XmlPullParserException -> 0x01f1 }
            r0.fatalError(r14)     // Catch:{ XmlPullParserException -> 0x01f1 }
            return
        L_0x00a5:
            org.xmlpull.v1.XmlPullParser r14 = r13.f52910d
            r13.f52910d = r14
            java.lang.String r1 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            boolean r1 = r14.getFeature(r1)
            int r2 = r14.getEventType()     // Catch:{ XmlPullParserException -> 0x01cc }
            if (r2 != r0) goto L_0x01b1
            int[] r2 = new int[r0]     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.StringBuffer r3 = new java.lang.StringBuffer     // Catch:{ XmlPullParserException -> 0x01cc }
            r4 = 16
            r3.<init>(r4)     // Catch:{ XmlPullParserException -> 0x01cc }
            int r4 = r14.getDepth()     // Catch:{ XmlPullParserException -> 0x01cc }
            r5 = 1
            int r4 = r4 - r5
            r6 = 2
        L_0x00c5:
            if (r6 == r5) goto L_0x01eb
            r7 = 58
            r8 = 0
            if (r6 == r0) goto L_0x0146
            r9 = 3
            if (r6 == r9) goto L_0x00e3
            r7 = 4
            if (r6 == r7) goto L_0x00d4
            goto L_0x01a6
        L_0x00d4:
            char[] r6 = r14.getTextCharacters(r2)     // Catch:{ XmlPullParserException -> 0x01cc }
            org.xml.sax.ContentHandler r7 = r13.f52907a     // Catch:{ XmlPullParserException -> 0x01cc }
            r8 = r2[r8]     // Catch:{ XmlPullParserException -> 0x01cc }
            r9 = r2[r5]     // Catch:{ XmlPullParserException -> 0x01cc }
            r7.characters(r6, r8, r9)     // Catch:{ XmlPullParserException -> 0x01cc }
            goto L_0x01a6
        L_0x00e3:
            if (r1 == 0) goto L_0x0134
            java.lang.String r6 = r14.getName()     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.String r9 = r14.getPrefix()     // Catch:{ XmlPullParserException -> 0x01cc }
            if (r9 == 0) goto L_0x00fb
            r3.setLength(r8)     // Catch:{ XmlPullParserException -> 0x01cc }
            r3.append(r9)     // Catch:{ XmlPullParserException -> 0x01cc }
            r3.append(r7)     // Catch:{ XmlPullParserException -> 0x01cc }
            r3.append(r6)     // Catch:{ XmlPullParserException -> 0x01cc }
        L_0x00fb:
            org.xml.sax.ContentHandler r7 = r13.f52907a     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.String r10 = r14.getNamespace()     // Catch:{ XmlPullParserException -> 0x01cc }
            if (r9 == 0) goto L_0x0105
            r9 = r6
            goto L_0x0109
        L_0x0105:
            java.lang.String r9 = r3.toString()     // Catch:{ XmlPullParserException -> 0x01cc }
        L_0x0109:
            r7.endElement(r10, r6, r9)     // Catch:{ XmlPullParserException -> 0x01cc }
            int r6 = r14.getDepth()     // Catch:{ XmlPullParserException -> 0x01cc }
            if (r4 <= r6) goto L_0x011a
            int r6 = r14.getDepth()     // Catch:{ XmlPullParserException -> 0x01cc }
            int r8 = r14.getNamespaceCount(r6)     // Catch:{ XmlPullParserException -> 0x01cc }
        L_0x011a:
            int r6 = r14.getDepth()     // Catch:{ XmlPullParserException -> 0x01cc }
            int r6 = r6 - r5
            int r6 = r14.getNamespaceCount(r6)     // Catch:{ XmlPullParserException -> 0x01cc }
            int r6 = r6 - r5
        L_0x0124:
            if (r6 >= r8) goto L_0x0128
            goto L_0x01a6
        L_0x0128:
            org.xml.sax.ContentHandler r7 = r13.f52907a     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.String r9 = r14.getNamespacePrefix(r6)     // Catch:{ XmlPullParserException -> 0x01cc }
            r7.endPrefixMapping(r9)     // Catch:{ XmlPullParserException -> 0x01cc }
            int r6 = r6 + -1
            goto L_0x0124
        L_0x0134:
            org.xml.sax.ContentHandler r6 = r13.f52907a     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.String r7 = r14.getNamespace()     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.String r8 = r14.getName()     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.String r9 = r14.getName()     // Catch:{ XmlPullParserException -> 0x01cc }
            r6.endElement(r7, r8, r9)     // Catch:{ XmlPullParserException -> 0x01cc }
            goto L_0x01a6
        L_0x0146:
            if (r1 == 0) goto L_0x0195
            int r6 = r14.getDepth()     // Catch:{ XmlPullParserException -> 0x01cc }
            int r6 = r6 - r5
            if (r4 <= r6) goto L_0x0154
            int r9 = r14.getNamespaceCount(r6)     // Catch:{ XmlPullParserException -> 0x01cc }
            goto L_0x0155
        L_0x0154:
            r9 = 0
        L_0x0155:
            int r6 = r6 + 1
            int r6 = r14.getNamespaceCount(r6)     // Catch:{ XmlPullParserException -> 0x01cc }
        L_0x015b:
            if (r9 < r6) goto L_0x0185
            java.lang.String r6 = r14.getName()     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.String r9 = r14.getPrefix()     // Catch:{ XmlPullParserException -> 0x01cc }
            if (r9 == 0) goto L_0x0173
            r3.setLength(r8)     // Catch:{ XmlPullParserException -> 0x01cc }
            r3.append(r9)     // Catch:{ XmlPullParserException -> 0x01cc }
            r3.append(r7)     // Catch:{ XmlPullParserException -> 0x01cc }
            r3.append(r6)     // Catch:{ XmlPullParserException -> 0x01cc }
        L_0x0173:
            java.lang.String r7 = r14.getNamespace()     // Catch:{ XmlPullParserException -> 0x01cc }
            if (r9 == 0) goto L_0x017b
            r8 = r6
            goto L_0x017f
        L_0x017b:
            java.lang.String r8 = r3.toString()     // Catch:{ XmlPullParserException -> 0x01cc }
        L_0x017f:
            org.xml.sax.ContentHandler r9 = r13.f52907a     // Catch:{ XmlPullParserException -> 0x01cc }
            r9.startElement(r7, r6, r8, r13)     // Catch:{ XmlPullParserException -> 0x01cc }
            goto L_0x01a6
        L_0x0185:
            org.xml.sax.ContentHandler r10 = r13.f52907a     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.String r11 = r14.getNamespacePrefix(r9)     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.String r12 = r14.getNamespaceUri(r9)     // Catch:{ XmlPullParserException -> 0x01cc }
            r10.startPrefixMapping(r11, r12)     // Catch:{ XmlPullParserException -> 0x01cc }
            int r9 = r9 + 1
            goto L_0x015b
        L_0x0195:
            java.lang.String r6 = r14.getNamespace()     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.String r7 = r14.getName()     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.String r8 = r14.getName()     // Catch:{ XmlPullParserException -> 0x01cc }
            org.xml.sax.ContentHandler r9 = r13.f52907a     // Catch:{ XmlPullParserException -> 0x01cc }
            r9.startElement(r6, r7, r8, r13)     // Catch:{ XmlPullParserException -> 0x01cc }
        L_0x01a6:
            int r6 = r14.next()     // Catch:{ XmlPullParserException -> 0x01cc }
            int r7 = r14.getDepth()     // Catch:{ XmlPullParserException -> 0x01cc }
            if (r7 > r4) goto L_0x00c5
            goto L_0x01eb
        L_0x01b1:
            org.xml.sax.SAXException r0 = new org.xml.sax.SAXException     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ XmlPullParserException -> 0x01cc }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.String r2 = "start tag must be read before skiping subtree"
            r1.append(r2)     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.String r14 = r14.getPositionDescription()     // Catch:{ XmlPullParserException -> 0x01cc }
            r1.append(r14)     // Catch:{ XmlPullParserException -> 0x01cc }
            java.lang.String r14 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01cc }
            r0.<init>(r14)     // Catch:{ XmlPullParserException -> 0x01cc }
            throw r0     // Catch:{ XmlPullParserException -> 0x01cc }
        L_0x01cc:
            r14 = move-exception
            org.xml.sax.SAXParseException r0 = new org.xml.sax.SAXParseException
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.String r2 = "parsing error: "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r13, r14)
            r14.printStackTrace()
            org.xml.sax.ErrorHandler r14 = r13.f52908b
            r14.fatalError(r0)
        L_0x01eb:
            org.xml.sax.ContentHandler r14 = r13.f52907a
            r14.endDocument()
            return
        L_0x01f1:
            r14 = move-exception
            org.xml.sax.SAXParseException r0 = new org.xml.sax.SAXParseException
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r13, r14)
            org.xml.sax.ErrorHandler r14 = r13.f52908b
            r14.fatalError(r0)
            return
        L_0x020c:
            r14 = move-exception
            org.xml.sax.SAXParseException r0 = new org.xml.sax.SAXParseException
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1, r13, r14)
            org.xml.sax.ErrorHandler r14 = r13.f52908b
            r14.fatalError(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bk0.C21086a.parse(org.xml.sax.InputSource):void");
    }

    public final void setContentHandler(ContentHandler contentHandler) {
        this.f52907a = contentHandler;
    }

    public final void setDTDHandler(DTDHandler dTDHandler) {
    }

    public final void setEntityResolver(EntityResolver entityResolver) {
    }

    public final void setErrorHandler(ErrorHandler errorHandler) {
        this.f52908b = errorHandler;
    }

    public final void setFeature(String str, boolean z) throws SAXNotRecognizedException, SAXNotSupportedException {
        try {
            if ("http://xml.org/sax/features/namespaces".equals(str)) {
                this.f52910d.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, z);
            } else if ("http://xml.org/sax/features/namespace-prefixes".equals(str)) {
                if (this.f52910d.getFeature(XmlPullParser.FEATURE_REPORT_NAMESPACE_ATTRIBUTES) != z) {
                    this.f52910d.setFeature(XmlPullParser.FEATURE_REPORT_NAMESPACE_ATTRIBUTES, z);
                }
            } else if ("http://xml.org/sax/features/validation".equals(str)) {
                this.f52910d.setFeature(XmlPullParser.FEATURE_VALIDATION, z);
            } else {
                this.f52910d.setFeature(str, z);
            }
        } catch (XmlPullParserException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("problem with setting feature ");
            stringBuffer.append(str);
            stringBuffer.append(": ");
            stringBuffer.append(e);
            throw new SAXNotSupportedException(stringBuffer.toString());
        }
    }

    public final void setProperty(String str, Object obj) throws SAXNotRecognizedException, SAXNotSupportedException {
        if ("http://xml.org/sax/properties/declaration-handler".equals(str)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("not supported setting property ");
            stringBuffer.append(str);
            throw new SAXNotSupportedException(stringBuffer.toString());
        } else if (!"http://xml.org/sax/properties/lexical-handler".equals(str)) {
            try {
                this.f52910d.setProperty(str, obj);
            } catch (XmlPullParserException e) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("not supported set property ");
                stringBuffer2.append(str);
                stringBuffer2.append(": ");
                stringBuffer2.append(e);
                throw new SAXNotSupportedException(stringBuffer2.toString());
            }
        } else {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("not supported setting property ");
            stringBuffer3.append(str);
            throw new SAXNotSupportedException(stringBuffer3.toString());
        }
    }

    public final String getType(String str, String str2) {
        for (int i = 0; i < this.f52910d.getAttributeCount(); i++) {
            if (this.f52910d.getAttributeNamespace(i).equals(str) && this.f52910d.getAttributeName(i).equals(str2)) {
                return this.f52910d.getAttributeType(i);
            }
        }
        return null;
    }

    public final String getValue(String str, String str2) {
        return this.f52910d.getAttributeValue(str, str2);
    }

    public final int getIndex(String str) {
        for (int i = 0; i < this.f52910d.getAttributeCount(); i++) {
            if (this.f52910d.getAttributeName(i).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final String getValue(String str) {
        return this.f52910d.getAttributeValue((String) null, str);
    }

    public final String getType(String str) {
        for (int i = 0; i < this.f52910d.getAttributeCount(); i++) {
            if (this.f52910d.getAttributeName(i).equals(str)) {
                return this.f52910d.getAttributeType(i);
            }
        }
        return null;
    }

    public final void parse(String str) throws SAXException, IOException {
        parse(new InputSource(str));
    }
}
