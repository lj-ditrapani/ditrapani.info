- Include typesafe hub Config
- Set ScalatraBootstrap 

```
launch with ENV=production
val env = java props get env
context.setInitParameter(org.scalatra.EnvironmentKey, env)
```

Configure servlet container (tomcat or jetty) to use https?
