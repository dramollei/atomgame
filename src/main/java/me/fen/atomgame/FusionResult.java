package me.fen.atomgame;

import me.fen.atomgame.particles.Particle;

import java.util.List;

public class FusionResult {
    public int newAtomicNumber;
    public int center;
    public int radius;
    public List<Integer> atomicNumberSteps; // convenience field so scoring strategies don't need to replicate the fusion logic
    public CircularList<Particle> particlesAfter; // board state after this fusion finishes, but before anything else occurs
    public Particle fusedParticle; // convenience field for storing the particle that the fusion resulted in

    public FusionResult(int newAtomicNumber, int center, int radius, List<Integer> atomicNumberSteps, CircularList<Particle> particlesAfter, Particle fusedParticle) {
        this.newAtomicNumber = newAtomicNumber;
        this.center = center;
        this.radius = radius;
        this.atomicNumberSteps = atomicNumberSteps;
        this.particlesAfter = particlesAfter;
        this.fusedParticle = fusedParticle;
    }

    @Override
    public String toString() {
        return "FusionResult{" +
                "newAtomicNumber=" + newAtomicNumber +
                ", center=" + center +
                ", radius=" + radius +
                ", atomicNumberSteps=" + atomicNumberSteps +
                ", particlesAfter=" + particlesAfter +
                ", fusedParticle=" + fusedParticle +
                '}';
    }
}
