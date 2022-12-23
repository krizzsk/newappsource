package org.simpleframework.xml.stream;

import af0.C20980a;
import af0.C20982c;
import af0.C20983d;
import java.util.Iterator;
import lj0.C24326c;
import lj0.C24327d;
import lj0.C24328e;
import lj0.C24329f;
import ze0.C25348b;
import ze0.C25349c;

public final class StreamReader implements C24328e {

    /* renamed from: a */
    public C24327d f62463a;

    public static class Start extends EventElement {
        private final C20982c element;
        private final C25348b location;

        public Start(C20983d dVar) {
            this.element = dVar.mo53061e();
            this.location = dVar.getLocation();
        }

        /* renamed from: O */
        public final int mo60475O() {
            return this.location.getLineNumber();
        }

        public final String getName() {
            return this.element.getName().mo58934a();
        }

        /* renamed from: i */
        public final Iterator<C20980a> mo61114i() {
            return this.element.getAttributes();
        }
    }

    /* renamed from: org.simpleframework.xml.stream.StreamReader$a */
    public static class C24671a extends C24329f {
        /* renamed from: d2 */
        public final boolean mo60477d2() {
            return true;
        }
    }

    /* renamed from: org.simpleframework.xml.stream.StreamReader$b */
    public static class C24672b extends C24326c {

        /* renamed from: a */
        public final C20980a f62464a;

        public C24672b(C20980a aVar) {
            this.f62464a = aVar;
        }

        /* renamed from: a */
        public final String mo60468a() {
            return this.f62464a.getName().mo58935b();
        }

        /* renamed from: b */
        public final boolean mo60469b() {
            return false;
        }

        /* renamed from: e */
        public final Object mo60470e() {
            return this.f62464a;
        }

        public final String getName() {
            return this.f62464a.getName().mo58934a();
        }

        public final String getPrefix() {
            return this.f62464a.getName().mo58936c();
        }

        public final String getValue() {
            return this.f62464a.getValue();
        }
    }

    /* renamed from: org.simpleframework.xml.stream.StreamReader$c */
    public static class C24673c extends C24329f {
        public C24673c(C20983d dVar) {
            dVar.mo53059c();
        }

        public final String getValue() {
            throw null;
        }

        /* renamed from: v */
        public final boolean mo60480v() {
            return true;
        }
    }

    public StreamReader(C25349c cVar) {
    }

    /* renamed from: a */
    public final C24327d mo61113a() throws Exception {
        throw null;
    }

    public final C24327d next() throws Exception {
        C24327d dVar = this.f62463a;
        if (dVar == null) {
            return mo61113a();
        }
        this.f62463a = null;
        return dVar;
    }

    public final C24327d peek() throws Exception {
        if (this.f62463a == null) {
            this.f62463a = next();
        }
        return this.f62463a;
    }
}
