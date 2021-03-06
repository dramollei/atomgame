package me.fen.atomgame.particles;

public class Plus implements Particle {
    public Plus() {
    }

    @Override
    public ParticleType getParticleType() {
        return ParticleType.PLUS;
    }

    @Override
    public int getReactionValue() {
        return 1;
    }

    @Override
    public boolean isAtomOperation() {
        return false;
    }

    @Override
    public boolean weakEquals(Particle obj) {
        return obj instanceof Plus;
    }

    @Override
    public String toString() {
        return "plus";
    }

    @Override
    public Particle copy() {
        return new Plus();
    }
}
