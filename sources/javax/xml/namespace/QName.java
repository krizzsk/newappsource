package javax.xml.namespace;

import java.io.Serializable;
import p001a0.C0016g;

public class QName implements Serializable {
    private String localPart;
    private String namespaceURI;
    private String prefix;

    /* renamed from: a */
    public final String mo58934a() {
        return this.localPart;
    }

    /* renamed from: b */
    public final String mo58935b() {
        return this.namespaceURI;
    }

    /* renamed from: c */
    public final String mo58936c() {
        return this.prefix;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof QName)) {
            return false;
        }
        QName qName = (QName) obj;
        if (!this.localPart.equals(qName.localPart) || !this.namespaceURI.equals(qName.namespaceURI)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.namespaceURI.hashCode() ^ this.localPart.hashCode();
    }

    public final String toString() {
        if (this.namespaceURI.equals("")) {
            return this.localPart;
        }
        StringBuffer q = C0016g.m33q("{");
        q.append(this.namespaceURI);
        q.append("}");
        q.append(this.localPart);
        return q.toString();
    }
}
