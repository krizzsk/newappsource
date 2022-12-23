package com.vungle.warren.downloader;

import com.vungle.warren.C23152i;
import java.util.ArrayList;

public interface Downloader {

    public static class RequestException extends Exception {
        public RequestException(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    void mo58146a();

    /* renamed from: b */
    void mo58147b();

    /* renamed from: c */
    void mo58148c();

    /* renamed from: d */
    boolean mo58149d(String str);

    /* renamed from: e */
    void mo58150e(C23127h hVar, C23152i iVar);

    /* renamed from: f */
    ArrayList mo58151f();

    /* renamed from: g */
    boolean mo58152g(C23127h hVar);

    /* renamed from: h */
    void mo58153h(boolean z);

    /* renamed from: i */
    void mo58154i(C23127h hVar);

    /* renamed from: j */
    void mo58155j(C23127h hVar);
}
