
import androidx.annotation.NonNull
import io.flutter.embedding.engine.plugins.FlutterPlugin

/** ImaPlugin */
class ImaPlayerPlugin : FlutterPlugin {
    override fun onAttachedToEngine(binding: FlutterPlugin.FlutterPluginBinding) {
        binding.platformViewRegistry.registerViewFactory(
            "gece.dev/imaplayer_view", ImaPlayerViewFactory(binding.binaryMessenger)
        )
    }

    override fun onDetachedFromEngine(binding: FlutterPlugin.FlutterPluginBinding) {

    }

}
