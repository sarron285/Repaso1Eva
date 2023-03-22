//clase personaje con los valores añadidos dentro del parentesis ("constructor")
class Personaje(
    private var nombre : String,
    private var vida : Int,
    private var fuerza : Int,
    private var defensa : Int
){
//ser y get correspondiente po cada atributo para poder acceder a ellos
    fun getNombre():String{
        return nombre
    }

    fun setNombre(nombre: String){
        this.nombre=nombre
    }

    fun getVida():Int{
        return vida
    }

    fun setVida(vida:Int){
        this.vida=vida
    }

    fun getFuerza():Int{
        return fuerza
    }

    fun setFuerza(fuerza: Int){
        this.fuerza=fuerza
    }

    fun getDefensa():Int{
        return defensa
    }

    fun setDefensa(defensa:Int){
        this.defensa=defensa
    }



}

//clase KaerMorhen con sus correspondientes metodos.
class KaerMorhen (){

    fun Entrar (nombre:Personaje, vida:Personaje, fuerza:Personaje, defensa:Personaje){
    }

    fun Salir(nombre: Personaje){
    }

    fun Habitacion(nombre: Personaje){
    }

    fun Entrenamiento(nombre: Personaje){
    }


class Menu(){
    //pedir por teclado
    print("Elija una de las 4 opciones:")
    val respuesta = readln().toInt()
}
}