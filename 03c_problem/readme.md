# Problems with Modules without beeing a module....
* normal Start: Exception

# Run without problems
* update library or
* Use Run Config with jvmArgs:
** --add-opens java.desktop/java.awt.font=ALL-UNNAMED --add-opens=java.base/java.util=ALL-UNNAMED --add-opens=java.base/java.lang.reflect=ALL-UNNAMED --add-opens=java.base/java.text=ALL-UNNAMED