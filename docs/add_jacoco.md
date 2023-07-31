# Add Jacoco to the project
[back to coverage](coverage.md)

In `pom.xml`, in the `<build>` group, add the following (**outside** of `<pluginManagement>`):

```xml
<plugins>
   <plugin>
      <groupId>org.jacoco</groupId>
      <artifactId>jacoco-maven-plugin</artifactId>
      <version>0.8.10</version>
      <executions>
            <execution>
               <id>prepare-agent</id>
               <goals>
                  <goal>prepare-agent</goal>
               </goals>
            </execution>
            <execution>
               <id>report</id>
               <phase>test</phase>
               <goals>
                  <goal>report</goal>
               </goals>
            </execution>
            <execution>
               <id>default-jacoco-check</id>
               <goals>
                  <goal>check</goal>
               </goals>
               <configuration>
                  <rules>
                        <rule>
                           <element>CLASS</element>
                           <excludes>
                              <exclude>*Test</exclude>
                           </excludes>
                           <limits>
                              <limit>
                                    <counter>INSTRUCTION</counter>
                                    <value>COVEREDRATIO</value>
                                    <minimum>90%</minimum>
                              </limit>
                              <limit>
                                    <counter>BRANCH</counter>
                                    <value>COVEREDRATIO</value>
                                    <minimum>90%</minimum>
                              </limit>
                              <limit>
                                    <counter>COMPLEXITY</counter>
                                    <value>COVEREDRATIO</value>
                                    <minimum>90%</minimum>
                              </limit>
                           </limits>
                        </rule>
                  </rules>
               </configuration>
            </execution>
      </executions>
   </plugin>
</plugins>
```

Run `mvn verify` to see if your tests achieve at least 90% coverage.

No?

Let's find out why not.  Open `target/site/jacoco/index.html` to view the coverage report.

Click through to see what was missed in `Rational.java`.

<details>
   <summary>What was missed?</summary>

The `main` method.

</details>

<details>
   <summary>How to fix?</summary>

Delete it!  It was auto-generated, but we don't need it.

</details>

Re-run `mvn verify`.  The build should succeed because now &ge; 90% of your code is covered by tests (it should be 100% now).

If your tests are passing and your coverage is high, now is a good time to `git add . ; git commit -m "all tests passing"`.

[next section: refactoring](refactoring.md)

<hr>

[table of contents](toc.md)