import info.ditrapani._
import org.scalatra.{EnvironmentKey, LifeCycle}
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    val env = util.Properties.propOrElse("info.ditrapani.environment", "development")
    context.setInitParameter(EnvironmentKey, env)
    context.mount(new ditrapani, "/*")
  }
}
