# ditrapani.info #

## Build & Run ##

```sh
$ cd ditrapani_info
$ ./sbt
> jetty:start
> browse
```

If `browse` doesn't launch your browser, manually open [http://localhost:8080/](http://localhost:8080/) in your browser.

## Deploy ##

```
sbt package
sudo cp ~/fun/ditrapani.info/target/scala-2.12/ditrapani-info_2.12-0.1.0.war \
    /var/lib/tomcat8/webapps/ROOT.war
```
