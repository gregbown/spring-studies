# Spring Studies
Studies in Spring Framework.

This repo is based on the Udemy class [Spring Framework 5: Beginner to Guru](https://www.udemy.com/spring-framework-5-beginner-to-guru).
The referenced repos are [Spring Framework Guru Pet Clinic](https://github.com/springframeworkguru/sfg-pet-clinic)  and [Spring Pet Clinic](https://github.com/spring-projects/spring-petclinic).

I have changed the app to use Java 1.8, libsass-maven-plugin to compile SCSS, Bootstrap 4.2.1 and FontAwesome 5.6.3 webjars for the SCSS source.  In doing this, I have removed wro4j and the Less to CSS compilation that was in sfg-pet-clinic.
Also, did some updated layout and styling in the owners view.

Created a [Java 11 branch](https://github.com/gregbown/spring-studies/tree/Java-11-build) that builds with [OpenJDK 11.2](https://jdk.java.net/11/) Added maven-compiler-plugin 3.8 with the dependency of org.ow2.asm 6.2 to facilitate the Java 11 build.