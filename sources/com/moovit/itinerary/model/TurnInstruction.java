package com.moovit.itinerary.model;

import ce0.C21100e;
import com.appboy.models.MessageButton;
import java.io.IOException;
import p810sz.C19577c;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p824tp.C19746x;

public final class TurnInstruction {

    /* renamed from: c */
    public static final C16102a f41934c = new C16102a();

    /* renamed from: a */
    public final Direction f41935a;

    /* renamed from: b */
    public final String f41936b;

    public enum Direction {
        DEPART(C19746x.direction_depart),
        HARD_LEFT(C19746x.direction_hard_left),
        LEFT(C19746x.direction_left),
        SLIGHTLY_LEFT(C19746x.direction_slightly_left),
        CONTINUE(C19746x.direction_continue),
        SLIGHTLY_RIGHT(C19746x.direction_slightly_right),
        RIGHT(C19746x.direction_right),
        HARD_RIGHT(C19746x.direction_hard_right),
        CIRCLE_CLOCKWISE(C19746x.direction_circle_clockwise),
        CIRCLE_COUNTERCLOCKWISE(C19746x.direction_circle_counter_clockwise),
        ELEVATOR(C19746x.direction_elevator),
        U_TURN_LEFT(C19746x.direction_uturn_left),
        U_TURN_RIGHT(C19746x.direction_uturn_right),
        NORTH(C19746x.direction_north),
        NORTH_EAST(r15),
        EAST(C19746x.direction_east),
        SOUTH_EAST(C19746x.direction_southeast),
        SOUTH(C19746x.direction_south),
        SOUTH_WEST(C19746x.direction_southwest),
        WEST(C19746x.direction_west),
        NORTH_WEST(r15);
        
        public static C19577c<Direction> CODER;
        private final int resId;

        /* access modifiers changed from: public */
        static {
            Direction direction;
            Direction direction2;
            Direction direction3;
            Direction direction4;
            Direction direction5;
            Direction direction6;
            Direction direction7;
            Direction direction8;
            Direction direction9;
            Direction direction10;
            Direction direction11;
            Direction direction12;
            Direction direction13;
            Direction direction14;
            Direction direction15;
            Direction direction16;
            Direction direction17;
            Direction direction18;
            Direction direction19;
            Direction direction20;
            Direction direction21;
            CODER = new C19577c<>(Direction.class, direction, direction2, direction3, direction4, direction5, direction6, direction7, direction8, direction9, direction10, direction11, direction15, direction12, direction13, direction14, direction16, direction17, direction18, direction20, direction19, direction21);
        }

        private Direction(int i) {
            this.resId = i;
        }

        public int getResId() {
            return this.resId;
        }
    }

    /* renamed from: com.moovit.itinerary.model.TurnInstruction$a */
    public class C16102a extends C19619s<TurnInstruction> {
        public C16102a() {
            super(0, TurnInstruction.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19577c<Direction> cVar = Direction.CODER;
            pVar.getClass();
            return new TurnInstruction((Direction) cVar.read(pVar), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TurnInstruction turnInstruction = (TurnInstruction) obj;
            Direction direction = turnInstruction.f41935a;
            C19577c<Direction> cVar = Direction.CODER;
            qVar.getClass();
            cVar.write(direction, qVar);
            qVar.mo51954p(turnInstruction.f41936b);
        }
    }

    public TurnInstruction(Direction direction, String str) {
        C21100e.m49373x(direction, "direction");
        this.f41935a = direction;
        C21100e.m49373x(str, MessageButton.TEXT);
        this.f41936b = str;
    }
}
