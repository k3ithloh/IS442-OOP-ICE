
# ! 1 way to compile
# javac -d classFiles -cp lib/farming.jar -sourcepath sourceFile sourceFiles/farming/app/*
# ! Another way to compile
javac -d classFiles -cp "lib/*:sourceFiles" sourceFiles/farming/app/*

# javac -d classFiles -cp lib/farming.jar -sourcepath sourceFiles sourceFiles/farming/app/AnimalFarmTest.java