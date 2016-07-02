package game

import javafx.animation.AnimationTimer
import javafx.application.Application
import javafx.scene.Group
import javafx.scene.Scene
import javafx.scene.canvas.Canvas
import javafx.scene.image.Image
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

        val canvas = Canvas(512.0,512.0)
        root.children.add(canvas);

        val gc = canvas.graphicsContext2D

        val nemi = Image("/nemi.png",100.0,100.0,true,true)
        val background = Image("/background.jpg",512.0,512.0,false, true)



        val startNanoTime = System.nanoTime()

        val gameloop = object : AnimationTimer() {
            override fun handle(now: Long) {
                val t = (now - startNanoTime) / 1000000000.0;

                val x = 232 + 128 * Math.cos(t);
                val y = 232 + 128 * Math.sin(t);

                // background image clears canvas
                gc.drawImage( background, 0.0, 0.0 );
                //gc.drawImage( earth, x, y );
                gc.drawImage( nemi, x,y );
            }
        }

        gameloop.start()

        stage.show()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            launch(Pong::class.java)
        }
    }
}
