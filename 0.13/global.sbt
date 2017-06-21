import com.scalapenos.sbt.prompt.SbtPrompt.autoImport._

// import org.ensime.EnsimeCoursierKeys._
//ensimeServerVersion in ThisBuild := "2.0.0-SNAPSHOT"

promptTheme                            := com.scalapenos.sbt.prompt.PromptThemes.ScalapenosTheme

libraryDependencies                    += "com.lihaoyi" % "ammonite" % "0.9.2" % Test cross CrossVersion.full
initialCommands     in (Test, console) := """ammonite.Main().run()"""
