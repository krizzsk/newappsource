package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.C2144e;
import java.io.IOException;

public final class ParcelFileDescriptorRewinder implements C2144e<ParcelFileDescriptor> {

    /* renamed from: a */
    public final InternalRewinder f6953a;

    public static final class InternalRewinder {

        /* renamed from: a */
        public final ParcelFileDescriptor f6954a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f6954a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            try {
                Os.lseek(this.f6954a.getFileDescriptor(), 0, OsConstants.SEEK_SET);
                return this.f6954a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C2138a implements C2144e.C2145a<ParcelFileDescriptor> {
        /* renamed from: a */
        public final Class<ParcelFileDescriptor> mo10902a() {
            return ParcelFileDescriptor.class;
        }

        /* renamed from: b */
        public final C2144e mo10903b(Object obj) {
            return new ParcelFileDescriptorRewinder((ParcelFileDescriptor) obj);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f6953a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: b */
    public final void mo10899b() {
    }

    /* renamed from: c */
    public final ParcelFileDescriptor mo10898a() throws IOException {
        return this.f6953a.rewind();
    }
}
