package info.ditrapani

import org.scalatra._

class ditrapani extends DitrapaniinfoStack {

  get("/") {
    <html>
      <body>
        <h1>Lyall Jonathan Di Trapani</h1>
        <ul>
          <li><a href="https://www.github.com/lj-ditrapani">Github</a></li>
          <li><a href="test.html">Static file test</a></li>
        </ul>
      </body>
    </html>
  }

}
