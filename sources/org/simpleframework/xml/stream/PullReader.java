package org.simpleframework.xml.stream;

import lj0.C24326c;
import lj0.C24327d;
import lj0.C24328e;
import lj0.C24329f;
import org.xmlpull.p982v1.XmlPullParser;

public final class PullReader implements C24328e {

    /* renamed from: a */
    public XmlPullParser f62454a;

    /* renamed from: b */
    public C24327d f62455b;

    public static class Start extends EventElement {
        private final int line;
        private final String name;
        private final String prefix;
        private final String reference;
        private final XmlPullParser source;

        public Start(XmlPullParser xmlPullParser) {
            this.reference = xmlPullParser.getNamespace();
            this.line = xmlPullParser.getLineNumber();
            this.prefix = xmlPullParser.getPrefix();
            this.name = xmlPullParser.getName();
            this.source = xmlPullParser;
        }

        /* renamed from: O */
        public final int mo60475O() {
            return this.line;
        }

        public final String getName() {
            return this.name;
        }
    }

    /* renamed from: org.simpleframework.xml.stream.PullReader$a */
    public static class C24668a extends C24329f {
        /* renamed from: d2 */
        public final boolean mo60477d2() {
            return true;
        }
    }

    /* renamed from: org.simpleframework.xml.stream.PullReader$b */
    public static class C24669b extends C24326c {

        /* renamed from: a */
        public final XmlPullParser f62456a;

        /* renamed from: b */
        public final String f62457b;

        /* renamed from: c */
        public final String f62458c;

        /* renamed from: d */
        public final String f62459d;

        /* renamed from: e */
        public final String f62460e;

        public C24669b(XmlPullParser xmlPullParser, int i) {
            this.f62457b = xmlPullParser.getAttributeNamespace(i);
            this.f62458c = xmlPullParser.getAttributePrefix(i);
            this.f62460e = xmlPullParser.getAttributeValue(i);
            this.f62459d = xmlPullParser.getAttributeName(i);
            this.f62456a = xmlPullParser;
        }

        /* renamed from: a */
        public final String mo60468a() {
            return this.f62457b;
        }

        /* renamed from: b */
        public final boolean mo60469b() {
            return false;
        }

        /* renamed from: e */
        public final Object mo60470e() {
            return this.f62456a;
        }

        public final String getName() {
            return this.f62459d;
        }

        public final String getPrefix() {
            return this.f62458c;
        }

        public final String getValue() {
            return this.f62460e;
        }
    }

    /* renamed from: org.simpleframework.xml.stream.PullReader$c */
    public static class C24670c extends C24329f {

        /* renamed from: b */
        public final XmlPullParser f62461b;

        /* renamed from: c */
        public final String f62462c;

        public C24670c(XmlPullParser xmlPullParser) {
            this.f62462c = xmlPullParser.getText();
            this.f62461b = xmlPullParser;
        }

        public final String getValue() {
            return this.f62462c;
        }

        /* renamed from: v */
        public final boolean mo60480v() {
            return true;
        }
    }

    public PullReader(XmlPullParser xmlPullParser) {
        this.f62454a = xmlPullParser;
    }

    /* renamed from: a */
    public final C24327d mo61110a() throws Exception {
        int next = this.f62454a.next();
        if (next == 1) {
            return null;
        }
        if (next == 2) {
            Start start = new Start(this.f62454a);
            if (start.isEmpty()) {
                int attributeCount = this.f62454a.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    start.add(new C24669b(this.f62454a, i));
                }
            }
            return start;
        } else if (next == 4) {
            return new C24670c(this.f62454a);
        } else {
            if (next == 3) {
                return new C24668a();
            }
            return mo61110a();
        }
    }

    public final C24327d next() throws Exception {
        C24327d dVar = this.f62455b;
        if (dVar == null) {
            return mo61110a();
        }
        this.f62455b = null;
        return dVar;
    }

    public final C24327d peek() throws Exception {
        if (this.f62455b == null) {
            this.f62455b = next();
        }
        return this.f62455b;
    }
}
