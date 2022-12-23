package p138jb;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p126ib.C5337e;
import p126ib.C5340g;
import p126ib.C5341h;
import p137ja.C5415f;
import p277ub.C6774a0;
import p304x.C7070l;
import p583jk.C17875h;

/* renamed from: jb.c */
public abstract class C5426c implements C5337e {

    /* renamed from: a */
    public final ArrayDeque<C5427a> f17876a = new ArrayDeque<>();

    /* renamed from: b */
    public final ArrayDeque<C5341h> f17877b;

    /* renamed from: c */
    public final PriorityQueue<C5427a> f17878c;

    /* renamed from: d */
    public C5427a f17879d;

    /* renamed from: e */
    public long f17880e;

    /* renamed from: f */
    public long f17881f;

    /* renamed from: jb.c$a */
    public static final class C5427a extends C5340g implements Comparable<C5427a> {

        /* renamed from: k */
        public long f17882k;

        public final int compareTo(Object obj) {
            C5427a aVar = (C5427a) obj;
            if (mo21174d(4) == aVar.mo21174d(4)) {
                long j = this.f13649f - aVar.f13649f;
                if (j == 0) {
                    j = this.f17882k - aVar.f17882k;
                    if (j == 0) {
                        return 0;
                    }
                }
                if (j > 0) {
                    return 1;
                }
            } else if (mo21174d(4)) {
                return 1;
            }
            return -1;
        }
    }

    /* renamed from: jb.c$b */
    public static final class C5428b extends C5341h {

        /* renamed from: f */
        public C5415f.C5416a<C5428b> f17883f;

        public C5428b(C7070l lVar) {
            this.f17883f = lVar;
        }

        /* renamed from: h */
        public final void mo21120h() {
            this.f17883f.mo20737a(this);
        }
    }

    public C5426c() {
        for (int i = 0; i < 10; i++) {
            this.f17876a.add(new C5427a());
        }
        this.f17877b = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f17877b.add(new C5428b(new C7070l(this, 4)));
        }
        this.f17878c = new PriorityQueue<>();
    }

    /* renamed from: a */
    public final void mo21176a(C5340g gVar) throws DecoderException {
        boolean z;
        if (gVar == this.f17879d) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        C5427a aVar = (C5427a) gVar;
        if (aVar.mo21175g()) {
            aVar.mo15948h();
            this.f17876a.add(aVar);
        } else {
            long j = this.f17881f;
            this.f17881f = 1 + j;
            aVar.f17882k = j;
            this.f17878c.add(aVar);
        }
        this.f17879d = null;
    }

    /* renamed from: b */
    public final void mo21117b(long j) {
        this.f17880e = j;
    }

    /* renamed from: d */
    public final Object mo21178d() throws DecoderException {
        boolean z;
        if (this.f17879d == null) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44304o(z);
        if (this.f17876a.isEmpty()) {
            return null;
        }
        C5427a pollFirst = this.f17876a.pollFirst();
        this.f17879d = pollFirst;
        return pollFirst;
    }

    /* renamed from: e */
    public abstract C5429d mo21186e();

    /* renamed from: f */
    public abstract void mo21187f(C5427a aVar);

    public void flush() {
        this.f17881f = 0;
        this.f17880e = 0;
        while (!this.f17878c.isEmpty()) {
            C5427a poll = this.f17878c.poll();
            int i = C6774a0.f20959a;
            poll.mo15948h();
            this.f17876a.add(poll);
        }
        C5427a aVar = this.f17879d;
        if (aVar != null) {
            aVar.mo15948h();
            this.f17876a.add(aVar);
            this.f17879d = null;
        }
    }

    /* renamed from: g */
    public C5341h mo21177c() throws SubtitleDecoderException {
        if (this.f17877b.isEmpty()) {
            return null;
        }
        while (!this.f17878c.isEmpty()) {
            int i = C6774a0.f20959a;
            if (this.f17878c.peek().f13649f > this.f17880e) {
                break;
            }
            C5427a poll = this.f17878c.poll();
            if (poll.mo21174d(4)) {
                C5341h pollFirst = this.f17877b.pollFirst();
                pollFirst.f17757b = 4 | pollFirst.f17757b;
                poll.mo15948h();
                this.f17876a.add(poll);
                return pollFirst;
            }
            mo21187f(poll);
            if (mo21189h()) {
                C5429d e = mo21186e();
                C5341h pollFirst2 = this.f17877b.pollFirst();
                pollFirst2.mo21125i(poll.f13649f, e, Long.MAX_VALUE);
                poll.mo15948h();
                this.f17876a.add(poll);
                return pollFirst2;
            }
            poll.mo15948h();
            this.f17876a.add(poll);
        }
        return null;
    }

    /* renamed from: h */
    public abstract boolean mo21189h();

    public void release() {
    }
}
