sys.props.get("plugin.version") match {
  case Some(x) => addSbtPlugin("edu.berkeley.cs" % "sbt-chisel-dep" % x)
  case _ => sys.error("""|The system property 'plugin.version' is not defined.
                         |Specify this property using the scriptedLaunchOpts -D.""".stripMargin)
}
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")
