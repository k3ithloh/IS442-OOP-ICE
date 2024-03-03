# javac -d generated -cp "lib/*:conf/*:" src/*
# javac -d generated -cp "conf/*:lib/log4j/*:lib/thymeleaf/*" src/*
javac -proc:none -d generated -cp "conf:lib/log4j/*:lib/thymeleaf/*:src" src/app/Example.java