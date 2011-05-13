import sbt._

class TutorialOneProject(info: ProjectInfo) extends DefaultProject(info) with AkkaProject with IdeaProject with ProjectWithSources