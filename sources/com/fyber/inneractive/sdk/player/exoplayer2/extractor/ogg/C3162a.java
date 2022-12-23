package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.a */
public final class C3162a implements C3169f {

    /* renamed from: a */
    public final C3168e f11212a = new C3168e();

    /* renamed from: b */
    public final long f11213b;

    /* renamed from: c */
    public final long f11214c;

    /* renamed from: d */
    public final C3171h f11215d;

    /* renamed from: e */
    public int f11216e;

    /* renamed from: f */
    public long f11217f;

    /* renamed from: g */
    public long f11218g;

    /* renamed from: h */
    public long f11219h;

    /* renamed from: i */
    public long f11220i;

    /* renamed from: j */
    public long f11221j;

    /* renamed from: k */
    public long f11222k;

    /* renamed from: l */
    public long f11223l;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.a$a */
    public class C3163a implements C3124m {
        public C3163a() {
        }

        /* renamed from: a */
        public long mo14078a(long j) {
            if (j == 0) {
                return C3162a.this.f11213b;
            }
            C3162a aVar = C3162a.this;
            long j2 = aVar.f11213b;
            long j3 = aVar.f11214c;
            long j4 = ((((j3 - j2) * ((((long) aVar.f11215d.f11257i) * j) / 1000000)) / aVar.f11217f) - 30000) + j2;
            if (j4 >= j2) {
                j2 = j4;
            }
            if (j2 >= j3) {
                return j3 - 1;
            }
            return j2;
        }

        /* renamed from: a */
        public boolean mo14079a() {
            return true;
        }

        /* renamed from: c */
        public long mo14080c() {
            C3162a aVar = C3162a.this;
            return (aVar.f11217f * 1000000) / ((long) aVar.f11215d.f11257i);
        }
    }

    public C3162a(long j, long j2, C3171h hVar, int i, long j3) {
        boolean z;
        if (j < 0 || j2 <= j) {
            z = false;
        } else {
            z = true;
        }
        C3380a.m8505a(z);
        this.f11215d = hVar;
        this.f11213b = j;
        this.f11214c = j2;
        if (((long) i) == j2 - j) {
            this.f11217f = j3;
            this.f11216e = 3;
            return;
        }
        this.f11216e = 0;
    }

    /* renamed from: a */
    public long mo14225a(C3087g gVar) throws IOException, InterruptedException {
        C3168e eVar;
        long j;
        long j2;
        C3087g gVar2 = gVar;
        int i = this.f11216e;
        if (i == 0) {
            long j3 = ((C3072b) gVar2).f10548c;
            this.f11218g = j3;
            this.f11216e = 1;
            long j4 = this.f11214c - 65307;
            if (j4 > j3) {
                return j4;
            }
        } else if (i != 1) {
            if (i == 2) {
                long j5 = this.f11219h;
                long j6 = 0;
                if (j5 != 0) {
                    long j7 = this.f11220i;
                    long j8 = this.f11221j;
                    if (j7 == j8) {
                        j = -(this.f11222k + 2);
                    } else {
                        C3072b bVar = (C3072b) gVar2;
                        long j9 = bVar.f10548c;
                        if (!mo14226a(gVar2, j8)) {
                            j = this.f11220i;
                            if (j == j9) {
                                throw new IOException("No ogg page can be found.");
                            }
                        } else {
                            this.f11212a.mo14235a(gVar2, false);
                            bVar.f10550e = 0;
                            C3168e eVar2 = this.f11212a;
                            long j10 = eVar2.f11240b;
                            long j11 = j5 - j10;
                            int i2 = eVar2.f11242d + eVar2.f11243e;
                            int i3 = (j11 > 0 ? 1 : (j11 == 0 ? 0 : -1));
                            if (i3 < 0 || j11 > 72000) {
                                if (i3 < 0) {
                                    this.f11221j = j9;
                                    this.f11223l = j10;
                                } else {
                                    long j12 = (long) i2;
                                    long j13 = bVar.f10548c + j12;
                                    this.f11220i = j13;
                                    this.f11222k = j10;
                                    if ((this.f11221j - j13) + j12 < 100000) {
                                        bVar.mo14088c(i2);
                                        j2 = this.f11222k;
                                    }
                                }
                                long j14 = this.f11221j;
                                long j15 = this.f11220i;
                                long j16 = j14 - j15;
                                if (j16 < 100000) {
                                    this.f11221j = j15;
                                    j = j15;
                                } else {
                                    j = Math.min(Math.max(((j11 * j16) / (this.f11223l - this.f11222k)) + (bVar.f10548c - ((long) (i2 * (i3 <= 0 ? 2 : 1)))), j15), this.f11221j - 1);
                                }
                            } else {
                                bVar.mo14088c(i2);
                                j2 = this.f11212a.f11240b;
                            }
                            j = -(j2 + 2);
                        }
                    }
                    if (j >= 0) {
                        return j;
                    }
                    long j17 = this.f11219h;
                    this.f11212a.mo14235a(gVar2, false);
                    j6 = -(j + 2);
                    while (true) {
                        C3168e eVar3 = this.f11212a;
                        if (eVar3.f11240b >= j17) {
                            break;
                        }
                        ((C3072b) gVar2).mo14088c(eVar3.f11242d + eVar3.f11243e);
                        C3168e eVar4 = this.f11212a;
                        j6 = eVar4.f11240b;
                        eVar4.mo14235a(gVar2, false);
                    }
                    ((C3072b) gVar2).f10550e = 0;
                }
                this.f11216e = 3;
                return -(j6 + 2);
            } else if (i == 3) {
                return -1;
            } else {
                throw new IllegalStateException();
            }
        }
        if (mo14226a(gVar2, this.f11214c)) {
            this.f11212a.mo14234a();
            while (true) {
                eVar = this.f11212a;
                if ((eVar.f11239a & 4) == 4) {
                    break;
                }
                C3072b bVar2 = (C3072b) gVar2;
                if (bVar2.f10548c >= this.f11214c) {
                    break;
                }
                eVar.mo14235a(gVar2, false);
                C3168e eVar5 = this.f11212a;
                bVar2.mo14088c(eVar5.f11242d + eVar5.f11243e);
            }
            this.f11217f = eVar.f11240b;
            this.f11216e = 3;
            return this.f11218g;
        }
        throw new EOFException();
    }

    /* renamed from: b */
    public C3124m mo14227b() {
        if (this.f11217f != 0) {
            return new C3163a();
        }
        return null;
    }

    /* renamed from: c */
    public long mo14228c(long j) {
        boolean z;
        long j2;
        int i = this.f11216e;
        if (i == 3 || i == 2) {
            z = true;
        } else {
            z = false;
        }
        C3380a.m8505a(z);
        if (j == 0) {
            j2 = 0;
        } else {
            j2 = (((long) this.f11215d.f11257i) * j) / 1000000;
        }
        this.f11219h = j2;
        this.f11216e = 2;
        this.f11220i = this.f11213b;
        this.f11221j = this.f11214c;
        this.f11222k = 0;
        this.f11223l = this.f11217f;
        return j2;
    }

    /* renamed from: a */
    public boolean mo14226a(C3087g gVar, long j) throws IOException, InterruptedException {
        int i;
        long min = Math.min(j + 3, this.f11214c);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            C3072b bVar = (C3072b) gVar;
            long j2 = bVar.f10548c;
            int i3 = 0;
            if (((long) i2) + j2 <= min || (i2 = (int) (min - j2)) >= 4) {
                bVar.mo14085a(bArr, 0, i2, false);
                while (true) {
                    i = i2 - 3;
                    if (i3 >= i) {
                        break;
                    } else if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        bVar.mo14088c(i3);
                        return true;
                    } else {
                        i3++;
                    }
                }
            } else {
                return false;
            }
            bVar.mo14088c(i);
        }
    }
}
