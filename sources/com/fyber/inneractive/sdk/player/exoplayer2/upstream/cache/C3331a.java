package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import java.io.File;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a */
public interface C3331a {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a$a */
    public static class C3332a extends IOException {
        public C3332a(String str) {
            super(str);
        }

        public C3332a(IOException iOException) {
            super(iOException);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.a$b */
    public interface C3333b {
        /* renamed from: a */
        void mo14469a(C3331a aVar, C3341g gVar);

        /* renamed from: a */
        void mo14470a(C3331a aVar, C3341g gVar, C3341g gVar2);

        /* renamed from: b */
        void mo14471b(C3331a aVar, C3341g gVar);
    }

    /* renamed from: a */
    long mo14460a();

    /* renamed from: a */
    long mo14461a(String str);

    /* renamed from: a */
    File mo14462a(String str, long j, long j2) throws C3332a;

    /* renamed from: a */
    void mo14463a(C3341g gVar) throws C3332a;

    /* renamed from: a */
    void mo14464a(File file) throws C3332a;

    /* renamed from: a */
    void mo14465a(String str, long j) throws C3332a;

    /* renamed from: b */
    C3341g mo14466b(String str, long j) throws InterruptedException, C3332a;

    /* renamed from: b */
    void mo14467b(C3341g gVar);

    /* renamed from: c */
    C3341g mo14468c(String str, long j) throws C3332a;
}
