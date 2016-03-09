## A [Scala.js](http://www.scala-js.org/) facade for the [Babylonjs](http://www.babylonjs.com/) 3D Gaming Engine
This is a work in progress and of experimental quality at this time. However, a production release will be coming soon!

An example application is included and is derived from a JavaScript version found in the Babylonjs documentation.

### [Apache 2.0 License](http://www.apache.org/licenses/LICENSE-2.0)

### Getting started

To get started, open `sbt` in this example project, and execute the task
`fastOptJS`. This creates the file `target/scala-2.11/example-fastopt.js`.
You can now open `index-fastopt.html` in your favorite Web browser!

During development, it is useful to use `~fastOptJS` in sbt, so that each
time you save a source file, a compilation of the project is triggered.
Hence only a refresh of your Web page is needed to see the effects of your
changes.

To view the test page, open index-fastopt.html in your browser (e.g., drag the file into your browser).

### Running the tests - none at the moment

To run the test suite, execute the task `test`. If you have installed
[Node.js](http://nodejs.org/), you can use that runtime to run the tests,
which is faster:

    > set scalaJSStage in Global := FastOptStage
    > test

### Building a fully optimized version

For ultimate code size reduction, use `fullOptJS`. This will take several
seconds to execute, so typically you only use this for the final, production
version of your application. While `index-fastopt.html` refers to the
JavaScript emitted by `fastOptJS`, `index.html` refers to the optimized
JavaScript emitted by `fullOptJS`.
