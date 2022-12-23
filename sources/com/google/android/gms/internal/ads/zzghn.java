package com.google.android.gms.internal.ads;

import com.appboy.support.ValidationUtils;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class zzghn {
    private final ECPublicKey zza;

    public zzghn(ECPublicKey eCPublicKey) {
        this.zza = eCPublicKey;
    }

    public final zzghm zza(String str, byte[] bArr, byte[] bArr2, int i, int i2) throws GeneralSecurityException {
        BigInteger bigInteger;
        char c;
        byte[] bArr3;
        int i3;
        int i4;
        byte[] bArr4;
        String str2 = str;
        byte[] bArr5 = bArr;
        int i5 = i;
        KeyPair zzb = zzgho.zzb(this.zza.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) zzb.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) zzb.getPrivate();
        ECPublicKey eCPublicKey2 = this.zza;
        try {
            ECParameterSpec params = eCPublicKey2.getParams();
            ECParameterSpec params2 = eCPrivateKey.getParams();
            if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey2.getW();
            zzgho.zzc(w, eCPrivateKey.getParams().getCurve());
            PublicKey generatePublic = ((KeyFactory) zzghq.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement keyAgreement = (KeyAgreement) zzghq.zze.zza("ECDH");
            keyAgreement.init(eCPrivateKey);
            int i6 = 1;
            try {
                keyAgreement.doPhase(generatePublic, true);
                byte[] generateSecret = keyAgreement.generateSecret();
                EllipticCurve curve = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger2 = new BigInteger(1, generateSecret);
                if (bigInteger2.signum() == -1 || bigInteger2.compareTo(zzgho.zza(curve)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                BigInteger zza2 = zzgho.zza(curve);
                BigInteger mod = bigInteger2.multiply(bigInteger2).add(curve.getA()).multiply(bigInteger2).add(curve.getB()).mod(zza2);
                if (zza2.signum() == 1) {
                    BigInteger mod2 = mod.mod(zza2);
                    BigInteger bigInteger3 = BigInteger.ZERO;
                    if (!mod2.equals(bigInteger3)) {
                        if (!zza2.testBit(0) || !zza2.testBit(1)) {
                            if (zza2.testBit(0) && !zza2.testBit(1)) {
                                bigInteger3 = BigInteger.ONE;
                                BigInteger shiftRight = zza2.subtract(bigInteger3).shiftRight(1);
                                int i7 = 0;
                                while (true) {
                                    BigInteger mod3 = bigInteger3.multiply(bigInteger3).subtract(mod2).mod(zza2);
                                    if (mod3.equals(BigInteger.ZERO)) {
                                        break;
                                    }
                                    BigInteger modPow = mod3.modPow(shiftRight, zza2);
                                    BigInteger bigInteger4 = BigInteger.ONE;
                                    if (modPow.add(bigInteger4).equals(zza2)) {
                                        BigInteger shiftRight2 = zza2.add(bigInteger4).shiftRight(i6);
                                        BigInteger bigInteger5 = bigInteger3;
                                        for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                            BigInteger multiply = bigInteger5.multiply(bigInteger4);
                                            BigInteger mod4 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(zza2).multiply(mod3)).mod(zza2);
                                            BigInteger mod5 = multiply.add(multiply).mod(zza2);
                                            if (shiftRight2.testBit(bitLength)) {
                                                BigInteger mod6 = mod4.multiply(bigInteger3).add(mod5.multiply(mod3)).mod(zza2);
                                                bigInteger4 = bigInteger3.multiply(mod5).add(mod4).mod(zza2);
                                                bigInteger5 = mod6;
                                            } else {
                                                BigInteger bigInteger6 = mod5;
                                                bigInteger5 = mod4;
                                                bigInteger4 = bigInteger6;
                                            }
                                        }
                                        bigInteger = bigInteger5;
                                    } else if (modPow.equals(bigInteger4)) {
                                        bigInteger3 = bigInteger3.add(bigInteger4);
                                        i7++;
                                        if (i7 == 128) {
                                            if (!zza2.isProbablePrime(80)) {
                                                throw new InvalidAlgorithmParameterException("p is not prime");
                                            }
                                        }
                                        i6 = 1;
                                    } else {
                                        throw new InvalidAlgorithmParameterException("p is not prime");
                                    }
                                }
                            } else {
                                bigInteger = null;
                            }
                        } else {
                            bigInteger = mod2.modPow(zza2.add(BigInteger.ONE).shiftRight(2), zza2);
                        }
                        if (bigInteger3 != null) {
                            if (bigInteger3.multiply(bigInteger3).mod(zza2).compareTo(mod2) != 0) {
                                throw new GeneralSecurityException("Could not find a modular square root");
                            }
                        }
                    }
                    if (!bigInteger3.testBit(0)) {
                        zza2.subtract(bigInteger3).mod(zza2);
                    }
                    EllipticCurve curve2 = eCPublicKey.getParams().getCurve();
                    ECPoint w2 = eCPublicKey.getW();
                    zzgho.zzc(w2, curve2);
                    int bitLength2 = (zzgho.zza(curve2).subtract(BigInteger.ONE).bitLength() + 7) / 8;
                    int i8 = i2 - 1;
                    if (i8 != 0) {
                        if (i8 != 2) {
                            int i9 = bitLength2 + 1;
                            bArr4 = new byte[i9];
                            byte[] byteArray = w2.getAffineX().toByteArray();
                            int length = byteArray.length;
                            c = 0;
                            System.arraycopy(byteArray, 0, bArr4, i9 - length, length);
                            bArr4[0] = true != w2.getAffineY().testBit(0) ? (byte) 2 : 3;
                        } else {
                            int i11 = bitLength2 + bitLength2;
                            bArr4 = new byte[i11];
                            byte[] byteArray2 = w2.getAffineX().toByteArray();
                            int length2 = byteArray2.length;
                            if (length2 > bitLength2) {
                                byteArray2 = Arrays.copyOfRange(byteArray2, length2 - bitLength2, length2);
                            }
                            byte[] byteArray3 = w2.getAffineY().toByteArray();
                            int length3 = byteArray3.length;
                            if (length3 > bitLength2) {
                                byteArray3 = Arrays.copyOfRange(byteArray3, length3 - bitLength2, length3);
                            }
                            int length4 = byteArray3.length;
                            c = 0;
                            System.arraycopy(byteArray3, 0, bArr4, i11 - length4, length4);
                            int length5 = byteArray2.length;
                            System.arraycopy(byteArray2, 0, bArr4, bitLength2 - length5, length5);
                        }
                        bArr3 = bArr4;
                        i4 = 2;
                        i3 = 1;
                    } else {
                        c = 0;
                        i3 = 1;
                        int i12 = bitLength2 + bitLength2 + 1;
                        bArr3 = new byte[i12];
                        byte[] byteArray4 = w2.getAffineX().toByteArray();
                        byte[] byteArray5 = w2.getAffineY().toByteArray();
                        int length6 = byteArray5.length;
                        System.arraycopy(byteArray5, 0, bArr3, i12 - length6, length6);
                        int length7 = byteArray4.length;
                        System.arraycopy(byteArray4, 0, bArr3, (bitLength2 + 1) - length7, length7);
                        bArr3[0] = 4;
                        i4 = 2;
                    }
                    byte[][] bArr6 = new byte[i4][];
                    bArr6[c] = bArr3;
                    bArr6[i3] = generateSecret;
                    byte[] zzc = zzghf.zzc(bArr6);
                    Mac mac = (Mac) zzghq.zzb.zza(str2);
                    if (i5 <= mac.getMacLength() * ValidationUtils.APPBOY_STRING_MAX_LENGTH) {
                        if (bArr5 == null || bArr5.length == 0) {
                            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str2));
                        } else {
                            mac.init(new SecretKeySpec(bArr5, str2));
                        }
                        byte[] doFinal = mac.doFinal(zzc);
                        byte[] bArr7 = new byte[i5];
                        mac.init(new SecretKeySpec(doFinal, str2));
                        byte[] bArr8 = new byte[0];
                        int i13 = 0;
                        while (true) {
                            mac.update(bArr8);
                            mac.update(bArr2);
                            mac.update((byte) i3);
                            byte[] doFinal2 = mac.doFinal();
                            int length8 = doFinal2.length;
                            int i14 = i13 + length8;
                            if (i14 < i5) {
                                System.arraycopy(doFinal2, 0, bArr7, i13, length8);
                                i3++;
                                bArr8 = doFinal2;
                                i13 = i14;
                            } else {
                                System.arraycopy(doFinal2, 0, bArr7, i13, i5 - i13);
                                return new zzghm(bArr3, bArr7);
                            }
                        }
                    } else {
                        throw new GeneralSecurityException("size too large");
                    }
                } else {
                    throw new InvalidAlgorithmParameterException("p must be positive");
                }
            } catch (IllegalStateException e) {
                throw new GeneralSecurityException(e.toString());
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2.toString());
        }
    }
}
