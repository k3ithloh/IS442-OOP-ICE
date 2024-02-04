# Compile the Java file in the goodmorning directory
#? javac -d classes -cp "library/*:." morning/Greetings.java:

# Compile the Java file in the goodafternoon directory
#? javac -d classes -cp "library/*:." afternoon/Greetings.java

# Compile the Java files together
javac -d classes -cp "library/*:." morning/Greetings.java afternoon/Greetings.java