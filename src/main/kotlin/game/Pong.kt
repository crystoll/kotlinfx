package game

import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.canvas.Canvas
import javafx.scene.image.Image
import javafx.scene.paint.Color
import javafx.scene.text.Font
import javafx.scene.text.FontWeight
import javafx.stage.Stage

/**
 * Simple exercise in topic of Pong game with Kotlin & JavaFX
 */
class Pong : Application() {

    override fun start(stage: Stage) {
        stage.setTitle("Pong game")
        val root = Group()
        val scene = Scene(root)
        stage.scene = scene

        val canvas = Canvas(400.0, 400.0)
        root.children.add(canvas);

        val gc = canvas.graphicsContext2D

        gc.fill = Color.RED
        gc.stroke = Color.BLACK
        gc.lineWidth = 2.0
        val font = Font.font("Times New Roman", FontWeight.BOLD, 48.0)
        gc.font = font;
        gc.fillText( "JavaFX is Cool!", 60.0, 50.0 );
        gc.strokeText( "JavaFX is Cool!", 60.0, 50.0 );

        val earth = Image( "/nemi.png" );
        gc.drawImage( earth, 70.0, 90.0 );

        stage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(Pong::class.java)
        }
    }
}
