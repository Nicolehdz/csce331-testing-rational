# Hamcrest
[back to getting started with java unit testing](getting_started_with_java_unit_testing.md)

I want us to use [Hamcrest](https://hamcrest.org/JavaHamcrest/tutorial) for writing our tests.  To put it simply, Hamcrest makes both writing and reading tests easier.  To be able to use Hamcrest, all we have to do is add the following dependency to our POM file (`pom.xml`) in the `<dependencies>` section:

```xml
<dependency>
   <groupId>org.hamcrest</groupId>
   <artifactId>hamcrest</artifactId>
   <version>2.2</version>
   <scope>test</scope>
</dependency>
```

Run `mvn test` again to be sure everything still works.  You should be able to see maven downloading Hamcrest.

[next section: constructor correctness, continued](constructor_correctness_continued.md)

<hr>

[table of contents](toc.md)