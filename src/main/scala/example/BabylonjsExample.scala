package example

import scala.scalajs.js
import js.annotation.JSExport
import org.scalajs.dom
import org.scalajs.dom.html
import org.scalajs.dom.raw._

import scalajs.facade.babylonjs._

object ScalaJSExample extends js.JSApp {
  def main(): Unit = {
    val canvas = dom.document.getElementById("renderCanvas").asInstanceOf[html.Canvas]
    val scene = createScene(canvas);
  } 
 
  def createScene(canvas: HTMLCanvasElement) {
    val engine: Engine = new Engine(canvas, true)
    val scene = new Scene(engine)
    scene.clearColor = new Color3(0,1,0)
    val camera = new FreeCamera("camera1", new Vector3(0,5,-10), scene)
    camera.setTarget(Vector3.Zero())
    camera.attachControl(canvas, false)
    val light = new HemisphericLight("light1", new Vector3(0, 1, 0), scene)
    light.intensity = .5
    val sphere = Mesh.CreateSphere("sphere1", 16, 2, scene)
    sphere.position.y = 1
    val ground = Mesh.CreateGround("ground1", 6.0, 6.0, 2, scene)
    engine.runRenderLoop{()=>
      scene.render()
      ground.rotation.y += 0.005
    }
  }
}