package org.simpleframework.xml.stream;

import lj0.C24326c;
import lj0.C24327d;
import lj0.C24328e;
import lj0.C24329f;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public final class DocumentReader implements C24328e {

    /* renamed from: a */
    public NodeExtractor f62449a;

    /* renamed from: b */
    public NodeStack f62450b;

    /* renamed from: c */
    public C24327d f62451c;

    public static class Start extends EventElement {
        private final Element element;

        public Start(Node node) {
            this.element = (Element) node;
        }

        public final String getName() {
            return this.element.getLocalName();
        }

        /* renamed from: i */
        public final NamedNodeMap mo61106i() {
            return this.element.getAttributes();
        }
    }

    /* renamed from: org.simpleframework.xml.stream.DocumentReader$a */
    public static class C24665a extends C24329f {
    }

    /* renamed from: org.simpleframework.xml.stream.DocumentReader$b */
    public static class C24666b extends C24326c {

        /* renamed from: a */
        public final Node f62452a;

        public C24666b(Node node) {
            this.f62452a = node;
        }

        /* renamed from: a */
        public final String mo60468a() {
            return this.f62452a.getNamespaceURI();
        }

        /* renamed from: b */
        public final boolean mo60469b() {
            String prefix = getPrefix();
            String name = getName();
            if (prefix != null) {
                return prefix.startsWith("xml");
            }
            return name.startsWith("xml");
        }

        /* renamed from: e */
        public final Object mo60470e() {
            return this.f62452a;
        }

        public final String getName() {
            return this.f62452a.getLocalName();
        }

        public final String getPrefix() {
            return this.f62452a.getPrefix();
        }

        public final String getValue() {
            return this.f62452a.getNodeValue();
        }
    }

    /* renamed from: org.simpleframework.xml.stream.DocumentReader$c */
    public static class C24667c extends C24329f {

        /* renamed from: b */
        public final Node f62453b;

        public C24667c(Node node) {
            this.f62453b = node;
        }

        public final String getValue() {
            return this.f62453b.getNodeValue();
        }
    }

    public DocumentReader(Document document) {
        this.f62449a = new NodeExtractor(document);
        NodeStack nodeStack = new NodeStack();
        this.f62450b = nodeStack;
        nodeStack.add(document);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: org.simpleframework.xml.stream.DocumentReader$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: org.simpleframework.xml.stream.DocumentReader$Start} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: org.simpleframework.xml.stream.DocumentReader$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: org.simpleframework.xml.stream.DocumentReader$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: org.simpleframework.xml.stream.DocumentReader$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final lj0.C24327d next() throws java.lang.Exception {
        /*
            r6 = this;
            lj0.d r0 = r6.f62451c
            if (r0 != 0) goto L_0x0072
            org.simpleframework.xml.stream.NodeExtractor r0 = r6.f62449a
            java.lang.Object r0 = r0.peek()
            org.w3c.dom.Node r0 = (org.w3c.dom.Node) r0
            if (r0 != 0) goto L_0x0014
            org.simpleframework.xml.stream.DocumentReader$a r0 = new org.simpleframework.xml.stream.DocumentReader$a
            r0.<init>()
            goto L_0x0075
        L_0x0014:
            org.w3c.dom.Node r1 = r0.getParentNode()
            org.simpleframework.xml.stream.NodeStack r2 = r6.f62450b
            java.lang.Object r2 = r2.mo61111i()
            org.w3c.dom.Node r2 = (org.w3c.dom.Node) r2
            if (r1 == r2) goto L_0x002f
            if (r2 == 0) goto L_0x0029
            org.simpleframework.xml.stream.NodeStack r0 = r6.f62450b
            r0.pop()
        L_0x0029:
            org.simpleframework.xml.stream.DocumentReader$a r0 = new org.simpleframework.xml.stream.DocumentReader$a
            r0.<init>()
            goto L_0x0075
        L_0x002f:
            org.simpleframework.xml.stream.NodeExtractor r1 = r6.f62449a
            r1.poll()
            short r1 = r0.getNodeType()
            r2 = 1
            if (r1 != r2) goto L_0x006b
            org.simpleframework.xml.stream.NodeStack r1 = r6.f62450b
            r1.add(r0)
            org.simpleframework.xml.stream.DocumentReader$Start r1 = new org.simpleframework.xml.stream.DocumentReader$Start
            r1.<init>(r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0070
            org.w3c.dom.NamedNodeMap r0 = r1.mo61106i()
            int r2 = r0.getLength()
            r3 = 0
        L_0x0054:
            if (r3 >= r2) goto L_0x0070
            org.w3c.dom.Node r4 = r0.item(r3)
            org.simpleframework.xml.stream.DocumentReader$b r5 = new org.simpleframework.xml.stream.DocumentReader$b
            r5.<init>(r4)
            boolean r4 = r5.mo60469b()
            if (r4 != 0) goto L_0x0068
            r1.add(r5)
        L_0x0068:
            int r3 = r3 + 1
            goto L_0x0054
        L_0x006b:
            org.simpleframework.xml.stream.DocumentReader$c r1 = new org.simpleframework.xml.stream.DocumentReader$c
            r1.<init>(r0)
        L_0x0070:
            r0 = r1
            goto L_0x0075
        L_0x0072:
            r1 = 0
            r6.f62451c = r1
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.simpleframework.xml.stream.DocumentReader.next():lj0.d");
    }

    public final C24327d peek() throws Exception {
        if (this.f62451c == null) {
            this.f62451c = next();
        }
        return this.f62451c;
    }
}
