enablePlugins(ScalaJSPlugin)

name := "app"

scalaVersion := "2.13.6"

libraryDependencies += "me.shadaj" %%% "slinky-native" % "0.6.7"
libraryDependencies += "me.shadaj" %%% "slinky-hot" % "0.6.7"

scalacOptions += "-Ymacro-annotations"

scalaJSLinkerConfig ~= (_.withModuleKind(ModuleKind.CommonJSModule))
