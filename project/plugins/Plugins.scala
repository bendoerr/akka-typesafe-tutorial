import sbt._

class Plugins(info : ProjectInfo) extends PluginDefinition(info) {
    val sbtIdeaRepo = "sbt-idea-repo" at "http://mpeltonen.github.com/maven/"
    val sbtIdea = "com.github.mpeltonen" % "sbt-idea-plugin" % "0.4.0"

    val olegychRepo = "olegychRepo" at "https://bitbucket.org/olegych/mvn/raw/default"
    val sbtSourcesPlugin = "com.olegych" % "sbt-sources-plugin" % "0.2.0"
	
	val akkaRepo   = "Akka Repo" at "http://akka.io/repository"
	val akkaPlugin = "se.scalablesolutions.akka" % "akka-sbt-plugin" % "1.1"
}