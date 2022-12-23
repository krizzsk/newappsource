package p847uo;

import com.masabi.justride.sdk.exception.JustRideSdkException;
import p635lo.C18248a;

/* renamed from: uo.c */
public final class C19970c {

    /* renamed from: a */
    public final String f50775a;

    /* renamed from: b */
    public final C18248a f50776b;

    /* renamed from: c */
    public final String f50777c;

    /* renamed from: d */
    public final C18248a f50778d;

    /* renamed from: e */
    public final String f50779e;

    /* renamed from: f */
    public final C18248a f50780f;

    /* renamed from: uo.c$a */
    public static class C19971a {

        /* renamed from: a */
        public String f50781a;

        /* renamed from: b */
        public C18248a f50782b;

        /* renamed from: c */
        public String f50783c;

        /* renamed from: d */
        public C18248a f50784d;

        /* renamed from: e */
        public String f50785e;

        /* renamed from: f */
        public C18248a f50786f;

        /* renamed from: a */
        public final C19970c mo52268a() {
            String str = this.f50781a;
            if (str != null) {
                C18248a aVar = this.f50782b;
                if (aVar != null) {
                    String str2 = this.f50783c;
                    if (str2 != null) {
                        C18248a aVar2 = this.f50784d;
                        if (aVar2 != null) {
                            String str3 = this.f50785e;
                            if (str3 != null) {
                                C18248a aVar3 = this.f50786f;
                                if (aVar3 != null) {
                                    return new C19970c(str, aVar, str2, aVar2, str3, aVar3);
                                }
                                throw new JustRideSdkException("Sub-value font missing from Ticket Info list item.");
                            }
                            throw new JustRideSdkException("Sub-value string missing from Ticket Info list item.");
                        }
                        throw new JustRideSdkException("Value font missing from Ticket Info list item.");
                    }
                    throw new JustRideSdkException("Value string missing from Ticket Info list item.");
                }
                throw new JustRideSdkException("Header font missing from Ticket Info list item.");
            }
            throw new JustRideSdkException("Header string missing from Ticket Info list item.");
        }
    }

    public C19970c(String str, C18248a aVar, String str2, C18248a aVar2, String str3, C18248a aVar3) {
        this.f50775a = str;
        this.f50776b = aVar;
        this.f50777c = str2;
        this.f50778d = aVar2;
        this.f50779e = str3;
        this.f50780f = aVar3;
    }
}
