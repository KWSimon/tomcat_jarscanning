This project is a minimal sample reproducing the following issue :  
ServletContainerInitializer ignored by Tomcat if in a jar prefixed by "spring" or "google" (or other names from default exclusion list) 
when a jar in the classpath contains a web-fragment.xml with ordering set to "before  others".

See https://stackoverflow.com/questions/72635520/servletcontainerinitializer-ignored-by-tomee-because-of-jar-name-and-web-fragmen

## Steps to reproduce the issue :_ 

### Build and run the war without the jar containting the web-fragment.xml:

- In the parent project jar-scanning-issue : `mvn clean install -P!ko`
- In the webapp project : `mvn tomee:run`

In the output you should see these 3 lines outputed by the 3 jars :

```
################### always-working-name jar Initializer
################### Google Named Jar Initializer
################### Spring Named Jar Initializer
```

### Build and run the war with the jar containing the web-fragment.xml: 

- In the parent project jar-scanning-issue : `mvn clean install`
- In the webapp project : `mvn tomee:run`

In the console outputs you should only see these 2 lines: 
```
################### always-working-name jar Initializer
################### jar-web-fragment (ordering before others) Initializer
```

The google and spring nameds jars `ServletContainerInitializer` are not called.

