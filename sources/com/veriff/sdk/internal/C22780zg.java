package com.veriff.sdk.internal;

import java.io.IOException;

/* renamed from: com.veriff.sdk.internal.zg */
class C22780zg extends abm {

    /* renamed from: a */
    private boolean f57763a;

    public C22780zg(abz abz) {
        super(abz);
    }

    /* renamed from: a */
    public void mo57476a(IOException iOException) {
        throw null;
    }

    /* renamed from: a_ */
    public void mo53675a_(abi abi, long j) throws IOException {
        if (this.f57763a) {
            abi.mo53900i(j);
            return;
        }
        try {
            super.mo53675a_(abi, j);
        } catch (IOException e) {
            this.f57763a = true;
            mo57476a(e);
        }
    }

    public void close() throws IOException {
        if (!this.f57763a) {
            try {
                super.close();
            } catch (IOException e) {
                this.f57763a = true;
                mo57476a(e);
            }
        }
    }

    public void flush() throws IOException {
        if (!this.f57763a) {
            try {
                super.flush();
            } catch (IOException e) {
                this.f57763a = true;
                mo57476a(e);
            }
        }
    }
}
