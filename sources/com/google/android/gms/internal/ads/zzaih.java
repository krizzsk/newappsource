package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import com.appboy.support.ValidationUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class zzaih {
    public static X509Certificate[][] zza(String str) throws zzaie, SecurityException, IOException {
        ByteBuffer byteBuffer;
        int limit;
        int position;
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair zzc = zzaii.zzc(randomAccessFile);
            if (zzc != null) {
                ByteBuffer byteBuffer2 = (ByteBuffer) zzc.first;
                long longValue = ((Long) zzc.second).longValue();
                long j = -20 + longValue;
                if (j >= 0) {
                    randomAccessFile.seek(j);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzaie("ZIP64 APK not supported");
                    }
                }
                long zza = zzaii.zza(byteBuffer2);
                if (zza >= longValue) {
                    StringBuilder sb = new StringBuilder(122);
                    sb.append("ZIP Central Directory offset out of range: ");
                    sb.append(zza);
                    sb.append(". ZIP End of Central Directory offset: ");
                    sb.append(longValue);
                    throw new zzaie(sb.toString());
                } else if (zzaii.zzb(byteBuffer2) + zza != longValue) {
                    throw new zzaie("ZIP Central Directory is not immediately followed by End of Central Directory");
                } else if (zza >= 32) {
                    ByteBuffer allocate = ByteBuffer.allocate(24);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    allocate.order(byteOrder);
                    randomAccessFile.seek(zza - ((long) allocate.capacity()));
                    randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                    if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                        int i = 0;
                        long j2 = allocate.getLong(0);
                        if (j2 < ((long) allocate.capacity()) || j2 > 2147483639) {
                            StringBuilder sb2 = new StringBuilder(57);
                            sb2.append("APK Signing Block size out of range: ");
                            sb2.append(j2);
                            throw new zzaie(sb2.toString());
                        }
                        int i2 = (int) (8 + j2);
                        long j3 = zza - ((long) i2);
                        if (j3 >= 0) {
                            ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                            allocate2.order(byteOrder);
                            randomAccessFile.seek(j3);
                            randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                            long j4 = allocate2.getLong(0);
                            if (j4 == j2) {
                                Pair create = Pair.create(allocate2, Long.valueOf(j3));
                                byteBuffer = (ByteBuffer) create.first;
                                long longValue2 = ((Long) create.second).longValue();
                                if (byteBuffer.order() == byteOrder) {
                                    int capacity = byteBuffer.capacity() - 24;
                                    if (capacity >= 8) {
                                        int capacity2 = byteBuffer.capacity();
                                        if (capacity <= byteBuffer.capacity()) {
                                            limit = byteBuffer.limit();
                                            position = byteBuffer.position();
                                            byteBuffer.position(0);
                                            byteBuffer.limit(capacity);
                                            byteBuffer.position(8);
                                            ByteBuffer slice = byteBuffer.slice();
                                            slice.order(byteBuffer.order());
                                            byteBuffer.position(0);
                                            byteBuffer.limit(limit);
                                            byteBuffer.position(position);
                                            while (slice.hasRemaining()) {
                                                i++;
                                                if (slice.remaining() >= 8) {
                                                    long j5 = slice.getLong();
                                                    if (j5 < 4 || j5 > 2147483647L) {
                                                        StringBuilder sb3 = new StringBuilder(76);
                                                        sb3.append("APK Signing Block entry #");
                                                        sb3.append(i);
                                                        sb3.append(" size out of range: ");
                                                        sb3.append(j5);
                                                        throw new zzaie(sb3.toString());
                                                    }
                                                    int i3 = (int) j5;
                                                    int position2 = slice.position() + i3;
                                                    if (i3 > slice.remaining()) {
                                                        int remaining = slice.remaining();
                                                        StringBuilder sb4 = new StringBuilder(91);
                                                        sb4.append("APK Signing Block entry #");
                                                        sb4.append(i);
                                                        sb4.append(" size out of range: ");
                                                        sb4.append(i3);
                                                        sb4.append(", available: ");
                                                        sb4.append(remaining);
                                                        throw new zzaie(sb4.toString());
                                                    } else if (slice.getInt() == 1896449818) {
                                                        X509Certificate[][] zzl = zzl(randomAccessFile.getChannel(), new zzaid(zze(slice, i3 - 4), longValue2, zza, longValue, byteBuffer2, (zzahz) null));
                                                        randomAccessFile.close();
                                                        try {
                                                            randomAccessFile.close();
                                                        } catch (IOException unused) {
                                                        }
                                                        return zzl;
                                                    } else {
                                                        slice.position(position2);
                                                    }
                                                } else {
                                                    StringBuilder sb5 = new StringBuilder(70);
                                                    sb5.append("Insufficient data to read size of APK Signing Block entry #");
                                                    sb5.append(i);
                                                    throw new zzaie(sb5.toString());
                                                }
                                            }
                                            throw new zzaie("No APK Signature Scheme v2 block in APK Signing Block");
                                        }
                                        StringBuilder sb6 = new StringBuilder(41);
                                        sb6.append("end > capacity: ");
                                        sb6.append(capacity);
                                        sb6.append(" > ");
                                        sb6.append(capacity2);
                                        throw new IllegalArgumentException(sb6.toString());
                                    }
                                    StringBuilder sb7 = new StringBuilder(38);
                                    sb7.append("end < start: ");
                                    sb7.append(capacity);
                                    sb7.append(" < ");
                                    sb7.append(8);
                                    throw new IllegalArgumentException(sb7.toString());
                                }
                                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                            }
                            StringBuilder sb8 = new StringBuilder(103);
                            sb8.append("APK Signing Block sizes in header and footer do not match: ");
                            sb8.append(j4);
                            sb8.append(" vs ");
                            sb8.append(j2);
                            throw new zzaie(sb8.toString());
                        }
                        StringBuilder sb9 = new StringBuilder(59);
                        sb9.append("APK Signing Block offset out of range: ");
                        sb9.append(j3);
                        throw new zzaie(sb9.toString());
                    }
                    throw new zzaie("No APK Signing Block before ZIP Central Directory");
                } else {
                    StringBuilder sb10 = new StringBuilder(87);
                    sb10.append("APK too small for APK Signing Block. ZIP Central Directory offset: ");
                    sb10.append(zza);
                    throw new zzaie(sb10.toString());
                }
            } else {
                long length = randomAccessFile.length();
                StringBuilder sb11 = new StringBuilder(102);
                sb11.append("Not an APK file: ZIP End of Central Directory record not found in file with ");
                sb11.append(length);
                sb11.append(" bytes");
                throw new zzaie(sb11.toString());
            }
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    private static int zzb(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        throw new IllegalArgumentException(C13715c.m34241g(44, "Unknown content digest algorthm: ", i));
    }

    private static int zzc(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                String valueOf = String.valueOf(Long.toHexString((long) i));
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Unknown signature algorithm: 0x".concat(valueOf) : new String("Unknown signature algorithm: 0x"));
        }
    }

    private static String zzd(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(C13715c.m34241g(44, "Unknown content digest algorthm: ", i));
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i < 0) {
                throw new IllegalArgumentException("Negative length");
            } else if (i <= byteBuffer.remaining()) {
                return zze(byteBuffer, i);
            } else {
                throw new IOException(C13715c.m34243i(101, "Length-prefixed field longer than remaining buffer. Field length: ", i, ", remaining: ", byteBuffer.remaining()));
            }
        } else {
            throw new IOException(C13715c.m34241g(93, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
    }

    private static void zzg(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        bArr[2] = (byte) ((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        bArr[3] = (byte) ((i >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        bArr[4] = (byte) (i >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            zzaic zzaic = new zzaic(fileChannel, 0, j);
            zzaic zzaic2 = new zzaic(fileChannel, j2, j3 - j2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            long j4 = j;
            zzaii.zzd(duplicate, j);
            zzaia zzaia = new zzaia(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i = 0;
            int i2 = 0;
            for (Integer intValue : map.keySet()) {
                iArr[i2] = intValue.intValue();
                i2++;
            }
            try {
                byte[][] zzk = zzk(iArr, new zzaib[]{zzaic, zzaic2, zzaia});
                while (i < size) {
                    int i3 = iArr[i];
                    Map map2 = map;
                    if (MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), zzk[i])) {
                        i++;
                    } else {
                        throw new SecurityException(zzd(i3).concat(" digest of contents did not verify"));
                    }
                }
            } catch (DigestException e) {
                throw new SecurityException("Failed to compute digest(s) of contents", e);
            }
        } else {
            throw new SecurityException("No digests provided");
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            throw new IOException("Negative length");
        } else if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        } else {
            throw new IOException(C13715c.m34243i(90, "Underflow while reading length-prefixed value. Length: ", i, ", available: ", byteBuffer.remaining()));
        }
    }

    private static X509Certificate[] zzj(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws SecurityException, IOException {
        String str;
        Pair pair;
        String str2;
        String str3;
        ByteBuffer zzf = zzf(byteBuffer);
        ByteBuffer zzf2 = zzf(byteBuffer);
        byte[] zzi = zzi(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = null;
        int i = -1;
        int i2 = 0;
        byte[] bArr2 = null;
        while (zzf2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer zzf3 = zzf(zzf2);
                if (zzf3.remaining() >= 8) {
                    int i3 = zzf3.getInt();
                    arrayList.add(Integer.valueOf(i3));
                    if (!(i3 == 513 || i3 == 514 || i3 == 769)) {
                        switch (i3) {
                            case 257:
                            case 258:
                            case 259:
                            case 260:
                                break;
                            default:
                                continue;
                        }
                    }
                    if (i != -1) {
                        int zzc = zzc(i3);
                        int zzc2 = zzc(i);
                        if (zzc != 1) {
                            if (zzc2 != 1) {
                            }
                        }
                    }
                    bArr2 = zzi(zzf3);
                    i = i3;
                } else {
                    throw new SecurityException("Signature record too short");
                }
            } catch (IOException | BufferUnderflowException e) {
                throw new SecurityException(C13715c.m34241g(45, "Failed to parse signature record #", i2), e);
            }
        }
        if (i != -1) {
            if (i == 513 || i == 514) {
                str = "EC";
            } else if (i != 769) {
                switch (i) {
                    case 257:
                    case 258:
                    case 259:
                    case 260:
                        str = KeyProvider18.KEY_ALGORITHM_RSA;
                        break;
                    default:
                        String valueOf = String.valueOf(Long.toHexString((long) i));
                        if (valueOf.length() != 0) {
                            str3 = "Unknown signature algorithm: 0x".concat(valueOf);
                        } else {
                            str3 = new String("Unknown signature algorithm: 0x");
                        }
                        throw new IllegalArgumentException(str3);
                }
            } else {
                str = "DSA";
            }
            if (i == 513) {
                pair = Pair.create("SHA256withECDSA", (Object) null);
            } else if (i == 514) {
                pair = Pair.create("SHA512withECDSA", (Object) null);
            } else if (i != 769) {
                switch (i) {
                    case 257:
                        pair = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                        break;
                    case 258:
                        pair = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                        break;
                    case 259:
                        pair = Pair.create("SHA256withRSA", (Object) null);
                        break;
                    case 260:
                        pair = Pair.create("SHA512withRSA", (Object) null);
                        break;
                    default:
                        String valueOf2 = String.valueOf(Long.toHexString((long) i));
                        if (valueOf2.length() != 0) {
                            str2 = "Unknown signature algorithm: 0x".concat(valueOf2);
                        } else {
                            str2 = new String("Unknown signature algorithm: 0x");
                        }
                        throw new IllegalArgumentException(str2);
                }
            } else {
                pair = Pair.create("SHA256withDSA", (Object) null);
            }
            String str4 = (String) pair.first;
            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pair.second;
            try {
                PublicKey generatePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(zzi));
                Signature instance = Signature.getInstance(str4);
                instance.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    instance.setParameter(algorithmParameterSpec);
                }
                instance.update(zzf);
                if (instance.verify(bArr2)) {
                    zzf.clear();
                    ByteBuffer zzf4 = zzf(zzf);
                    ArrayList arrayList2 = new ArrayList();
                    int i4 = 0;
                    while (zzf4.hasRemaining()) {
                        i4++;
                        try {
                            ByteBuffer zzf5 = zzf(zzf4);
                            if (zzf5.remaining() >= 8) {
                                int i5 = zzf5.getInt();
                                arrayList2.add(Integer.valueOf(i5));
                                if (i5 == i) {
                                    bArr = zzi(zzf5);
                                }
                            } else {
                                throw new IOException("Record too short");
                            }
                        } catch (IOException | BufferUnderflowException e2) {
                            throw new IOException(C13715c.m34241g(42, "Failed to parse digest record #", i4), e2);
                        }
                    }
                    if (arrayList.equals(arrayList2)) {
                        int zzc3 = zzc(i);
                        byte[] bArr3 = (byte[]) map.put(Integer.valueOf(zzc3), bArr);
                        if (bArr3 == null || MessageDigest.isEqual(bArr3, bArr)) {
                            ByteBuffer zzf6 = zzf(zzf);
                            ArrayList arrayList3 = new ArrayList();
                            int i6 = 0;
                            while (zzf6.hasRemaining()) {
                                i6++;
                                byte[] zzi2 = zzi(zzf6);
                                try {
                                    arrayList3.add(new zzaif((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(zzi2)), zzi2));
                                } catch (CertificateException e3) {
                                    throw new SecurityException(C13715c.m34241g(41, "Failed to decode certificate #", i6), e3);
                                }
                            }
                            if (arrayList3.isEmpty()) {
                                throw new SecurityException("No certificates listed");
                            } else if (Arrays.equals(zzi, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
                            } else {
                                throw new SecurityException("Public key mismatch between certificate and signature record");
                            }
                        } else {
                            throw new SecurityException(zzd(zzc3).concat(" contents digest does not match the digest specified by a preceding signer"));
                        }
                    } else {
                        throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                    }
                } else {
                    throw new SecurityException(String.valueOf(str4).concat(" signature did not verify"));
                }
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException e4) {
                throw new SecurityException(C13715c.m34245k(new StringBuilder(String.valueOf(str4).length() + 27), "Failed to verify ", str4, " signature"), e4);
            }
        } else if (i2 == 0) {
            throw new SecurityException("No signatures found");
        } else {
            throw new SecurityException("No supported signatures found");
        }
    }

    private static byte[][] zzk(int[] iArr, zzaib[] zzaibArr) throws DigestException {
        long j;
        int i;
        int length;
        int[] iArr2 = iArr;
        long j2 = 0;
        int i2 = 0;
        int i3 = 0;
        long j3 = 0;
        while (true) {
            j = 1048576;
            if (i3 >= 3) {
                break;
            }
            j3 += (zzaibArr[i3].zza() + 1048575) / 1048576;
            i3++;
        }
        if (j3 < 2097151) {
            int i4 = (int) j3;
            byte[][] bArr = new byte[iArr2.length][];
            int i5 = 0;
            while (true) {
                length = iArr2.length;
                if (i5 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[((zzb(iArr2[i5]) * i4) + 5)];
                bArr2[0] = 90;
                zzg(i4, bArr2, 1);
                bArr[i5] = bArr2;
                i5++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            int i6 = 0;
            while (i6 < iArr2.length) {
                String zzd = zzd(iArr2[i6]);
                try {
                    messageDigestArr[i6] = MessageDigest.getInstance(zzd);
                    i6++;
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(zzd.concat(" digest not supported"), e);
                }
            }
            int i7 = 0;
            int i8 = 0;
            for (i = 3; i7 < i; i = 3) {
                zzaib zzaib = zzaibArr[i7];
                int i9 = i7;
                int i11 = i8;
                long zza = zzaib.zza();
                long j4 = j;
                long j5 = j2;
                while (zza > j2) {
                    int min = (int) Math.min(zza, j4);
                    zzg(min, bArr3, 1);
                    for (int i12 = 0; i12 < length; i12++) {
                        messageDigestArr[i12].update(bArr3);
                    }
                    try {
                        zzaib.zzb(messageDigestArr, j5, min);
                        int i13 = 0;
                        while (i13 < iArr2.length) {
                            int i14 = iArr2[i13];
                            byte[] bArr4 = bArr[i13];
                            int zzb = zzb(i14);
                            byte[] bArr5 = bArr3;
                            MessageDigest messageDigest = messageDigestArr[i13];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr4, (i11 * zzb) + 5, zzb);
                            if (digest == zzb) {
                                i13++;
                                bArr3 = bArr5;
                                messageDigestArr = messageDigestArr2;
                            } else {
                                String algorithm = messageDigest.getAlgorithm();
                                StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        byte[] bArr6 = bArr3;
                        MessageDigest[] messageDigestArr3 = messageDigestArr;
                        long j6 = (long) min;
                        j5 += j6;
                        zza -= j6;
                        i11++;
                        j2 = 0;
                        j4 = 1048576;
                    } catch (IOException e2) {
                        throw new DigestException(C13715c.m34243i(59, "Failed to digest chunk #", i11, " of section #", i2), e2);
                    }
                }
                byte[] bArr7 = bArr3;
                MessageDigest[] messageDigestArr4 = messageDigestArr;
                i8 = i11;
                i2++;
                i7 = i9 + 1;
                j2 = 0;
                j = 1048576;
            }
            byte[][] bArr8 = new byte[iArr2.length][];
            int i15 = 0;
            while (i15 < iArr2.length) {
                int i16 = iArr2[i15];
                byte[] bArr9 = bArr[i15];
                String zzd2 = zzd(i16);
                try {
                    bArr8[i15] = MessageDigest.getInstance(zzd2).digest(bArr9);
                    i15++;
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(zzd2.concat(" digest not supported"), e3);
                }
            }
            return bArr8;
        }
        StringBuilder sb2 = new StringBuilder(37);
        sb2.append("Too many chunks: ");
        sb2.append(j3);
        throw new DigestException(sb2.toString());
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzaid zzaid) throws SecurityException {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer zzf = zzf(zzaid.zza);
                int i = 0;
                while (zzf.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, instance));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(C13715c.m34242h(48, "Failed to parse/verify signer #", i, " block"), e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                } else if (!hashMap.isEmpty()) {
                    zzh(hashMap, fileChannel, zzaid.zzb, zzaid.zzc, zzaid.zzd, zzaid.zze);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                } else {
                    throw new SecurityException("No content digests found");
                }
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
