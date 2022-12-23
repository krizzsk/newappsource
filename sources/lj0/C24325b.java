package lj0;

import java.io.StringReader;
import javax.xml.parsers.DocumentBuilderFactory;
import org.simpleframework.xml.stream.DocumentReader;
import org.xml.sax.InputSource;

/* renamed from: lj0.b */
public final class C24325b implements C24335l {

    /* renamed from: a */
    public final DocumentBuilderFactory f61631a;

    public C24325b() {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        this.f61631a = newInstance;
        newInstance.setNamespaceAware(true);
    }

    /* renamed from: a */
    public final C24328e mo60474a(StringReader stringReader) throws Exception {
        return new DocumentReader(this.f61631a.newDocumentBuilder().parse(new InputSource(stringReader)));
    }
}
