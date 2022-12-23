package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.ai */
final class C21397ai extends C21396ah {

    /* renamed from: a */
    private final boolean f53840a;

    public C21397ai(C21388ad adVar, boolean z) {
        super(adVar);
        this.f53840a = z;
    }

    /* renamed from: b */
    private void m50935b(C21316ab abVar) {
        C22292q qVar;
        C22292q qVar2;
        C21388ad a = mo54169a();
        if (this.f53840a) {
            qVar = a.mo54118e();
        } else {
            qVar = a.mo54119f();
        }
        if (this.f53840a) {
            qVar2 = a.mo54120g();
        } else {
            qVar2 = a.mo54121h();
        }
        int b = mo54172b((int) qVar2.mo56295b());
        C21391ae[] b2 = mo54173b();
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        for (int b3 = mo54172b((int) qVar.mo56295b()); b3 < b; b3++) {
            C21391ae aeVar = b2[b3];
            if (aeVar != null) {
                aeVar.mo54150b();
                int h = aeVar.mo54157h() - i;
                if (h == 0) {
                    i2++;
                } else {
                    if (h == 1) {
                        i3 = Math.max(i3, i2);
                        i = aeVar.mo54157h();
                    } else if (aeVar.mo54157h() >= abVar.mo53823c()) {
                        b2[b3] = null;
                    } else {
                        i = aeVar.mo54157h();
                    }
                    i2 = 1;
                }
            }
        }
    }

    /* renamed from: f */
    private void m50936f() {
        for (C21391ae aeVar : mo54173b()) {
            if (aeVar != null) {
                aeVar.mo54150b();
            }
        }
    }

    /* renamed from: a */
    public void mo54176a(C21316ab abVar) {
        C21391ae[] b = mo54173b();
        m50936f();
        m50934a(b, abVar);
        C21388ad a = mo54169a();
        C22292q e = this.f53840a ? a.mo54118e() : a.mo54119f();
        C22292q g = this.f53840a ? a.mo54120g() : a.mo54121h();
        int b2 = mo54172b((int) e.mo56295b());
        int b3 = mo54172b((int) g.mo56295b());
        int i = -1;
        int i2 = 0;
        int i3 = 1;
        while (b2 < b3) {
            C21391ae aeVar = b[b2];
            if (aeVar != null) {
                int h = aeVar.mo54157h() - i;
                if (h == 0) {
                    i2++;
                } else {
                    if (h == 1) {
                        i3 = Math.max(i3, i2);
                        i = aeVar.mo54157h();
                    } else if (h < 0 || aeVar.mo54157h() >= abVar.mo53823c() || h > b2) {
                        b[b2] = null;
                    } else {
                        if (i3 > 2) {
                            h *= i3 - 2;
                        }
                        boolean z = h >= b2;
                        for (int i4 = 1; i4 <= h && !z; i4++) {
                            z = b[b2 - i4] != null;
                        }
                        if (z) {
                            b[b2] = null;
                        } else {
                            i = aeVar.mo54157h();
                        }
                    }
                    i2 = 1;
                }
            }
            b2++;
        }
    }

    /* renamed from: c */
    public int[] mo54177c() {
        int h;
        C21316ab d = mo54178d();
        if (d == null) {
            return null;
        }
        m50935b(d);
        int c = d.mo53823c();
        int[] iArr = new int[c];
        for (C21391ae aeVar : mo54173b()) {
            if (aeVar != null && (h = aeVar.mo54157h()) < c) {
                iArr[h] = iArr[h] + 1;
            }
        }
        return iArr;
    }

    /* renamed from: d */
    public C21316ab mo54178d() {
        C21391ae[] b = mo54173b();
        C21328ac acVar = new C21328ac();
        C21328ac acVar2 = new C21328ac();
        C21328ac acVar3 = new C21328ac();
        C21328ac acVar4 = new C21328ac();
        for (C21391ae aeVar : b) {
            if (aeVar != null) {
                aeVar.mo54150b();
                int g = aeVar.mo54156g() % 30;
                int h = aeVar.mo54157h();
                if (!this.f53840a) {
                    h += 2;
                }
                int i = h % 3;
                if (i == 0) {
                    acVar2.mo53990a((g * 3) + 1);
                } else if (i == 1) {
                    acVar4.mo53990a(g / 3);
                    acVar3.mo53990a(g % 3);
                } else if (i == 2) {
                    acVar.mo53990a(g + 1);
                }
            }
        }
        if (acVar.mo53991a().length == 0 || acVar2.mo53991a().length == 0 || acVar3.mo53991a().length == 0 || acVar4.mo53991a().length == 0 || acVar.mo53991a()[0] <= 0 || acVar2.mo53991a()[0] + acVar3.mo53991a()[0] < 3 || acVar2.mo53991a()[0] + acVar3.mo53991a()[0] > 90) {
            return null;
        }
        C21316ab abVar = new C21316ab(acVar.mo53991a()[0], acVar2.mo53991a()[0], acVar3.mo53991a()[0], acVar4.mo53991a()[0]);
        m50934a(b, abVar);
        return abVar;
    }

    /* renamed from: e */
    public boolean mo54179e() {
        return this.f53840a;
    }

    public String toString() {
        return "IsLeft: " + this.f53840a + 10 + super.toString();
    }

    /* renamed from: a */
    private void m50934a(C21391ae[] aeVarArr, C21316ab abVar) {
        for (int i = 0; i < aeVarArr.length; i++) {
            C21391ae aeVar = aeVarArr[i];
            if (aeVar != null) {
                int g = aeVar.mo54156g() % 30;
                int h = aeVar.mo54157h();
                if (h > abVar.mo53823c()) {
                    aeVarArr[i] = null;
                } else {
                    if (!this.f53840a) {
                        h += 2;
                    }
                    int i2 = h % 3;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2 && g + 1 != abVar.mo53821a()) {
                                aeVarArr[i] = null;
                            }
                        } else if (g / 3 != abVar.mo53822b() || g % 3 != abVar.mo53825e()) {
                            aeVarArr[i] = null;
                        }
                    } else if ((g * 3) + 1 != abVar.mo53824d()) {
                        aeVarArr[i] = null;
                    }
                }
            }
        }
    }
}
