package com.google.android.gms.nearby.connection;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.nearby.zzsi;
import com.google.android.gms.internal.nearby.zzsq;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.UUID;

public class Payload {
    public static final zzsq zza = zzsq.zzn("/", "\\", "?", "*", "\"", "<", ">", "|", "[", "]", ":", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, ";", "\u0000", "\n", "\r", "\t", "\f");
    public static final zzsq zzb = zzsq.zzn("\\", "?", "*", "\"", "<", ">", "|", "[", "]", ":", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, ";", "..", "\u0000", "\n", "\r", "\t", "\f");
    private final long zzc;
    @Type
    private final int zzd;
    private final byte[] zze;
    private final File zzf;
    private final Stream zzg;
    private long zzh;
    private boolean zzi;
    private String zzj;
    private String zzk;

    public static class File {
        private final java.io.File zza;
        private final ParcelFileDescriptor zzb;
        private final long zzc;
        private final Uri zzd;

        private File(java.io.File file, ParcelFileDescriptor parcelFileDescriptor, long j, Uri uri) {
            this.zza = file;
            this.zzb = parcelFileDescriptor;
            this.zzc = j;
            this.zzd = uri;
        }

        public static File zza(java.io.File file, ParcelFileDescriptor parcelFileDescriptor, long j, Uri uri) {
            return new File((java.io.File) Preconditions.checkNotNull(file, "Cannot create Payload.File from null java.io.File."), (ParcelFileDescriptor) Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor."), j, (Uri) Preconditions.checkNotNull(uri, "Cannot create Payload.File from null Uri"));
        }

        public static File zzb(ParcelFileDescriptor parcelFileDescriptor) {
            return new File((java.io.File) null, (ParcelFileDescriptor) Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.File from null ParcelFileDescriptor."), parcelFileDescriptor.getStatSize(), (Uri) null);
        }

        @Deprecated
        public java.io.File asJavaFile() {
            return this.zza;
        }

        public ParcelFileDescriptor asParcelFileDescriptor() {
            return this.zzb;
        }

        public Uri asUri() {
            return this.zzd;
        }

        @Deprecated
        public void close() {
            IOUtils.closeQuietly(this.zzb);
        }

        public long getSize() {
            return this.zzc;
        }
    }

    public static class Stream {
        private final ParcelFileDescriptor zza;
        private InputStream zzb;

        private Stream(ParcelFileDescriptor parcelFileDescriptor, InputStream inputStream) {
            this.zza = parcelFileDescriptor;
            this.zzb = inputStream;
        }

        public static Stream zza(InputStream inputStream) {
            Preconditions.checkNotNull(inputStream, "Cannot create Payload.Stream from null InputStream.");
            return new Stream((ParcelFileDescriptor) null, inputStream);
        }

        public static Stream zzb(ParcelFileDescriptor parcelFileDescriptor) {
            Preconditions.checkNotNull(parcelFileDescriptor, "Cannot create Payload.Stream from null ParcelFileDescriptor.");
            return new Stream(parcelFileDescriptor, (InputStream) null);
        }

        public InputStream asInputStream() {
            if (this.zzb == null) {
                this.zzb = new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) Preconditions.checkNotNull(this.zza));
            }
            return this.zzb;
        }

        public ParcelFileDescriptor asParcelFileDescriptor() {
            return this.zza;
        }

        @Deprecated
        public void close() {
            IOUtils.closeQuietly(this.zza);
            IOUtils.closeQuietly((Closeable) this.zzb);
        }
    }

    public @interface Type {
        public static final int BYTES = 1;
        public static final int FILE = 2;
        public static final int STREAM = 3;
    }

    private Payload(long j, int i, byte[] bArr, File file, Stream stream) {
        this.zzc = j;
        this.zzd = i;
        this.zze = bArr;
        this.zzf = file;
        this.zzg = stream;
    }

    public static Payload fromBytes(byte[] bArr) {
        Preconditions.checkNotNull(bArr, "Cannot create a Payload from null bytes.");
        return zza(bArr, UUID.randomUUID().getLeastSignificantBits());
    }

    public static Payload fromFile(ParcelFileDescriptor parcelFileDescriptor) {
        return zzb(File.zzb(parcelFileDescriptor), UUID.randomUUID().getLeastSignificantBits());
    }

    public static Payload fromStream(ParcelFileDescriptor parcelFileDescriptor) {
        return zzc(Stream.zzb(parcelFileDescriptor), UUID.randomUUID().getLeastSignificantBits());
    }

    public static Payload zza(byte[] bArr, long j) {
        return new Payload(j, 1, bArr, (File) null, (Stream) null);
    }

    public static Payload zzb(File file, long j) {
        return new Payload(j, 2, (byte[]) null, file, (Stream) null);
    }

    public static Payload zzc(Stream stream, long j) {
        return new Payload(j, 3, (byte[]) null, (File) null, stream);
    }

    public byte[] asBytes() {
        return this.zze;
    }

    public File asFile() {
        return this.zzf;
    }

    public Stream asStream() {
        return this.zzg;
    }

    public void close() {
        File file = this.zzf;
        if (file != null) {
            file.close();
        }
        Stream stream = this.zzg;
        if (stream != null) {
            stream.close();
        }
    }

    public long getId() {
        return this.zzc;
    }

    public long getOffset() {
        return this.zzh;
    }

    @Type
    public int getType() {
        return this.zzd;
    }

    public void setFileName(String str) {
        if (zzsi.zzb(str)) {
            throw new IllegalArgumentException("Payload file name should not be null or empty.");
        } else if (getType() == 2) {
            zzsq zzsq = zza;
            int size = zzsq.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (!str.contains((String) zzsq.get(i))) {
                    i = i2;
                } else {
                    throw new IllegalArgumentException("File name contains illegal string.");
                }
            }
            this.zzj = str;
        } else {
            throw new IllegalArgumentException("Payload type must be FILE.");
        }
    }

    public void setOffset(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Payload offset must be positive or zero.");
        } else if (getType() == 2 || getType() == 3) {
            File file = this.zzf;
            if (file == null || j < file.getSize()) {
                getType();
                this.zzh = j;
                return;
            }
            throw new IllegalArgumentException("Payload offset should be smaller than the file size.");
        } else {
            throw new IllegalArgumentException("Payload offset only support FILE or STREAM type.");
        }
    }

    public void setParentFolder(String str) {
        if (zzsi.zzb(str)) {
            throw new IllegalArgumentException("Payload parent folder should not be null or empty.");
        } else if (getType() == 2) {
            zzsq zzsq = zzb;
            int size = zzsq.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (!str.contains((String) zzsq.get(i))) {
                    i = i2;
                } else {
                    throw new IllegalArgumentException("Folder name contains illegal string.");
                }
            }
            this.zzk = str;
        } else {
            throw new IllegalArgumentException("Payload type must be FILE.");
        }
    }

    public void setSensitive(boolean z) {
        this.zzi = z;
    }

    @ShowFirstParty
    public final String zzd() {
        return this.zzj;
    }

    @ShowFirstParty
    public final String zze() {
        return this.zzk;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public static Payload fromFile(java.io.File file) throws FileNotFoundException {
        return zzb(File.zza(file, ParcelFileDescriptor.open(file, 268435456), file.length(), Uri.fromFile(file)), UUID.randomUUID().getLeastSignificantBits());
    }

    public static Payload fromStream(InputStream inputStream) {
        return zzc(Stream.zza(inputStream), UUID.randomUUID().getLeastSignificantBits());
    }
}
