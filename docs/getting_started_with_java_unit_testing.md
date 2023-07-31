# Getting Started with Java Unit Testing
[back to Constructor Correctness](constructor_correctness.md)

Let's get our testing framework set up now.  I will walk you through every step.

1. [install maven](https://www.baeldung.com/install-maven-on-windows-linux-mac)
   * on Ubuntu: `sudo apt-get install maven`
1. be in whatever root directory you want your project to live in
1. create a maven project: `mvn -B archetype:generate -DgroupId=numbers -DartifactId=csce331-testing-rational -DarchetypeArtifactId=maven-archetype-simple -DarchetypeVersion=1.4`
1. sanity check; compile : `mvn compile`
   * you should see `BUILD SUCCESS`
1. sanity check; run tests: `mvn test`
   * you should see `BUILD SUCCESS`
1. edit `pom.xml`
   * in the `<properties>` block:
     * change `maven.compiler.source` and `maven.compiler.target` from `1.7` to  `17`
     * add `<maven.compiler.release>17</maven.compiler.release>`
   * in the `<dependencies>` block:
     * change the version of junit from `3.8.1` to `4.13.2`
1. rename `src/main/java/numbers/App.java` &rarr; `src/main/java/numbers/Rational.java`: `mv src/main/java/numbers/App.java src/main/java/numbers/Rational.java`
1. edit `src/main/java/numbers/Rational.java` to change the class name to `Rational`
1. rename `src/test/java/numbers/AppTest.java` &rarr; `src/test/java/numbers/RationalTest.java`: `mv src/test/java/numbers/AppTest.java src/test/java/numbers/RationalTest.java`
1. edit `src/test/java/numbers/RationalTest.java` to change all intances of `App` to `Rational`
1. run tests: `mvn test`
   * you should see `BUILD SUCCESS`
1. `git init`
1. tell git to ignore `target/`: `echo "target/" > .gitignore`
1. stage the changes: `git add .`
1. commit the changes: `git commit -m "initial commit"`

<details>
  <summary>What did we just do?</summary>

We
<ol>
   <li> installed maven, a powerful tool for building and managing Java-based projects</li>
   <li> created a maven project from an archetype, so we can get started quickly</li>
   <li> compiled and tested the simple generated code</li>
   <li> changed some filenames to match our task</li>
   <li> verified that the chnages didn't break anything</li>
   <li> initialized a local git repository and committed our initial changes to it</li>
</ol>
</details>

We are now ready to get back to testing!

[next section: hamcrest](add_hamcrest_dependency.md)

<hr>

[table of contents](toc.md)