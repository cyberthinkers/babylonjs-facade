package scalajs.facade.babylonjs // package naming was done to avoid future collisions with other facades

import scala.scalajs.js
import js.annotation._
import js.|
import scala.scalajs.js.typedarray._
import org.scalajs.dom

//import org.scalajs.dom.{html, webgl}
import scala.scalajs.js.annotation.JSExport
import org.scalajs.dom.raw._

@js.native
@JSName("BABYLON._DepthCullingState")
class _DepthCullingState extends js.Object {
  var isDirty: Boolean = js.native
  var zOffset: Double = js.native
  var cullFace: Double = js.native
  var cull: Boolean = js.native
  var depthFunc: Double = js.native
  var depthMask: Boolean = js.native
  var depthTest: Boolean = js.native
  def reset(): Unit = js.native
  @JSName("apply")
  def apply(gl: WebGLRenderingContext): Unit = js.native
}

@js.native
@JSName("BABYLON._AlphaState")
class _AlphaState extends js.Object {
  var isDirty: Boolean = js.native
  var alphaBlend: Boolean = js.native
  def setAlphaBlendFunctionParameters(value0: Double, value1: Double, value2: Double, value3: Double): Unit = js.native
  def reset(): Unit = js.native
  @JSName("apply")
  def apply(gl: WebGLRenderingContext): Unit = js.native
}

@js.native
@JSName("BABYLON.EngineCapabilities")
class EngineCapabilities extends js.Object {
  var maxTexturesImageUnits: Double = js.native
  var maxTextureSize: Double = js.native
  var maxCubemapTextureSize: Double = js.native
  var maxRenderTextureSize: Double = js.native
  var standardDerivatives: Boolean = js.native
  var s3tc: js.Any = js.native
  var textureFloat: Boolean = js.native
  var textureAnisotropicFilterExtension: js.Any = js.native
  var maxAnisotropy: Double = js.native
  var instancedArrays: js.Any = js.native
  var uintIndices: Boolean = js.native
  var highPrecisionShaderSupported: Boolean = js.native
} 

@js.native
@JSName("BABYLON.Engine")
class Engine protected () extends js.Object {
  def this(canvas: HTMLCanvasElement, antialias: Boolean, options: js.Any) = this()
  def this(canvas: HTMLCanvasElement, antialias: Boolean) = this()
  var isFullscreen: Boolean = js.native
  var isPointerLock: Boolean = js.native
  var cullBackFaces: Boolean = js.native
  var renderEvenInBackground: Boolean = js.native
  var enableOfflineSupport: Boolean = js.native
  var scenes: js.Array[Scene] = js.native
  var _gl: WebGLRenderingContext = js.native
  var _activeTexturesCache: js.Array[BaseTexture] = js.native
  def getGlInfo(): js.Any = js.native
  def getAspectRatio(camera: Camera): Double = js.native
  def getRenderWidth(): Double = js.native
  def getRenderHeight(): Double = js.native
  def getRenderingCanvas(): HTMLCanvasElement = js.native
  def getRenderingCanvasClientRect(): ClientRect = js.native
  def setHardwareScalingLevel(level: Double): Unit = js.native
  def getHardwareScalingLevel(): Double = js.native
  def getLoadedTexturesCache(): js.Array[WebGLTexture] = js.native
  def getCaps(): EngineCapabilities = js.native
  var drawCalls: Double = js.native
  def resetDrawCalls(): Unit = js.native
  def setDepthFunctionToGreater(): Unit = js.native
  def setDepthFunctionToGreaterOrEqual(): Unit = js.native
  def setDepthFunctionToLess(): Unit = js.native
  def setDepthFunctionToLessOrEqual(): Unit = js.native
  def stopRenderLoop(renderFunction: js.Function0[Unit]): Unit = js.native
  def _renderLoop(): Unit = js.native
  def runRenderLoop(renderFunction: js.Function0[Unit]): Unit = js.native
  def switchFullscreen(requestPointerLock: Boolean): Unit = js.native
  def clear(color: js.Any, backBuffer: Boolean, depthStencil: Boolean): Unit = js.native
  def setViewport(viewport: Viewport, requiredWidth: Double, requiredHeight: Double): Unit = js.native
  def setDirectViewport(x: Double, y: Double, width: Double, height: Double): Unit = js.native
  def beginFrame(): Unit = js.native
  def endFrame(): Unit = js.native
  def resize(): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  def bindFramebuffer(texture: WebGLTexture): Unit = js.native
  def unBindFramebuffer(texture: WebGLTexture): Unit = js.native
  def flushFramebuffer(): Unit = js.native
  def restoreDefaultFramebuffer(): Unit = js.native
  def createVertexBuffer(vertices: js.Array[Double]): WebGLBuffer = js.native
  def createDynamicVertexBuffer(capacity: Double): WebGLBuffer = js.native
  def updateDynamicVertexBuffer(vertexBuffer: WebGLBuffer, vertices: js.Any, offset: Double): Unit = js.native
  def createIndexBuffer(indices: js.Array[Double]): WebGLBuffer = js.native
  def bindBuffers(vertexBuffer: WebGLBuffer, indexBuffer: WebGLBuffer, vertexDeclaration: js.Array[Double], vertexStrideSize: Double, effect: Effect): Unit = js.native
  def bindMultiBuffers(vertexBuffers: js.Array[VertexBuffer], indexBuffer: WebGLBuffer, effect: Effect): Unit = js.native
  def _releaseBuffer(buffer: WebGLBuffer): Boolean = js.native
  def createInstancesBuffer(capacity: Double): WebGLBuffer = js.native
  def deleteInstancesBuffer(buffer: WebGLBuffer): Unit = js.native
  def updateAndBindInstancesBuffer(instancesBuffer: WebGLBuffer, data: Float32Array, offsetLocations: js.Array[Double]): Unit = js.native
  def unBindInstancesBuffer(instancesBuffer: WebGLBuffer, offsetLocations: js.Array[Double]): Unit = js.native
  def applyStates(): Unit = js.native
  def draw(useTriangles: Boolean, indexStart: Double, indexCount: Double, instancesCount: Double): Unit = js.native
  def drawPointClouds(verticesStart: Double, verticesCount: Double, instancesCount: Double): Unit = js.native
  def _releaseEffect(effect: Effect): Unit = js.native
  def createEffect(baseName: js.Any, attributesNames: js.Array[String], uniformsNames: js.Array[String], samplers: js.Array[String], defines: String, fallbacks: EffectFallbacks, onCompiled: js.Function1[Effect, Unit], onError: js.Function2[Effect, String, Unit]): Effect = js.native
  def createEffectForParticles(fragmentName: String, uniformsNames: js.Array[String], samplers: js.Array[String], defines: String, fallbacks: EffectFallbacks, onCompiled: js.Function1[Effect, Unit], onError: js.Function2[Effect, String, Unit]): Effect = js.native
  def createShaderProgram(vertexCode: String, fragmentCode: String, defines: String): WebGLProgram = js.native
  def getUniforms(shaderProgram: WebGLProgram, uniformsNames: js.Array[String]): js.Array[WebGLUniformLocation] = js.native
  def getAttributes(shaderProgram: WebGLProgram, attributesNames: js.Array[String]): js.Array[Double] = js.native
  def enableEffect(effect: Effect): Unit = js.native
  def setArray(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
  def setArray2(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
  def setArray3(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
  def setArray4(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
  def setMatrices(uniform: WebGLUniformLocation, matrices: Float32Array): Unit = js.native
  def setMatrix(uniform: WebGLUniformLocation, matrix: Matrix): Unit = js.native
  def setMatrix3x3(uniform: WebGLUniformLocation, matrix: Float32Array): Unit = js.native
  def setMatrix2x2(uniform: WebGLUniformLocation, matrix: Float32Array): Unit = js.native
  def setFloat(uniform: WebGLUniformLocation, value: Double): Unit = js.native
  def setFloat2(uniform: WebGLUniformLocation, x: Double, y: Double): Unit = js.native
  def setFloat3(uniform: WebGLUniformLocation, x: Double, y: Double, z: Double): Unit = js.native
  def setBool(uniform: WebGLUniformLocation, bool: Double): Unit = js.native
  def setFloat4(uniform: WebGLUniformLocation, x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def setColor3(uniform: WebGLUniformLocation, color3: Color3): Unit = js.native
  def setColor4(uniform: WebGLUniformLocation, color3: Color3, alpha: Double): Unit = js.native
  def setState(culling: Boolean, zOffset: Double, force: Boolean): Unit = js.native
  def setDepthBuffer(enable: Boolean): Unit = js.native
  def getDepthWrite(): Boolean = js.native
  def setDepthWrite(enable: Boolean): Unit = js.native
  def setColorWrite(enable: Boolean): Unit = js.native
  def setAlphaMode(mode: Double): Unit = js.native
  def getAlphaMode(): Double = js.native
  def setAlphaTesting(enable: Boolean): Unit = js.native
  def getAlphaTesting(): Boolean = js.native
  def wipeCaches(): Unit = js.native
  def setSamplingMode(texture: WebGLTexture, samplingMode: Double): Unit = js.native
  def createTexture(url: String, noMipmap: Boolean, invertY: Boolean, scene: Scene, samplingMode: Double, onLoad: js.Function0[Unit], onError: js.Function0[Unit], buffer: js.Any): WebGLTexture = js.native
  def updateRawTexture(texture: WebGLTexture, data: ArrayBufferView, format: Double, invertY: Boolean, compression: String): Unit = js.native
  def createRawTexture(data: ArrayBufferView, width: Double, height: Double, format: Double, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Double, compression: String): WebGLTexture = js.native
  def createDynamicTexture(width: Double, height: Double, generateMipMaps: Boolean, samplingMode: Double, forceExponantOfTwo: Boolean): WebGLTexture = js.native
  def updateTextureSamplingMode(samplingMode: Double, texture: WebGLTexture): Unit = js.native
  def updateDynamicTexture(texture: WebGLTexture, canvas: HTMLCanvasElement, invertY: Boolean): Unit = js.native
  def updateVideoTexture(texture: WebGLTexture, video: HTMLVideoElement, invertY: Boolean): Unit = js.native
  def createRenderTargetTexture(size: js.Any, options: js.Any): WebGLTexture = js.native
  def createCubeTexture(rootUrl: String, scene: Scene, extensions: js.Array[String], noMipmap: Boolean): WebGLTexture = js.native
  def _releaseTexture(texture: WebGLTexture): Unit = js.native
  def bindSamplers(effect: Effect): Unit = js.native
  def _bindTexture(channel: Double, texture: WebGLTexture): Unit = js.native
  def setTextureFromPostProcess(channel: Double, postProcess: PostProcess): Unit = js.native
  def setTexture(channel: Double, texture: BaseTexture): Unit = js.native
  def _setAnisotropicLevel(key: Double, texture: BaseTexture): Unit = js.native
  def readPixels(x: Double, y: Double, width: Double, height: Double): Uint8Array = js.native
  def dispose(): Unit = js.native
  def displayLoadingUI(): Unit = js.native
  var loadingUIText: String = js.native
  var loadingUIBackgroundColor: String = js.native
  def hideLoadingUI(): Unit = js.native
  def getFps(): Double = js.native
  def getDeltaTime(): Double = js.native
}

@js.native
@JSName("BABYLON.Engine")
object Engine extends js.Object {
  var ALPHA_DISABLE: Double = js.native
  var ALPHA_ONEONE: Double = js.native
  var ALPHA_ADD: Double = js.native
  var ALPHA_COMBINE: Double = js.native
  var ALPHA_SUBTRACT: Double = js.native
  var ALPHA_MULTIPLY: Double = js.native
  var ALPHA_MAXIMIZED: Double = js.native
  var DELAYLOADSTATE_NONE: Double = js.native
  var DELAYLOADSTATE_LOADED: Double = js.native
  var DELAYLOADSTATE_LOADING: Double = js.native
  var DELAYLOADSTATE_NOTLOADED: Double = js.native
  var TEXTUREFORMAT_ALPHA: Double = js.native
  var TEXTUREFORMAT_LUMINANCE: Double = js.native
  var TEXTUREFORMAT_LUMINANCE_ALPHA: Double = js.native
  var TEXTUREFORMAT_RGB: Double = js.native
  var TEXTUREFORMAT_RGBA: Double = js.native
  var TEXTURETYPE_UNSIGNED_INT: Double = js.native
  var TEXTURETYPE_FLOAT: Double = js.native
  var Version: String = js.native
  var Epsilon: Double = js.native
  var CollisionsEpsilon: Double = js.native
  var CodeRepository: String = js.native
  var ShadersRepository: String = js.native
  var audioEngine: AudioEngine = js.native
  def isSupported(): Boolean = js.native
}

@js.native
@JSName("BABYLON.Node")
class Node protected () extends js.Object {
  def this(name: String, scene: Scene) = this()
  var parent: Node = js.native
  var name: String = js.native
  var id: String = js.native
  var uniqueId: Double = js.native
  var state: String = js.native
  var animations: js.Array[Animation] = js.native
  var onReady: js.Function1[Node, Unit] = js.native
  var _currentRenderId: Double = js.native
  var _waitingParentId: String = js.native
  var _cache: js.Any = js.native
  def getScene(): Scene = js.native
  def getEngine(): Engine = js.native
  def getWorldMatrix(): Matrix = js.native
  def _initCache(): Unit = js.native
  def updateCache(force: Boolean): Unit = js.native
  def _updateCache(ignoreParentClass: Boolean): Unit = js.native
  def _isSynchronized(): Boolean = js.native
  def _markSyncedWithParent(): Unit = js.native
  def isSynchronizedWithParent(): Boolean = js.native
  def isSynchronized(updateCache: Boolean): Boolean = js.native
  def hasNewParent(update: Boolean): Boolean = js.native
  def isReady(): Boolean = js.native
  def isEnabled(): Boolean = js.native
  def setEnabled(value: Boolean): Unit = js.native
  def isDescendantOf(ancestor: Node): Boolean = js.native
  def _getDescendants(list: js.Array[Node], results: js.Array[Node]): Unit = js.native
  def getDescendants(): js.Array[Node] = js.native
  def _setReady(state: Boolean): Unit = js.native
}

@js.native
trait IDisposable extends js.Object {
  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.Scene")
class Scene protected () extends js.Object {
  def this(engine: Engine) = this()
  var autoClear: Boolean = js.native
  var clearColor: js.Any = js.native
  var ambientColor: Color3 = js.native
  var beforeRender: js.Function0[Unit] = js.native
  var afterRender: js.Function0[Unit] = js.native
  var onDispose: js.Function0[Unit] = js.native
  var beforeCameraRender: js.Function1[Camera, Unit] = js.native
  var afterCameraRender: js.Function1[Camera, Unit] = js.native
  var forceWireframe: Boolean = js.native
  var forcePointsCloud: Boolean = js.native
  var forceShowBoundingBoxes: Boolean = js.native
  var clipPlane: Plane = js.native
  var animationsEnabled: Boolean = js.native
  /*FIXME
  var onPointerDown: js.Function2[PointerEvent, PickingInfo, Unit] = js.native
  var onPointerUp: js.Function2[PointerEvent, PickingInfo, Unit] = js.native
  * 
  */
  var cameraToUseForPointers: Camera = js.native
  var fogEnabled: Boolean = js.native
  var fogMode: Double = js.native
  var fogColor: Color3 = js.native
  var fogDensity: Double = js.native
  var fogStart: Double = js.native
  var fogEnd: Double = js.native
  var shadowsEnabled: Boolean = js.native
  var lightsEnabled: Boolean = js.native
  var lights: js.Array[Light] = js.native
  var onNewLightAdded: js.Function3[Light, Double, Scene, Unit] = js.native
  var onLightRemoved: js.Function1[Light, Unit] = js.native
  var cameras: js.Array[Camera] = js.native
  var onNewCameraAdded: js.Function3[Camera, Double, Scene, Unit] = js.native
  var onCameraRemoved: js.Function1[Camera, Unit] = js.native
  var activeCameras: js.Array[Camera] = js.native
  var activeCamera: Camera = js.native
  var meshes: js.Array[AbstractMesh] = js.native
  var onNewMeshAdded: js.Function3[AbstractMesh, Double, Scene, Unit] = js.native
  var onMeshRemoved: js.Function1[AbstractMesh, Unit] = js.native
  var onGeometryAdded: js.Function1[Geometry, Unit] = js.native
  var onGeometryRemoved: js.Function1[Geometry, Unit] = js.native
  var materials: js.Array[Material] = js.native
  var multiMaterials: js.Array[MultiMaterial] = js.native
  var defaultMaterial: StandardMaterial = js.native
  var texturesEnabled: Boolean = js.native
  var textures: js.Array[BaseTexture] = js.native
  var particlesEnabled: Boolean = js.native
  var particleSystems: js.Array[ParticleSystem] = js.native
  var spritesEnabled: Boolean = js.native
  var spriteManagers: js.Array[SpriteManager] = js.native
  var layers: js.Array[Layer] = js.native
  var skeletonsEnabled: Boolean = js.native
  var skeletons: js.Array[Skeleton] = js.native
  var lensFlaresEnabled: Boolean = js.native
  var lensFlareSystems: js.Array[LensFlareSystem] = js.native
  var collisionsEnabled: Boolean = js.native
  var collisionCoordinator: ICollisionCoordinator = js.native
  var gravity: Vector3 = js.native
  var postProcessesEnabled: Boolean = js.native
  var postProcessManager: PostProcessManager = js.native
  var postProcessRenderPipelineManager: PostProcessRenderPipelineManager = js.native
  var renderTargetsEnabled: Boolean = js.native
  var dumpNextRenderTargets: Boolean = js.native
  var customRenderTargets: js.Array[RenderTargetTexture] = js.native
  var useDelayedTextureLoading: Boolean = js.native
  var importedMeshesFiles: js.Array[String] = js.native
  var database: js.Any = js.native
  var actionManager: ActionManager = js.native
  var _actionManagers: js.Array[ActionManager] = js.native
  var proceduralTexturesEnabled: Boolean = js.native
  var _proceduralTextures: js.Array[ProceduralTexture] = js.native
  var mainSoundTrack: SoundTrack = js.native
  var soundTracks: js.Array[SoundTrack] = js.native
  var simplificationQueue: SimplificationQueue = js.native
  var _activeIndices: Double = js.native
  var _activeParticles: Double = js.native
  var _particlesDuration: Double = js.native
  var _spritesDuration: Double = js.native
  var _cachedMaterial: Material = js.native
  var _toBeDisposed: SmartArray[IDisposable] = js.native
  var _activeParticleSystems: SmartArray[ParticleSystem] = js.native
  var _activeBones: Double = js.native
  var _activeAnimatables: Animatable = js.native
  var debugLayer: DebugLayer = js.native
  var workerCollisions: Boolean = js.native
  var SelectionOctree: Octree[AbstractMesh] = js.native
  var meshUnderPointer: AbstractMesh = js.native
  var pointerX: Double = js.native
  var pointerY: Double = js.native
  def getCachedMaterial(): Material = js.native
  def getBoundingBoxRenderer(): BoundingBoxRenderer = js.native
  def getOutlineRenderer(): OutlineRenderer = js.native
  def getEngine(): Engine = js.native
  def getTotalVertices(): Double = js.native
  def getActiveIndices(): Double = js.native
  def getActiveParticles(): Double = js.native
  def getActiveBones(): Double = js.native
  def getLastFrameDuration(): Double = js.native
  def getEvaluateActiveMeshesDuration(): Double = js.native
  def getActiveMeshes(): SmartArray[Mesh] = js.native
  def getRenderTargetsDuration(): Double = js.native
  def getRenderDuration(): Double = js.native
  def getParticlesDuration(): Double = js.native
  def getSpritesDuration(): Double = js.native
  def getAnimationRatio(): Double = js.native
  def getRenderId(): Double = js.native
  def incrementRenderId(): Unit = js.native
  def attachControl(): Unit = js.native
  def detachControl(): Unit = js.native
  def isReady(): Boolean = js.native
  def resetCachedMaterial(): Unit = js.native
  def registerBeforeRender(func: js.Function0[Unit]): Unit = js.native
  def unregisterBeforeRender(func: js.Function0[Unit]): Unit = js.native
  def registerAfterRender(func: js.Function0[Unit]): Unit = js.native
  def unregisterAfterRender(func: js.Function0[Unit]): Unit = js.native
  def _addPendingData(data: js.Any): Unit = js.native
  def _removePendingData(data: js.Any): Unit = js.native
  def getWaitingItemsCount(): Double = js.native
  def executeWhenReady(func: js.Function0[Unit]): Unit = js.native
  def _checkIsReady(): Unit = js.native
  def beginAnimation(target: js.Any, from: Double, to: Double, loop: Boolean, speedRatio: Double, onAnimationEnd: js.Function0[Unit], animatable: Animatable): Animatable = js.native
  def beginDirectAnimation(target: js.Any, animations: js.Array[Animation], from: Double, to: Double, loop: Boolean, speedRatio: Double, onAnimationEnd: js.Function0[Unit]): Animatable = js.native
  def getAnimatableByTarget(target: js.Any): Animatable = js.native
  def stopAnimation(target: js.Any): Unit = js.native
  def getViewMatrix(): Matrix = js.native
  def getProjectionMatrix(): Matrix = js.native
  def getTransformMatrix(): Matrix = js.native
  def setTransformMatrix(view: Matrix, projection: Matrix): Unit = js.native
  def addMesh(newMesh: AbstractMesh): Unit = js.native
  def removeMesh(toRemove: AbstractMesh): Double = js.native
  def removeLight(toRemove: Light): Double = js.native
  def removeCamera(toRemove: Camera): Double = js.native
  def addLight(newLight: Light): Unit = js.native
  def addCamera(newCamera: Camera): Unit = js.native
  def setActiveCameraByID(id: String): Camera = js.native
  def setActiveCameraByName(name: String): Camera = js.native
  def getMaterialByID(id: String): Material = js.native
  def getMaterialByName(name: String): Material = js.native
  def getLensFlareSystemByName(name: String): LensFlareSystem = js.native
  def getCameraByID(id: String): Camera = js.native
  def getCameraByUniqueID(uniqueId: Double): Camera = js.native
  def getCameraByName(name: String): Camera = js.native
  def getLightByName(name: String): Light = js.native
  def getLightByID(id: String): Light = js.native
  def getLightByUniqueID(uniqueId: Double): Light = js.native
  def getGeometryByID(id: String): Geometry = js.native
  def pushGeometry(geometry: Geometry, force: Boolean): Boolean = js.native
  def removeGeometry(geometry: Geometry): Boolean = js.native
  def getGeometries(): js.Array[Geometry] = js.native
  def getMeshByID(id: String): AbstractMesh = js.native
  def getMeshByUniqueID(uniqueId: Double): AbstractMesh = js.native
  def getLastMeshByID(id: String): AbstractMesh = js.native
  def getLastEntryByID(id: String): Node = js.native
  def getNodeByID(id: String): Node = js.native
  def getNodeByName(name: String): Node = js.native
  def getMeshByName(name: String): AbstractMesh = js.native
  def getSoundByName(name: String): Sound = js.native
  def getLastSkeletonByID(id: String): Skeleton = js.native
  def getSkeletonById(id: String): Skeleton = js.native
  def getSkeletonByName(name: String): Skeleton = js.native
  def isActiveMesh(mesh: Mesh): Boolean = js.native
  def updateTransformMatrix(force: Boolean): Unit = js.native
  def render(): Unit = js.native
  var audioEnabled: Boolean = js.native
  var headphone: Boolean = js.native
  def enableDepthRenderer(): DepthRenderer = js.native
  def disableDepthRenderer(): Unit = js.native
  def dispose(): Unit = js.native
  def disposeSounds(): Unit = js.native
  def getWorldExtends(): js.Any = js.native
  def createOrUpdateSelectionOctree(maxCapacity: Double, maxDepth: Double): Octree[AbstractMesh] = js.native
  def createPickingRay(x: Double, y: Double, world: Matrix, camera: Camera): Ray = js.native
  def pick(x: Double, y: Double, predicate: js.Function1[AbstractMesh, Boolean], fastCheck: Boolean, camera: Camera): PickingInfo = js.native
  def pickWithRay(ray: Ray, predicate: js.Function1[Mesh, Boolean], fastCheck: Boolean): PickingInfo = js.native
  def setPointerOverMesh(mesh: AbstractMesh): Unit = js.native
  def getPointerOverMesh(): AbstractMesh = js.native
  def getPhysicsEngine(): PhysicsEngine = js.native
  def enablePhysics(gravity: Vector3, plugin: IPhysicsEnginePlugin): Boolean = js.native
  def disablePhysicsEngine(): Unit = js.native
  def isPhysicsEnabled(): Boolean = js.native
  def setGravity(gravity: Vector3): Unit = js.native
  def createCompoundImpostor(parts: js.Any, options: PhysicsBodyCreationOptions): js.Dynamic = js.native
  def deleteCompoundImpostor(compound: js.Any): Unit = js.native
  def createDefaultCameraOrLight(): Unit = js.native
  def getMeshesByTags(tagsQuery: String, forEach: js.Function1[AbstractMesh, Unit]): js.Array[Mesh] = js.native
  def getCamerasByTags(tagsQuery: String, forEach: js.Function1[Camera, Unit]): js.Array[Camera] = js.native
  def getLightsByTags(tagsQuery: String, forEach: js.Function1[Light, Unit]): js.Array[Light] = js.native
  def getMaterialByTags(tagsQuery: String, forEach: js.Function1[Material, Unit]): js.Array[Material] = js.native
}

@js.native
@JSName("BABYLON.Scene")
object Scene extends js.Object {
  var MinDeltaTime: Double = js.native
  var MaxDeltaTime: Double = js.native
  var FOGMODE_NONE: Double = js.native
  var FOGMODE_EXP: Double = js.native
  var FOGMODE_EXP2: Double = js.native
  var FOGMODE_LINEAR: Double = js.native
}

@js.native
@JSName("BABYLON.Action")
class Action protected () extends js.Object {
  def this(triggerOptions: js.Any, condition: Condition) = this()
  var triggerOptions: js.Any = js.native
  var trigger: Double = js.native
  var _actionManager: ActionManager = js.native
  def _prepare(): Unit = js.native
  def getTriggerParameter(): js.Dynamic = js.native
  def _executeCurrent(evt: ActionEvent): Unit = js.native
  def execute(evt: ActionEvent): Unit = js.native
  def then(action: Action): Action = js.native
  def _getProperty(propertyPath: String): String = js.native
  def _getEffectiveTarget(target: js.Any, propertyPath: String): js.Dynamic = js.native
}

@js.native
@JSName("BABYLON.ActionEvent")
class ActionEvent protected () extends js.Object {
  def this(source: AbstractMesh, pointerX: Double, pointerY: Double, meshUnderPointer: AbstractMesh, sourceEvent: js.Any, additionalData: js.Any) = this()
  var source: AbstractMesh = js.native
  var pointerX: Double = js.native
  var pointerY: Double = js.native
  var meshUnderPointer: AbstractMesh = js.native
  var sourceEvent: js.Any = js.native
  var additionalData: js.Any = js.native
}

@js.native
@JSName("BABYLON.ActionEvent")
object ActionEvent extends js.Object {
  def CreateNew(source: AbstractMesh, evt: Event, additionalData: js.Any): ActionEvent = js.native
  def CreateNewFromScene(scene: Scene, evt: Event): ActionEvent = js.native
}

@js.native
@JSName("BABYLON.ActionManager")
class ActionManager protected () extends js.Object {
  def this(scene: Scene) = this()
  var actions: js.Array[Action] = js.native
  def dispose(): Unit = js.native
  def getScene(): Scene = js.native
  def hasSpecificTriggers(triggers: js.Array[Double]): Boolean = js.native
  def hasSpecificTrigger(trigger: Double): Boolean = js.native
  var hasPointerTriggers: Boolean = js.native
  var hasPickTriggers: Boolean = js.native
  def registerAction(action: Action): Action = js.native
  def processTrigger(trigger: Double, evt: ActionEvent): Unit = js.native
  def _getEffectiveTarget(target: js.Any, propertyPath: String): js.Dynamic = js.native
  def _getProperty(propertyPath: String): String = js.native
}

@js.native
@JSName("BABYLON.ActionManager")
object ActionManager extends js.Object {
  var NothingTrigger: Double = js.native
  var OnPickTrigger: Double = js.native
  var OnLeftPickTrigger: Double = js.native
  var OnRightPickTrigger: Double = js.native
  var OnCenterPickTrigger: Double = js.native
  var OnPointerOverTrigger: Double = js.native
  var OnPointerOutTrigger: Double = js.native
  var OnEveryFrameTrigger: Double = js.native
  var OnIntersectionEnterTrigger: Double = js.native
  var OnIntersectionExitTrigger: Double = js.native
  var OnKeyDownTrigger: Double = js.native
  var OnKeyUpTrigger: Double = js.native
  var OnPickUpTrigger: Double = js.native
}

@js.native
@JSName("BABYLON.Condition")
class Condition protected () extends js.Object {
  def this(actionManager: ActionManager) = this()
  var _actionManager: ActionManager = js.native
  var _evaluationId: Double = js.native
  var _currentResult: Boolean = js.native
  def isValid(): Boolean = js.native
  def _getProperty(propertyPath: String): String = js.native
  def _getEffectiveTarget(target: js.Any, propertyPath: String): js.Dynamic = js.native
}

@js.native
@JSName("BABYLON.ValueCondition")
class ValueCondition protected () extends Condition {
  def this(actionManager: ActionManager, target: js.Any, propertyPath: String, value: js.Any, operator: Double) = this()
  var propertyPath: String = js.native
  var value: js.Any = js.native
  var operator: Double = js.native
//  var _actionManager: ActionManager = js.native
  override def isValid(): Boolean = js.native
}

@js.native
@JSName("BABYLON.ValueCondition")
object ValueCondition extends js.Object {
  var IsEqual: Double = js.native
  var IsDifferent: Double = js.native
  var IsGreater: Double = js.native
  var IsLesser: Double = js.native
}

@js.native
@JSName("BABYLON.PredicateCondition")
class PredicateCondition protected () extends Condition {
  def this(actionManager: ActionManager, predicate: js.Function0[Boolean]) = this()
  var predicate: js.Function0[Boolean] = js.native
//  var _actionManager: ActionManager = js.native
  override def isValid(): Boolean = js.native
}

@js.native
@JSName("BABYLON.StateCondition")
class StateCondition protected () extends Condition {
  def this(actionManager: ActionManager, target: js.Any, value: String) = this()
  var value: String = js.native
//  var _actionManager: ActionManager = js.native
  override def isValid(): Boolean = js.native
}

@js.native
@JSName("BABYLON.SwitchBooleanAction")
class SwitchBooleanAction protected () extends Action {
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, condition: Condition) = this()
  var propertyPath: String = js.native
  override def _prepare(): Unit = js.native
  def execute(): Unit = js.native
}

@js.native
@JSName("BABYLON.SetStateAction")
class SetStateAction protected () extends Action {
  def this(triggerOptions: js.Any, target: js.Any, value: String, condition: Condition) = this()
  var value: String = js.native
  def execute(): Unit = js.native
}

@js.native
@JSName("BABYLON.SetValueAction")
class SetValueAction protected () extends Action {
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any, condition: Condition) = this()
  var propertyPath: String = js.native
  var value: js.Any = js.native
//  def _prepare(): Unit = js.native
  def execute(): Unit = js.native
}

@js.native
@JSName("BABYLON.IncrementValueAction")
class IncrementValueAction protected () extends Action {
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any, condition: Condition) = this()
  var propertyPath: String = js.native
  var value: js.Any = js.native
//  def _prepare(): Unit = js.native
  def execute(): Unit = js.native
}

@js.native
@JSName("BABYLON.PlayAnimationAction")
class PlayAnimationAction protected () extends Action {
  def this(triggerOptions: js.Any, target: js.Any, from: Double, to: Double, loop: Boolean, condition: Condition) = this()
  var from: Double = js.native
  var to: Double = js.native
  var loop: Boolean = js.native
//  def _prepare(): Unit = js.native
  def execute(): Unit = js.native
}

@js.native
@JSName("BABYLON.StopAnimationAction")
class StopAnimationAction protected () extends Action {
  def this(triggerOptions: js.Any, target: js.Any, condition: Condition) = this()
//  def _prepare(): Unit = js.native
  def execute(): Unit = js.native
}

@js.native
@JSName("BABYLON.DoNothingAction")
class DoNothingAction protected () extends Action {
  def this(triggerOptions: js.Any, condition: Condition) = this()
  def execute(): Unit = js.native
}

@js.native
@JSName("BABYLON.CombineAction")
class CombineAction protected () extends Action {
  def this(triggerOptions: js.Any, children: js.Array[Action], condition: Condition) = this()
  var children: js.Array[Action] = js.native
//  def _prepare(): Unit = js.native
//  def execute(evt: ActionEvent): Unit = js.native
}

@js.native
@JSName("BABYLON.ExecuteCodeAction")
class ExecuteCodeAction protected () extends Action {
  def this(triggerOptions: js.Any, func: js.Function1[ActionEvent, Unit], condition: Condition) = this()
  var func: js.Function1[ActionEvent, Unit] = js.native
//  def execute(evt: ActionEvent): Unit = js.native
}

@js.native
@JSName("BABYLON.SetParentAction")
class SetParentAction protected () extends Action {
  def this(triggerOptions: js.Any, target: js.Any, parent: js.Any, condition: Condition) = this()
//  def _prepare(): Unit = js.native
  def execute(): Unit = js.native
}

@js.native
@JSName("BABYLON.PlaySoundAction")
class PlaySoundAction protected () extends Action {
  def this(triggerOptions: js.Any, sound: Sound, condition: Condition) = this()
//  def _prepare(): Unit = js.native
  def execute(): Unit = js.native
}

@js.native
@JSName("BABYLON.StopSoundAction")
class StopSoundAction protected () extends Action {
  def this(triggerOptions: js.Any, sound: Sound, condition: Condition) = this()
//  def _prepare(): Unit = js.native
  def execute(): Unit = js.native
}

@js.native
@JSName("BABYLON.InterpolateValueAction")
class InterpolateValueAction protected () extends Action {
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any, duration: Double, condition: Condition, stopOtherAnimations: Boolean) = this()
  var propertyPath: String = js.native
  var value: js.Any = js.native
  var duration: Double = js.native
  var stopOtherAnimations: Boolean = js.native
//  def _prepare(): Unit = js.native
  def execute(): Unit = js.native
}

@js.native
@JSName("BABYLON.Animatable")
class Animatable protected () extends js.Object {
  def this(scene: Scene, target: js.Any, fromFrame: Double, toFrame: Double, loopAnimation: Boolean, speedRatio: Double, onAnimationEnd: js.Any, animations: js.Any) = this()
  var target: js.Any = js.native
  var fromFrame: Double = js.native
  var toFrame: Double = js.native
  var loopAnimation: Boolean = js.native
  var speedRatio: Double = js.native
  var onAnimationEnd: js.Any = js.native
  var animationStarted: Boolean = js.native
  def appendAnimations(target: js.Any, animations: js.Array[Animation]): Unit = js.native
  def getAnimationByTargetProperty(property: String): Animation = js.native
  def reset(): Unit = js.native
  def pause(): Unit = js.native
  def restart(): Unit = js.native
  def stop(): Unit = js.native
  def _animate(delay: Double): Boolean = js.native
}

@js.native
@JSName("BABYLON.Animation")
class Animation protected () extends js.Object {
  def this(name: String, targetProperty: String, framePerSecond: Double, dataType: Double, loopMode: Double) = this()
  var name: String = js.native
  var targetProperty: String = js.native
  var framePerSecond: Double = js.native
  var dataType: Double = js.native
  var loopMode: Double = js.native
  var _target: js.Any = js.native
  var targetPropertyPath: js.Array[String] = js.native
  var currentFrame: Double = js.native
  var allowMatricesInterpolation: Boolean = js.native
  def reset(): Unit = js.native
  def isStopped(): Boolean = js.native
  def getKeys(): js.Array[js.Any] = js.native
  def getEasingFunction(): IEasingFunction = js.native
  def setEasingFunction(easingFunction: EasingFunction): Unit = js.native
  def floatInterpolateFunction(startValue: Double, endValue: Double, gradient: Double): Double = js.native
  def quaternionInterpolateFunction(startValue: Quaternion, endValue: Quaternion, gradient: Double): Quaternion = js.native
  def vector3InterpolateFunction(startValue: Vector3, endValue: Vector3, gradient: Double): Vector3 = js.native
  def vector2InterpolateFunction(startValue: Vector2, endValue: Vector2, gradient: Double): Vector2 = js.native
  def color3InterpolateFunction(startValue: Color3, endValue: Color3, gradient: Double): Color3 = js.native
  def matrixInterpolateFunction(startValue: Matrix, endValue: Matrix, gradient: Double): Matrix = js.native
  override def clone(): Animation = js.native
  def setKeys(values: js.Array[js.Any]): Unit = js.native
  def animate(delay: Double, from: Double, to: Double, loop: Boolean, speedRatio: Double): Boolean = js.native
}

@js.native
@JSName("BABYLON.Animation")
object Animation extends js.Object {
  def CreateAndStartAnimation(name: String, mesh: AbstractMesh, targetProperty: String, framePerSecond: Double, totalFrame: Double, from: js.Any, to: js.Any, loopMode: Double, easingFunction: EasingFunction): Animatable = js.native
  var ANIMATIONTYPE_FLOAT: Double = js.native
  var ANIMATIONTYPE_VECTOR3: Double = js.native
  var ANIMATIONTYPE_VECTOR2: Double = js.native
  var ANIMATIONTYPE_QUATERNION: Double = js.native
  var ANIMATIONTYPE_MATRIX: Double = js.native
  var ANIMATIONTYPE_COLOR3: Double = js.native
  var ANIMATIONLOOPMODE_RELATIVE: Double = js.native
  var ANIMATIONLOOPMODE_CYCLE: Double = js.native
  var ANIMATIONLOOPMODE_CONSTANT: Double = js.native
}

@js.native
trait IEasingFunction extends js.Object {
  def ease(gradient: Double): Double = js.native
}

@js.native
@JSName("BABYLON.EasingFunction")
class EasingFunction extends IEasingFunction {
  def setEasingMode(easingMode: Double): Unit = js.native
  def getEasingMode(): Double = js.native
  def easeInCore(gradient: Double): Double = js.native
//  def ease(gradient: Double): Double = js.native
}

@js.native
@JSName("BABYLON.EasingFunction")
object EasingFunction extends js.Object {
  var EASINGMODE_EASEIN: Double = js.native
  var EASINGMODE_EASEOUT: Double = js.native
  var EASINGMODE_EASEINOUT: Double = js.native
}

@js.native
@JSName("BABYLON.CircleEase")
class CircleEase extends EasingFunction with IEasingFunction {
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSName("BABYLON.BackEase")
class BackEase protected () extends EasingFunction with IEasingFunction {
  def this(amplitude: Double) = this()
  var amplitude: Double = js.native
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSName("BABYLON.BounceEase")
class BounceEase protected () extends EasingFunction with IEasingFunction {
  def this(bounces: Double, bounciness: Double) = this()
  var bounces: Double = js.native
  var bounciness: Double = js.native
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSName("BABYLON.CubicEase")
class CubicEase extends EasingFunction with IEasingFunction {
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSName("BABYLON.ElasticEase")
class ElasticEase protected () extends EasingFunction with IEasingFunction {
  def this(oscillations: Double, springiness: Double) = this()
  var oscillations: Double = js.native
  var springiness: Double = js.native
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSName("BABYLON.ExponentialEase")
class ExponentialEase protected () extends EasingFunction with IEasingFunction {
  def this(exponent: Double) = this()
  var exponent: Double = js.native
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSName("BABYLON.PowerEase")
class PowerEase protected () extends EasingFunction with IEasingFunction {
  def this(power: Double) = this()
  var power: Double = js.native
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSName("BABYLON.QuadraticEase")
class QuadraticEase extends EasingFunction with IEasingFunction {
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSName("BABYLON.QuarticEase")
class QuarticEase extends EasingFunction with IEasingFunction {
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSName("BABYLON.QuinticEase")
class QuinticEase extends EasingFunction with IEasingFunction {
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSName("BABYLON.SineEase")
class SineEase extends EasingFunction with IEasingFunction {
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSName("BABYLON.BezierCurveEase")
class BezierCurveEase protected () extends EasingFunction with IEasingFunction {
  def this(x1: Double, y1: Double, x2: Double, y2: Double) = this()
  var x1: Double = js.native
  var y1: Double = js.native
  var x2: Double = js.native
  var y2: Double = js.native
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSName("BABYLON.Analyser")
class Analyser protected () extends js.Object {
  def this(scene: Scene) = this()
  var SMOOTHING: Double = js.native
  var FFT_SIZE: Double = js.native
  var BARGRAPHAMPLITUDE: Double = js.native
  var DEBUGCANVASPOS: js.Any = js.native
  var DEBUGCANVASSIZE: js.Any = js.native
  def getFrequencyBinCount(): Double = js.native
  def getByteFrequencyData(): Uint8Array = js.native
  def getByteTimeDomainData(): Uint8Array = js.native
  def getFloatFrequencyData(): Uint8Array = js.native
  def drawDebugCanvas(): Unit = js.native
  def stopDebugCanvas(): Unit = js.native
  def connectAudioNodes(inputAudioNode: AudioNode, outputAudioNode: AudioNode): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.AudioEngine")
class AudioEngine extends js.Object {
  var canUseWebAudio: Boolean = js.native
  var masterGain: GainNode = js.native
  var WarnedWebAudioUnsupported: Boolean = js.native
  var audioContext: AudioContext = js.native
  def dispose(): Unit = js.native
  def getGlobalVolume(): Double = js.native
  def setGlobalVolume(newVolume: Double): Unit = js.native
  def connectToAnalyser(analyser: Analyser): Unit = js.native
}

@js.native
@JSName("BABYLON.Sound")
class Sound protected () extends js.Object {
  def this(name: String, urlOrArrayBuffer: js.Any, scene: Scene, readyToPlayCallback: js.Function0[Unit], options: js.Any) = this()
  var name: String = js.native
  var autoplay: Boolean = js.native
  var loop: Boolean = js.native
  var useCustomAttenuation: Boolean = js.native
  var soundTrackId: Double = js.native
  var spatialSound: Boolean = js.native
  var refDistance: Double = js.native
  var rolloffFactor: Double = js.native
  var maxDistance: Double = js.native
  var distanceModel: String = js.native
  var onended: js.Function0[Any] = js.native
  var isPlaying: Boolean = js.native
  var isPaused: Boolean = js.native
  def dispose(): Unit = js.native
  def setAudioBuffer(audioBuffer: AudioBuffer): Unit = js.native
  def updateOptions(options: js.Any): Unit = js.native
  def switchPanningModelToHRTF(): Unit = js.native
  def switchPanningModelToEqualPower(): Unit = js.native
  def connectToSoundTrackAudioNode(soundTrackAudioNode: AudioNode): Unit = js.native
  def setDirectionalCone(coneInnerAngle: Double, coneOuterAngle: Double, coneOuterGain: Double): Unit = js.native
  def setPosition(newPosition: Vector3): Unit = js.native
  def setLocalDirectionToMesh(newLocalDirection: Vector3): Unit = js.native
  def updateDistanceFromListener(): Unit = js.native
  def setAttenuationFunction(callback: js.Function5[Double, Double, Double, Double, Double, Double]): Unit = js.native
  def play(time: Double): Unit = js.native
  def stop(time: Double): Unit = js.native
  def pause(): Unit = js.native
  def setVolume(newVolume: Double, time: Double): Unit = js.native
  def setPlaybackRate(newPlaybackRate: Double): Unit = js.native
  def getVolume(): Double = js.native
  def attachToMesh(meshToConnectTo: AbstractMesh): Unit = js.native
}

@js.native
@JSName("BABYLON.SoundTrack")
class SoundTrack protected () extends js.Object {
  def this(scene: Scene, options: js.Any) = this()
  var id: Double = js.native
  var soundCollection: js.Array[Sound] = js.native
  def dispose(): Unit = js.native
  def AddSound(sound: Sound): Unit = js.native
  def RemoveSound(sound: Sound): Unit = js.native
  def setVolume(newVolume: Double): Unit = js.native
  def switchPanningModelToHRTF(): Unit = js.native
  def switchPanningModelToEqualPower(): Unit = js.native
  def connectToAnalyser(analyser: Analyser): Unit = js.native
}

@js.native
@JSName("BABYLON.Bone")
class Bone protected () extends Node {
  def this(name: String, skeleton: Skeleton, parentBone: Bone, matrix: Matrix) = this()
  var children: js.Array[Bone] = js.native
  /*FIXME
  override var animations: js.Array[Animation] = js.native
  * 
  */
  def getParent(): Bone = js.native
  def getLocalMatrix(): Matrix = js.native
  def getBaseMatrix(): Matrix = js.native
  override def getWorldMatrix(): Matrix = js.native
  def getInvertedAbsoluteTransform(): Matrix = js.native
  def getAbsoluteMatrix(): Matrix = js.native
  def updateMatrix(matrix: Matrix): Unit = js.native
  def markAsDirty(): Unit = js.native
}

@js.native
@JSName("BABYLON.Skeleton")
class Skeleton protected () extends js.Object {
  def this(name: String, id: String, scene: Scene) = this()
  var name: String = js.native
  var id: String = js.native
  var bones: js.Array[Bone] = js.native
  def getTransformMatrices(): Float32Array = js.native
  def getScene(): Scene = js.native
  def _markAsDirty(): Unit = js.native
  def prepare(): Unit = js.native
  def getAnimatables(): js.Array[IAnimatable] = js.native
  def clone(name: String, id: String): Skeleton = js.native
}

@js.native
@JSName("BABYLON.ArcRotateCamera")
class ArcRotateCamera protected () extends TargetCamera {
  def this(name: String, alpha: Double, beta: Double, radius: Double, target: js.Any, scene: Scene) = this()
  var alpha: Double = js.native
  var beta: Double = js.native
  var radius: Double = js.native
  var target: js.Any = js.native
  var inertialAlphaOffset: Double = js.native
  var inertialBetaOffset: Double = js.native
  var inertialRadiusOffset: Double = js.native
  var lowerAlphaLimit: js.Any = js.native
  var upperAlphaLimit: js.Any = js.native

  // We must be able to set null to remove the limitation. http://www.html5gamedevs.com/topic/3279-unlimited-y-rotation-on-camera/#comment-21360
  var lowerBetaLimit: js.Any = js.native
  var upperBetaLimit: js.Any = js.native

  var lowerRadiusLimit: js.Any = js.native
  var upperRadiusLimit: js.Any = js.native
  var angularSensibilityX: Double = js.native
  var angularSensibilityY: Double = js.native
  var wheelPrecision: Double = js.native
  var pinchPrecision: Double = js.native
  var panningSensibility: Double = js.native
  var inertialPanningX: Double = js.native
  var inertialPanningY: Double = js.native
  var keysUp: js.Array[Double] = js.native
  var keysDown: js.Array[Double] = js.native
  var keysLeft: js.Array[Double] = js.native
  var keysRight: js.Array[Double] = js.native
  var zoomOnFactor: Double = js.native
  var targetScreenOffset: Vector2 = js.native
  var pinchInwards: Boolean = js.native
  var allowUpsideDown: Boolean = js.native
  var onCollide: js.Function1[AbstractMesh, Unit] = js.native
  var checkCollisions: Boolean = js.native
  var collisionRadius: Vector3 = js.native
  var angularSensibility: Double = js.native
  def _getTargetPosition(): Vector3 = js.native
  override def _initCache(): Unit = js.native
  override def _updateCache(ignoreParentClass: Boolean): Unit = js.native
  override def _isSynchronizedViewMatrix(): Boolean = js.native
  def attachControl(element: HTMLElement, noPreventDefault: Boolean, useCtrlForPanning: Boolean): Unit = js.native
  override def detachControl(element: HTMLElement): Unit = js.native
  override def _checkInputs(): Unit = js.native
  def setPosition(position: Vector3): Unit = js.native
  override def setTarget(target: Vector3): Unit = js.native
  override def _getViewMatrix(): Matrix = js.native
  def zoomOn(meshes: js.Array[AbstractMesh], doNotUpdateMaxZ: Boolean): Unit = js.native
  def focusOn(meshesOrMinMaxVectorAndDistance: js.Any, doNotUpdateMaxZ: Boolean): Unit = js.native
  override def createRigCamera(name: String, cameraIndex: Double): Camera = js.native
  override def _updateRigCameras(): Unit = js.native
}

@js.native
@JSName("BABYLON.VRCameraMetrics")
class VRCameraMetrics extends js.Object {
  var hResolution: Double = js.native
  var vResolution: Double = js.native
  var hScreenSize: Double = js.native
  var vScreenSize: Double = js.native
  var vScreenCenter: Double = js.native
  var eyeToScreenDistance: Double = js.native
  var lensSeparationDistance: Double = js.native
  var interpupillaryDistance: Double = js.native
  var distortionK: js.Array[Double] = js.native
  var chromaAbCorrection: js.Array[Double] = js.native
  var postProcessScaleFactor: Double = js.native
  var lensCenterOffset: Double = js.native
  var compensateDistorsion: Boolean = js.native
  var aspectRatio: Double = js.native
  var aspectRatioFov: Double = js.native
  var leftHMatrix: Matrix = js.native
  var rightHMatrix: Matrix = js.native
  var leftPreViewMatrix: Matrix = js.native
  var rightPreViewMatrix: Matrix = js.native
}

@js.native
@JSName("BABYLON.VRCameraMetrics")
object VRCameraMetrics extends js.Object {
  def GetDefault(): VRCameraMetrics = js.native
}

@js.native
@JSName("BABYLON.Camera")
class Camera protected () extends Node {
  def this(name: String, position: Vector3, scene: Scene) = this()
  var position: Vector3 = js.native
  var upVector: Vector3 = js.native
  var orthoLeft: js.Any = js.native
  var orthoRight: js.Any = js.native
  var orthoBottom: js.Any = js.native
  var orthoTop: js.Any = js.native
  var fov: Double = js.native
  var minZ: Double = js.native
  var maxZ: Double = js.native
  var inertia: Double = js.native
  var mode: Double = js.native
  var isIntermediate: Boolean = js.native
  var viewport: Viewport = js.native
  var layerMask: Double = js.native
  var fovMode: Double = js.native
  var cameraRigMode: Double = js.native
  var _cameraRigParams: js.Any = js.native
  var _rigCameras: js.Array[Camera] = js.native
  var _projectionMatrix: Matrix = js.native
  var _postProcesses: js.Array[PostProcess] = js.native
  var _postProcessesTakenIndices: js.Array[js.Any] = js.native
  var _activeMeshes: SmartArray[Mesh] = js.native
  var globalPosition: Vector3 = js.native
  def getActiveMeshes(): SmartArray[Mesh] = js.native
  def isActiveMesh(mesh: Mesh): Boolean = js.native
  override def _initCache(): Unit = js.native
  override def _updateCache(ignoreParentClass: Boolean): Unit = js.native
  def _updateFromScene(): Unit = js.native
  override def _isSynchronized(): Boolean = js.native
  def _isSynchronizedViewMatrix(): Boolean = js.native
  def _isSynchronizedProjectionMatrix(): Boolean = js.native
  def attachControl(element: HTMLElement): Unit = js.native
  def detachControl(element: HTMLElement): Unit = js.native
  def _update(): Unit = js.native
  def _checkInputs(): Unit = js.native
  def attachPostProcess(postProcess: PostProcess, insertAt: Double): Double = js.native
  def detachPostProcess(postProcess: PostProcess, atIndices: js.Any): js.Array[Double] = js.native
  override def getWorldMatrix(): Matrix = js.native
  def _getViewMatrix(): Matrix = js.native
  def getViewMatrix(force: Boolean): Matrix = js.native
  def _computeViewMatrix(force: Boolean): Matrix = js.native
  def getProjectionMatrix(force: Boolean): Matrix = js.native
  def dispose(): Unit = js.native
  def setCameraRigMode(mode: Double, rigParams: js.Any): Unit = js.native
  def setCameraRigParameter(name: String, value: js.Any): Unit = js.native
  def createRigCamera(name: String, cameraIndex: Double): Camera = js.native
  def _updateRigCameras(): Unit = js.native
}

@js.native
@JSName("BABYLON.Camera")
object Camera extends js.Object {
  var PERSPECTIVE_CAMERA: Double = js.native
  var ORTHOGRAPHIC_CAMERA: Double = js.native
  var FOVMODE_VERTICAL_FIXED: Double = js.native
  var FOVMODE_HORIZONTAL_FIXED: Double = js.native
  var RIG_MODE_NONE: Double = js.native
  var RIG_MODE_STEREOSCOPIC_ANAGLYPH: Double = js.native
  var RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_PARALLEL: Double = js.native
  var RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_CROSSEYED: Double = js.native
  var RIG_MODE_STEREOSCOPIC_OVERUNDER: Double = js.native
  var RIG_MODE_VR: Double = js.native
}

@js.native
@JSName("BABYLON.DeviceOrientationCamera")
class DeviceOrientationCamera protected () extends FreeCamera {
  def this(name: String, position: Vector3, scene: Scene) = this()
  var moveSensibility: Double = js.native
  def attachControl(canvas: HTMLCanvasElement, noPreventDefault: Boolean): Unit = js.native
  def detachControl(canvas: HTMLCanvasElement): Unit = js.native
  override def _checkInputs(): Unit = js.native
}

@js.native
@JSName("BABYLON.FollowCamera")
class FollowCamera protected () extends TargetCamera {
  def this(name: String, position: Vector3, scene: Scene) = this()
  var radius: Double = js.native
  var rotationOffset: Double = js.native
  var heightOffset: Double = js.native
  var cameraAcceleration: Double = js.native
  var maxCameraSpeed: Double = js.native
  var target: AbstractMesh = js.native
  override def _checkInputs(): Unit = js.native
}

@js.native
@JSName("BABYLON.ArcFollowCamera")
class ArcFollowCamera protected () extends TargetCamera {
  def this(name: String, alpha: Double, beta: Double, radius: Double, target: AbstractMesh, scene: Scene) = this()
  var alpha: Double = js.native
  var beta: Double = js.native
  var radius: Double = js.native
  var target: AbstractMesh = js.native
  override def _checkInputs(): Unit = js.native
}

@js.native
@JSName("BABYLON.FreeCamera")
class FreeCamera protected () extends TargetCamera {
  def this(name: String, position: Vector3, scene: Scene) = this()
  var ellipsoid: Vector3 = js.native
  var keysUp: js.Array[Double] = js.native
  var keysDown: js.Array[Double] = js.native
  var keysLeft: js.Array[Double] = js.native
  var keysRight: js.Array[Double] = js.native
  var checkCollisions: Boolean = js.native
  var applyGravity: Boolean = js.native
  var angularSensibility: Double = js.native
  var onCollide: js.Function1[AbstractMesh, Unit] = js.native
  var _onLostFocus: js.Function1[FocusEvent, Any] = js.native
  def attachControl(element: HTMLElement, noPreventDefault: Boolean): Unit = js.native
  override def detachControl(element: HTMLElement): Unit = js.native
  def _collideWithWorld(velocity: Vector3): Unit = js.native
  override def _checkInputs(): Unit = js.native
  override def _decideIfNeedsToMove(): Boolean = js.native
  override def _updatePosition(): Unit = js.native
}

@js.native
@JSName("BABYLON.GamepadCamera")
class GamepadCamera protected () extends FreeCamera {
  def this(name: String, position: Vector3, scene: Scene) = this()
  var moveSensibility: Double = js.native
  override def _checkInputs(): Unit = js.native
  override def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.AnaglyphFreeCamera")
class AnaglyphFreeCamera protected () extends FreeCamera {
  def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
}

@js.native
@JSName("BABYLON.AnaglyphArcRotateCamera")
class AnaglyphArcRotateCamera protected () extends ArcRotateCamera {
  def this(name: String, alpha: Double, beta: Double, radius: Double, target: js.Any, interaxialDistance: Double, scene: Scene) = this()
}

@js.native
@JSName("BABYLON.AnaglyphGamepadCamera")
class AnaglyphGamepadCamera protected () extends GamepadCamera {
  def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
}

@js.native
@JSName("BABYLON.StereoscopicFreeCamera")
class StereoscopicFreeCamera protected () extends FreeCamera {
  def this(name: String, position: Vector3, interaxialDistance: Double, isSideBySide: Boolean, scene: Scene) = this()
}

@js.native
@JSName("BABYLON.StereoscopicArcRotateCamera")
class StereoscopicArcRotateCamera protected () extends ArcRotateCamera {
  def this(name: String, alpha: Double, beta: Double, radius: Double, target: js.Any, interaxialDistance: Double, isSideBySide: Boolean, scene: Scene) = this()
}

@js.native
@JSName("BABYLON.StereoscopicGamepadCamera")
class StereoscopicGamepadCamera protected () extends GamepadCamera {
  def this(name: String, position: Vector3, interaxialDistance: Double, isSideBySide: Boolean, scene: Scene) = this()
}

@js.native
@JSName("BABYLON.TargetCamera")
class TargetCamera protected () extends Camera {
  def this(name: String, position: Vector3, scene: Scene) = this()
  var cameraDirection: Vector3 = js.native
  var cameraRotation: Vector2 = js.native
  var rotation: Vector3 = js.native
  var speed: Double = js.native
  var noRotationConstraint: Boolean = js.native
  var lockedTarget: js.Any = js.native
  var _currentTarget: Vector3 = js.native
  var _viewMatrix: Matrix = js.native
  var _camMatrix: Matrix = js.native
  var _cameraTransformMatrix: Matrix = js.native
  var _cameraRotationMatrix: Matrix = js.native
  var _referencePoint: Vector3 = js.native
  var _transformedReferencePoint: Vector3 = js.native
  var _lookAtTemp: Matrix = js.native
  var _tempMatrix: Matrix = js.native
  var _reset: js.Function0[Unit] = js.native
  var _waitingLockedTargetId: String = js.native
  def getFrontPosition(distance: Double): Vector3 = js.native
  def _getLockedTargetPosition(): Vector3 = js.native
  override def _initCache(): Unit = js.native
  override def _updateCache(ignoreParentClass: Boolean): Unit = js.native
  def _computeLocalCameraSpeed(): Double = js.native
  def setTarget(target: Vector3): Unit = js.native
  def getTarget(): Vector3 = js.native
  def _decideIfNeedsToMove(): Boolean = js.native
  def _updatePosition(): Unit = js.native
  override def _checkInputs(): Unit = js.native
  override def _getViewMatrix(): Matrix = js.native
  def _getVRViewMatrix(): Matrix = js.native
  override def createRigCamera(name: String, cameraIndex: Double): Camera = js.native
  override def _updateRigCameras(): Unit = js.native
}

@js.native
@JSName("BABYLON.TouchCamera")
class TouchCamera protected () extends FreeCamera {
  def this(name: String, position: Vector3, scene: Scene) = this()
  var moveSensibility: Double = js.native
  def attachControl(canvas: HTMLCanvasElement, noPreventDefault: Boolean): Unit = js.native
  def detachControl(canvas: HTMLCanvasElement): Unit = js.native
  override def _checkInputs(): Unit = js.native
}

@js.native
@JSName("BABYLON.VirtualJoysticksCamera")
class VirtualJoysticksCamera protected () extends FreeCamera {
  def this(name: String, position: Vector3, scene: Scene) = this()
  def getLeftJoystick(): VirtualJoystick = js.native
  def getRightJoystick(): VirtualJoystick = js.native
  override def _checkInputs(): Unit = js.native
  override def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.Collider")
class Collider extends js.Object {
  var radius: Vector3 = js.native
  var retry: Double = js.native
  var velocity: Vector3 = js.native
  var basePoint: Vector3 = js.native
  var epsilon: Double = js.native
  var collisionFound: Boolean = js.native
  var velocityWorldLength: Double = js.native
  var basePointWorld: Vector3 = js.native
  var velocityWorld: Vector3 = js.native
  var normalizedVelocity: Vector3 = js.native
  var initialVelocity: Vector3 = js.native
  var initialPosition: Vector3 = js.native
  var nearestDistance: Double = js.native
  var intersectionPoint: Vector3 = js.native
  var collidedMesh: AbstractMesh = js.native
  def _initialize(source: Vector3, dir: Vector3, e: Double): Unit = js.native
  def _checkPointInTriangle(point: Vector3, pa: Vector3, pb: Vector3, pc: Vector3, n: Vector3): Boolean = js.native
  def _canDoCollision(sphereCenter: Vector3, sphereRadius: Double, vecMin: Vector3, vecMax: Vector3): Boolean = js.native
  def _testTriangle(faceIndex: Double, trianglePlaneArray: js.Array[Plane], p1: Vector3, p2: Vector3, p3: Vector3, hasMaterial: Boolean): Unit = js.native
  def _collide(trianglePlaneArray: js.Array[Plane], pts: js.Array[Vector3], indices: js.Array[Double], indexStart: Double, indexEnd: Double, decal: Double, hasMaterial: Boolean): Unit = js.native
  def _getResponse(pos: Vector3, vel: Vector3): Unit = js.native
}

@js.native
trait ICollisionCoordinator extends js.Object {
  def getNewPosition(position: Vector3, velocity: Vector3, collider: Collider, maximumRetry: Double, excludedMesh: AbstractMesh, onNewPosition: js.Function3[Double, Vector3, AbstractMesh, Unit], collisionIndex: Double): Unit = js.native
  def init(scene: Scene): Unit = js.native
  def destroy(): Unit = js.native
  def onMeshAdded(mesh: AbstractMesh): js.Dynamic = js.native
  def onMeshUpdated(mesh: AbstractMesh): js.Dynamic = js.native
  def onMeshRemoved(mesh: AbstractMesh): js.Dynamic = js.native
  def onGeometryAdded(geometry: Geometry): js.Dynamic = js.native
  def onGeometryUpdated(geometry: Geometry): js.Dynamic = js.native
  def onGeometryDeleted(geometry: Geometry): js.Dynamic = js.native
}

@js.native
trait SerializedMesh extends js.Object {
  var id: String = js.native
  var name: String = js.native
  var uniqueId: Double = js.native
  var geometryId: String = js.native
  var sphereCenter: js.Array[Double] = js.native
  var sphereRadius: Double = js.native
  var boxMinimum: js.Array[Double] = js.native
  var boxMaximum: js.Array[Double] = js.native
  var worldMatrixFromCache: js.Any = js.native
  var subMeshes: js.Array[SerializedSubMesh] = js.native
  var checkCollisions: Boolean = js.native
}

@js.native
trait SerializedSubMesh extends js.Object {
  var position: Double = js.native
  var verticesStart: Double = js.native
  var verticesCount: Double = js.native
  var indexStart: Double = js.native
  var indexCount: Double = js.native
  var hasMaterial: Boolean = js.native
  var sphereCenter: js.Array[Double] = js.native
  var sphereRadius: Double = js.native
  var boxMinimum: js.Array[Double] = js.native
  var boxMaximum: js.Array[Double] = js.native
}

@js.native
trait SerializedGeometry extends js.Object {
  var id: String = js.native
  var positions: Float32Array = js.native
  var indices: Int32Array = js.native
  var normals: Float32Array = js.native
}

@js.native
trait BabylonMessage extends js.Object {
  var taskType: WorkerTaskType = js.native
  var payload: InitPayload | CollidePayload | UpdatePayload = js.native
}

@js.native
trait SerializedColliderToWorker extends js.Object {
  var position: js.Array[Double] = js.native
  var velocity: js.Array[Double] = js.native
  var radius: js.Array[Double] = js.native
}

@js.native
sealed trait WorkerTaskType extends js.Object {
}

@js.native
@JSName("BABYLON.WorkerTaskType")
object WorkerTaskType extends js.Object {
  var INIT: WorkerTaskType = js.native
  var UPDATE: WorkerTaskType = js.native
  var COLLIDE: WorkerTaskType = js.native
  @JSBracketAccess
  def apply(value: WorkerTaskType): String = js.native
}

@js.native
trait WorkerReply extends js.Object {
  var error: WorkerReplyType = js.native
  var taskType: WorkerTaskType = js.native
  var payload: js.Any = js.native
}

@js.native
trait CollisionReplyPayload extends js.Object {
  var newPosition: js.Array[Double] = js.native
  var collisionId: Double = js.native
  var collidedMeshUniqueId: Double = js.native
}

@js.native
trait InitPayload extends js.Object {
}

@js.native
trait CollidePayload extends js.Object {
  var collisionId: Double = js.native
  var collider: SerializedColliderToWorker = js.native
  var maximumRetry: Double = js.native
  var excludedMeshUniqueId: Double = js.native
}

@js.native
trait UpdatePayload extends js.Object {
  var updatedMeshes: js.Any = js.native
  var updatedGeometries: js.Dictionary[SerializedGeometry] = js.native
  var removedMeshes: js.Array[Double] = js.native
  var removedGeometries: js.Array[String] = js.native
}

@js.native
sealed trait WorkerReplyType extends js.Object {
}

@js.native
@JSName("BABYLON.WorkerReplyType")
object WorkerReplyType extends js.Object {
  var SUCCESS: WorkerReplyType = js.native
  var UNKNOWN_ERROR: WorkerReplyType = js.native
  @JSBracketAccess
  def apply(value: WorkerReplyType): String = js.native
}

@js.native
@JSName("BABYLON.CollisionCoordinatorWorker")
class CollisionCoordinatorWorker extends ICollisionCoordinator {
  override def getNewPosition(position: Vector3, velocity: Vector3, collider: Collider, maximumRetry: Double, excludedMesh: AbstractMesh, onNewPosition: js.Function3[Double, Vector3, AbstractMesh, Unit], collisionIndex: Double): Unit = js.native
  override def init(scene: Scene): Unit = js.native
  override def destroy(): Unit = js.native
  var onMeshUpdated: js.Function1[AbstractMesh, Unit] = js.native
  var onGeometryUpdated: js.Function1[Geometry, Unit] = js.native
}

@js.native
@JSName("BABYLON.CollisionCoordinatorWorker")
object CollisionCoordinatorWorker extends js.Object {
  var SerializeMesh: js.Function1[AbstractMesh, SerializedMesh] = js.native
  var SerializeGeometry: js.Function1[Geometry, SerializedGeometry] = js.native
}

@js.native
@JSName("BABYLON.CollisionCoordinatorLegacy")
class CollisionCoordinatorLegacy extends ICollisionCoordinator {
  override def getNewPosition(position: Vector3, velocity: Vector3, collider: Collider, maximumRetry: Double, excludedMesh: AbstractMesh, onNewPosition: js.Function3[Double, Vector3, AbstractMesh, Unit], collisionIndex: Double): Unit = js.native
  override def init(scene: Scene): Unit = js.native
  override def destroy(): Unit = js.native
}

@js.native
@JSName("BABYLON.CollisionCache")
class CollisionCache extends js.Object {
  def getMeshes(): js.Any = js.native
  def getGeometries(): js.Any = js.native
  def getMesh(id: js.Any): SerializedMesh = js.native
  def addMesh(mesh: SerializedMesh): Unit = js.native
  def getGeometry(id: String): SerializedGeometry = js.native
  def addGeometry(geometry: SerializedGeometry): Unit = js.native
}

@js.native
@JSName("BABYLON.CollideWorker")
class CollideWorker protected () extends js.Object {
  def this(collider: Collider, _collisionCache: CollisionCache, finalPosition: Vector3) = this()
  var collider: Collider = js.native
  def collideWithWorld(position: Vector3, velocity: Vector3, maximumRetry: Double, excludedMeshUniqueId: Double): Unit = js.native
}

@js.native
trait ICollisionDetector extends js.Object {
  def onInit(payload: InitPayload): Unit = js.native
  def onUpdate(payload: UpdatePayload): Unit = js.native
  def onCollision(payload: CollidePayload): Unit = js.native
}

@js.native
@JSName("BABYLON.CollisionDetectorTransferable")
class CollisionDetectorTransferable extends ICollisionDetector {
  override def onInit(payload: InitPayload): Unit = js.native
  override def onUpdate(payload: UpdatePayload): Unit = js.native
  override def onCollision(payload: CollidePayload): Unit = js.native
}

@js.native
@JSName("BABYLON.IntersectionInfo")
class IntersectionInfo protected () extends js.Object {
  def this(bu: Double, bv: Double, distance: Double) = this()
  var bu: Double = js.native
  var bv: Double = js.native
  var distance: Double = js.native
  var faceId: Double = js.native
  var subMeshId: Double = js.native
}

@js.native
@JSName("BABYLON.PickingInfo")
class PickingInfo extends js.Object {
  var hit: Boolean = js.native
  var distance: Double = js.native
  var pickedPoint: Vector3 = js.native
  var pickedMesh: AbstractMesh = js.native
  var bu: Double = js.native
  var bv: Double = js.native
  var faceId: Double = js.native
  var subMeshId: Double = js.native
  def getNormal(useWorldCoordinates: Boolean, useVerticesNormals: Boolean): Vector3 = js.native
  def getTextureCoordinates(): Vector2 = js.native
}

@js.native
@JSName("BABYLON.BoundingBox")
class BoundingBox protected () extends js.Object {
  def this(minimum: Vector3, maximum: Vector3) = this()
  var minimum: Vector3 = js.native
  var maximum: Vector3 = js.native
  var vectors: js.Array[Vector3] = js.native
  var center: Vector3 = js.native
  var extendSize: Vector3 = js.native
  var directions: js.Array[Vector3] = js.native
  var vectorsWorld: js.Array[Vector3] = js.native
  var minimumWorld: Vector3 = js.native
  var maximumWorld: Vector3 = js.native
  def getWorldMatrix(): Matrix = js.native
  def _update(world: Matrix): Unit = js.native
  def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  def intersectsPoint(point: Vector3): Boolean = js.native
  def intersectsSphere(sphere: BoundingSphere): Boolean = js.native
  def intersectsMinMax(min: Vector3, max: Vector3): Boolean = js.native
}

@js.native
@JSName("BABYLON.BoundingBox")
object BoundingBox extends js.Object {
  def Intersects(box0: BoundingBox, box1: BoundingBox): Boolean = js.native
  def IntersectsSphere(minPoint: Vector3, maxPoint: Vector3, sphereCenter: Vector3, sphereRadius: Double): Boolean = js.native
  def IsCompletelyInFrustum(boundingVectors: js.Array[Vector3], frustumPlanes: js.Array[Plane]): Boolean = js.native
  def IsInFrustum(boundingVectors: js.Array[Vector3], frustumPlanes: js.Array[Plane]): Boolean = js.native
}

@js.native
@JSName("BABYLON.BoundingInfo")
class BoundingInfo protected () extends js.Object {
  def this(minimum: Vector3, maximum: Vector3) = this()
  var minimum: Vector3 = js.native
  var maximum: Vector3 = js.native
  var boundingBox: BoundingBox = js.native
  var boundingSphere: BoundingSphere = js.native
  def _update(world: Matrix): Unit = js.native
  def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  def _checkCollision(collider: Collider): Boolean = js.native
  def intersectsPoint(point: Vector3): Boolean = js.native
  def intersects(boundingInfo: BoundingInfo, precise: Boolean): Boolean = js.native
}

@js.native
@JSName("BABYLON.BoundingSphere")
class BoundingSphere protected () extends js.Object {
  def this(minimum: Vector3, maximum: Vector3) = this()
  var minimum: Vector3 = js.native
  var maximum: Vector3 = js.native
  var center: Vector3 = js.native
  var radius: Double = js.native
  var centerWorld: Vector3 = js.native
  var radiusWorld: Double = js.native
  def _update(world: Matrix): Unit = js.native
  def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  def intersectsPoint(point: Vector3): Boolean = js.native
}

@js.native
@JSName("BABYLON.BoundingSphere")
object BoundingSphere extends js.Object {
  def Intersects(sphere0: BoundingSphere, sphere1: BoundingSphere): Boolean = js.native
}

@js.native
@JSName("BABYLON.DebugLayer")
class DebugLayer protected () extends js.Object {
  def this(scene: Scene) = this()
  var shouldDisplayLabel: js.Function1[Node, Boolean] = js.native
  var shouldDisplayAxis: js.Function1[Mesh, Boolean] = js.native
  var axisRatio: Double = js.native
  var accentColor: String = js.native
  var customStatsFunction: js.Function0[String] = js.native
  def isVisible(): Boolean = js.native
  def hide(): Unit = js.native
  def show(showUI: Boolean, camera: Camera): Unit = js.native
}

@js.native
@JSName("BABYLON.Layer")
class Layer protected () extends js.Object {
  def this(name: String, imgUrl: String, scene: Scene, isBackground: Boolean, color: Color4) = this()
  var name: String = js.native
  var texture: Texture = js.native
  var isBackground: Boolean = js.native
  var color: Color4 = js.native
  var onDispose: js.Function0[Unit] = js.native
  def render(): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.LensFlare")
class LensFlare protected () extends js.Object {
  def this(size: Double, position: Double, color: js.Any, imgUrl: String, system: LensFlareSystem) = this()
  var size: Double = js.native
  var position: Double = js.native
  var color: Color3 = js.native
  var texture: Texture = js.native
  var dispose: js.Function0[Unit] = js.native
}

@js.native
@JSName("BABYLON.LensFlareSystem")
class LensFlareSystem protected () extends js.Object {
  def this(name: String, emitter: js.Any, scene: Scene) = this()
  var name: String = js.native
  var lensFlares: js.Array[LensFlare] = js.native
  var borderLimit: Double = js.native
  var meshesSelectionPredicate: js.Function1[Mesh, Boolean] = js.native
  var layerMask: Double = js.native
  var isEnabled: Boolean = js.native
  def getScene(): Scene = js.native
  def getEmitter(): js.Dynamic = js.native
  def setEmitter(newEmitter: js.Any): Unit = js.native
  def getEmitterPosition(): Vector3 = js.native
  def computeEffectivePosition(globalViewport: Viewport): Boolean = js.native
  def _isVisible(): Boolean = js.native
  def render(): Boolean = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.DirectionalLight")
class DirectionalLight protected () extends Light with IShadowLight {
  def this(name: String, direction: Vector3, scene: Scene) = this()
//  var direction: Vector3 = js.native
//  var position: Vector3 = js.native
//  var transformedPosition: Vector3 = js.native
  var shadowOrthoScale: Double = js.native
//  def getAbsolutePosition(): Vector3 = js.native
  def setDirectionToTarget(target: Vector3): Vector3 = js.native
//  def setShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: js.Array[AbstractMesh]): Unit = js.native
//  def supportsVSM(): Boolean = js.native
//  def needRefreshPerFrame(): Boolean = js.native
//  def computeTransformedPosition(): Boolean = js.native
  def transferToEffect(effect: Effect, directionUniformName: String): Unit = js.native
//  def _getWorldMatrix(): Matrix = js.native
}

@js.native
@JSName("BABYLON.HemisphericLight")
class HemisphericLight protected () extends Light {
  def this(name: String, direction: Vector3, scene: Scene) = this()
  var direction: Vector3 = js.native
  var groundColor: Color3 = js.native
  def setDirectionToTarget(target: Vector3): Vector3 = js.native
//  def getShadowGenerator(): ShadowGenerator = js.native
//  def transferToEffect(effect: Effect, directionUniformName: String, groundColorUniformName: String): Unit = js.native
//  def _getWorldMatrix(): Matrix = js.native
}

@js.native
trait IShadowLight extends js.Object {
//  var position: Vector3 = js.native
//  var direction: Vector3 = js.native
//  var transformedPosition: Vector3 = js.native
//  var name: String = js.native
  def computeTransformedPosition(): Boolean = js.native
  def getScene(): Scene
  def setShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: js.Array[AbstractMesh]): Unit = js.native
  def supportsVSM(): Boolean = js.native
  def needRefreshPerFrame(): Boolean = js.native
//  var _shadowGenerator: ShadowGenerator = js.native
}

@js.native
@JSName("BABYLON.Light")
class Light protected () extends Node {
  def this(name: String, scene: Scene) = this()
  var diffuse: Color3 = js.native
  var specular: Color3 = js.native
  var intensity: Double = js.native
  var range: Double = js.native
  var includeOnlyWithLayerMask: Double = js.native
  var includedOnlyMeshes: js.Array[AbstractMesh] = js.native
  var excludedMeshes: js.Array[AbstractMesh] = js.native
  var excludeWithLayerMask: Double = js.native
  var _shadowGenerator: ShadowGenerator = js.native
  var _excludedMeshesIds: js.Array[String] = js.native
  var _includedOnlyMeshesIds: js.Array[String] = js.native
  def getShadowGenerator(): ShadowGenerator = js.native
  def getAbsolutePosition(): Vector3 = js.native
  def transferToEffect(effect: Effect, uniformName0: String, uniformName1: String): Unit = js.native
  def _getWorldMatrix(): Matrix = js.native
  def canAffectMesh(mesh: AbstractMesh): Boolean = js.native
//  def getWorldMatrix(): Matrix = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.PointLight")
class PointLight protected () extends Light {
  def this(name: String, position: Vector3, scene: Scene) = this()
  var position: Vector3 = js.native
//  def getAbsolutePosition(): Vector3 = js.native
  def transferToEffect(effect: Effect, positionUniformName: String): Unit = js.native
//  def getShadowGenerator(): ShadowGenerator = js.native
//  def _getWorldMatrix(): Matrix = js.native
}

@js.native
@JSName("BABYLON.SpotLight")
class SpotLight protected () extends Light with IShadowLight {
  def this(name: String, position: Vector3, direction: Vector3, angle: Double, exponent: Double, scene: Scene) = this()
//  var position: Vector3 = js.native
//  var direction: Vector3 = js.native
  var angle: Double = js.native
  var exponent: Double = js.native
//  var transformedPosition: Vector3 = js.native
//  def getAbsolutePosition(): Vector3 = js.native
//  def setShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: js.Array[AbstractMesh]): Unit = js.native
//  def supportsVSM(): Boolean = js.native
//  def needRefreshPerFrame(): Boolean = js.native
  def setDirectionToTarget(target: Vector3): Vector3 = js.native
//  def computeTransformedPosition(): Boolean = js.native
//  def transferToEffect(effect: Effect, positionUniformName: String, directionUniformName: String): Unit = js.native
//  def _getWorldMatrix(): Matrix = js.native
}

@js.native
trait ISceneLoaderPlugin extends js.Object {
  var extensions: String = js.native
  var importMesh: js.Function7[js.Any, Scene, js.Any, String, js.Array[AbstractMesh], js.Array[ParticleSystem], js.Array[Skeleton], Boolean] = js.native
  var load: js.Function3[Scene, String, String, Boolean] = js.native
}

@js.native
@JSName("BABYLON.SceneLoader")
class SceneLoader extends js.Object {
}

@js.native
@JSName("BABYLON.SceneLoader")
object SceneLoader extends js.Object {
  var ForceFullSceneLoadingForIncremental: Boolean = js.native
  var ShowLoadingScreen: Boolean = js.native
  def RegisterPlugin(plugin: ISceneLoaderPlugin): Unit = js.native
  def ImportMesh(meshesNames: js.Any, rootUrl: String, sceneFilename: String, scene: Scene, onsuccess: js.Function3[js.Array[AbstractMesh], js.Array[ParticleSystem], js.Array[Skeleton], Unit], progressCallBack: js.Function0[Unit], onerror: js.Function2[Scene, js.Any, Unit]): Unit = js.native
  def Load(rootUrl: String, sceneFilename: js.Any, engine: Engine, onsuccess: js.Function1[Scene, Unit], progressCallBack: js.Any, onerror: js.Function1[Scene, Unit]): Unit = js.native
  def Append(rootUrl: String, sceneFilename: js.Any, scene: Scene, onsuccess: js.Function1[Scene, Unit], progressCallBack: js.Any, onerror: js.Function1[Scene, Unit]): Unit = js.native
}

@js.native
@JSName("BABYLON.EffectFallbacks")
class EffectFallbacks extends js.Object {
  def addFallback(rank: Double, define: String): Unit = js.native
  var isMoreFallbacks: Boolean = js.native
  def reduce(currentDefines: String): String = js.native
}

@js.native
@JSName("BABYLON.Effect")
class Effect protected () extends js.Object {
  def this(baseName: js.Any, attributesNames: js.Array[String], uniformsNames: js.Array[String], samplers: js.Array[String], engine: js.Any, defines: String, fallbacks: EffectFallbacks, onCompiled: js.Function1[Effect, Unit], onError: js.Function2[Effect, String, Unit]) = this()
  var name: js.Any = js.native
  var defines: String = js.native
  var onCompiled: js.Function1[Effect, Unit] = js.native
  var onError: js.Function2[Effect, String, Unit] = js.native
  var onBind: js.Function1[Effect, Unit] = js.native
  var _key: String = js.native
  def isReady(): Boolean = js.native
  def getProgram(): WebGLProgram = js.native
  def getAttributesNames(): js.Array[String] = js.native
  def getAttributeLocation(index: Double): Double = js.native
  def getAttributeLocationByName(name: String): Double = js.native
  def getAttributesCount(): Double = js.native
  def getUniformIndex(uniformName: String): Double = js.native
  def getUniform(uniformName: String): WebGLUniformLocation = js.native
  def getSamplers(): js.Array[String] = js.native
  def getCompilationError(): String = js.native
  def _loadVertexShader(vertex: js.Any, callback: js.Function1[js.Any, Unit]): Unit = js.native
  def _loadFragmentShader(fragment: js.Any, callback: js.Function1[js.Any, Unit]): Unit = js.native
  def _bindTexture(channel: String, texture: WebGLTexture): Unit = js.native
  def setTexture(channel: String, texture: BaseTexture): Unit = js.native
  def setTextureFromPostProcess(channel: String, postProcess: PostProcess): Unit = js.native
  def _cacheFloat2(uniformName: String, x: Double, y: Double): Unit = js.native
  def _cacheFloat3(uniformName: String, x: Double, y: Double, z: Double): Unit = js.native
  def _cacheFloat4(uniformName: String, x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def setArray(uniformName: String, array: js.Array[Double]): Effect = js.native
  def setArray2(uniformName: String, array: js.Array[Double]): Effect = js.native
  def setArray3(uniformName: String, array: js.Array[Double]): Effect = js.native
  def setArray4(uniformName: String, array: js.Array[Double]): Effect = js.native
  def setMatrices(uniformName: String, matrices: Float32Array): Effect = js.native
  def setMatrix(uniformName: String, matrix: Matrix): Effect = js.native
  def setMatrix3x3(uniformName: String, matrix: Float32Array): Effect = js.native
  def setMatrix2x2(uniformname: String, matrix: Float32Array): Effect = js.native
  def setFloat(uniformName: String, value: Double): Effect = js.native
  def setBool(uniformName: String, bool: Boolean): Effect = js.native
  def setVector2(uniformName: String, vector2: Vector2): Effect = js.native
  def setFloat2(uniformName: String, x: Double, y: Double): Effect = js.native
  def setVector3(uniformName: String, vector3: Vector3): Effect = js.native
  def setFloat3(uniformName: String, x: Double, y: Double, z: Double): Effect = js.native
  def setVector4(uniformName: String, vector4: Vector4): Effect = js.native
  def setFloat4(uniformName: String, x: Double, y: Double, z: Double, w: Double): Effect = js.native
  def setColor3(uniformName: String, color3: Color3): Effect = js.native
  def setColor4(uniformName: String, color3: Color3, alpha: Double): Effect = js.native
}

@js.native
@JSName("BABYLON.Effect")
object Effect extends js.Object {
}

@js.native
@JSName("BABYLON.Material")
class Material protected () extends js.Object {
  def this(name: String, scene: Scene, doNotAdd: Boolean) = this()
  var name: String = js.native
  var id: String = js.native
  var checkReadyOnEveryCall: Boolean = js.native
  var checkReadyOnlyOnce: Boolean = js.native
  var state: String = js.native
  var alpha: Double = js.native
  var backFaceCulling: Boolean = js.native
  var onCompiled: js.Function1[Effect, Unit] = js.native
  var onError: js.Function2[Effect, String, Unit] = js.native
  var onDispose: js.Function0[Unit] = js.native
  var onBind: js.Function2[Material, Mesh, Unit] = js.native
  var getRenderTargetTextures: js.Function0[SmartArray[RenderTargetTexture]] = js.native
  var alphaMode: Double = js.native
  var disableDepthWrite: Boolean = js.native
  var _effect: Effect = js.native
  var _wasPreviouslyReady: Boolean = js.native
  var pointSize: Double = js.native
  var zOffset: Double = js.native
  var wireframe: Boolean = js.native
  var pointsCloud: Boolean = js.native
  var fillMode: Double = js.native
  def isReady(mesh: AbstractMesh, useInstances: Boolean): Boolean = js.native
  def getEffect(): Effect = js.native
  def getScene(): Scene = js.native
  def needAlphaBlending(): Boolean = js.native
  def needAlphaTesting(): Boolean = js.native
  def getAlphaTestTexture(): BaseTexture = js.native
  def trackCreation(onCompiled: js.Function1[Effect, Unit], onError: js.Function2[Effect, String, Unit]): Unit = js.native
  def _preBind(): Unit = js.native
  def bind(world: Matrix, mesh: Mesh): Unit = js.native
  def bindOnlyWorldMatrix(world: Matrix): Unit = js.native
  def unbind(): Unit = js.native
  def clone(name: String): Material = js.native
  def dispose(forceDisposeEffect: Boolean): Unit = js.native
}

@js.native
@JSName("BABYLON.Material")
object Material extends js.Object {
  var TriangleFillMode: Double = js.native
  var WireFrameFillMode: Double = js.native
  var PointFillMode: Double = js.native
}

@js.native
@JSName("BABYLON.MultiMaterial")
class MultiMaterial protected () extends Material {
  def this(name: String, scene: Scene) = this()
  var subMaterials: js.Array[Material] = js.native
  def getSubMaterial(index: js.Any): Material = js.native
  /*FIXME
  def isReady(mesh: AbstractMesh): Boolean = js.native
  */
  override def clone(name: String): MultiMaterial = js.native
}

@js.native
@JSName("BABYLON.ShaderMaterial")
class ShaderMaterial protected () extends Material {
  def this(name: String, scene: Scene, shaderPath: js.Any, options: js.Any) = this()
//  def needAlphaBlending(): Boolean = js.native
//  def needAlphaTesting(): Boolean = js.native
  def setTexture(name: String, texture: Texture): ShaderMaterial = js.native
  def setFloat(name: String, value: Double): ShaderMaterial = js.native
  def setFloats(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  def setColor3(name: String, value: Color3): ShaderMaterial = js.native
  def setColor4(name: String, value: Color4): ShaderMaterial = js.native
  def setVector2(name: String, value: Vector2): ShaderMaterial = js.native
  def setVector3(name: String, value: Vector3): ShaderMaterial = js.native
  def setVector4(name: String, value: Vector4): ShaderMaterial = js.native
  def setMatrix(name: String, value: Matrix): ShaderMaterial = js.native
  def setMatrix3x3(name: String, value: Float32Array): ShaderMaterial = js.native
  def setMatrix2x2(name: String, value: Float32Array): ShaderMaterial = js.native
//  def isReady(mesh: AbstractMesh, useInstances: Boolean): Boolean = js.native
//  def bindOnlyWorldMatrix(world: Matrix): Unit = js.native
//  def bind(world: Matrix, mesh: Mesh): Unit = js.native
//  def clone(name: String): ShaderMaterial = js.native
//  def dispose(forceDisposeEffect: Boolean): Unit = js.native
}

@js.native
@JSName("BABYLON.FresnelParameters")
class FresnelParameters extends js.Object {
  var isEnabled: Boolean = js.native
  var leftColor: Color3 = js.native
  var rightColor: Color3 = js.native
  var bias: Double = js.native
  var power: Double = js.native
}

@js.native
@JSName("BABYLON.StandardMaterial")
class StandardMaterial protected () extends Material {
  def this(name: String, scene: Scene) = this()
  var diffuseTexture: BaseTexture = js.native
  var ambientTexture: BaseTexture = js.native
  var opacityTexture: BaseTexture = js.native
  var reflectionTexture: BaseTexture = js.native
  var emissiveTexture: BaseTexture = js.native
  var specularTexture: BaseTexture = js.native
  var bumpTexture: BaseTexture = js.native
  var ambientColor: Color3 = js.native
  var diffuseColor: Color3 = js.native
  var specularColor: Color3 = js.native
  var specularPower: Double = js.native
  var emissiveColor: Color3 = js.native
  var useAlphaFromDiffuseTexture: Boolean = js.native
  var useEmissiveAsIllumination: Boolean = js.native
  var useReflectionFresnelFromSpecular: Boolean = js.native
  var useSpecularOverAlpha: Boolean = js.native
  var fogEnabled: Boolean = js.native
  var roughness: Double = js.native
  var diffuseFresnelParameters: FresnelParameters = js.native
  var opacityFresnelParameters: FresnelParameters = js.native
  var reflectionFresnelParameters: FresnelParameters = js.native
  var emissiveFresnelParameters: FresnelParameters = js.native
  var useGlossinessFromSpecularMapAlpha: Boolean = js.native
//  def needAlphaBlending(): Boolean = js.native
//  def needAlphaTesting(): Boolean = js.native
//  def getAlphaTestTexture(): BaseTexture = js.native
//  def isReady(mesh: AbstractMesh, useInstances: Boolean): Boolean = js.native
//  def unbind(): Unit = js.native
//  def bindOnlyWorldMatrix(world: Matrix): Unit = js.native
//  def bind(world: Matrix, mesh: Mesh): Unit = js.native
  def getAnimatables(): js.Array[IAnimatable] = js.native
//  def dispose(forceDisposeEffect: Boolean): Unit = js.native
//  def clone(name: String): StandardMaterial = js.native
}

@js.native
@JSName("BABYLON.StandardMaterial")
object StandardMaterial extends js.Object {
  var DiffuseTextureEnabled: Boolean = js.native
  var AmbientTextureEnabled: Boolean = js.native
  var OpacityTextureEnabled: Boolean = js.native
  var ReflectionTextureEnabled: Boolean = js.native
  var EmissiveTextureEnabled: Boolean = js.native
  var SpecularTextureEnabled: Boolean = js.native
  var BumpTextureEnabled: Boolean = js.native
  var FresnelEnabled: Boolean = js.native
}

@js.native
@JSName("BABYLON.Color3")
class Color3 protected () extends js.Object {
  def this(r: Double, g: Double, b: Double) = this()
  var r: Double = js.native
  var g: Double = js.native
  var b: Double = js.native
  override def toString(): String = js.native
  def toArray(array: js.Array[Double], index: Double): Color3 = js.native
  def toColor4(alpha: Double): Color4 = js.native
  def asArray(): js.Array[Double] = js.native
  def toLuminance(): Double = js.native
  def multiply(otherColor: Color3): Color3 = js.native
  def multiplyToRef(otherColor: Color3, result: Color3): Color3 = js.native
  def equals(otherColor: Color3): Boolean = js.native
  def equalsFloats(r: Double, g: Double, b: Double): Boolean = js.native
  def scale(scale: Double): Color3 = js.native
  def scaleToRef(scale: Double, result: Color3): Color3 = js.native
  def add(otherColor: Color3): Color3 = js.native
  def addToRef(otherColor: Color3, result: Color3): Color3 = js.native
  def subtract(otherColor: Color3): Color3 = js.native
  def subtractToRef(otherColor: Color3, result: Color3): Color3 = js.native
  override def clone(): Color3 = js.native
  def copyFrom(source: Color3): Color3 = js.native
  def copyFromFloats(r: Double, g: Double, b: Double): Color3 = js.native
  def toHexString(): String = js.native
}

@js.native
@JSName("BABYLON.Color3")
object Color3 extends js.Object {
  def FromHexString(hex: String): Color3 = js.native
  def FromArray(array: js.Array[Double], offset: Double): Color3 = js.native
  def FromInts(r: Double, g: Double, b: Double): Color3 = js.native
  def Lerp(start: Color3, end: Color3, amount: Double): Color3 = js.native
  def Red(): Color3 = js.native
  def Green(): Color3 = js.native
  def Blue(): Color3 = js.native
  def Black(): Color3 = js.native
  def White(): Color3 = js.native
  def Purple(): Color3 = js.native
  def Magenta(): Color3 = js.native
  def Yellow(): Color3 = js.native
  def Gray(): Color3 = js.native
}

@js.native
@JSName("BABYLON.Color4")
class Color4 protected () extends js.Object {
  def this(r: Double, g: Double, b: Double, a: Double) = this()
  var r: Double = js.native
  var g: Double = js.native
  var b: Double = js.native
  var a: Double = js.native
  def addInPlace(right: js.Any): Color4 = js.native
  def asArray(): js.Array[Double] = js.native
  def toArray(array: js.Array[Double], index: Double): Color4 = js.native
  def add(right: Color4): Color4 = js.native
  def subtract(right: Color4): Color4 = js.native
  def subtractToRef(right: Color4, result: Color4): Color4 = js.native
  def scale(scale: Double): Color4 = js.native
  def scaleToRef(scale: Double, result: Color4): Color4 = js.native
  override def toString(): String = js.native
  override def clone(): Color4 = js.native
  def copyFrom(source: Color4): Color4 = js.native
  def toHexString(): String = js.native
}

@js.native
@JSName("BABYLON.Color4")
object Color4 extends js.Object {
  def FromHexString(hex: String): Color4 = js.native
  def Lerp(left: Color4, right: Color4, amount: Double): Color4 = js.native
  def LerpToRef(left: Color4, right: Color4, amount: Double, result: Color4): Unit = js.native
  def FromArray(array: js.Array[Double], offset: Double): Color4 = js.native
  def FromInts(r: Double, g: Double, b: Double, a: Double): Color4 = js.native
}

@js.native
@JSName("BABYLON.Vector2")
class Vector2 protected () extends js.Object {
  def this(x: Double, y: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  override def toString(): String = js.native
  def toArray(array: js.Array[Double], index: Double): Vector2 = js.native
  def asArray(): js.Array[Double] = js.native
  def copyFrom(source: Vector2): Vector2 = js.native
  def copyFromFloats(x: Double, y: Double): Vector2 = js.native
  def add(otherVector: Vector2): Vector2 = js.native
  def addVector3(otherVector: Vector3): Vector2 = js.native
  def subtract(otherVector: Vector2): Vector2 = js.native
  def subtractInPlace(otherVector: Vector2): Vector2 = js.native
  def multiplyInPlace(otherVector: Vector2): Vector2 = js.native
  def multiply(otherVector: Vector2): Vector2 = js.native
  def multiplyToRef(otherVector: Vector2, result: Vector2): Vector2 = js.native
  def multiplyByFloats(x: Double, y: Double): Vector2 = js.native
  def divide(otherVector: Vector2): Vector2 = js.native
  def divideToRef(otherVector: Vector2, result: Vector2): Vector2 = js.native
  def negate(): Vector2 = js.native
  def scaleInPlace(scale: Double): Vector2 = js.native
  def scale(scale: Double): Vector2 = js.native
  def equals(otherVector: Vector2): Boolean = js.native
  def equalsWithEpsilon(otherVector: Vector2, epsilon: Double): Boolean = js.native
  def length(): Double = js.native
  def lengthSquared(): Double = js.native
  def normalize(): Vector2 = js.native
  override def clone(): Vector2 = js.native
}

@js.native
@JSName("BABYLON.Vector2")
object Vector2 extends js.Object {
  def Zero(): Vector2 = js.native
  def FromArray(array: js.Array[Double], offset: Double): Vector2 = js.native
  def FromArrayToRef(array: js.Array[Double], offset: Double, result: Vector2): Unit = js.native
  def CatmullRom(value1: Vector2, value2: Vector2, value3: Vector2, value4: Vector2, amount: Double): Vector2 = js.native
  def Clamp(value: Vector2, min: Vector2, max: Vector2): Vector2 = js.native
  def Hermite(value1: Vector2, tangent1: Vector2, value2: Vector2, tangent2: Vector2, amount: Double): Vector2 = js.native
  def Lerp(start: Vector2, end: Vector2, amount: Double): Vector2 = js.native
  def Dot(left: Vector2, right: Vector2): Double = js.native
  def Normalize(vector: Vector2): Vector2 = js.native
  def Minimize(left: Vector2, right: Vector2): Vector2 = js.native
  def Maximize(left: Vector2, right: Vector2): Vector2 = js.native
  def Transform(vector: Vector2, transformation: Matrix): Vector2 = js.native
  def Distance(value1: Vector2, value2: Vector2): Double = js.native
  def DistanceSquared(value1: Vector2, value2: Vector2): Double = js.native
}

@js.native
@JSName("BABYLON.Vector3")
class Vector3 protected () extends js.Object {
  def this(x: Double, y: Double, z: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  override def toString(): String = js.native
  def asArray(): js.Array[Double] = js.native
  def toArray(array: js.Array[Double], index: Double): Vector3 = js.native
  def toQuaternion(): Quaternion = js.native
  def addInPlace(otherVector: Vector3): Vector3 = js.native
  def add(otherVector: Vector3): Vector3 = js.native
  def addToRef(otherVector: Vector3, result: Vector3): Vector3 = js.native
  def subtractInPlace(otherVector: Vector3): Vector3 = js.native
  def subtract(otherVector: Vector3): Vector3 = js.native
  def subtractToRef(otherVector: Vector3, result: Vector3): Vector3 = js.native
  def subtractFromFloats(x: Double, y: Double, z: Double): Vector3 = js.native
  def subtractFromFloatsToRef(x: Double, y: Double, z: Double, result: Vector3): Vector3 = js.native
  def negate(): Vector3 = js.native
  def scaleInPlace(scale: Double): Vector3 = js.native
  def scale(scale: Double): Vector3 = js.native
  def scaleToRef(scale: Double, result: Vector3): Unit = js.native
  def equals(otherVector: Vector3): Boolean = js.native
  def equalsWithEpsilon(otherVector: Vector3, epsilon: Double): Boolean = js.native
  def equalsToFloats(x: Double, y: Double, z: Double): Boolean = js.native
  def multiplyInPlace(otherVector: Vector3): Vector3 = js.native
  def multiply(otherVector: Vector3): Vector3 = js.native
  def multiplyToRef(otherVector: Vector3, result: Vector3): Vector3 = js.native
  def multiplyByFloats(x: Double, y: Double, z: Double): Vector3 = js.native
  def divide(otherVector: Vector3): Vector3 = js.native
  def divideToRef(otherVector: Vector3, result: Vector3): Vector3 = js.native
  def MinimizeInPlace(other: Vector3): Vector3 = js.native
  def MaximizeInPlace(other: Vector3): Vector3 = js.native
  def length(): Double = js.native
  def lengthSquared(): Double = js.native
  def normalize(): Vector3 = js.native
  override def clone(): Vector3 = js.native
  def copyFrom(source: Vector3): Vector3 = js.native
  def copyFromFloats(x: Double, y: Double, z: Double): Vector3 = js.native
}

@js.native
@JSName("BABYLON.Vector3")
object Vector3 extends js.Object {
  def GetClipFactor(vector0: Vector3, vector1: Vector3, axis: Vector3, size: js.Any): Double = js.native
  def FromArray(array: js.Array[Double], offset: Double): Vector3 = js.native
  def FromFloatArray(array: Float32Array, offset: Double): Vector3 = js.native
  def FromArrayToRef(array: js.Array[Double], offset: Double, result: Vector3): Unit = js.native
  def FromFloatArrayToRef(array: Float32Array, offset: Double, result: Vector3): Unit = js.native
  def FromFloatsToRef(x: Double, y: Double, z: Double, result: Vector3): Unit = js.native
  def Zero(): Vector3 = js.native
  def Up(): Vector3 = js.native
  def TransformCoordinates(vector: Vector3, transformation: Matrix): Vector3 = js.native
  def TransformCoordinatesToRef(vector: Vector3, transformation: Matrix, result: Vector3): Unit = js.native
  def TransformCoordinatesFromFloatsToRef(x: Double, y: Double, z: Double, transformation: Matrix, result: Vector3): Unit = js.native
  def TransformCoordinatesToRefSIMD(vector: Vector3, transformation: Matrix, result: Vector3): Unit = js.native
  def TransformCoordinatesFromFloatsToRefSIMD(x: Double, y: Double, z: Double, transformation: Matrix, result: Vector3): Unit = js.native
  def TransformNormal(vector: Vector3, transformation: Matrix): Vector3 = js.native
  def TransformNormalToRef(vector: Vector3, transformation: Matrix, result: Vector3): Unit = js.native
  def TransformNormalFromFloatsToRef(x: Double, y: Double, z: Double, transformation: Matrix, result: Vector3): Unit = js.native
  def CatmullRom(value1: Vector3, value2: Vector3, value3: Vector3, value4: Vector3, amount: Double): Vector3 = js.native
  def Clamp(value: Vector3, min: Vector3, max: Vector3): Vector3 = js.native
  def Hermite(value1: Vector3, tangent1: Vector3, value2: Vector3, tangent2: Vector3, amount: Double): Vector3 = js.native
  def Lerp(start: Vector3, end: Vector3, amount: Double): Vector3 = js.native
  def Dot(left: Vector3, right: Vector3): Double = js.native
  def Cross(left: Vector3, right: Vector3): Vector3 = js.native
  def CrossToRef(left: Vector3, right: Vector3, result: Vector3): Unit = js.native
  def Normalize(vector: Vector3): Vector3 = js.native
  def NormalizeToRef(vector: Vector3, result: Vector3): Unit = js.native
  def Project(vector: Vector3, world: Matrix, transform: Matrix, viewport: Viewport): Vector3 = js.native
  def UnprojectFromTransform(source: Vector3, viewportWidth: Double, viewportHeight: Double, world: Matrix, transform: Matrix): Vector3 = js.native
  def Unproject(source: Vector3, viewportWidth: Double, viewportHeight: Double, world: Matrix, view: Matrix, projection: Matrix): Vector3 = js.native
  def Minimize(left: Vector3, right: Vector3): Vector3 = js.native
  def Maximize(left: Vector3, right: Vector3): Vector3 = js.native
  def Distance(value1: Vector3, value2: Vector3): Double = js.native
  def DistanceSquared(value1: Vector3, value2: Vector3): Double = js.native
  def Center(value1: Vector3, value2: Vector3): Vector3 = js.native
  def RotationFromAxis(axis1: Vector3, axis2: Vector3, axis3: Vector3): Vector3 = js.native
  def RotationFromAxisToRef(axis1: Vector3, axis2: Vector3, axis3: Vector3, ref: Vector3): Unit = js.native
}

@js.native
@JSName("BABYLON.Vector4")
class Vector4 protected () extends js.Object {
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  var w: Double = js.native
  override def toString(): String = js.native
  def asArray(): js.Array[Double] = js.native
  def toArray(array: js.Array[Double], index: Double): Vector4 = js.native
  def addInPlace(otherVector: Vector4): Vector4 = js.native
  def add(otherVector: Vector4): Vector4 = js.native
  def addToRef(otherVector: Vector4, result: Vector4): Vector4 = js.native
  def subtractInPlace(otherVector: Vector4): Vector4 = js.native
  def subtract(otherVector: Vector4): Vector4 = js.native
  def subtractToRef(otherVector: Vector4, result: Vector4): Vector4 = js.native
  def subtractFromFloats(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
  def subtractFromFloatsToRef(x: Double, y: Double, z: Double, w: Double, result: Vector4): Vector4 = js.native
  def negate(): Vector4 = js.native
  def scaleInPlace(scale: Double): Vector4 = js.native
  def scale(scale: Double): Vector4 = js.native
  def scaleToRef(scale: Double, result: Vector4): Unit = js.native
  def equals(otherVector: Vector4): Boolean = js.native
  def equalsWithEpsilon(otherVector: Vector4, epsilon: Double): Boolean = js.native
  def equalsToFloats(x: Double, y: Double, z: Double, w: Double): Boolean = js.native
  def multiplyInPlace(otherVector: Vector4): Vector4 = js.native
  def multiply(otherVector: Vector4): Vector4 = js.native
  def multiplyToRef(otherVector: Vector4, result: Vector4): Vector4 = js.native
  def multiplyByFloats(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
  def divide(otherVector: Vector4): Vector4 = js.native
  def divideToRef(otherVector: Vector4, result: Vector4): Vector4 = js.native
  def MinimizeInPlace(other: Vector4): Vector4 = js.native
  def MaximizeInPlace(other: Vector4): Vector4 = js.native
  def length(): Double = js.native
  def lengthSquared(): Double = js.native
  def normalize(): Vector4 = js.native
  override def clone(): Vector4 = js.native
  def copyFrom(source: Vector4): Vector4 = js.native
  def copyFromFloats(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
}

@js.native
@JSName("BABYLON.Vector4")
object Vector4 extends js.Object {
  def FromArray(array: js.Array[Double], offset: Double): Vector4 = js.native
  def FromArrayToRef(array: js.Array[Double], offset: Double, result: Vector4): Unit = js.native
  def FromFloatArrayToRef(array: Float32Array, offset: Double, result: Vector4): Unit = js.native
  def FromFloatsToRef(x: Double, y: Double, z: Double, w: Double, result: Vector4): Unit = js.native
  def Zero(): Vector4 = js.native
  def Normalize(vector: Vector4): Vector4 = js.native
  def NormalizeToRef(vector: Vector4, result: Vector4): Unit = js.native
  def Minimize(left: Vector4, right: Vector4): Vector4 = js.native
  def Maximize(left: Vector4, right: Vector4): Vector4 = js.native
  def Distance(value1: Vector4, value2: Vector4): Double = js.native
  def DistanceSquared(value1: Vector4, value2: Vector4): Double = js.native
  def Center(value1: Vector4, value2: Vector4): Vector4 = js.native
}

@js.native
@JSName("BABYLON.Quaternion")
class Quaternion protected () extends js.Object {
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  var w: Double = js.native
  override def toString(): String = js.native
  def asArray(): js.Array[Double] = js.native
  def equals(otherQuaternion: Quaternion): Boolean = js.native
  override def clone(): Quaternion = js.native
  def copyFrom(other: Quaternion): Quaternion = js.native
  def copyFromFloats(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
  def add(other: Quaternion): Quaternion = js.native
  def subtract(other: Quaternion): Quaternion = js.native
  def scale(value: Double): Quaternion = js.native
  def multiply(q1: Quaternion): Quaternion = js.native
  def multiplyToRef(q1: Quaternion, result: Quaternion): Quaternion = js.native
  def length(): Double = js.native
  def normalize(): Quaternion = js.native
  def toEulerAngles(): Vector3 = js.native
  def toEulerAnglesToRef(result: Vector3): Quaternion = js.native
  def toRotationMatrix(result: Matrix): Quaternion = js.native
  def fromRotationMatrix(matrix: Matrix): Quaternion = js.native
}

@js.native
@JSName("BABYLON.Quaternion")
object Quaternion extends js.Object {
  def FromRotationMatrix(matrix: Matrix): Quaternion = js.native
  def FromRotationMatrixToRef(matrix: Matrix, result: Quaternion): Unit = js.native
  def Inverse(q: Quaternion): Quaternion = js.native
  def Identity(): Quaternion = js.native
  def RotationAxis(axis: Vector3, angle: Double): Quaternion = js.native
  def FromArray(array: js.Array[Double], offset: Double): Quaternion = js.native
  def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): Quaternion = js.native
  def RotationYawPitchRollToRef(yaw: Double, pitch: Double, roll: Double, result: Quaternion): Unit = js.native
  def RotationAlphaBetaGamma(alpha: Double, beta: Double, gamma: Double): Quaternion = js.native
  def RotationAlphaBetaGammaToRef(alpha: Double, beta: Double, gamma: Double, result: Quaternion): Unit = js.native
  def Slerp(left: Quaternion, right: Quaternion, amount: Double): Quaternion = js.native
}

@js.native
@JSName("BABYLON.Matrix")
class Matrix extends js.Object {
  var m: Float32Array = js.native
  def isIdentity(): Boolean = js.native
  def determinant(): Double = js.native
  def toArray(): Float32Array = js.native
  def asArray(): Float32Array = js.native
  def invert(): Matrix = js.native
  def reset(): Matrix = js.native
  def add(other: Matrix): Matrix = js.native
  def addToRef(other: Matrix, result: Matrix): Matrix = js.native
  def addToSelf(other: Matrix): Matrix = js.native
  def invertToRef(other: Matrix): Matrix = js.native
  def invertToRefSIMD(other: Matrix): Matrix = js.native
  def setTranslation(vector3: Vector3): Matrix = js.native
  def multiply(other: Matrix): Matrix = js.native
  def copyFrom(other: Matrix): Matrix = js.native
  def copyToArray(array: Float32Array, offset: Double): Matrix = js.native
  def multiplyToRef(other: Matrix, result: Matrix): Matrix = js.native
  def multiplyToArray(other: Matrix, result: Float32Array, offset: Double): Matrix = js.native
  def multiplyToArraySIMD(other: Matrix, result: Matrix, offset: Double): Unit = js.native
  def equals(value: Matrix): Boolean = js.native
  override def clone(): Matrix = js.native
  def decompose(scale: Vector3, rotation: Quaternion, translation: Vector3): Boolean = js.native
}

@js.native
@JSName("BABYLON.Matrix")
object Matrix extends js.Object {
  def FromArray(array: js.Array[Double], offset: Double): Matrix = js.native
  def FromArrayToRef(array: js.Array[Double], offset: Double, result: Matrix): Unit = js.native
  def FromFloat32ArrayToRefScaled(array: Float32Array, offset: Double, scale: Double, result: Matrix): Unit = js.native
  def FromValuesToRef(initialM11: Double, initialM12: Double, initialM13: Double, initialM14: Double, initialM21: Double, initialM22: Double, initialM23: Double, initialM24: Double, initialM31: Double, initialM32: Double, initialM33: Double, initialM34: Double, initialM41: Double, initialM42: Double, initialM43: Double, initialM44: Double, result: Matrix): Unit = js.native
  def FromValues(initialM11: Double, initialM12: Double, initialM13: Double, initialM14: Double, initialM21: Double, initialM22: Double, initialM23: Double, initialM24: Double, initialM31: Double, initialM32: Double, initialM33: Double, initialM34: Double, initialM41: Double, initialM42: Double, initialM43: Double, initialM44: Double): Matrix = js.native
  def Compose(scale: Vector3, rotation: Quaternion, translation: Vector3): Matrix = js.native
  def Identity(): Matrix = js.native
  def IdentityToRef(result: Matrix): Unit = js.native
  def Zero(): Matrix = js.native
  def RotationX(angle: Double): Matrix = js.native
  def Invert(source: Matrix): Matrix = js.native
  def RotationXToRef(angle: Double, result: Matrix): Unit = js.native
  def RotationY(angle: Double): Matrix = js.native
  def RotationYToRef(angle: Double, result: Matrix): Unit = js.native
  def RotationZ(angle: Double): Matrix = js.native
  def RotationZToRef(angle: Double, result: Matrix): Unit = js.native
  def RotationAxis(axis: Vector3, angle: Double): Matrix = js.native
  def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): Matrix = js.native
  def RotationYawPitchRollToRef(yaw: Double, pitch: Double, roll: Double, result: Matrix): Unit = js.native
  def Scaling(x: Double, y: Double, z: Double): Matrix = js.native
  def ScalingToRef(x: Double, y: Double, z: Double, result: Matrix): Unit = js.native
  def Translation(x: Double, y: Double, z: Double): Matrix = js.native
  def TranslationToRef(x: Double, y: Double, z: Double, result: Matrix): Unit = js.native
  def LookAtLH(eye: Vector3, target: Vector3, up: Vector3): Matrix = js.native
  def LookAtLHToRef(eye: Vector3, target: Vector3, up: Vector3, result: Matrix): Unit = js.native
  def LookAtLHToRefSIMD(eyeRef: Vector3, targetRef: Vector3, upRef: Vector3, result: Matrix): Unit = js.native
  def OrthoLH(width: Double, height: Double, znear: Double, zfar: Double): Matrix = js.native
  def OrthoLHToRef(width: Double, height: Double, znear: Double, zfar: Double, result: Matrix): Unit = js.native
  def OrthoOffCenterLH(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Matrix = js.native
  def OrthoOffCenterLHToRef(left: Double, right: js.Any, bottom: Double, top: Double, znear: Double, zfar: Double, result: Matrix): Unit = js.native
  def PerspectiveLH(width: Double, height: Double, znear: Double, zfar: Double): Matrix = js.native
  def PerspectiveFovLH(fov: Double, aspect: Double, znear: Double, zfar: Double): Matrix = js.native
  def PerspectiveFovLHToRef(fov: Double, aspect: Double, znear: Double, zfar: Double, result: Matrix, fovMode: Double): Unit = js.native
  def GetFinalMatrix(viewport: Viewport, world: Matrix, view: Matrix, projection: Matrix, zmin: Double, zmax: Double): Matrix = js.native
  def GetAsMatrix2x2(matrix: Matrix): Float32Array = js.native
  def GetAsMatrix3x3(matrix: Matrix): Float32Array = js.native
  def Transpose(matrix: Matrix): Matrix = js.native
  def Reflection(plane: Plane): Matrix = js.native
  def ReflectionToRef(plane: Plane, result: Matrix): Unit = js.native
}

@js.native
@JSName("BABYLON.Plane")
class Plane protected () extends js.Object {
  def this(a: Double, b: Double, c: Double, d: Double) = this()
  var normal: Vector3 = js.native
  var d: Double = js.native
  def asArray(): js.Array[Double] = js.native
  override def clone(): Plane = js.native
  def normalize(): Plane = js.native
  def transform(transformation: Matrix): Plane = js.native
  def dotCoordinate(point: js.Any): Double = js.native
  def copyFromPoints(point1: Vector3, point2: Vector3, point3: Vector3): Plane = js.native
  def isFrontFacingTo(direction: Vector3, epsilon: Double): Boolean = js.native
  def signedDistanceTo(point: Vector3): Double = js.native
  def this(id: String, scene: Scene, size: Double, canBeRegenerated: Boolean, mesh: Mesh, side: Double) = this()
  var size: Double = js.native
  var side: Double = js.native
  def _regenerateVertexData(): VertexData = js.native
  def copy(id: String): Geometry = js.native
}

@js.native
@JSName("BABYLON.Plane")
object Plane extends js.Object {
  def FromArray(array: js.Array[Double]): Plane = js.native
  def FromPoints(point1: js.Any, point2: js.Any, point3: js.Any): Plane = js.native
  def FromPositionAndNormal(origin: Vector3, normal: Vector3): Plane = js.native
  def SignedDistanceToPlaneFromPositionAndNormal(origin: Vector3, normal: Vector3, point: Vector3): Double = js.native
}

@js.native
@JSName("BABYLON.Viewport")
class Viewport protected () extends js.Object {
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  def toGlobal(engine: js.Any): Viewport = js.native
}

@js.native
@JSName("BABYLON.Frustum")
class Frustum extends js.Object {
}

@js.native
@JSName("BABYLON.Frustum")
object Frustum extends js.Object {
  def GetPlanes(transform: Matrix): js.Array[Plane] = js.native
  def GetPlanesToRef(transform: Matrix, frustumPlanes: js.Array[Plane]): Unit = js.native
}

@js.native
@JSName("BABYLON.Ray")
class Ray protected () extends js.Object {
  def this(origin: Vector3, direction: Vector3, length: Double) = this()
  var origin: Vector3 = js.native
  var direction: Vector3 = js.native
  var length: Double = js.native
  def intersectsBoxMinMax(minimum: Vector3, maximum: Vector3): Boolean = js.native
  def intersectsBox(box: BoundingBox): Boolean = js.native
  def intersectsSphere(sphere: js.Any): Boolean = js.native
  def intersectsTriangle(vertex0: Vector3, vertex1: Vector3, vertex2: Vector3): IntersectionInfo = js.native
}

@js.native
@JSName("BABYLON.Ray")
object Ray extends js.Object {
  def CreateNew(x: Double, y: Double, viewportWidth: Double, viewportHeight: Double, world: Matrix, view: Matrix, projection: Matrix): Ray = js.native
  def CreateNewFromTo(origin: Vector3, end: Vector3, world: Matrix): Ray = js.native
  def Transform(ray: Ray, matrix: Matrix): Ray = js.native
}

@js.native
sealed trait Space extends js.Object {
}

@js.native
@JSName("BABYLON.Space")
object Space extends js.Object {
  var LOCAL: Space = js.native
  var WORLD: Space = js.native
  @JSBracketAccess
  def apply(value: Space): String = js.native
}

@js.native
@JSName("BABYLON.Axis")
class Axis extends js.Object {
}

@js.native
@JSName("BABYLON.Axis")
object Axis extends js.Object {
  var X: Vector3 = js.native
  var Y: Vector3 = js.native
  var Z: Vector3 = js.native
}

@js.native
@JSName("BABYLON.BezierCurve")
class BezierCurve extends js.Object {
}

@js.native
@JSName("BABYLON.BezierCurve")
object BezierCurve extends js.Object {
  def interpolate(t: Double, x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
}

@js.native
sealed trait Orientation extends js.Object {
}

@js.native
@JSName("BABYLON.Orientation")
object Orientation extends js.Object {
  var CW: Orientation = js.native
  var CCW: Orientation = js.native
  @JSBracketAccess
  def apply(value: Orientation): String = js.native
}

@js.native
@JSName("BABYLON.Angle")
class Angle protected () extends js.Object {
  def this(radians: Double) = this()
  var degrees: js.Function0[Double] = js.native
  var radians: js.Function0[Double] = js.native
}

@js.native
@JSName("BABYLON.Angle")
object Angle extends js.Object {
  def BetweenTwoPoints(a: Vector2, b: Vector2): Angle = js.native
  def FromRadians(radians: Double): Angle = js.native
  def FromDegrees(degrees: Double): Angle = js.native
}

@js.native
@JSName("BABYLON.Arc2")
class Arc2 protected () extends js.Object {
  def this(startPoint: Vector2, midPoint: Vector2, endPoint: Vector2) = this()
  var startPoint: Vector2 = js.native
  var midPoint: Vector2 = js.native
  var endPoint: Vector2 = js.native
  var centerPoint: Vector2 = js.native
  var radius: Double = js.native
  var angle: Angle = js.native
  var startAngle: Angle = js.native
  var orientation: Orientation = js.native
}

@js.native
@JSName("BABYLON.PathCursor")
class PathCursor protected () extends js.Object {
  def this(path: Path2) = this()
  var value: Double = js.native
  var animations: js.Array[Animation] = js.native
  def getPoint(): Vector3 = js.native
  def moveAhead(step: Double): PathCursor = js.native
  def moveBack(step: Double): PathCursor = js.native
  def move(step: Double): PathCursor = js.native
  def onchange(f: js.Function1[PathCursor, Unit]): PathCursor = js.native
}

@js.native
@JSName("BABYLON.Path2")
class Path2 protected () extends js.Object {
  def this(x: Double, y: Double) = this()
  var closed: Boolean = js.native
  def addLineTo(x: Double, y: Double): Path2 = js.native
  def addArcTo(midX: Double, midY: Double, endX: Double, endY: Double, numberOfSegments: Double): Path2 = js.native
  def close(): Path2 = js.native
  def length(): Double = js.native
  def getPoints(): js.Array[Vector2] = js.native
  def getPointAtLengthPosition(normalizedLengthPosition: Double): Vector2 = js.native
}

@js.native
@JSName("BABYLON.Path2")
object Path2 extends js.Object {
  def StartingAt(x: Double, y: Double): Path2 = js.native
}

@js.native
@JSName("BABYLON.Path3D")
class Path3D protected () extends js.Object {
  def this(path: js.Array[Vector3], firstNormal: Vector3, raw: Boolean) = this()
  var path: js.Array[Vector3] = js.native
  def getCurve(): js.Array[Vector3] = js.native
  def getTangents(): js.Array[Vector3] = js.native
  def getNormals(): js.Array[Vector3] = js.native
  def getBinormals(): js.Array[Vector3] = js.native
  def getDistances(): js.Array[Double] = js.native
  def update(path: js.Array[Vector3], firstNormal: Vector3): Path3D = js.native
}

@js.native
@JSName("BABYLON.Curve3")
class Curve3 protected () extends js.Object {
  def this(points: js.Array[Vector3]) = this()
  def getPoints(): js.Array[Vector3] = js.native
  def length(): Double = js.native
  def continue(curve: Curve3): Curve3 = js.native
}

@js.native
@JSName("BABYLON.Curve3")
object Curve3 extends js.Object {
  def CreateQuadraticBezier(v0: Vector3, v1: Vector3, v2: Vector3, nbPoints: Double): Curve3 = js.native
  def CreateCubicBezier(v0: Vector3, v1: Vector3, v2: Vector3, v3: Vector3, nbPoints: Double): Curve3 = js.native
  def CreateHermiteSpline(p1: Vector3, t1: Vector3, p2: Vector3, t2: Vector3, nbPoints: Double): Curve3 = js.native
}

@js.native
@JSName("BABYLON.PositionNormalVertex")
class PositionNormalVertex protected () extends js.Object {
  def this(position: Vector3, normal: Vector3) = this()
  var position: Vector3 = js.native
  var normal: Vector3 = js.native
  override def clone(): PositionNormalVertex = js.native
}

@js.native
@JSName("BABYLON.PositionNormalTextureVertex")
class PositionNormalTextureVertex protected () extends js.Object {
  def this(position: Vector3, normal: Vector3, uv: Vector2) = this()
  var position: Vector3 = js.native
  var normal: Vector3 = js.native
  var uv: Vector2 = js.native
  override def clone(): PositionNormalTextureVertex = js.native
}

@js.native
@JSName("BABYLON.SIMDHelper")
class SIMDHelper extends js.Object {
}

@js.native
@JSName("BABYLON.SIMDHelper")
object SIMDHelper extends js.Object {
  var IsEnabled: Boolean = js.native
  def DisableSIMD(): Unit = js.native
  def EnableSIMD(): Unit = js.native
}

@js.native
@JSName("BABYLON.AbstractMesh")
class AbstractMesh protected () extends Node with IDisposable {
  def this(name: String, scene: Scene) = this()
  var definedFacingForward: Boolean = js.native
  var position: Vector3 = js.native
  var rotation: Vector3 = js.native
  var rotationQuaternion: Quaternion = js.native
  var scaling: Vector3 = js.native
  var billboardMode: Double = js.native
  var visibility: Double = js.native
  var alphaIndex: Double = js.native
  var infiniteDistance: Boolean = js.native
  var isVisible: Boolean = js.native
  var isPickable: Boolean = js.native
  var showBoundingBox: Boolean = js.native
  var showSubMeshesBoundingBox: Boolean = js.native
  var onDispose: js.Any = js.native
  var isBlocker: Boolean = js.native
  var skeleton: Skeleton = js.native
  var renderingGroupId: Double = js.native
  var material: Material = js.native
  var receiveShadows: Boolean = js.native
  var actionManager: ActionManager = js.native
  var renderOutline: Boolean = js.native
  var outlineColor: Color3 = js.native
  var outlineWidth: Double = js.native
  var renderOverlay: Boolean = js.native
  var overlayColor: Color3 = js.native
  var overlayAlpha: Double = js.native
  var hasVertexAlpha: Boolean = js.native
  var useVertexColors: Boolean = js.native
  var applyFog: Boolean = js.native
  var computeBonesUsingShaders: Boolean = js.native
  var useOctreeForRenderingSelection: Boolean = js.native
  var useOctreeForPicking: Boolean = js.native
  var useOctreeForCollisions: Boolean = js.native
  var layerMask: Double = js.native
  var alwaysSelectAsActiveMesh: Boolean = js.native
  var _physicImpostor: Double = js.native
  var _physicsMass: Double = js.native
  var _physicsFriction: Double = js.native
  var _physicRestitution: Double = js.native
  var ellipsoid: Vector3 = js.native
  var ellipsoidOffset: Vector3 = js.native
  var onCollide: js.Function1[AbstractMesh, Unit] = js.native
  var edgesWidth: Double = js.native
  var edgesColor: Color4 = js.native
  var _edgesRenderer: EdgesRenderer = js.native
  var _worldMatrix: Matrix = js.native
  var _positions: js.Array[Vector3] = js.native
  var _masterMesh: AbstractMesh = js.native
  var _boundingInfo: BoundingInfo = js.native
  var _isDisposed: Boolean = js.native
  var _renderId: Double = js.native
  var subMeshes: js.Array[SubMesh] = js.native
  var _submeshesOctree: Octree[SubMesh] = js.native
  var _intersectionsInProgress: js.Array[AbstractMesh] = js.native
  var _waitingActions: js.Any = js.native
  var _waitingFreezeWorldMatrix: Boolean = js.native
  def disableEdgesRendering(): Unit = js.native
  def enableEdgesRendering(epsilon: Double, checkVerticesInsteadOfIndices: Boolean): Unit = js.native
  var isBlocked: Boolean = js.native
  def getLOD(camera: Camera): AbstractMesh = js.native
  def getTotalVertices(): Double = js.native
  def getIndices(): js.Array[Double] = js.native
  def getVerticesData(kind: String): js.Array[Double] = js.native
// FIXME - removed this for now
//  def isVerticesDataPresent(kind: String): Boolean = js.native
  def getBoundingInfo(): BoundingInfo = js.native
  var useBones: Boolean = js.native
  def _preActivate(): Unit = js.native
  def _activate(renderId: Double): Unit = js.native
  //def getWorldMatrix(): Matrix = js.native
  var worldMatrixFromCache: Matrix = js.native
  var absolutePosition: Vector3 = js.native
  def freezeWorldMatrix(): Unit = js.native
  def unfreezeWorldMatrix(): Unit = js.native
  var isWorldMatrixFrozen: Boolean = js.native
  def rotate(axis: Vector3, amount: Double, space: Space): Unit = js.native
  def translate(axis: Vector3, distance: Double, space: Space): Unit = js.native
  def getAbsolutePosition(): Vector3 = js.native
  def setAbsolutePosition(absolutePosition: Vector3): Unit = js.native
  def movePOV(amountRight: Double, amountUp: Double, amountForward: Double): Unit = js.native
  def calcMovePOV(amountRight: Double, amountUp: Double, amountForward: Double): Vector3 = js.native
  def rotatePOV(flipBack: Double, twirlClockwise: Double, tiltRight: Double): Unit = js.native
  def calcRotatePOV(flipBack: Double, twirlClockwise: Double, tiltRight: Double): Vector3 = js.native
  def setPivotMatrix(matrix: Matrix): Unit = js.native
  def getPivotMatrix(): Matrix = js.native
//  def _isSynchronized(): Boolean = js.native
//  def _initCache(): Unit = js.native
  def markAsDirty(property: String): Unit = js.native
  def _updateBoundingInfo(): Unit = js.native
  def _updateSubMeshesBoundingInfo(matrix: Matrix): Unit = js.native
  def computeWorldMatrix(force: Boolean): Matrix = js.native
  def registerAfterWorldMatrixUpdate(func: js.Function1[AbstractMesh, Unit]): Unit = js.native
  def unregisterAfterWorldMatrixUpdate(func: js.Function1[AbstractMesh, Unit]): Unit = js.native
  def setPositionWithLocalVector(vector3: Vector3): Unit = js.native
  def getPositionExpressedInLocalSpace(): Vector3 = js.native
  def locallyTranslate(vector3: Vector3): Unit = js.native
  def lookAt(targetPoint: Vector3, yawCor: Double, pitchCor: Double, rollCor: Double): Unit = js.native
  def attachToBone(bone: Bone, affectedMesh: AbstractMesh): Unit = js.native
  def detachFromBone(): Unit = js.native
  def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  def isCompletelyInFrustum(camera: Camera): Boolean = js.native
  def intersectsMesh(mesh: AbstractMesh, precise: Boolean): Boolean = js.native
  def intersectsPoint(point: Vector3): Boolean = js.native
  def setPhysicsState(impostor: js.Any, options: PhysicsBodyCreationOptions): js.Dynamic = js.native
  def getPhysicsImpostor(): Double = js.native
  def getPhysicsMass(): Double = js.native
  def getPhysicsFriction(): Double = js.native
  def getPhysicsRestitution(): Double = js.native
  def getPositionInCameraSpace(camera: Camera): Vector3 = js.native
  def getDistanceToCamera(camera: Camera): Double = js.native
  def applyImpulse(force: Vector3, contactPoint: Vector3): Unit = js.native
  def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3, options: js.Any): Unit = js.native
  def updatePhysicsBodyPosition(): Unit = js.native
  var checkCollisions: Boolean = js.native
  def moveWithCollisions(velocity: Vector3): Unit = js.native
  def createOrUpdateSubmeshesOctree(maxCapacity: Double, maxDepth: Double): Octree[SubMesh] = js.native
  def _collideForSubMesh(subMesh: SubMesh, transformMatrix: Matrix, collider: Collider): Unit = js.native
  def _processCollisionsForSubMeshes(collider: Collider, transformMatrix: Matrix): Unit = js.native
  def _checkCollision(collider: Collider): Unit = js.native
  def _generatePointsArray(): Boolean = js.native
  def intersects(ray: Ray, fastCheck: Boolean): PickingInfo = js.native
  def clone(name: String, newParent: Node, doNotCloneChildren: Boolean): AbstractMesh = js.native
  def releaseSubMeshes(): Unit = js.native
  def dispose(doNotRecurse: Boolean): Unit = js.native
}

@js.native
@JSName("BABYLON.AbstractMesh")
object AbstractMesh extends js.Object {
  var BILLBOARDMODE_NONE: Double = js.native
  var BILLBOARDMODE_X: Double = js.native
  var BILLBOARDMODE_Y: Double = js.native
  var BILLBOARDMODE_Z: Double = js.native
  var BILLBOARDMODE_ALL: Double = js.native
}

@js.native
@JSName("BABYLON.CSG")
class CSG extends js.Object {
  var matrix: Matrix = js.native
  var position: Vector3 = js.native
  var rotation: Vector3 = js.native
  var rotationQuaternion: Quaternion = js.native
  var scaling: Vector3 = js.native
  override def clone(): CSG = js.native
  def union(csg: CSG): CSG = js.native
  def unionInPlace(csg: CSG): Unit = js.native
  def subtract(csg: CSG): CSG = js.native
  def subtractInPlace(csg: CSG): Unit = js.native
  def intersect(csg: CSG): CSG = js.native
  def intersectInPlace(csg: CSG): Unit = js.native
  def inverse(): CSG = js.native
  def inverseInPlace(): Unit = js.native
  def copyTransformAttributes(csg: CSG): CSG = js.native
  def buildMeshGeometry(name: String, scene: Scene, keepSubMeshes: Boolean): Mesh = js.native
  def toMesh(name: String, material: Material, scene: Scene, keepSubMeshes: Boolean): Mesh = js.native
}

@js.native
@JSName("BABYLON.CSG")
object CSG extends js.Object {
  def FromMesh(mesh: Mesh): CSG = js.native
}

@js.native
@JSName("BABYLON.Geometry")
class Geometry protected () extends IGetSetVerticesData {
  def this(id: String, scene: Scene, vertexData: VertexData, updatable: Boolean, mesh: Mesh) = this()
  var id: String = js.native
  var delayLoadState: Double = js.native
  var delayLoadingFile: String = js.native
  var onGeometryUpdated: js.Function2[Geometry, String, Unit] = js.native
  var _delayInfo: js.Any = js.native
  var _boundingInfo: BoundingInfo = js.native
  var _delayLoadingFunction: js.Function2[js.Any, Geometry, Unit] = js.native
  def getScene(): Scene = js.native
  def getEngine(): Engine = js.native
  def isReady(): Boolean = js.native
  def setAllVerticesData(vertexData: VertexData, updatable: Boolean): Unit = js.native
//  def setVerticesData(kind: String, data: js.Array[Double], updatable: Boolean, stride: Double): Unit = js.native
  def updateVerticesDataDirectly(kind: String, data: Float32Array, offset: Double): Unit = js.native
//  def updateVerticesData(kind: String, data: js.Array[Double], updateExtends: Boolean): Unit = js.native
  def getTotalVertices(): Double = js.native
//  def getVerticesData(kind: String, copyWhenShared: Boolean): js.Array[Double] = js.native
  def getVertexBuffer(kind: String): VertexBuffer = js.native
  def getVertexBuffers(): js.Array[VertexBuffer] = js.native
//  def isVerticesDataPresent(kind: String): Boolean = js.native
  def getVerticesDataKinds(): js.Array[String] = js.native
  def setIndices(indices: js.Array[Double], totalVertices: Double): Unit = js.native
  def getTotalIndices(): Double = js.native
//  def getIndices(copyWhenShared: Boolean): js.Array[Double] = js.native
  def getIndexBuffer(): js.Dynamic = js.native
  def releaseForMesh(mesh: Mesh, shouldDispose: Boolean): Unit = js.native
  def applyToMesh(mesh: Mesh): Unit = js.native
  def load(scene: Scene, onLoaded: js.Function0[Unit]): Unit = js.native
  def isDisposed(): Boolean = js.native
  def dispose(): Unit = js.native
  def copy(id: String): Geometry = js.native
}

@js.native
@JSName("BABYLON.Geometry")
object Geometry extends js.Object {
  def ExtractFromMesh(mesh: Mesh, id: String): Geometry = js.native
  def RandomId(): String = js.native
}

@js.native
@JSName("BABYLON.Geometry.Primitives._Primitive")
class _Primitive protected () extends Geometry {
  def this(id: String, scene: Scene, vertexData: VertexData, canBeRegenerated: Boolean, mesh: Mesh) = this()
  def canBeRegenerated(): Boolean = js.native
  def regenerate(): Unit = js.native
  def asNewGeometry(id: String): Geometry = js.native
//  def setAllVerticesData(vertexData: VertexData, updatable: Boolean): Unit = js.native
//  def setVerticesData(kind: String, data: js.Array[Double], updatable: Boolean): Unit = js.native
  def _regenerateVertexData(): VertexData = js.native
  override def copy(id: String): Geometry = js.native
}

@js.native
@JSName("BABYLON.Geometry.Primitives.Ribbon")
class Ribbon protected () extends _Primitive {
  def this(id: String, scene: Scene, pathArray: js.Array[js.Array[Vector3]], closeArray: Boolean, closePath: Boolean, offset: Double, canBeRegenerated: Boolean, mesh: Mesh, side: Double) = this()
  var pathArray: js.Array[js.Array[Vector3]] = js.native
  var closeArray: Boolean = js.native
  var closePath: Boolean = js.native
  var offset: Double = js.native
  var side: Double = js.native
//  def _regenerateVertexData(): VertexData = js.native
  override def copy(id: String): Geometry = js.native
}

@js.native
@JSName("BABYLON.Geometry.Primitives.Box")
class Box protected () extends _Primitive {
  def this(id: String, scene: Scene, size: Double, canBeRegenerated: Boolean, mesh: Mesh, side: Double) = this()
  var size: Double = js.native
  var side: Double = js.native
//  def _regenerateVertexData(): VertexData = js.native
  override def copy(id: String): Geometry = js.native
}

@js.native
@JSName("BABYLON.Geometry.Primitives.Sphere")
class Sphere protected () extends _Primitive {
  def this(id: String, scene: Scene, segments: Double, diameter: Double, canBeRegenerated: Boolean, mesh: Mesh, side: Double) = this()
  var segments: Double = js.native
  var diameter: Double = js.native
  var side: Double = js.native
//  def _regenerateVertexData(): VertexData = js.native
  override def copy(id: String): Geometry = js.native
}

@js.native
@JSName("BABYLON.Geometry.Primitives.Cylinder")
class Cylinder protected () extends _Primitive {
  def this(id: String, scene: Scene, height: Double, diameterTop: Double, diameterBottom: Double, tessellation: Double, subdivisions: Double, canBeRegenerated: Boolean, mesh: Mesh, side: Double) = this()
  var height: Double = js.native
  var diameterTop: Double = js.native
  var diameterBottom: Double = js.native
  var tessellation: Double = js.native
  var subdivisions: Double = js.native
  var side: Double = js.native
//  def _regenerateVertexData(): VertexData = js.native
//  def copy(id: String): Geometry = js.native
}

@js.native
@JSName("BABYLON.Geometry.Primitives.Torus")
class Torus protected () extends _Primitive {
  def this(id: String, scene: Scene, diameter: Double, thickness: Double, tessellation: Double, canBeRegenerated: Boolean, mesh: Mesh, side: Double) = this()
  var diameter: Double = js.native
  var thickness: Double = js.native
  var tessellation: Double = js.native
  var side: Double = js.native
//  def _regenerateVertexData(): VertexData = js.native
//  def copy(id: String): Geometry = js.native
}

@js.native
@JSName("BABYLON.Geometry.Primitives.Ground")
class Ground protected () extends _Primitive {
  def this(id: String, scene: Scene, width: Double, height: Double, subdivisions: Double, canBeRegenerated: Boolean, mesh: Mesh) = this()
  var width: Double = js.native
  var height: Double = js.native
  var subdivisions: Double = js.native
//  def _regenerateVertexData(): VertexData = js.native
//  def copy(id: String): Geometry = js.native
}

@js.native
@JSName("BABYLON.Geometry.Primitives.TiledGround")
class TiledGround protected () extends _Primitive {
  def this(id: String, scene: Scene, xmin: Double, zmin: Double, xmax: Double, zmax: Double, subdivisions: js.Any, precision: js.Any, canBeRegenerated: Boolean, mesh: Mesh) = this()
  var xmin: Double = js.native
  var zmin: Double = js.native
  var xmax: Double = js.native
  var zmax: Double = js.native
  var subdivisions: js.Any = js.native
  var precision: js.Any = js.native
//  def _regenerateVertexData(): VertexData = js.native
//  def copy(id: String): Geometry = js.native
}

//@js.native
//@JSName("BABYLON.Geometry.Primitives.Plane")
//class Plane protected () extends _Primitive {
//  def this(id: String, scene: Scene, size: Double, canBeRegenerated: Boolean, mesh: Mesh, side: Double) = this()
//  var size: Double = js.native
//  var side: Double = js.native
//  def _regenerateVertexData(): VertexData = js.native
//  def copy(id: String): Geometry = js.native
//}

@js.native
@JSName("BABYLON.Geometry.Primitives.TorusKnot")
class TorusKnot protected () extends _Primitive {
  def this(id: String, scene: Scene, radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double, p: Double, q: Double, canBeRegenerated: Boolean, mesh: Mesh, side: Double) = this()
  var radius: Double = js.native
  var tube: Double = js.native
  var radialSegments: Double = js.native
  var tubularSegments: Double = js.native
  var p: Double = js.native
  var q: Double = js.native
  var side: Double = js.native
//  def _regenerateVertexData(): VertexData = js.native
//  def copy(id: String): Geometry = js.native
}

@js.native
@JSName("BABYLON.GroundMesh")
class GroundMesh protected () extends Mesh {
  def this(name: String, scene: Scene) = this()
  var generateOctree: Boolean = js.native
  var _subdivisions: Double = js.native
  var subdivisions: Double = js.native
  def optimize(chunksCount: Double, octreeBlocksSize: Double): Unit = js.native
  def getHeightAtCoordinates(x: Double, z: Double): Double = js.native
}

@js.native
@JSName("BABYLON.InstancedMesh")
class InstancedMesh protected () extends AbstractMesh {
  def this(name: String, source: Mesh) = this()
//  var receiveShadows: Boolean = js.native
//  var material: Material = js.native
//  var visibility: Double = js.native
//  var skeleton: Skeleton = js.native
//  def getTotalVertices(): Double = js.native
  var sourceMesh: Mesh = js.native
//  def getVerticesData(kind: String): js.Array[Double] = js.native
//  def isVerticesDataPresent(kind: String): Boolean = js.native
//  def getIndices(): js.Array[Double] = js.native
//  var _positions: js.Array[Vector3] = js.native
  def refreshBoundingInfo(): Unit = js.native
//  def _preActivate(): Unit = js.native
//  def _activate(renderId: Double): Unit = js.native
//  def getLOD(camera: Camera): AbstractMesh = js.native
  def _syncSubMeshes(): Unit = js.native
//  def _generatePointsArray(): Boolean = js.native
//  def clone(name: String, newParent: Node, doNotCloneChildren: Boolean): InstancedMesh = js.native
//  def dispose(doNotRecurse: Boolean): Unit = js.native
}

@js.native
@JSName("BABYLON.LinesMesh")
class LinesMesh protected () extends Mesh {
  def this(name: String, scene: Scene, parent: Node, source: Mesh, doNotCloneChildren: Boolean) = this()
  var color: Color3 = js.native
  var alpha: Double = js.native
//  var material: Material = js.native
//  var isPickable: Boolean = js.native
//  var checkCollisions: Boolean = js.native
//  def _bind(subMesh: SubMesh, effect: Effect, fillMode: Double): Unit = js.native
//  def _draw(subMesh: SubMesh, fillMode: Double, instancesCount: Double): Unit = js.native
//  def intersects(ray: Ray, fastCheck: Boolean): js.Dynamic = js.native
//  def dispose(doNotRecurse: Boolean): Unit = js.native
//  def clone(name: String, newParent: Node, doNotCloneChildren: Boolean): LinesMesh = js.native
}

@js.native
@JSName("BABYLON._InstancesBatch")
class _InstancesBatch extends js.Object {
  var mustReturn: Boolean = js.native
  var visibleInstances: js.Array[js.Array[InstancedMesh]] = js.native
  var renderSelf: js.Array[Boolean] = js.native
}

@js.native
@JSName("BABYLON.Mesh")
class Mesh protected () extends AbstractMesh with IGetSetVerticesData {
  def this(name: String, scene: Scene, parent: Node, source: Mesh, doNotCloneChildren: Boolean) = this()
  var delayLoadState: Double = js.native
  var instances: js.Array[InstancedMesh] = js.native
  var delayLoadingFile: String = js.native
  var _binaryInfo: js.Any = js.native
  var onLODLevelSelection: js.Function3[Double, Mesh, Mesh, Unit] = js.native
  var _geometry: Geometry = js.native
  var _delayInfo: js.Any = js.native
  var _delayLoadingFunction: js.Function2[js.Any, Mesh, Unit] = js.native
  var _visibleInstances: js.Any = js.native
  var _shouldGenerateFlatShading: Boolean = js.native
  var hasLODLevels: Boolean = js.native
  def addLODLevel(distance: Double, mesh: Mesh): Mesh = js.native
  def getLODLevelAtDistance(distance: Double): Mesh = js.native
  def removeLODLevel(mesh: Mesh): Mesh = js.native
  def getLOD(camera: Camera, boundingSphere: BoundingSphere): AbstractMesh = js.native
  var geometry: Geometry = js.native
//  def getTotalVertices(): Double = js.native
//  def getVerticesData(kind: String, copyWhenShared: Boolean): js.Array[Double] = js.native
  def getVertexBuffer(kind: js.Any): VertexBuffer = js.native
//  def isVerticesDataPresent(kind: String): Boolean = js.native
  def getVerticesDataKinds(): js.Array[String] = js.native
  def getTotalIndices(): Double = js.native
//  def getIndices(copyWhenShared: Boolean): js.Array[Double] = js.native
//  var isBlocked: Boolean = js.native
//  def isReady(): Boolean = js.native
  def isDisposed(): Boolean = js.native
  var sideOrientation: Double = js.native
  var areNormalsFrozen: Boolean = js.native
  def freezeNormals(): Unit = js.native
  def unfreezeNormals(): Unit = js.native
//  def _preActivate(): Unit = js.native
  def _registerInstanceForRenderId(instance: InstancedMesh, renderId: Double): Unit = js.native
  def refreshBoundingInfo(): Unit = js.native
  def _createGlobalSubMesh(): SubMesh = js.native
  def subdivide(count: Double): Unit = js.native
//  def setVerticesData(kind: js.Any, data: js.Any, updatable: Boolean, stride: Double): Unit = js.native
//  def updateVerticesData(kind: String, data: js.Array[Double], updateExtends: Boolean, makeItUnique: Boolean): Unit = js.native
  def updateVerticesDataDirectly(kind: String, data: Float32Array, offset: Double, makeItUnique: Boolean): Unit = js.native
  def updateMeshPositions(positionFunction: js.Any, computeNormals: Boolean): Unit = js.native
  def makeGeometryUnique(): Unit = js.native
  def setIndices(indices: js.Array[Double], totalVertices: Double): Unit = js.native
  def _bind(subMesh: SubMesh, effect: Effect, fillMode: Double): Unit = js.native
  def _draw(subMesh: SubMesh, fillMode: Double, instancesCount: Double): Unit = js.native
  def registerBeforeRender(func: js.Function1[AbstractMesh, Unit]): Unit = js.native
  def unregisterBeforeRender(func: js.Function1[AbstractMesh, Unit]): Unit = js.native
  def registerAfterRender(func: js.Function1[AbstractMesh, Unit]): Unit = js.native
  def unregisterAfterRender(func: js.Function1[AbstractMesh, Unit]): Unit = js.native
  def _getInstancesRenderList(subMeshId: Double): _InstancesBatch = js.native
  def _renderWithInstances(subMesh: SubMesh, fillMode: Double, batch: _InstancesBatch, effect: Effect, engine: Engine): Unit = js.native
  def _processRendering(subMesh: SubMesh, effect: Effect, fillMode: Double, batch: _InstancesBatch, hardwareInstancedRendering: Boolean, onBeforeDraw: js.Function2[Boolean, Matrix, Unit]): Unit = js.native
  def render(subMesh: SubMesh, enableAlphaMode: Boolean): Unit = js.native
  def getEmittedParticleSystems(): js.Array[ParticleSystem] = js.native
  def getHierarchyEmittedParticleSystems(): js.Array[ParticleSystem] = js.native
  def getChildren(): js.Array[Node] = js.native
  def _checkDelayState(): Unit = js.native
//  def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  def setMaterialByID(id: String): Unit = js.native
  def getAnimatables(): js.Array[IAnimatable] = js.native
  def bakeTransformIntoVertices(transform: Matrix): Unit = js.native
  def bakeCurrentTransformIntoVertices(): Unit = js.native
  def _resetPointsArrayCache(): Unit = js.native
//  def _generatePointsArray(): Boolean = js.native
//  def clone(name: String, newParent: Node, doNotCloneChildren: Boolean): Mesh = js.native
//  def dispose(doNotRecurse: Boolean): Unit = js.native
  def applyDisplacementMap(url: String, minHeight: Double, maxHeight: Double, onSuccess: js.Function1[Mesh, Unit]): Unit = js.native
  def applyDisplacementMapFromBuffer(buffer: Uint8Array, heightMapWidth: Double, heightMapHeight: Double, minHeight: Double, maxHeight: Double): Unit = js.native
  def convertToFlatShadedMesh(): Unit = js.native
  def flipFaces(flipNormals: Boolean): Unit = js.native
  def createInstance(name: String): InstancedMesh = js.native
  def synchronizeInstances(): Unit = js.native
  def simplify(settings: js.Array[ISimplificationSettings], parallelProcessing: Boolean, simplificationType: SimplificationType, successCallback: js.Function2[Mesh, Double, Unit]): Unit = js.native
  def optimizeIndices(successCallback: js.Function1[Mesh, Unit]): Unit = js.native
  def applySkeleton(skeleton: Skeleton): Mesh = js.native
}

@js.native
@JSName("BABYLON.Mesh")
object Mesh extends js.Object {
  var _FRONTSIDE: Double = js.native
  var _BACKSIDE: Double = js.native
  var _DOUBLESIDE: Double = js.native
  var _DEFAULTSIDE: Double = js.native
  var _NO_CAP: Double = js.native
  var _CAP_START: Double = js.native
  var _CAP_END: Double = js.native
  var _CAP_ALL: Double = js.native
  var FRONTSIDE: Double = js.native
  var BACKSIDE: Double = js.native
  var DOUBLESIDE: Double = js.native
  var DEFAULTSIDE: Double = js.native
  var NO_CAP: Double = js.native
  var CAP_START: Double = js.native
  var CAP_END: Double = js.native
  var CAP_ALL: Double = js.native
  def CreateRibbon(name: String, pathArray: js.Array[js.Array[Vector3]], closeArray: Boolean, closePath: Boolean, offset: Double, scene: Scene, updatable: Boolean, sideOrientation: Double, ribbonInstance: Mesh): Mesh = js.native
  def CreateDisc(name: String, radius: Double, tessellation: Double, scene: Scene, updatable: Boolean, sideOrientation: Double): Mesh = js.native
  def CreateBox(name: String, size: Double, scene: Scene, updatable: Boolean, sideOrientation: Double): Mesh = js.native
  def CreateBox(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def CreateSphere(name: String, segments: Double, diameter: Double, scene: Scene, updatable: Boolean, sideOrientation: Double): Mesh = js.native
  //added... (FIXME not sure why segments is Double)
  def CreateSphere(name: String, segments: Double, diameter: Double, scene: Scene): Mesh = js.native
  def CreateSphere(name: String, options: js.Any, scene: js.Any): Mesh = js.native
  def CreateCylinder(name: String, height: Double, diameterTop: Double, diameterBottom: Double, tessellation: Double, subdivisions: js.Any, scene: Scene, updatable: js.Any, sideOrientation: Double): Mesh = js.native
  def CreateTorus(name: String, diameter: Double, thickness: Double, tessellation: Double, scene: Scene, updatable: Boolean, sideOrientation: Double): Mesh = js.native
  def CreateTorusKnot(name: String, radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double, p: Double, q: Double, scene: Scene, updatable: Boolean, sideOrientation: Double): Mesh = js.native
  def CreateLines(name: String, points: js.Array[Vector3], scene: Scene, updatable: Boolean, linesInstance: LinesMesh): LinesMesh = js.native
  def CreateDashedLines(name: String, points: js.Array[Vector3], dashSize: Double, gapSize: Double, dashNb: Double, scene: Scene, updatable: Boolean, linesInstance: LinesMesh): LinesMesh = js.native
  def ExtrudeShape(name: String, shape: js.Array[Vector3], path: js.Array[Vector3], scale: Double, rotation: Double, cap: Double, scene: Scene, updatable: Boolean, sideOrientation: Double, extrudedInstance: Mesh): Mesh = js.native
  def ExtrudeShapeCustom(name: String, shape: js.Array[Vector3], path: js.Array[Vector3], scaleFunction: js.Any, rotationFunction: js.Any, ribbonCloseArray: Boolean, ribbonClosePath: Boolean, cap: Double, scene: Scene, updatable: Boolean, sideOrientation: Double, extrudedInstance: Mesh): Mesh = js.native
  def CreateLathe(name: String, shape: js.Array[Vector3], radius: Double, tessellation: Double, scene: Scene, updatable: Boolean, sideOrientation: Double): Mesh = js.native
  def CreatePlane(name: String, size: Double, scene: Scene, updatable: Boolean, sideOrientation: Double): Mesh = js.native
  def CreatePlane(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def CreateGround(name: String, width: Double, height: Double, subdivisions: Double, scene: Scene, updatable: Boolean): Mesh = js.native
  // added...
  def CreateGround(name: String, width: Double, height: Double, subdivisions: Double, scene: Scene): Mesh = js.native
  def CreateGround(name: String, options: js.Any, scene: js.Any): Mesh = js.native
  def CreateTiledGround(name: String, xmin: Double, zmin: Double, xmax: Double, zmax: Double, subdivisions: js.Any, precision: js.Any, scene: Scene, updatable: Boolean): Mesh = js.native
  def CreateGroundFromHeightMap(name: String, url: String, width: Double, height: Double, subdivisions: Double, minHeight: Double, maxHeight: Double, scene: Scene, updatable: Boolean, onReady: js.Function1[GroundMesh, Unit]): GroundMesh = js.native
  def CreateTube(name: String, path: js.Array[Vector3], radius: Double, tessellation: Double, radiusFunction: js.Any, cap: Double, scene: Scene, updatable: Boolean, sideOrientation: Double, tubeInstance: Mesh): Mesh = js.native
  def CreateDecal(name: String, sourceMesh: AbstractMesh, position: Vector3, normal: Vector3, size: Vector3, angle: Double): Mesh = js.native
  def MinMax(meshes: js.Array[AbstractMesh]): js.Any = js.native
  def Center(meshesOrMinMaxVector: js.Any): Vector3 = js.native
  def MergeMeshes(meshes: js.Array[Mesh], disposeSource: Boolean, allow32BitsIndices: Boolean, meshSubclass: Mesh): Mesh = js.native
}

@js.native
trait IGetSetVerticesData extends js.Object {
  def isVerticesDataPresent(kind: String): Boolean = js.native
  def getVerticesData(kind: String, copyWhenShared: Boolean): js.Array[Double] = js.native
  def getIndices(copyWhenShared: Boolean): js.Array[Double] = js.native
  def setVerticesData(kind: String, data: js.Array[Double], updatable: Boolean): Unit = js.native
  def updateVerticesData(kind: String, data: js.Array[Double], updateExtends: Boolean, makeItUnique: Boolean): Unit = js.native
  def setIndices(indices: js.Array[Double]): Unit = js.native
}

@js.native
@JSName("BABYLON.VertexData")
class VertexData extends js.Object {
  var positions: js.Array[Double] = js.native
  var normals: js.Array[Double] = js.native
  var uvs: js.Array[Double] = js.native
  var uvs2: js.Array[Double] = js.native
  var uvs3: js.Array[Double] = js.native
  var uvs4: js.Array[Double] = js.native
  var uvs5: js.Array[Double] = js.native
  var uvs6: js.Array[Double] = js.native
  var colors: js.Array[Double] = js.native
  var matricesIndices: js.Array[Double] = js.native
  var matricesWeights: js.Array[Double] = js.native
  var indices: js.Array[Double] = js.native
  def set(data: js.Array[Double], kind: String): Unit = js.native
  def applyToMesh(mesh: Mesh, updatable: Boolean): Unit = js.native
  def applyToGeometry(geometry: Geometry, updatable: Boolean): Unit = js.native
  def updateMesh(mesh: Mesh, updateExtends: Boolean, makeItUnique: Boolean): Unit = js.native
  def updateGeometry(geometry: Geometry, updateExtends: Boolean, makeItUnique: Boolean): Unit = js.native
  def transform(matrix: Matrix): Unit = js.native
  def merge(other: VertexData): Unit = js.native
}

@js.native
@JSName("BABYLON.VertexData")
object VertexData extends js.Object {
  def ExtractFromMesh(mesh: Mesh, copyWhenShared: Boolean): VertexData = js.native
  def ExtractFromGeometry(geometry: Geometry, copyWhenShared: Boolean): VertexData = js.native
  def CreateRibbon(pathArray: js.Array[js.Array[Vector3]], closeArray: Boolean, closePath: Boolean, offset: Double, sideOrientation: Double): VertexData = js.native
  def CreateBox(options: js.Any): VertexData = js.native
  def CreateBox(size: Double, sideOrientation: Double): VertexData = js.native
  def CreateSphere(options: js.Any): VertexData = js.native
  def CreateSphere(segments: Double, diameter: Double, sideOrientation: Double): VertexData = js.native
  def CreateCylinder(height: Double, diameterTop: Double, diameterBottom: Double, tessellation: Double, subdivisions: Double, sideOrientation: Double): VertexData = js.native
  def CreateTorus(diameter: js.Any, thickness: js.Any, tessellation: js.Any, sideOrientation: Double): VertexData = js.native
  def CreateLines(points: js.Array[Vector3]): VertexData = js.native
  def CreateDashedLines(points: js.Array[Vector3], dashSize: Double, gapSize: Double, dashNb: Double): VertexData = js.native
  def CreateGround(options: js.Any): VertexData = js.native
  def CreateGround(width: Double, height: Double, subdivisions: Double): VertexData = js.native
  def CreateTiledGround(xmin: Double, zmin: Double, xmax: Double, zmax: Double, subdivisions: js.Any, precision: js.Any): VertexData = js.native
  def CreateGroundFromHeightMap(width: Double, height: Double, subdivisions: Double, minHeight: Double, maxHeight: Double, buffer: Uint8Array, bufferWidth: Double, bufferHeight: Double): VertexData = js.native
  def CreatePlane(options: js.Any): VertexData = js.native
  def CreatePlane(size: Double, sideOrientation: Double): VertexData = js.native
  def CreateDisc(radius: Double, tessellation: Double, sideOrientation: Double): VertexData = js.native
  def CreateTorusKnot(radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double, p: Double, q: Double, sideOrientation: Double): VertexData = js.native
  def ComputeNormals(positions: js.Any, indices: js.Any, normals: js.Any): Unit = js.native
}

package scalajs.facade.babylonjs {

@js.native
@JSName("BABYLON.Internals.MeshLODLevel")
class MeshLODLevel protected () extends js.Object {
  def this(distance: Double, mesh: Mesh) = this()
  var distance: Double = js.native
  var mesh: Mesh = js.native
}

@js.native
@JSName("BABYLON.Internals.AndOrNotEvaluator")
class AndOrNotEvaluator extends js.Object {
}

@js.native
@JSName("BABYLON.Internals.AndOrNotEvaluator")
object AndOrNotEvaluator extends js.Object {
  def Eval(query: String, evaluateCallback: js.Function1[js.Any, Boolean]): Boolean = js.native
}

@js.native
trait DDSInfo extends js.Object {
  var width: Double = js.native
  var height: Double = js.native
  var mipmapCount: Double = js.native
  var isFourCC: Boolean = js.native
  var isRGB: Boolean = js.native
  var isLuminance: Boolean = js.native
  var isCube: Boolean = js.native
}

@js.native
@JSName("BABYLON.Internals.DDSTools")
class DDSTools extends js.Object {
}

@js.native
@JSName("BABYLON.Internals.DDSTools")
object DDSTools extends js.Object {
  def GetDDSInfo(arrayBuffer: js.Any): DDSInfo = js.native
  def UploadDDSLevels(gl: WebGLRenderingContext, ext: js.Any, arrayBuffer: js.Any, info: DDSInfo, loadMipmaps: Boolean, faces: Double): Unit = js.native
}

@js.native
@JSName("BABYLON.Internals.TGATools")
class TGATools extends js.Object {
}

@js.native
@JSName("BABYLON.Internals.TGATools")
object TGATools extends js.Object {
  def GetTGAHeader(data: Uint8Array): js.Dynamic = js.native
  def UploadContent(gl: WebGLRenderingContext, data: Uint8Array): Unit = js.native
  def _getImageData8bits(header: js.Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Double, y_step: Double, y_end: Double, x_start: Double, x_step: Double, x_end: Double): Uint8Array = js.native
  def _getImageData16bits(header: js.Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Double, y_step: Double, y_end: Double, x_start: Double, x_step: Double, x_end: Double): Uint8Array = js.native
  def _getImageData24bits(header: js.Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Double, y_step: Double, y_end: Double, x_start: Double, x_step: Double, x_end: Double): Uint8Array = js.native
  def _getImageData32bits(header: js.Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Double, y_step: Double, y_end: Double, x_start: Double, x_step: Double, x_end: Double): Uint8Array = js.native
  def _getImageDataGrey8bits(header: js.Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Double, y_step: Double, y_end: Double, x_start: Double, x_step: Double, x_end: Double): Uint8Array = js.native
  def _getImageDataGrey16bits(header: js.Any, palettes: Uint8Array, pixel_data: Uint8Array, y_start: Double, y_step: Double, y_end: Double, x_start: Double, x_step: Double, x_end: Double): Uint8Array = js.native
}

}

@js.native
trait ISimplifier extends js.Object {
  def simplify(settings: ISimplificationSettings, successCallback: js.Function1[Mesh, Unit], errorCallback: js.Function0[Unit]): Unit = js.native
}

@js.native
trait ISimplificationSettings extends js.Object {
  var quality: Double = js.native
  var distance: Double = js.native
  var optimizeMesh: Boolean = js.native
}

@js.native
@JSName("BABYLON.SimplificationSettings")
class SimplificationSettings protected () extends ISimplificationSettings {
  def this(quality: Double, distance: Double, optimizeMesh: Boolean) = this()
//  var quality: Double = js.native
//  var distance: Double = js.native
//  var optimizeMesh: Boolean = js.native
}

@js.native
trait ISimplificationTask extends js.Object {
  var settings: js.Array[ISimplificationSettings] = js.native
  var simplificationType: SimplificationType = js.native
  var mesh: Mesh = js.native
  var successCallback: js.Function0[Unit] = js.native
  var parallelProcessing: Boolean = js.native
}

@js.native
@JSName("BABYLON.SimplificationQueue")
class SimplificationQueue extends js.Object {
  var running: js.Any = js.native
  def addTask(task: ISimplificationTask): Unit = js.native
  def executeNext(): Unit = js.native
  def runSimplification(task: ISimplificationTask): Unit = js.native
}

@js.native
sealed trait SimplificationType extends js.Object {
}

@js.native
@JSName("BABYLON.SimplificationType")
object SimplificationType extends js.Object {
  var QUADRATIC: SimplificationType = js.native
  @JSBracketAccess
  def apply(value: SimplificationType): String = js.native
}

@js.native
@JSName("BABYLON.DecimationTriangle")
class DecimationTriangle protected () extends js.Object {
  def this(vertices: js.Array[DecimationVertex]) = this()
  var vertices: js.Array[DecimationVertex] = js.native
  var normal: Vector3 = js.native
  var error: js.Array[Double] = js.native
  var deleted: Boolean = js.native
  var isDirty: Boolean = js.native
  var borderFactor: Double = js.native
  var deletePending: Boolean = js.native
  var originalOffset: Double = js.native
}

@js.native
@JSName("BABYLON.DecimationVertex")
class DecimationVertex protected () extends js.Object {
  def this(position: Vector3, id: js.Any) = this()
  var position: Vector3 = js.native
  var id: js.Any = js.native
  var q: QuadraticMatrix = js.native
  var isBorder: Boolean = js.native
  var triangleStart: Double = js.native
  var triangleCount: Double = js.native
  var originalOffsets: js.Array[Double] = js.native
  def updatePosition(newPosition: Vector3): Unit = js.native
}

@js.native
@JSName("BABYLON.QuadraticMatrix")
class QuadraticMatrix protected () extends js.Object {
  def this(data: js.Array[Double]) = this()
  var data: js.Array[Double] = js.native
  def det(a11: js.Any, a12: js.Any, a13: js.Any, a21: js.Any, a22: js.Any, a23: js.Any, a31: js.Any, a32: js.Any, a33: js.Any): Double = js.native
  def addInPlace(matrix: QuadraticMatrix): Unit = js.native
  def addArrayInPlace(data: js.Array[Double]): Unit = js.native
  def add(matrix: QuadraticMatrix): QuadraticMatrix = js.native
}

@js.native
@JSName("BABYLON.QuadraticMatrix")
object QuadraticMatrix extends js.Object {
  def FromData(a: Double, b: Double, c: Double, d: Double): QuadraticMatrix = js.native
  def DataFromNumbers(a: Double, b: Double, c: Double, d: Double): js.Array[Double] = js.native
}

@js.native
@JSName("BABYLON.Reference")
class Reference protected () extends js.Object {
  def this(vertexId: Double, triangleId: Double) = this()
  var vertexId: Double = js.native
  var triangleId: Double = js.native
}

@js.native
@JSName("BABYLON.QuadraticErrorSimplification")
class QuadraticErrorSimplification protected () extends ISimplifier {
  def this(_mesh: Mesh) = this()
  var syncIterations: Double = js.native
  var aggressiveness: Double = js.native
  var decimationIterations: Double = js.native
  var boundingBoxEpsilon: Double = js.native
  def simplify(settings: ISimplificationSettings, successCallback: js.Function1[Mesh, Unit]): Unit = js.native
}

@js.native
@JSName("BABYLON.Polygon")
class Polygon extends js.Object {
}

@js.native
@JSName("BABYLON.Polygon")
object Polygon extends js.Object {
  def Rectangle(xmin: Double, ymin: Double, xmax: Double, ymax: Double): js.Array[Vector2] = js.native
  def Circle(radius: Double, cx: Double, cy: Double, numberOfSides: Double): js.Array[Vector2] = js.native
  def Parse(input: String): js.Array[Vector2] = js.native
  def StartingAt(x: Double, y: Double): Path2 = js.native
}

@js.native
@JSName("BABYLON.PolygonMeshBuilder")
class PolygonMeshBuilder protected () extends js.Object {
  def this(name: String, contours: Path2, scene: Scene) = this()
  def this(name: String, contours: js.Array[Vector2], scene: Scene) = this()
  def addHole(hole: js.Array[Vector2]): PolygonMeshBuilder = js.native
  def build(updatable: Boolean, depth: Double): Mesh = js.native
}

@js.native
@JSName("BABYLON.SubMesh")
class SubMesh protected () extends js.Object {
  def this(materialIndex: Double, verticesStart: Double, verticesCount: Double, indexStart: js.Any, indexCount: Double, mesh: AbstractMesh, renderingMesh: Mesh, createBoundingBox: Boolean) = this()
  var materialIndex: Double = js.native
  var verticesStart: Double = js.native
  var verticesCount: Double = js.native
  var indexStart: js.Any = js.native
  var indexCount: Double = js.native
  var linesIndexCount: Double = js.native
  var _lastColliderWorldVertices: js.Array[Vector3] = js.native
  var _trianglePlanes: js.Array[Plane] = js.native
  var _lastColliderTransformMatrix: Matrix = js.native
  var _renderId: Double = js.native
  var _alphaIndex: Double = js.native
  var _distanceToCamera: Double = js.native
  var _id: Double = js.native
  def getBoundingInfo(): BoundingInfo = js.native
  def getMesh(): AbstractMesh = js.native
  def getRenderingMesh(): Mesh = js.native
  def getMaterial(): Material = js.native
  def refreshBoundingInfo(): Unit = js.native
  def _checkCollision(collider: Collider): Boolean = js.native
  def updateBoundingInfo(world: Matrix): Unit = js.native
  def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  def render(enableAlphaMode: Boolean): Unit = js.native
  def getLinesIndexBuffer(indices: js.Array[Double], engine: js.Any): WebGLBuffer = js.native
  def canIntersects(ray: Ray): Boolean = js.native
  def intersects(ray: Ray, positions: js.Array[Vector3], indices: js.Array[Double], fastCheck: Boolean): IntersectionInfo = js.native
  def clone(newMesh: AbstractMesh, newRenderingMesh: Mesh): SubMesh = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.SubMesh")
object SubMesh extends js.Object {
  def CreateFromIndices(materialIndex: Double, startIndex: Double, indexCount: Double, mesh: AbstractMesh, renderingMesh: Mesh): SubMesh = js.native
}

@js.native
@JSName("BABYLON.VertexBuffer")
class VertexBuffer protected () extends js.Object {
  def this(engine: js.Any, data: js.Array[Double], kind: String, updatable: Boolean, postponeInternalCreation: Boolean, stride: Double) = this()
  def isUpdatable(): Boolean = js.native
  def getData(): js.Array[Double] = js.native
  def getBuffer(): WebGLBuffer = js.native
  def getStrideSize(): Double = js.native
  def create(data: js.Array[Double]): Unit = js.native
  def update(data: js.Array[Double]): Unit = js.native
  def updateDirectly(data: Float32Array, offset: Double): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.VertexBuffer")
object VertexBuffer extends js.Object {
  var PositionKind: String = js.native
  var NormalKind: String = js.native
  var UVKind: String = js.native
  var UV2Kind: String = js.native
  var UV3Kind: String = js.native
  var UV4Kind: String = js.native
  var UV5Kind: String = js.native
  var UV6Kind: String = js.native
  var ColorKind: String = js.native
  var MatricesIndicesKind: String = js.native
  var MatricesWeightsKind: String = js.native
}

@js.native
@JSName("BABYLON.Particle")
class Particle extends js.Object {
  var position: Vector3 = js.native
  var direction: Vector3 = js.native
  var color: Color4 = js.native
  var colorStep: Color4 = js.native
  var lifeTime: Double = js.native
  var age: Double = js.native
  var size: Double = js.native
  var angle: Double = js.native
  var angularSpeed: Double = js.native
  def copyTo(other: Particle): Unit = js.native
}

@js.native
@JSName("BABYLON.ParticleSystem")
class ParticleSystem protected () extends IDisposable {
  def this(name: String, capacity: Double, scene: Scene, customEffect: Effect) = this()
  var name: String = js.native
  var id: String = js.native
  var renderingGroupId: Double = js.native
  var emitter: js.Any = js.native
  var emitRate: Double = js.native
  var manualEmitCount: Double = js.native
  var updateSpeed: Double = js.native
  var targetStopDuration: Double = js.native
  var disposeOnStop: Boolean = js.native
  var minEmitPower: Double = js.native
  var maxEmitPower: Double = js.native
  var minLifeTime: Double = js.native
  var maxLifeTime: Double = js.native
  var minSize: Double = js.native
  var maxSize: Double = js.native
  var minAngularSpeed: Double = js.native
  var maxAngularSpeed: Double = js.native
  var particleTexture: Texture = js.native
  var layerMask: Double = js.native
  var onDispose: js.Function0[Unit] = js.native
  var updateFunction: js.Function1[js.Array[Particle], Unit] = js.native
  var blendMode: Double = js.native
  var forceDepthWrite: Boolean = js.native
  var gravity: Vector3 = js.native
  var direction1: Vector3 = js.native
  var direction2: Vector3 = js.native
  var minEmitBox: Vector3 = js.native
  var maxEmitBox: Vector3 = js.native
  var color1: Color4 = js.native
  var color2: Color4 = js.native
  var colorDead: Color4 = js.native
  var textureMask: Color4 = js.native
  var startDirectionFunction: js.Function3[Double, Matrix, Vector3, Unit] = js.native
  var startPositionFunction: js.Function2[Matrix, Vector3, Unit] = js.native
  def recycleParticle(particle: Particle): Unit = js.native
  def getCapacity(): Double = js.native
  def isAlive(): Boolean = js.native
  def isStarted(): Boolean = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
  def _appendParticleVertex(index: Double, particle: Particle, offsetX: Double, offsetY: Double): Unit = js.native
  def animate(): Unit = js.native
  def render(): Double = js.native
//  def dispose(): Unit = js.native
  def clone(name: String, newEmitter: js.Any): ParticleSystem = js.native
}

@js.native
@JSName("BABYLON.ParticleSystem")
object ParticleSystem extends js.Object {
  var BLENDMODE_ONEONE: Double = js.native
  var BLENDMODE_STANDARD: Double = js.native
}

@js.native
trait IPhysicsEnginePlugin extends js.Object {
  def initialize(iterations: Double): js.Dynamic = js.native
  def setGravity(gravity: Vector3): Unit = js.native
  def runOneStep(delta: Double): Unit = js.native
  def registerMesh(mesh: AbstractMesh, impostor: Double, options: PhysicsBodyCreationOptions): js.Dynamic = js.native
  def registerMeshesAsCompound(parts: js.Array[PhysicsCompoundBodyPart], options: PhysicsBodyCreationOptions): js.Dynamic = js.native
  def unregisterMesh(mesh: AbstractMesh): js.Dynamic = js.native
  def applyImpulse(mesh: AbstractMesh, force: Vector3, contactPoint: Vector3): Unit = js.native
  def createLink(mesh1: AbstractMesh, mesh2: AbstractMesh, pivot1: Vector3, pivot2: Vector3, options: js.Any): Boolean = js.native
  def dispose(): Unit = js.native
  def isSupported(): Boolean = js.native
  def updateBodyPosition(mesh: AbstractMesh): Unit = js.native
}

@js.native
trait PhysicsBodyCreationOptions extends js.Object {
  var mass: Double = js.native
  var friction: Double = js.native
  var restitution: Double = js.native
}

@js.native
trait PhysicsCompoundBodyPart extends js.Object {
  var mesh: Mesh = js.native
  var impostor: Double = js.native
}

@js.native
@JSName("BABYLON.PhysicsEngine")
class PhysicsEngine protected () extends js.Object {
  def this(plugin: IPhysicsEnginePlugin) = this()
  var gravity: Vector3 = js.native
  def _initialize(gravity: Vector3): Unit = js.native
  def _runOneStep(delta: Double): Unit = js.native
  def _setGravity(gravity: Vector3): Unit = js.native
  def _registerMesh(mesh: AbstractMesh, impostor: Double, options: PhysicsBodyCreationOptions): js.Dynamic = js.native
  def _registerMeshesAsCompound(parts: js.Array[PhysicsCompoundBodyPart], options: PhysicsBodyCreationOptions): js.Dynamic = js.native
  def _unregisterMesh(mesh: AbstractMesh): Unit = js.native
  def _applyImpulse(mesh: AbstractMesh, force: Vector3, contactPoint: Vector3): Unit = js.native
  def _createLink(mesh1: AbstractMesh, mesh2: AbstractMesh, pivot1: Vector3, pivot2: Vector3, options: js.Any): Boolean = js.native
  def _updateBodyPosition(mesh: AbstractMesh): Unit = js.native
  def dispose(): Unit = js.native
  def isSupported(): Boolean = js.native
}

@js.native
@JSName("BABYLON.PhysicsEngine")
object PhysicsEngine extends js.Object {
  var NoImpostor: Double = js.native
  var SphereImpostor: Double = js.native
  var BoxImpostor: Double = js.native
  var PlaneImpostor: Double = js.native
  var MeshImpostor: Double = js.native
  var CapsuleImpostor: Double = js.native
  var ConeImpostor: Double = js.native
  var CylinderImpostor: Double = js.native
  var ConvexHullImpostor: Double = js.native
  var Epsilon: Double = js.native
}

@js.native
@JSName("BABYLON.BoundingBoxRenderer")
class BoundingBoxRenderer protected () extends js.Object {
  def this(scene: Scene) = this()
  var frontColor: Color3 = js.native
  var backColor: Color3 = js.native
  var showBackLines: Boolean = js.native
  var renderList: SmartArray[BoundingBox] = js.native
  def reset(): Unit = js.native
  def render(): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.DepthRenderer")
class DepthRenderer protected () extends js.Object {
  def this(scene: Scene, `type`: Double) = this()
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  def getDepthMap(): RenderTargetTexture = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.EdgesRenderer")
class EdgesRenderer protected () extends js.Object {
  def this(source: AbstractMesh, epsilon: Double, checkVerticesInsteadOfIndices: Boolean) = this()
  def dispose(): Unit = js.native
  def _generateEdgesLines(): Unit = js.native
  def render(): Unit = js.native
}

@js.native
@JSName("BABYLON.OutlineRenderer")
class OutlineRenderer protected () extends js.Object {
  def this(scene: Scene) = this()
  def render(subMesh: SubMesh, batch: _InstancesBatch, useOverlay: Boolean): Unit = js.native
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
}

@js.native
@JSName("BABYLON.RenderingGroup")
class RenderingGroup protected () extends js.Object {
  def this(index: Double, scene: Scene) = this()
  var index: Double = js.native
  def render(customRenderFunction: js.Function3[SmartArray[SubMesh], SmartArray[SubMesh], SmartArray[SubMesh], Unit]): Boolean = js.native
  def prepare(): Unit = js.native
  def dispatch(subMesh: SubMesh): Unit = js.native
}

@js.native
@JSName("BABYLON.RenderingManager")
class RenderingManager protected () extends js.Object {
  def this(scene: Scene) = this()
  def render(customRenderFunction: js.Function3[SmartArray[SubMesh], SmartArray[SubMesh], SmartArray[SubMesh], Unit], activeMeshes: js.Array[AbstractMesh], renderParticles: Boolean, renderSprites: Boolean): Unit = js.native
  def reset(): Unit = js.native
  def dispatch(subMesh: SubMesh): Unit = js.native
}

@js.native
@JSName("BABYLON.RenderingManager")
object RenderingManager extends js.Object {
  var MAX_RENDERINGGROUPS: Double = js.native
}

@js.native
@JSName("BABYLON.AnaglyphPostProcess")
class AnaglyphPostProcess protected () extends PostProcess {
  def this(name: String, ratio: Double, camera: Camera, samplingMode: Double, engine: Engine, reusable: Boolean) = this()
}

@js.native
@JSName("BABYLON.BlackAndWhitePostProcess")
class BlackAndWhitePostProcess protected () extends PostProcess {
  def this(name: String, ratio: Double, camera: Camera, samplingMode: Double, engine: Engine, reusable: Boolean) = this()
}

@js.native
@JSName("BABYLON.BlurPostProcess")
class BlurPostProcess protected () extends PostProcess {
  def this(name: String, direction: Vector2, blurWidth: Double, ratio: Double, camera: Camera, samplingMode: Double, engine: Engine, reusable: Boolean) = this()
  var direction: Vector2 = js.native
  var blurWidth: Double = js.native
}

@js.native
@JSName("BABYLON.ColorCorrectionPostProcess")
class ColorCorrectionPostProcess protected () extends PostProcess {
  def this(name: String, colorTableUrl: String, ratio: Double, camera: Camera, samplingMode: Double, engine: Engine, reusable: Boolean) = this()
}

@js.native
@JSName("BABYLON.ConvolutionPostProcess")
class ConvolutionPostProcess protected () extends PostProcess {
  def this(name: String, kernel: js.Array[Double], ratio: Double, camera: Camera, samplingMode: Double, engine: Engine, reusable: Boolean) = this()
  var kernel: js.Array[Double] = js.native
}

@js.native
@JSName("BABYLON.ConvolutionPostProcess")
object ConvolutionPostProcess extends js.Object {
  var EdgeDetect0Kernel: js.Array[Double] = js.native
  var EdgeDetect1Kernel: js.Array[Double] = js.native
  var EdgeDetect2Kernel: js.Array[Double] = js.native
  var SharpenKernel: js.Array[Double] = js.native
  var EmbossKernel: js.Array[Double] = js.native
  var GaussianKernel: js.Array[Double] = js.native
}

@js.native
@JSName("BABYLON.DisplayPassPostProcess")
class DisplayPassPostProcess protected () extends PostProcess {
  def this(name: String, ratio: Double, camera: Camera, samplingMode: Double, engine: Engine, reusable: Boolean) = this()
}

@js.native
@JSName("BABYLON.FilterPostProcess")
class FilterPostProcess protected () extends PostProcess {
  def this(name: String, kernelMatrix: Matrix, ratio: Double, camera: Camera, samplingMode: Double, engine: Engine, reusable: Boolean) = this()
  var kernelMatrix: Matrix = js.native
}

@js.native
@JSName("BABYLON.FxaaPostProcess")
class FxaaPostProcess protected () extends PostProcess {
  def this(name: String, ratio: Double, camera: Camera, samplingMode: Double, engine: Engine, reusable: Boolean) = this()
  var texelWidth: Double = js.native
  var texelHeight: Double = js.native
}

@js.native
@JSName("BABYLON.HDRRenderingPipeline")
class HDRRenderingPipeline protected () extends PostProcessRenderPipeline with IDisposable {
  def this(name: String, scene: Scene, ratio: Double, originalPostProcess: PostProcess, cameras: js.Array[Camera]) = this()
  var gaussCoeff: Double = js.native
  var gaussMean: Double = js.native
  var gaussStandDev: Double = js.native
  var exposure: Double = js.native
  var minimumLuminance: Double = js.native
  var maximumLuminance: Double = js.native
  var luminanceIncreaserate: Double = js.native
  var luminanceDecreaseRate: Double = js.native
  var brightThreshold: Double = js.native
  def update(): Unit = js.native
  def getCurrentLuminance(): Double = js.native
  def getOutputLuminance(): Double = js.native
//  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.HDRRenderingPipeline")
object HDRRenderingPipeline extends js.Object {
  var LUM_STEPS: Double = js.native
}

@js.native
@JSName("BABYLON.LensRenderingPipeline")
class LensRenderingPipeline protected () extends PostProcessRenderPipeline {
  def this(name: String, parameters: js.Any, scene: Scene, ratio: Double, cameras: js.Array[Camera]) = this()
  var LensChromaticAberrationEffect: String = js.native
  var HighlightsEnhancingEffect: String = js.native
  var LensDepthOfFieldEffect: String = js.native
  def setEdgeBlur(amount: Double): Unit = js.native
  def disableEdgeBlur(): Unit = js.native
  def setGrainAmount(amount: Double): Unit = js.native
  def disableGrain(): Unit = js.native
  def setChromaticAberration(amount: Double): Unit = js.native
  def disableChromaticAberration(): Unit = js.native
  def setEdgeDistortion(amount: Double): Unit = js.native
  def disableEdgeDistortion(): Unit = js.native
  def setFocusDistance(amount: Double): Unit = js.native
  def disableDepthOfField(): Unit = js.native
  def setAperture(amount: Double): Unit = js.native
  def setDarkenOutOfFocus(amount: Double): Unit = js.native
  def enablePentagonBokeh(): Unit = js.native
  def disablePentagonBokeh(): Unit = js.native
  def enableNoiseBlur(): Unit = js.native
  def disableNoiseBlur(): Unit = js.native
  def setHighlightsGain(amount: Double): Unit = js.native
  def setHighlightsThreshold(amount: Double): Unit = js.native
  def disableHighlights(): Unit = js.native
  def dispose(disableDepthRender: Boolean): Unit = js.native
}

@js.native
@JSName("BABYLON.PassPostProcess")
class PassPostProcess protected () extends PostProcess {
  def this(name: String, ratio: Double, camera: Camera, samplingMode: Double, engine: Engine, reusable: Boolean) = this()
}

@js.native
@JSName("BABYLON.PostProcess")
class PostProcess protected () extends js.Object {
  def this(name: String, fragmentUrl: String, parameters: js.Array[String], samplers: js.Array[String], ratio: Double | js.Any, camera: Camera, samplingMode: Double, engine: Engine, reusable: Boolean, defines: String, textureType: Double) = this()
  var name: String = js.native
  var onApply: js.Function1[Effect, Unit] = js.native
  var onBeforeRender: js.Function1[Effect, Unit] = js.native
  var onAfterRender: js.Function1[Effect, Unit] = js.native
  var onSizeChanged: js.Function0[Unit] = js.native
  var onActivate: js.Function1[Camera, Unit] = js.native
  var width: Double = js.native
  var height: Double = js.native
  var renderTargetSamplingMode: Double = js.native
  var clearColor: Color4 = js.native
  var _textures: SmartArray[WebGLTexture] = js.native
  var _currentRenderTextureInd: Double = js.native
  def isReusable(): Boolean = js.native
  def activate(camera: Camera, sourceTexture: WebGLTexture): Unit = js.native
  @JSName("apply")
  def apply(): Effect = js.native
  def dispose(camera: Camera): Unit = js.native
}

@js.native
@JSName("BABYLON.PostProcessManager")
class PostProcessManager protected () extends js.Object {
  def this(scene: Scene) = this()
  def _prepareFrame(sourceTexture: WebGLTexture): Boolean = js.native
  def directRender(postProcesses: js.Array[PostProcess], targetTexture: WebGLTexture): Unit = js.native
  def _finalizeFrame(doNotPresent: Boolean, targetTexture: WebGLTexture, postProcesses: js.Array[PostProcess]): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.RefractionPostProcess")
class RefractionPostProcess protected () extends PostProcess {
  def this(name: String, refractionTextureUrl: String, color: Color3, depth: Double, colorLevel: Double, ratio: Double, camera: Camera, samplingMode: Double, engine: Engine, reusable: Boolean) = this()
  var color: Color3 = js.native
  var depth: Double = js.native
  var colorLevel: Double = js.native
//  def dispose(camera: Camera): Unit = js.native
}

@js.native
@JSName("BABYLON.SSAORenderingPipeline")
class SSAORenderingPipeline protected () extends PostProcessRenderPipeline {
  def this(name: String, scene: Scene, ratio: js.Any, cameras: js.Array[Camera]) = this()
  var SSAOOriginalSceneColorEffect: String = js.native
  var SSAORenderEffect: String = js.native
  var SSAOBlurHRenderEffect: String = js.native
  var SSAOBlurVRenderEffect: String = js.native
  var SSAOCombineRenderEffect: String = js.native
  var totalStrength: Double = js.native
  var radius: Double = js.native
  var area: Double = js.native
  var fallOff: Double = js.native
  def getBlurHPostProcess(): BlurPostProcess = js.native
  def getBlurVPostProcess(): BlurPostProcess = js.native
  def dispose(disableDepthRender: Boolean): Unit = js.native
}

@js.native
@JSName("BABYLON.StereoscopicInterlacePostProcess")
class StereoscopicInterlacePostProcess protected () extends PostProcess {
  def this(name: String, camB: Camera, postProcessA: PostProcess, isStereoscopicHoriz: Boolean, samplingMode: Double) = this()
}

@js.native
sealed trait TonemappingOperator extends js.Object {
}

@js.native
@JSName("BABYLON.TonemappingOperator")
object TonemappingOperator extends js.Object {
  var Hable: TonemappingOperator = js.native
  var Reinhard: TonemappingOperator = js.native
  var HejiDawson: TonemappingOperator = js.native
  var Photographic: TonemappingOperator = js.native
  @JSBracketAccess
  def apply(value: TonemappingOperator): String = js.native
}

@js.native
@JSName("BABYLON.TonemapPostProcess")
class TonemapPostProcess protected () extends PostProcess {
  def this(name: String, operator: TonemappingOperator, exposureAdjustment: Double, camera: Camera, samplingMode: Double, engine: Engine, textureFormat: Double) = this()
}

@js.native
@JSName("BABYLON.VolumetricLightScatteringPostProcess")
class VolumetricLightScatteringPostProcess protected () extends PostProcess {
  def this(name: String, ratio: js.Any, camera: Camera, mesh: Mesh, samples: Double, samplingMode: Double, engine: Engine, reusable: Boolean, scene: Scene) = this()
  var useCustomMeshPosition: Boolean = js.native
  var invert: Boolean = js.native
  var mesh: Mesh = js.native
  var useDiffuseColor: Boolean = js.native
  var excludedMeshes: js.Array[AbstractMesh] = js.native
  var exposure: Double = js.native
  var decay: Double = js.native
  var weight: Double = js.native
  var density: Double = js.native
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  def setCustomMeshPosition(position: Vector3): Unit = js.native
  def getCustomMeshPosition(): Vector3 = js.native
//  def dispose(camera: Camera): Unit = js.native
  def getPass(): RenderTargetTexture = js.native
}

@js.native
@JSName("BABYLON.VolumetricLightScatteringPostProcess")
object VolumetricLightScatteringPostProcess extends js.Object {
  def CreateDefaultMesh(name: String, scene: Scene): Mesh = js.native
}

@js.native
@JSName("BABYLON.VRDistortionCorrectionPostProcess")
class VRDistortionCorrectionPostProcess protected () extends PostProcess {
  def this(name: String, camera: Camera, isRightEye: Boolean, vrMetrics: VRCameraMetrics) = this()
  var aspectRatio: Double = js.native
}

@js.native
@JSName("BABYLON.Sprite")
class Sprite protected () extends js.Object {
  def this(name: String, manager: SpriteManager) = this()
  var name: String = js.native
  var position: Vector3 = js.native
  var color: Color4 = js.native
  var width: Double = js.native
  var height: Double = js.native
  var angle: Double = js.native
  var cellIndex: Double = js.native
  var invertU: Double = js.native
  var invertV: Double = js.native
  var disposeWhenFinishedAnimating: Boolean = js.native
  var animations: js.Array[Animation] = js.native
  var size: Double = js.native
  def playAnimation(from: Double, to: Double, loop: Boolean, delay: Double): Unit = js.native
  def stopAnimation(): Unit = js.native
  def _animate(deltaTime: Double): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.SpriteManager")
class SpriteManager protected () extends js.Object {
  def this(name: String, imgUrl: String, capacity: Double, cellSize: Double, scene: Scene, epsilon: Double, samplingMode: Double) = this()
  var name: String = js.native
  var cellSize: Double = js.native
  var sprites: js.Array[Sprite] = js.native
  var renderingGroupId: Double = js.native
  var layerMask: Double = js.native
  var onDispose: js.Function0[Unit] = js.native
  var fogEnabled: Boolean = js.native
  def render(): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
trait IAssetTask extends js.Object {
  var onSuccess: js.Function1[IAssetTask, Unit] = js.native
  var onError: js.Function1[IAssetTask, Unit] = js.native
  var isCompleted: Boolean = js.native
  def run(scene: Scene, onSuccess: js.Function0[Unit], onError: js.Function0[Unit]): js.Dynamic = js.native
}

@js.native
@JSName("BABYLON.MeshAssetTask")
class MeshAssetTask protected () extends IAssetTask {
  def this(name: String, meshesNames: js.Any, rootUrl: String, sceneFilename: String) = this()
  var name: String = js.native
  var meshesNames: js.Any = js.native
  var rootUrl: String = js.native
  var sceneFilename: String = js.native
  var loadedMeshes: js.Array[AbstractMesh] = js.native
  var loadedParticleSystems: js.Array[ParticleSystem] = js.native
  var loadedSkeletons: js.Array[Skeleton] = js.native
//  var onSuccess: js.Function1[IAssetTask, Unit] = js.native
//  var onError: js.Function1[IAssetTask, Unit] = js.native
//  var isCompleted: Boolean = js.native
//  FIXME
//  def run(scene: Scene, onSuccess: js.Function0[Unit], onError: js.Function0[Unit]): Unit = js.native
}

@js.native
@JSName("BABYLON.TextFileAssetTask")
class TextFileAssetTask protected () extends IAssetTask {
  def this(name: String, url: String) = this()
  var name: String = js.native
  var url: String = js.native
//  var onSuccess: js.Function1[IAssetTask, Unit] = js.native
//  var onError: js.Function1[IAssetTask, Unit] = js.native
//  var isCompleted: Boolean = js.native
  var text: String = js.native
//  fixme
//  def run(scene: Scene, onSuccess: js.Function0[Unit], onError: js.Function0[Unit]): Unit = js.native
}

@js.native
@JSName("BABYLON.BinaryFileAssetTask")
class BinaryFileAssetTask protected () extends IAssetTask {
  def this(name: String, url: String) = this()
  var name: String = js.native
  var url: String = js.native
//  var onSuccess: js.Function1[IAssetTask, Unit] = js.native
//  var onError: js.Function1[IAssetTask, Unit] = js.native
//  var isCompleted: Boolean = js.native
  var data: ArrayBuffer = js.native
//  FIXME
//  def run(scene: Scene, onSuccess: js.Function0[Unit], onError: js.Function0[Unit]): Unit = js.native
}

@js.native
@JSName("BABYLON.ImageAssetTask")
class ImageAssetTask protected () extends IAssetTask {
  def this(name: String, url: String) = this()
  var name: String = js.native
  var url: String = js.native
//  var onSuccess: js.Function1[IAssetTask, Unit] = js.native
//  var onError: js.Function1[IAssetTask, Unit] = js.native
//  var isCompleted: Boolean = js.native
  var image: HTMLImageElement = js.native
//  FIXME
//  def run(scene: Scene, onSuccess: js.Function0[Unit], onError: js.Function0[Unit]): Unit = js.native
}

@js.native
@JSName("BABYLON.TextureAssetTask")
class TextureAssetTask protected () extends IAssetTask {
  def this(name: String, url: String, noMipmap: Boolean, invertY: Boolean, samplingMode: Double) = this()
  var name: String = js.native
  var url: String = js.native
  var noMipmap: Boolean = js.native
  var invertY: Boolean = js.native
  var samplingMode: Double = js.native
//  var onSuccess: js.Function1[IAssetTask, Unit] = js.native
//  var onError: js.Function1[IAssetTask, Unit] = js.native
//  var isCompleted: Boolean = js.native
  var texture: Texture = js.native
//  FIXME
//  def run(scene: Scene, onSuccess: js.Function0[Unit], onError: js.Function0[Unit]): Unit = js.native
}

@js.native
@JSName("BABYLON.AssetsManager")
class AssetsManager protected () extends js.Object {
  def this(scene: Scene) = this()
  var onFinish: js.Function1[js.Array[IAssetTask], Unit] = js.native
  var onTaskSuccess: js.Function1[IAssetTask, Unit] = js.native
  var onTaskError: js.Function1[IAssetTask, Unit] = js.native
  var useDefaultLoadingScreen: Boolean = js.native
  def addMeshTask(taskName: String, meshesNames: js.Any, rootUrl: String, sceneFilename: String): IAssetTask = js.native
  def addTextFileTask(taskName: String, url: String): IAssetTask = js.native
  def addBinaryFileTask(taskName: String, url: String): IAssetTask = js.native
  def addImageTask(taskName: String, url: String): IAssetTask = js.native
  def addTextureTask(taskName: String, url: String, noMipmap: Boolean, invertY: Boolean, samplingMode: Double): IAssetTask = js.native
  def reset(): AssetsManager = js.native
  def load(): AssetsManager = js.native
}

@js.native
@JSName("BABYLON.Database")
class Database protected () extends js.Object {
  def this(urlToScene: String, callbackManifestChecked: js.Function1[Boolean, Any]) = this()
  def checkManifestFile(): Unit = js.native
  def openAsync(successCallback: js.Any, errorCallback: js.Any): Unit = js.native
  def loadImageFromDB(url: String, image: HTMLImageElement): Unit = js.native
}

@js.native
@JSName("BABYLON.Database")
object Database extends js.Object {
  var IsUASupportingBlobStorage: Boolean = js.native
  var IDBStorageEnabled: Boolean = js.native
  var parseURL: js.Function1[String, String] = js.native
  var ReturnFullUrlLocation: js.Function1[String, String] = js.native
}

@js.native
@JSName("BABYLON.FilesInput")
class FilesInput protected () extends js.Object {
  def this(p_engine: Engine, p_scene: Scene, p_canvas: HTMLCanvasElement, p_sceneLoadedCallback: js.Any, p_progressCallback: js.Any, p_additionnalRenderLoopLogicCallback: js.Any, p_textureLoadingCallback: js.Any, p_startingProcessingFilesCallback: js.Any) = this()
  def monitorElementForDragNDrop(p_elementToMonitor: HTMLElement): Unit = js.native
  def loadFiles(event: js.Any): Unit = js.native
  def reload(): Unit = js.native
}

@js.native
@JSName("BABYLON.FilesInput")
object FilesInput extends js.Object {
  var FilesTextures: js.Array[js.Any] = js.native
  var FilesToLoad: js.Array[js.Any] = js.native
}

@js.native
@JSName("BABYLON.Gamepads")
class Gamepads protected () extends js.Object {
  def this(ongamedpadconnected: js.Function1[Gamepad, Unit]) = this()
  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.StickValues")
class StickValues protected () extends js.Object {
  def this(x: js.Any, y: js.Any) = this()
  var x: js.Any = js.native
  var y: js.Any = js.native
}

@js.native
@JSName("BABYLON.Gamepad")
class Gamepad protected () extends js.Object {
  def this(id: String, index: Double, browserGamepad: js.Any) = this()
  var id: String = js.native
  var index: Double = js.native
  var browserGamepad: js.Any = js.native
  def onleftstickchanged(callback: js.Function1[StickValues, Unit]): Unit = js.native
  def onrightstickchanged(callback: js.Function1[StickValues, Unit]): Unit = js.native
  var leftStick: StickValues = js.native
  var rightStick: StickValues = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("BABYLON.GenericPad")
class GenericPad protected () extends Gamepad {
  def this(id: String, index: Double, gamepad: js.Any) = this()
//  var id: String = js.native
//  var index: Double = js.native
  var gamepad: js.Any = js.native
  def onbuttondown(callback: js.Function1[Double, Unit]): Unit = js.native
  def onbuttonup(callback: js.Function1[Double, Unit]): Unit = js.native
//  def update(): Unit = js.native
}

@js.native
sealed trait Xbox360Button extends js.Object {
}

@js.native
@JSName("BABYLON.Xbox360Button")
object Xbox360Button extends js.Object {
  var A: Xbox360Button = js.native
  var B: Xbox360Button = js.native
  var X: Xbox360Button = js.native
  var Y: Xbox360Button = js.native
  var Start: Xbox360Button = js.native
  var Back: Xbox360Button = js.native
  var LB: Xbox360Button = js.native
  var RB: Xbox360Button = js.native
  var LeftStick: Xbox360Button = js.native
  var RightStick: Xbox360Button = js.native
  @JSBracketAccess
  def apply(value: Xbox360Button): String = js.native
}

@js.native
sealed trait Xbox360Dpad extends js.Object {
}

@js.native
@JSName("BABYLON.Xbox360Dpad")
object Xbox360Dpad extends js.Object {
  var Up: Xbox360Dpad = js.native
  var Down: Xbox360Dpad = js.native
  var Left: Xbox360Dpad = js.native
  var Right: Xbox360Dpad = js.native
  @JSBracketAccess
  def apply(value: Xbox360Dpad): String = js.native
}

@js.native
@JSName("BABYLON.Xbox360Pad")
class Xbox360Pad extends Gamepad {
  def onlefttriggerchanged(callback: js.Function1[Double, Unit]): Unit = js.native
  def onrighttriggerchanged(callback: js.Function1[Double, Unit]): Unit = js.native
  var leftTrigger: Double = js.native
  var rightTrigger: Double = js.native
  def onbuttondown(callback: js.Function1[Xbox360Button, Unit]): Unit = js.native
  def onbuttonup(callback: js.Function1[Xbox360Button, Unit]): Unit = js.native
  def ondpaddown(callback: js.Function1[Xbox360Dpad, Unit]): Unit = js.native
  def ondpadup(callback: js.Function1[Xbox360Dpad, Unit]): Unit = js.native
  var buttonA: Double = js.native
  var buttonB: Double = js.native
  var buttonX: Double = js.native
  var buttonY: Double = js.native
  var buttonStart: Double = js.native
  var buttonBack: Double = js.native
  var buttonLB: Double = js.native
  var buttonRB: Double = js.native
  var buttonLeftStick: Double = js.native
  var buttonRightStick: Double = js.native
  var dPadUp: Double = js.native
  var dPadDown: Double = js.native
  var dPadLeft: Double = js.native
  var dPadRight: Double = js.native
//  def update(): Unit = js.native
}

@js.native
@JSName("BABYLON.SceneOptimization")
class SceneOptimization protected () extends js.Object {
  def this(priority: Double) = this()
  var priority: Double = js.native
  @JSName("apply")
  var apply: js.Function1[Scene, Boolean] = js.native
}

@js.native
@JSName("BABYLON.TextureOptimization")
class TextureOptimization protected () extends SceneOptimization {
  def this(priority: Double, maximumSize: Double) = this()
//  var priority: Double = js.native
  var maximumSize: Double = js.native
//  @JSName("apply")
//  var apply: js.Function1[Scene, Boolean] = js.native
}

@js.native
@JSName("BABYLON.HardwareScalingOptimization")
class HardwareScalingOptimization protected () extends SceneOptimization {
  def this(priority: Double, maximumScale: Double) = this()
//  var priority: Double = js.native
  var maximumScale: Double = js.native
//  @JSName("apply")
//  var apply: js.Function1[Scene, Boolean] = js.native
}

@js.native
@JSName("BABYLON.ShadowsOptimization")
class ShadowsOptimization extends SceneOptimization {
//  FIXME
//  @JSName("apply")
//  var apply: js.Function1[Scene, Boolean] = js.native
}

@js.native
@JSName("BABYLON.PostProcessesOptimization")
class PostProcessesOptimization extends SceneOptimization {
//  @JSName("apply")
//  var apply: js.Function1[Scene, Boolean] = js.native
}

@js.native
@JSName("BABYLON.LensFlaresOptimization")
class LensFlaresOptimization extends SceneOptimization {
//  @JSName("apply")
//  var apply: js.Function1[Scene, Boolean] = js.native
}

@js.native
@JSName("BABYLON.ParticlesOptimization")
class ParticlesOptimization extends SceneOptimization {
//  @JSName("apply")
//  var apply: js.Function1[Scene, Boolean] = js.native
}

@js.native
@JSName("BABYLON.RenderTargetsOptimization")
class RenderTargetsOptimization extends SceneOptimization {
//  @JSName("apply")
//  var apply: js.Function1[Scene, Boolean] = js.native
}

@js.native
@JSName("BABYLON.MergeMeshesOptimization")
class MergeMeshesOptimization extends SceneOptimization {
//  @JSName("apply")
//  var apply: js.Function2[Scene, Boolean, Boolean] = js.native
}

@js.native
@JSName("BABYLON.MergeMeshesOptimization")
object MergeMeshesOptimization extends js.Object {
  var _UpdateSelectionTree: Boolean = js.native
  var UpdateSelectionTree: Boolean = js.native
}

@js.native
@JSName("BABYLON.SceneOptimizerOptions")
class SceneOptimizerOptions protected () extends js.Object {
  def this(targetFrameRate: Double, trackerDuration: Double) = this()
  var targetFrameRate: Double = js.native
  var trackerDuration: Double = js.native
  var optimizations: js.Array[SceneOptimization] = js.native
}

@js.native
@JSName("BABYLON.SceneOptimizerOptions")
object SceneOptimizerOptions extends js.Object {
  def LowDegradationAllowed(targetFrameRate: Double): SceneOptimizerOptions = js.native
  def ModerateDegradationAllowed(targetFrameRate: Double): SceneOptimizerOptions = js.native
  def HighDegradationAllowed(targetFrameRate: Double): SceneOptimizerOptions = js.native
}

@js.native
@JSName("BABYLON.SceneOptimizer")
class SceneOptimizer extends js.Object {
}

@js.native
@JSName("BABYLON.SceneOptimizer")
object SceneOptimizer extends js.Object {
  def _CheckCurrentState(scene: Scene, options: SceneOptimizerOptions, currentPriorityLevel: Double, onSuccess: js.Function0[Unit], onFailure: js.Function0[Unit]): Unit = js.native
  def OptimizeAsync(scene: Scene, options: SceneOptimizerOptions, onSuccess: js.Function0[Unit], onFailure: js.Function0[Unit]): Unit = js.native
}

@js.native
@JSName("BABYLON.SceneSerializer")
class SceneSerializer extends js.Object {
}

@js.native
@JSName("BABYLON.SceneSerializer")
object SceneSerializer extends js.Object {
  def Serialize(scene: Scene): js.Dynamic = js.native
  def SerializeMesh(toSerialize: js.Any, withParents: Boolean, withChildren: Boolean): js.Dynamic = js.native
}

@js.native
@JSName("BABYLON.SmartArray")
class SmartArray[T] protected () extends js.Object {
  def this(capacity: Double) = this()
  var data: js.Array[T] = js.native
  var length: Double = js.native
  def push(value: js.Any): Unit = js.native
  def pushNoDuplicate(value: js.Any): Unit = js.native
  def sort(compareFn: js.Any): Unit = js.native
  def reset(): Unit = js.native
  def concat(array: js.Any): Unit = js.native
  def concatWithNoDuplicate(array: js.Any): Unit = js.native
  def indexOf(value: js.Any): Double = js.native
}

@js.native
@JSName("BABYLON.SmartCollection")
class SmartCollection protected () extends js.Object {
  def this(capacity: Double) = this()
  var count: Double = js.native
  var items: js.Any = js.native
  def add(key: js.Any, item: js.Any): Double = js.native
  def remove(key: js.Any): Double = js.native
  def removeItemOfIndex(index: Double): Double = js.native
  def indexOf(key: js.Any): Double = js.native
  def item(key: js.Any): js.Dynamic = js.native
  def getAllKeys(): js.Array[js.Any] = js.native
  def getKeyByIndex(index: Double): js.Dynamic = js.native
  def getItemByIndex(index: Double): js.Dynamic = js.native
  def empty(): Unit = js.native
  def forEach(block: js.Function1[js.Any, Unit]): Unit = js.native
}

@js.native
@JSName("BABYLON.Tags")
class Tags extends js.Object {
}

@js.native
@JSName("BABYLON.Tags")
object Tags extends js.Object {
  def EnableFor(obj: js.Any): Unit = js.native
  def DisableFor(obj: js.Any): Unit = js.native
  def HasTags(obj: js.Any): Boolean = js.native
  def GetTags(obj: js.Any): js.Dynamic = js.native
  def AddTagsTo(obj: js.Any, tagsString: String): Unit = js.native
  def _AddTagTo(obj: js.Any, tag: String): Unit = js.native
  def RemoveTagsFrom(obj: js.Any, tagsString: String): Unit = js.native
  def _RemoveTagFrom(obj: js.Any, tag: String): Unit = js.native
  def MatchesQuery(obj: js.Any, tagsQuery: String): Boolean = js.native
}

@js.native
trait IAnimatable extends js.Object {
  var animations: js.Array[Animation] = js.native
}

@js.native
trait ISize extends js.Object {
  var width: Double = js.native
  var height: Double = js.native
}

@js.native
@JSName("BABYLON.Tools")
class Tools extends js.Object {
}

@js.native
@JSName("BABYLON.Tools")
object Tools extends js.Object {
  var BaseUrl: String = js.native
  def ToHex(i: Double): String = js.native
  def SetImmediate(action: js.Function0[Unit]): Unit = js.native
  def IsExponantOfTwo(value: Double): Boolean = js.native
  def GetExponantOfTwo(value: Double, max: Double): Double = js.native
  def GetFilename(path: String): String = js.native
  def GetDOMTextContent(element: HTMLElement): String = js.native
  def ToDegrees(angle: Double): Double = js.native
  def ToRadians(angle: Double): Double = js.native
  def ExtractMinAndMaxIndexed(positions: js.Array[Double], indices: js.Array[Double], indexStart: Double, indexCount: Double): js.Any = js.native
  def ExtractMinAndMax(positions: js.Array[Double], start: Double, count: Double): js.Any = js.native
  def MakeArray(obj: js.Any, allowsNullUndefined: Boolean): js.Array[js.Any] = js.native
  def GetPointerPrefix(): String = js.native
  def QueueNewFrame(func: js.Any): Unit = js.native
  def RequestFullscreen(element: js.Any): Unit = js.native
  def ExitFullscreen(): Unit = js.native
  def CleanUrl(url: String): String = js.native
  def LoadImage(url: String, onload: js.Any, onerror: js.Any, database: js.Any): HTMLImageElement = js.native
  def LoadFile(url: String, callback: js.Function1[js.Any, Unit], progressCallBack: js.Function0[Unit], database: js.Any, useArrayBuffer: Boolean, onError: js.Function0[Unit]): Unit = js.native
  def ReadFileAsDataURL(fileToLoad: js.Any, callback: js.Any, progressCallback: js.Any): Unit = js.native
  def ReadFile(fileToLoad: js.Any, callback: js.Any, progressCallBack: js.Any, useArrayBuffer: Boolean): Unit = js.native
  def Clamp(value: Double, min: Double, max: Double): Double = js.native
  def Sign(value: Double): Double = js.native
  def Format(value: Double, decimals: Double): String = js.native
  def CheckExtends(v: Vector3, min: Vector3, max: Vector3): Unit = js.native
  def WithinEpsilon(a: Double, b: Double, epsilon: Double): Boolean = js.native
  def DeepCopy(source: js.Any, destination: js.Any, doNotCopyList: js.Array[String], mustCopyList: js.Array[String]): Unit = js.native
  def IsEmpty(obj: js.Any): Boolean = js.native
  def RegisterTopRootEvents(events: js.Array[js.Any]): Unit = js.native
  def UnregisterTopRootEvents(events: js.Array[js.Any]): Unit = js.native
  def DumpFramebuffer(width: Double, height: Double, engine: Engine, successCallback: js.Function1[String, Unit]): Unit = js.native
  def CreateScreenshot(engine: Engine, camera: Camera, size: js.Any, successCallback: js.Function1[String, Unit]): Unit = js.native
  def ValidateXHRData(xhr: XMLHttpRequest, dataType: Double): Boolean = js.native
  var errorsCount: Double = js.native
  var OnNewCacheEntry: js.Function1[String, Unit] = js.native
  var NoneLogLevel: Double = js.native
  var MessageLogLevel: Double = js.native
  var WarningLogLevel: Double = js.native
  var ErrorLogLevel: Double = js.native
  var AllLogLevel: Double = js.native
  var Log: js.Function1[String, Unit] = js.native
  var Warn: js.Function1[String, Unit] = js.native
  var Error: js.Function1[String, Unit] = js.native
  var LogCache: String = js.native
  def ClearLogCache(): Unit = js.native
  var LogLevels: Double = js.native
  var PerformanceNoneLogLevel: Double = js.native
  var PerformanceUserMarkLogLevel: Double = js.native
  var PerformanceConsoleLogLevel: Double = js.native
  var PerformanceLogLevel: Double = js.native
  def _StartPerformanceCounterDisabled(counterName: String, condition: Boolean): Unit = js.native
  def _EndPerformanceCounterDisabled(counterName: String, condition: Boolean): Unit = js.native
  def _StartUserMark(counterName: String, condition: Boolean): Unit = js.native
  def _EndUserMark(counterName: String, condition: Boolean): Unit = js.native
  def _StartPerformanceConsole(counterName: String, condition: Boolean): Unit = js.native
  def _EndPerformanceConsole(counterName: String, condition: Boolean): Unit = js.native
  var StartPerformanceCounter: js.Function2[String, Boolean, Unit] = js.native
  var EndPerformanceCounter: js.Function2[String, Boolean, Unit] = js.native
  var Now: Double = js.native
  def GetFps(): Double = js.native
}

@js.native
@JSName("BABYLON.AsyncLoop")
class AsyncLoop protected () extends js.Object {
  def this(iterations: Double, _fn: js.Function1[AsyncLoop, Unit], _successCallback: js.Function0[Unit], offset: Double) = this()
  var iterations: Double = js.native
  var index: Double = js.native
  def executeNext(): Unit = js.native
  def breakLoop(): Unit = js.native
}

@js.native
@JSName("BABYLON.AsyncLoop")
object AsyncLoop extends js.Object {
  def Run(iterations: Double, _fn: js.Function1[AsyncLoop, Unit], _successCallback: js.Function0[Unit], offset: Double): AsyncLoop = js.native
  def SyncAsyncForLoop(iterations: Double, syncedIterations: Double, fn: js.Function1[Double, Unit], callback: js.Function0[Unit], breakFunction: js.Function0[Boolean], timeout: Double): Unit = js.native
}

@js.native
sealed trait JoystickAxis extends js.Object {
}

@js.native
@JSName("BABYLON.JoystickAxis")
object JoystickAxis extends js.Object {
  var X: JoystickAxis = js.native
  var Y: JoystickAxis = js.native
  var Z: JoystickAxis = js.native
  @JSBracketAccess
  def apply(value: JoystickAxis): String = js.native
}

@js.native
@JSName("BABYLON.VirtualJoystick")
class VirtualJoystick protected () extends js.Object {
  def this(leftJoystick: Boolean) = this()
  var reverseLeftRight: Boolean = js.native
  var reverseUpDown: Boolean = js.native
  var deltaPosition: Vector3 = js.native
  var pressed: Boolean = js.native
  def setJoystickSensibility(newJoystickSensibility: Double): Unit = js.native
  def setJoystickColor(newColor: String): Unit = js.native
  def setActionOnTouch(action: js.Function0[Any]): Unit = js.native
  def setAxisForLeftRight(axis: JoystickAxis): Unit = js.native
  def setAxisForUpDown(axis: JoystickAxis): Unit = js.native
  def releaseCanvas(): Unit = js.native
}

@js.native
@JSName("BABYLON.VRDeviceOrientationFreeCamera")
class VRDeviceOrientationFreeCamera protected () extends FreeCamera {
  def this(name: String, position: Vector3, scene: Scene, compensateDistorsion: Boolean) = this()
  var _alpha: Double = js.native
  var _beta: Double = js.native
  var _gamma: Double = js.native
  /* FIXME
  def _onOrientationEvent(evt: DeviceOrientationEvent): Unit = js.native
  * 
  */
//  def attachControl(element: HTMLElement, noPreventDefault: Boolean): Unit = js.native
//  def detachControl(element: HTMLElement): Unit = js.native
}

@js.native
@JSName("BABYLON.WebVRFreeCamera")
class WebVRFreeCamera protected () extends FreeCamera {
  def this(name: String, position: Vector3, scene: Scene, compensateDistorsion: Boolean) = this()
  var _hmdDevice: js.Any = js.native
  var _sensorDevice: js.Any = js.native
  var _cacheState: js.Any = js.native
  var _cacheQuaternion: Quaternion = js.native
  var _cacheRotation: Vector3 = js.native
  var _vrEnabled: Boolean = js.native
//  def _checkInputs(): Unit = js.native
//  def attachControl(element: HTMLElement, noPreventDefault: Boolean): Unit = js.native
//  def detachControl(element: HTMLElement): Unit = js.native
}

@js.native
trait IOctreeContainer[T] extends js.Object {
  var blocks: js.Array[OctreeBlock[T]] = js.native
}

@js.native
@JSName("BABYLON.Octree")
class Octree[T] protected () extends js.Object {
  def this(creationFunc: js.Function2[T, OctreeBlock[T], Unit], maxBlockCapacity: Double, maxDepth: Double) = this()
  var maxDepth: Double = js.native
  var blocks: js.Array[OctreeBlock[T]] = js.native
  var dynamicContent: js.Array[T] = js.native
  def update(worldMin: Vector3, worldMax: Vector3, entries: js.Array[T]): Unit = js.native
  def addMesh(entry: T): Unit = js.native
  def select(frustumPlanes: js.Array[Plane], allowDuplicate: Boolean): SmartArray[T] = js.native
  def intersects(sphereCenter: Vector3, sphereRadius: Double, allowDuplicate: Boolean): SmartArray[T] = js.native
  def intersectsRay(ray: Ray): SmartArray[T] = js.native
}

@js.native
@JSName("BABYLON.Octree")
object Octree extends js.Object {
  def _CreateBlocks[T](worldMin: Vector3, worldMax: Vector3, entries: js.Array[T], maxBlockCapacity: Double, currentDepth: Double, maxDepth: Double, target: IOctreeContainer[T], creationFunc: js.Function2[T, OctreeBlock[T], Unit]): Unit = js.native
  var CreationFuncForMeshes: js.Function2[AbstractMesh, OctreeBlock[AbstractMesh], Unit] = js.native
  var CreationFuncForSubMeshes: js.Function2[SubMesh, OctreeBlock[SubMesh], Unit] = js.native
}

@js.native
@JSName("BABYLON.OctreeBlock")
class OctreeBlock[T] protected () extends js.Object {
  def this(minPoint: Vector3, maxPoint: Vector3, capacity: Double, depth: Double, maxDepth: Double, creationFunc: js.Function2[T, OctreeBlock[T], Unit]) = this()
  var entries: js.Array[T] = js.native
  var blocks: js.Array[OctreeBlock[T]] = js.native
  var capacity: Double = js.native
  var minPoint: Vector3 = js.native
  var maxPoint: Vector3 = js.native
  def addEntry(entry: T): Unit = js.native
  def addEntries(entries: js.Array[T]): Unit = js.native
  def select(frustumPlanes: js.Array[Plane], selection: SmartArray[T], allowDuplicate: Boolean): Unit = js.native
  def intersects(sphereCenter: Vector3, sphereRadius: Double, selection: SmartArray[T], allowDuplicate: Boolean): Unit = js.native
  def intersectsRay(ray: Ray, selection: SmartArray[T]): Unit = js.native
  def createInnerBlocks(): Unit = js.native
}

@js.native
@JSName("BABYLON.ShadowGenerator")
class ShadowGenerator protected () extends js.Object {
  def this(mapSize: Double, light: IShadowLight) = this()
  var blurScale: Double = js.native
  var bias: Double = js.native
  var blurBoxOffset: Double = js.native
  var filter: Double = js.native
  var useVarianceShadowMap: Boolean = js.native
  var usePoissonSampling: Boolean = js.native
  var useBlurVarianceShadowMap: Boolean = js.native
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  def getShadowMap(): RenderTargetTexture = js.native
  def getShadowMapForRendering(): RenderTargetTexture = js.native
  def getLight(): IShadowLight = js.native
  def getTransformMatrix(): Matrix = js.native
  def getDarkness(): Double = js.native
  def setDarkness(darkness: Double): Unit = js.native
  def setTransparencyShadow(hasShadow: Boolean): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.ShadowGenerator")
object ShadowGenerator extends js.Object {
  var FILTER_NONE: Double = js.native
  var FILTER_VARIANCESHADOWMAP: Double = js.native
  var FILTER_POISSONSAMPLING: Double = js.native
  var FILTER_BLURVARIANCESHADOWMAP: Double = js.native
}

@js.native
@JSName("BABYLON.BaseTexture")
class BaseTexture protected () extends js.Object {
  def this(scene: Scene) = this()
  var name: String = js.native
  var delayLoadState: Double = js.native
  var hasAlpha: Boolean = js.native
  var getAlphaFromRGB: Boolean = js.native
  var level: Double = js.native
  var isCube: Boolean = js.native
  var isRenderTarget: Boolean = js.native
  var animations: js.Array[Animation] = js.native
  var onDispose: js.Function0[Unit] = js.native
  var coordinatesIndex: Double = js.native
  var coordinatesMode: Double = js.native
  var wrapU: Double = js.native
  var wrapV: Double = js.native
  var uScale: Double = js.native
  var vScale: Double = js.native
  var anisotropicFilteringLevel: Double = js.native
  var _cachedAnisotropicFilteringLevel: Double = js.native
  var _texture: WebGLTexture = js.native
  def getScene(): Scene = js.native
  def getTextureMatrix(): Matrix = js.native
  def getReflectionTextureMatrix(): Matrix = js.native
  def getInternalTexture(): WebGLTexture = js.native
  def isReady(): Boolean = js.native
  def getSize(): ISize = js.native
  def getBaseSize(): ISize = js.native
  def scale(ratio: Double): Unit = js.native
  var canRescale: Boolean = js.native
  def _removeFromCache(url: String, noMipmap: Boolean): Unit = js.native
  def _getFromCache(url: String, noMipmap: Boolean, sampling: Double): WebGLTexture = js.native
  def delayLoad(): Unit = js.native
  def releaseInternalTexture(): Unit = js.native
  override def clone(): BaseTexture = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.CubeTexture")
class CubeTexture protected () extends BaseTexture {
  def this(rootUrl: String, scene: Scene, extensions: js.Array[String], noMipmap: Boolean) = this()
  var url: String = js.native
//  var coordinatesMode: Double = js.native
  override def clone(): CubeTexture = js.native
//  def delayLoad(): Unit = js.native
//  def getReflectionTextureMatrix(): Matrix = js.native
}

@js.native
@JSName("BABYLON.DynamicTexture")
class DynamicTexture protected () extends Texture {
  def this(name: String, options: js.Any, scene: Scene, generateMipMaps: Boolean, samplingMode: Double) = this()
//  var canRescale: Boolean = js.native
//  def scale(ratio: Double): Unit = js.native
  def getContext(): CanvasRenderingContext2D = js.native
  def clear(): Unit = js.native
  def update(invertY: Boolean): Unit = js.native
  def drawText(text: String, x: Double, y: Double, font: String, color: String, clearColor: String, invertY: Boolean, update: Boolean): Unit = js.native
  override def clone(): DynamicTexture = js.native
}

@js.native
@JSName("BABYLON.MirrorTexture")
class MirrorTexture protected () extends RenderTargetTexture {
  def this(name: String, size: Double, scene: Scene, generateMipMaps: Boolean) = this()
  var mirrorPlane: Plane = js.native
  override def clone(): MirrorTexture = js.native
}

@js.native
@JSName("BABYLON.RawTexture")
class RawTexture protected () extends Texture {
  def this(data: ArrayBufferView, width: Double, height: Double, format: Double, scene: Scene, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Double) = this()
  var format: Double = js.native
  def update(data: ArrayBufferView): Unit = js.native
}

@js.native
@JSName("BABYLON.RawTexture")
object RawTexture extends js.Object {
  def CreateLuminanceTexture(data: ArrayBufferView, width: Double, height: Double, scene: Scene, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Double): RawTexture = js.native
  def CreateLuminanceAlphaTexture(data: ArrayBufferView, width: Double, height: Double, scene: Scene, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Double): RawTexture = js.native
  def CreateAlphaTexture(data: ArrayBufferView, width: Double, height: Double, scene: Scene, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Double): RawTexture = js.native
  def CreateRGBTexture(data: ArrayBufferView, width: Double, height: Double, scene: Scene, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Double): RawTexture = js.native
  def CreateRGBATexture(data: ArrayBufferView, width: Double, height: Double, scene: Scene, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Double): RawTexture = js.native
}

@js.native
@JSName("BABYLON.RenderTargetTexture")
class RenderTargetTexture protected () extends Texture {
  def this(name: String, size: js.Any, scene: Scene, generateMipMaps: Boolean, doNotChangeAspectRatio: Boolean, `type`: Double) = this()
  var renderList: js.Array[AbstractMesh] = js.native
  var renderParticles: Boolean = js.native
  var renderSprites: Boolean = js.native
//  var coordinatesMode: Double = js.native
  var onBeforeRender: js.Function0[Unit] = js.native
  var onAfterRender: js.Function0[Unit] = js.native
  var onAfterUnbind: js.Function0[Unit] = js.native
  var onClear: js.Function1[Engine, Unit] = js.native
  var activeCamera: Camera = js.native
  var customRenderFunction: js.Function4[SmartArray[SubMesh], SmartArray[SubMesh], SmartArray[SubMesh], js.Function0[Unit], Unit] = js.native
  var _generateMipMaps: Boolean = js.native
  var _waitingRenderList: js.Array[String] = js.native
  def resetRefreshCounter(): Unit = js.native
  var refreshRate: Double = js.native
  def _shouldRender(): Boolean = js.native
//  def isReady(): Boolean = js.native
  def getRenderSize(): Double = js.native
//  var canRescale: Boolean = js.native
//  def scale(ratio: Double): Unit = js.native
  def resize(size: js.Any, generateMipMaps: Boolean): Unit = js.native
  def render(useCameraPostProcess: Boolean, dumpForDebug: Boolean): Unit = js.native
//  def clone(): RenderTargetTexture = js.native
}

@js.native
@JSName("BABYLON.Texture")
class Texture protected () extends BaseTexture {
  def this(url: String, scene: Scene, noMipmap: Boolean, invertY: Boolean, samplingMode: Double, onLoad: js.Function0[Unit], onError: js.Function0[Unit], buffer: js.Any, deleteBuffer: Boolean) = this()
  var url: String = js.native
  var uOffset: Double = js.native
  var vOffset: Double = js.native
//  var uScale: Double = js.native
//  var vScale: Double = js.native
  var uAng: Double = js.native
  var vAng: Double = js.native
  var wAng: Double = js.native
  var _invertY: Boolean = js.native
  var _samplingMode: Double = js.native
//  def delayLoad(): Unit = js.native
  def updateSamplingMode(samplingMode: Double): Unit = js.native
//  def getTextureMatrix(): Matrix = js.native
//  def getReflectionTextureMatrix(): Matrix = js.native
  override def clone(): Texture = js.native
}

@js.native
@JSName("BABYLON.Texture")
object Texture extends js.Object {
  var NEAREST_SAMPLINGMODE: Double = js.native
  var BILINEAR_SAMPLINGMODE: Double = js.native
  var TRILINEAR_SAMPLINGMODE: Double = js.native
  var EXPLICIT_MODE: Double = js.native
  var SPHERICAL_MODE: Double = js.native
  var PLANAR_MODE: Double = js.native
  var CUBIC_MODE: Double = js.native
  var PROJECTION_MODE: Double = js.native
  var SKYBOX_MODE: Double = js.native
  var CLAMP_ADDRESSMODE: Double = js.native
  var WRAP_ADDRESSMODE: Double = js.native
  var MIRROR_ADDRESSMODE: Double = js.native
  def CreateFromBase64String(data: String, name: String, scene: Scene, noMipmap: Boolean, invertY: Boolean, samplingMode: Double, onLoad: js.Function0[Unit], onError: js.Function0[Unit]): Texture = js.native
}

@js.native
@JSName("BABYLON.VideoTexture")
class VideoTexture protected () extends Texture {
  def this(name: String, urls: js.Array[String], scene: Scene, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Double) = this()
  var video: HTMLVideoElement = js.native
  def update(): Boolean = js.native
}

@js.native
@JSName("BABYLON.CannonJSPlugin")
class CannonJSPlugin extends IPhysicsEnginePlugin {
  var checkWithEpsilon: js.Function1[Double, Double] = js.native
//  def initialize(iterations: Double): Unit = js.native
//  def runOneStep(delta: Double): Unit = js.native
//  def setGravity(gravity: Vector3): Unit = js.native
//  def registerMesh(mesh: AbstractMesh, impostor: Double, options: PhysicsBodyCreationOptions): js.Dynamic = js.native
//  def registerMeshesAsCompound(parts: js.Array[PhysicsCompoundBodyPart], options: PhysicsBodyCreationOptions): js.Dynamic = js.native
//  def unregisterMesh(mesh: AbstractMesh): Unit = js.native
//  def applyImpulse(mesh: AbstractMesh, force: Vector3, contactPoint: Vector3): Unit = js.native
  var updateBodyPosition: js.Function1[AbstractMesh, Unit] = js.native
  def createLink(mesh1: AbstractMesh, mesh2: AbstractMesh, pivot1: Vector3, pivot2: Vector3): Boolean = js.native
//  def dispose(): Unit = js.native
//  def isSupported(): Boolean = js.native
}

@js.native
@JSName("BABYLON.OimoJSPlugin")
class OimoJSPlugin extends IPhysicsEnginePlugin {
//  def initialize(iterations: Double): Unit = js.native
//  def setGravity(gravity: Vector3): Unit = js.native
//  def registerMesh(mesh: AbstractMesh, impostor: Double, options: PhysicsBodyCreationOptions): js.Dynamic = js.native
//  def registerMeshesAsCompound(parts: js.Array[PhysicsCompoundBodyPart], options: PhysicsBodyCreationOptions): js.Dynamic = js.native
//  def unregisterMesh(mesh: AbstractMesh): Unit = js.native
  var updateBodyPosition: js.Function1[AbstractMesh, Unit] = js.native
//  def applyImpulse(mesh: AbstractMesh, force: Vector3, contactPoint: Vector3): Unit = js.native
//  def createLink(mesh1: AbstractMesh, mesh2: AbstractMesh, pivot1: Vector3, pivot2: Vector3, options: js.Any): Boolean = js.native
//  def dispose(): Unit = js.native
//  def isSupported(): Boolean = js.native
//  def runOneStep(time: Double): Unit = js.native
}

@js.native
@JSName("BABYLON.PostProcessRenderEffect")
class PostProcessRenderEffect protected () extends js.Object {
  def this(engine: Engine, name: String, getPostProcess: js.Function0[PostProcess], singleInstance: Boolean) = this()
  var _name: String = js.native
  var applyParameters: js.Function1[PostProcess, Unit] = js.native
  def _update(): Unit = js.native
  def addPass(renderPass: PostProcessRenderPass): Unit = js.native
  def removePass(renderPass: PostProcessRenderPass): Unit = js.native
  def addRenderEffectAsPass(renderEffect: PostProcessRenderEffect): Unit = js.native
  def getPass(passName: String): Unit = js.native
  def emptyPasses(): Unit = js.native
  def _attachCameras(cameras: Camera): js.Dynamic = js.native
  def _attachCameras(cameras: js.Array[Camera]): js.Dynamic = js.native
  def _detachCameras(cameras: Camera): js.Dynamic = js.native
  def _detachCameras(cameras: js.Array[Camera]): js.Dynamic = js.native
  def _enable(cameras: Camera): js.Dynamic = js.native
  def _enable(cameras: js.Array[Camera]): js.Dynamic = js.native
  def _disable(cameras: Camera): js.Dynamic = js.native
  def _disable(cameras: js.Array[Camera]): js.Dynamic = js.native
  def getPostProcess(camera: Camera): PostProcess = js.native
}

@js.native
@JSName("BABYLON.PostProcessRenderPass")
class PostProcessRenderPass protected () extends js.Object {
  def this(scene: Scene, name: String, size: Double, renderList: js.Array[Mesh], beforeRender: js.Function0[Unit], afterRender: js.Function0[Unit]) = this()
  var _name: String = js.native
  def _incRefCount(): Double = js.native
  def _decRefCount(): Double = js.native
  def _update(): Unit = js.native
  def setRenderList(renderList: js.Array[Mesh]): Unit = js.native
  def getRenderTexture(): RenderTargetTexture = js.native
}

@js.native
@JSName("BABYLON.PostProcessRenderPipeline")
class PostProcessRenderPipeline protected () extends js.Object {
  def this(engine: Engine, name: String) = this()
  var _name: String = js.native
  def addEffect(renderEffect: PostProcessRenderEffect): Unit = js.native
  def _enableEffect(renderEffectName: String, cameras: Camera): js.Dynamic = js.native
  def _enableEffect(renderEffectName: String, cameras: js.Array[Camera]): js.Dynamic = js.native
  def _disableEffect(renderEffectName: String, cameras: Camera): js.Dynamic = js.native
  def _disableEffect(renderEffectName: String, cameras: js.Array[Camera]): js.Dynamic = js.native
  def _attachCameras(cameras: Camera, unique: Boolean): js.Dynamic = js.native
  def _attachCameras(cameras: js.Array[Camera], unique: Boolean): js.Dynamic = js.native
  def _detachCameras(cameras: Camera): js.Dynamic = js.native
  def _detachCameras(cameras: js.Array[Camera]): js.Dynamic = js.native
  def _enableDisplayOnlyPass(passName: js.Any, cameras: Camera): js.Dynamic = js.native
  def _enableDisplayOnlyPass(passName: js.Any, cameras: js.Array[Camera]): js.Dynamic = js.native
  def _disableDisplayOnlyPass(cameras: Camera): js.Dynamic = js.native
  def _disableDisplayOnlyPass(cameras: js.Array[Camera]): js.Dynamic = js.native
  def _update(): Unit = js.native
}

@js.native
@JSName("BABYLON.PostProcessRenderPipelineManager")
class PostProcessRenderPipelineManager extends js.Object {
  def addPipeline(renderPipeline: PostProcessRenderPipeline): Unit = js.native
  def attachCamerasToRenderPipeline(renderPipelineName: String, cameras: Camera, unique: Boolean): js.Dynamic = js.native
  def attachCamerasToRenderPipeline(renderPipelineName: String, cameras: js.Array[Camera], unique: Boolean): js.Dynamic = js.native
  def detachCamerasFromRenderPipeline(renderPipelineName: String, cameras: Camera): js.Dynamic = js.native
  def detachCamerasFromRenderPipeline(renderPipelineName: String, cameras: js.Array[Camera]): js.Dynamic = js.native
  def enableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Camera): js.Dynamic = js.native
  def enableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: js.Array[Camera]): js.Dynamic = js.native
  def disableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Camera): js.Dynamic = js.native
  def disableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: js.Array[Camera]): js.Dynamic = js.native
  def enableDisplayOnlyPassInPipeline(renderPipelineName: String, passName: String, cameras: Camera): js.Dynamic = js.native
  def enableDisplayOnlyPassInPipeline(renderPipelineName: String, passName: String, cameras: js.Array[Camera]): js.Dynamic = js.native
  def disableDisplayOnlyPassInPipeline(renderPipelineName: String, cameras: Camera): js.Dynamic = js.native
  def disableDisplayOnlyPassInPipeline(renderPipelineName: String, cameras: js.Array[Camera]): js.Dynamic = js.native
  def update(): Unit = js.native
}

@js.native
@JSName("BABYLON.CustomProceduralTexture")
class CustomProceduralTexture protected () extends ProceduralTexture {
  def this(name: String, texturePath: js.Any, size: Double, scene: Scene, fallbackTexture: Texture, generateMipMaps: Boolean) = this()
//  def isReady(): Boolean = js.native
//  def render(useCameraPostProcess: Boolean): Unit = js.native
  def updateTextures(): Unit = js.native
  def updateShaderUniforms(): Unit = js.native
  var animate: Boolean = js.native
}

@js.native
@JSName("BABYLON.ProceduralTexture")
class ProceduralTexture protected () extends Texture {
  def this(name: String, size: js.Any, fragment: js.Any, scene: Scene, fallbackTexture: Texture, generateMipMaps: Boolean) = this()
  var _generateMipMaps: Boolean = js.native
  var isEnabled: Boolean = js.native
  var _textures: js.Array[Texture] = js.native
  def reset(): Unit = js.native
//  def isReady(): Boolean = js.native
  def resetRefreshCounter(): Unit = js.native
  def setFragment(fragment: js.Any): Unit = js.native
  var refreshRate: Double = js.native
  def _shouldRender(): Boolean = js.native
  def getRenderSize(): Double = js.native
  def resize(size: js.Any, generateMipMaps: js.Any): Unit = js.native
  def setTexture(name: String, texture: Texture): ProceduralTexture = js.native
  def setFloat(name: String, value: Double): ProceduralTexture = js.native
  def setFloats(name: String, value: js.Array[Double]): ProceduralTexture = js.native
  def setColor3(name: String, value: Color3): ProceduralTexture = js.native
  def setColor4(name: String, value: Color4): ProceduralTexture = js.native
  def setVector2(name: String, value: Vector2): ProceduralTexture = js.native
  def setVector3(name: String, value: Vector3): ProceduralTexture = js.native
  def setMatrix(name: String, value: Matrix): ProceduralTexture = js.native
  def render(useCameraPostProcess: Boolean): Unit = js.native
  override def clone(): ProceduralTexture = js.native
//  def dispose(): Unit = js.native
}

@js.native
@JSName("BABYLON.WoodProceduralTexture")
class WoodProceduralTexture protected () extends ProceduralTexture {
  def this(name: String, size: Double, scene: Scene, fallbackTexture: Texture, generateMipMaps: Boolean) = this()
  def updateShaderUniforms(): Unit = js.native
  var ampScale: Double = js.native
  var woodColor: Color3 = js.native
}

@js.native
@JSName("BABYLON.FireProceduralTexture")
class FireProceduralTexture protected () extends ProceduralTexture {
  def this(name: String, size: Double, scene: Scene, fallbackTexture: Texture, generateMipMaps: Boolean) = this()
  def updateShaderUniforms(): Unit = js.native
//  def render(useCameraPostProcess: Boolean): Unit = js.native
  var fireColors: js.Array[Color3] = js.native
  var time: Double = js.native
  var speed: Vector2 = js.native
  var alphaThreshold: Double = js.native
}

@js.native
@JSName("BABYLON.FireProceduralTexture")
object FireProceduralTexture extends js.Object {
  var PurpleFireColors: js.Array[Color3] = js.native
  var GreenFireColors: js.Array[Color3] = js.native
  var RedFireColors: js.Array[Color3] = js.native
  var BlueFireColors: js.Array[Color3] = js.native
}

@js.native
@JSName("BABYLON.CloudProceduralTexture")
class CloudProceduralTexture protected () extends ProceduralTexture {
  def this(name: String, size: Double, scene: Scene, fallbackTexture: Texture, generateMipMaps: Boolean) = this()
  def updateShaderUniforms(): Unit = js.native
  var skyColor: Color4 = js.native
  var cloudColor: Color4 = js.native
}

@js.native
@JSName("BABYLON.GrassProceduralTexture")
class GrassProceduralTexture protected () extends ProceduralTexture {
  def this(name: String, size: Double, scene: Scene, fallbackTexture: Texture, generateMipMaps: Boolean) = this()
  def updateShaderUniforms(): Unit = js.native
  var grassColors: js.Array[Color3] = js.native
  var groundColor: Color3 = js.native
}

@js.native
@JSName("BABYLON.RoadProceduralTexture")
class RoadProceduralTexture protected () extends ProceduralTexture {
  def this(name: String, size: Double, scene: Scene, fallbackTexture: Texture, generateMipMaps: Boolean) = this()
  def updateShaderUniforms(): Unit = js.native
  var roadColor: Color3 = js.native
}

@js.native
@JSName("BABYLON.BrickProceduralTexture")
class BrickProceduralTexture protected () extends ProceduralTexture {
  def this(name: String, size: Double, scene: Scene, fallbackTexture: Texture, generateMipMaps: Boolean) = this()
  def updateShaderUniforms(): Unit = js.native
  var numberOfBricksHeight: Double = js.native
  var numberOfBricksWidth: Double = js.native
  var jointColor: Color3 = js.native
  var brickColor: Color3 = js.native
}

@js.native
@JSName("BABYLON.MarbleProceduralTexture")
class MarbleProceduralTexture protected () extends ProceduralTexture {
  def this(name: String, size: Double, scene: Scene, fallbackTexture: Texture, generateMipMaps: Boolean) = this()
  def updateShaderUniforms(): Unit = js.native
  var numberOfTilesHeight: Double = js.native
  var numberOfTilesWidth: Double = js.native
  var jointColor: Color3 = js.native
  var marbleColor: Color3 = js.native
}

@js.native // << FIXME -- added this to remove warning, but not sure if this is correct
@JSName("BABYLON")
object BABYLON extends js.Object {
  var CollisionWorker: String = js.native
  var WorkerIncluded: Boolean = js.native
}

@js.native
trait Window extends js.Object {
  def mozIndexedDB(func: js.Any): js.Dynamic = js.native
  def webkitIndexedDB(func: js.Any): js.Dynamic = js.native
  def IDBTransaction(func: js.Any): js.Dynamic = js.native
  def webkitIDBTransaction(func: js.Any): js.Dynamic = js.native
  def msIDBTransaction(func: js.Any): js.Dynamic = js.native
  def IDBKeyRange(func: js.Any): js.Dynamic = js.native
  def webkitIDBKeyRange(func: js.Any): js.Dynamic = js.native
  def msIDBKeyRange(func: js.Any): js.Dynamic = js.native
  var webkitURL: HTMLURL = js.native
  def webkitRequestAnimationFrame(func: js.Any): js.Dynamic = js.native
  def mozRequestAnimationFrame(func: js.Any): js.Dynamic = js.native
  def oRequestAnimationFrame(func: js.Any): js.Dynamic = js.native
  var WebGLRenderingContext: WebGLRenderingContext = js.native
//  var MSGesture: MSGesture = js.native
  var CANNON: js.Any = js.native
  var SIMD: js.Any = js.native
  var AudioContext: AudioContext = js.native
  var webkitAudioContext: AudioContext = js.native
}

@js.native
trait HTMLURL extends js.Object {
  def createObjectURL(param1: js.Any, param2: js.Any): js.Dynamic = js.native
}

@js.native
trait Document extends js.Object {
  def exitFullscreen(): Unit = js.native
  def webkitCancelFullScreen(): Unit = js.native
  def mozCancelFullScreen(): Unit = js.native
  def msCancelFullScreen(): Unit = js.native
  var mozFullScreen: Boolean = js.native
  var msIsFullScreen: Boolean = js.native
  var fullscreen: Boolean = js.native
  var mozPointerLockElement: HTMLElement = js.native
  var msPointerLockElement: HTMLElement = js.native
  var webkitPointerLockElement: HTMLElement = js.native
}
// FIXME -  rename of HTMLCanvasElement (REALLY BAD)
//@js.native
//trait HTMLCanvasElement extends js.Object {
//  def requestPointerLock(): Unit = js.native
//  def msRequestPointerLock(): Unit = js.native
//  def mozRequestPointerLock(): Unit = js.native
//  def webkitRequestPointerLock(): Unit = js.native
//}

@js.native
trait CanvasRenderingContext2D extends js.Object {
  var imageSmoothingEnabled: Boolean = js.native
  var mozImageSmoothingEnabled: Boolean = js.native
  var oImageSmoothingEnabled: Boolean = js.native
  var webkitImageSmoothingEnabled: Boolean = js.native
}

@js.native
trait WebGLTexture extends js.Object {
  var isReady: Boolean = js.native
  var isCube: Boolean = js.native
  var url: String = js.native
  var noMipmap: Boolean = js.native
  var samplingMode: Double = js.native
  var references: Double = js.native
  var generateMipMaps: Boolean = js.native
  var _size: Double = js.native
  var _baseWidth: Double = js.native
  var _baseHeight: Double = js.native
  var _width: Double = js.native
  var _height: Double = js.native
  var _workingCanvas: HTMLCanvasElement = js.native
  var _workingContext: CanvasRenderingContext2D = js.native
  var _framebuffer: WebGLFramebuffer = js.native
  var _depthBuffer: WebGLRenderbuffer = js.native
  var _cachedCoordinatesMode: Double = js.native
  var _cachedWrapU: Double = js.native
  var _cachedWrapV: Double = js.native
  var _isDisabled: Boolean = js.native
}

@js.native
trait WebGLBuffer extends js.Object {
  var references: Double = js.native
  var capacity: Double = js.native
  var is32Bits: Boolean = js.native
}

@js.native
trait MouseEvent extends js.Object {
  var mozMovementX: Double = js.native
  var mozMovementY: Double = js.native
  var webkitMovementX: Double = js.native
  var webkitMovementY: Double = js.native
  var msMovementX: Double = js.native
  var msMovementY: Double = js.native
}

@js.native
trait MSStyleCSSProperties extends js.Object {
  var webkitTransform: String = js.native
  var webkitTransition: String = js.native
}

@js.native
trait Navigator extends js.Object {
  var getVRDevices: js.Function0[Any] = js.native
  var mozGetVRDevices: js.Function1[js.Any, Any] = js.native
  var isCocoonJS: Boolean = js.native
  def getGamepads(func: js.Any): js.Dynamic = js.native
  def webkitGetGamepads(func: js.Any): js.Dynamic = js.native
  def msGetGamepads(func: js.Any): js.Dynamic = js.native
  def webkitGamepads(func: js.Any): js.Dynamic = js.native
}

@js.native
trait Screen extends js.Object {
  var orientation: String = js.native
  var mozOrientation: String = js.native
}

/*
package object importedjs extends js.GlobalScope {
  var HMDVRDevice: js.Any = js.native
  var PositionSensorVRDevice: js.Any = js.native
} */
