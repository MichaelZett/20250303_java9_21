package de.zettsystems.java9_10.misc;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class ProcessApiJava9Example {
    public static void main(String[] args) {
        
        // Aktueller Prozess
        ProcessHandle currentProcess = ProcessHandle.current();
        long pid = currentProcess.pid();
        System.out.println("Aktueller Prozess PID: " + pid);

        // Info zum aktuellen Prozess abfragen
        ProcessHandle.Info info = currentProcess.info();
        Optional<String> cmd = info.command();
        Optional<Instant> startTime = info.startInstant();
        Optional<Duration> totalCpuDuration = info.totalCpuDuration();

        cmd.ifPresent(c -> System.out.println("Command: " + c));
        startTime.ifPresent(t -> System.out.println("Startzeit: " + t));
        totalCpuDuration.ifPresent(d -> System.out.println("CPU-Dauer: " + d));

        // Alle laufenden Prozesse auflisten (Vorsicht: kann sehr viele sein!)
        System.out.println("\nAlle Prozesse (PID und Befehl):");
        ProcessHandle.allProcesses()
                     .limit(5) // nur die ersten 5 anzeigen, damit es nicht zu viel wird
                     .forEach(ph -> {
                         System.out.print("PID: " + ph.pid() + " ");
                         ph.info().command().ifPresent(cmdString -> System.out.println(" -> " + cmdString));
                     });
    }
}
