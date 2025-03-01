# Ordner jpackage
## mit classpath
* im src/main/java-Ordner runter bis zum package javac HelloWindow.java
* Ergebnis samt Package-Ordnern ins classpathy-Verzeichnis legen
* dort: jar cfe HelloWindowApplication.jar de.zettsystems.pack.HelloWindow de/zettsystems/pack/HelloWindow.class
* Ergebnis-jar ins classpathy_in Verzeichnis legen
* aus dem Hauptverzeichnis jpackage:
* jpackage --type app-image --input ./classpathy_in --dest ./classpathy_out --name HelloWindowExe --main-jar HelloWindowApplication.jar --main-class de.zettsystems.pack.HelloWindow
* lauffähige Anwendung liegt dann unter classpathy_out

## modular
* im src/main/java-Ordner javac module-info.java de/zettsystems/pack/HelloWindow.java (oder maven und aus target/classes holen)
* Ergebnis samt Package-Ordnern ins modular-Verzeichnis legen
* im Hauptordner jpackage: jar --create --file modular_in/HelloWindowApplication.jar -C modular .
* Ergebnis-jar ins modular_in Verzeichnis legen
* aus dem Hauptverzeichnis jpackage:
* jpackage --type app-image --dest ./modular_out --name HelloWindowExe --module de.zettsystems.pack/de.zettsystems.pack.HelloWindow --module-path ./modular_in
* lauffähige Anwendung liegt dann unter modular_out
* jetzt könnte man noch mit jlink vorher eine kleinere runtime machen....