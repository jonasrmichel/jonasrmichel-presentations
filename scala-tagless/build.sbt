tutSettings

watchSources <++= tutSourceDirectory map { path => (path ** "*.html").get }

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "io.argonaut" %% "argonaut" % "6.1",
  "com.lihaoyi" %% "fastparse" % "0.3.4",
  "org.scalaz" %% "scalaz-core" % "7.1.6"
)