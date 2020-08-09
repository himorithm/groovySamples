import groovy.transform.Immutable

class BluetoothAudio{
    void searchDevice(){
        println "Searching Device"
    }

    void connect(device){
        println "Connected '$device'"
    }

    void diconnect(device){
       println "Disconnected '$device'"
    }

    void volume(){
        println "Bluetooth Volume"
    }
}

class Mp3player{

    void play(song){
        println "Playing '$song'"
    }

    void pause(){
        println "Puase "

    }

    void stop(){
        println "Stopped"
    }

    void volume(){
        println "Hardware Volume"
    }
}

/**
 * Class CarMusicSystem will act as Facade of Bluetooth music and Mp3 music player.
 * Groovy does mapping of methods for both the classes automatically.
 * The conflicting method volume is resolved as Bluetooth is the first implementation.
 * User can provide own implementation.
 */
class CarMusicSystem{
    @Delegate BluetoothAudio blueAudio
    @Delegate Mp3player mp3player
}


class DelegateSample {

    static void main(String[] args) {
        CarMusicSystem carMusicSystem = new CarMusicSystem(blueAudio: new BluetoothAudio(), mp3player: new Mp3player())
        carMusicSystem.searchDevice()
        carMusicSystem.connect"CarAudio"
        carMusicSystem.play"Hello Tune"
        carMusicSystem.volume()
        carMusicSystem.stop ()
        carMusicSystem.diconnect"CarAudio"
    }


}

