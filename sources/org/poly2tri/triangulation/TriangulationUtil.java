package org.poly2tri.triangulation;

import bj0.C21085b;

public final class TriangulationUtil {

    public enum Orientation {
        CW,
        CCW,
        Collinear
    }

    /* renamed from: a */
    public static boolean m61948a(C21085b bVar, C21085b bVar2, C21085b bVar3, C21085b bVar4) {
        double a = bVar4.mo53239a();
        double b = bVar4.mo53240b();
        double a2 = bVar.mo53239a() - a;
        double b2 = bVar.mo53240b() - b;
        if (((bVar2.mo53240b() - b) * a2) - ((bVar2.mo53239a() - a) * b2) <= 0.0d) {
            return false;
        }
        if (((bVar3.mo53239a() - a) * b2) - (a2 * (bVar3.mo53240b() - b)) <= 0.0d) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Orientation m61949b(C21085b bVar, C21085b bVar2, C21085b bVar3) {
        double b = ((bVar2.mo53240b() - bVar3.mo53240b()) * (bVar.mo53239a() - bVar3.mo53239a())) - ((bVar2.mo53239a() - bVar3.mo53239a()) * (bVar.mo53240b() - bVar3.mo53240b()));
        if (b > -1.0E-12d && b < 1.0E-12d) {
            return Orientation.Collinear;
        }
        if (b > 0.0d) {
            return Orientation.CCW;
        }
        return Orientation.CW;
    }
}
