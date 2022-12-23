package org.poly2tri.triangulation.delaunay.sweep;

public class PointOnEdgeException extends RuntimeException {
    private static final long serialVersionUID = 1;

    public PointOnEdgeException(String str) {
        super(str);
    }
}
